/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.*;
import Model.Enums.*;
import Model.Enums.FormOfPayment.ExpenseStatus;
import Model.Home.Card;
import Model.Home.Category;
import Model.Home.Expense;
import Model.Home.Revenue;
import static View.Internal.ExpenseScreen.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class ExpenseController {

    public boolean createExpense(Integer accountId, Category category, Double value, String date, String description, FormOfPayment formOfPayment, Integer numberOfInstallments, ExpenseStatus status) throws SQLException {

        CardController c = new CardController();
        RevenueController r = new RevenueController();

        Revenue rv = r.getRevenueByAccountId(accountId);

        if ((rv.getValue() - value) < 1) {
            JOptionPane.showMessageDialog(null, "A sua receita do mês não possui saldo suficiente!");
            return false;
        }

        if (value <= 0.00) {
            JOptionPane.showMessageDialog(null, "O valor para a despesa tem que ser maior que zero!");
            return false;
        }

        Integer categoryId = null;
        if (category != null) {
            categoryId = category.getId();
        }

        if (!cmbFormaPay.getSelectedItem().equals(FormOfPayment.DINHEIRO)) {
            Card card = null; // ´Pega esse cara do banco para verificar o TIPO de cartão do usuário

            Integer number = Integer.parseInt(cmbCartao.getSelectedItem().toString()); // NULL*
            card = c.getCardByNumber(number);

            if (card == null) {
                JOptionPane.showMessageDialog(null, "A sua conta não possui um cartão cadastrado!");
                return false;
            }

            if (card.getType() == CardType.CREDITO && formOfPayment != FormOfPayment.CREDITO) {
                JOptionPane.showMessageDialog(null, "O seu cartão é de crédito, mude a forma de pagamento");
                return false;
            }

            if (card.getType() == CardType.DEBITO && formOfPayment != FormOfPayment.DEBITO) {
                JOptionPane.showMessageDialog(null, "O seu cartão é de débito, mude a forma de pagamento");
                return false;
            }

            if (card.getType() == CardType.CREDITO && numberOfInstallments < 0) {
                JOptionPane.showMessageDialog(null, "O número de parcelas é inválido");
                return false;
            }

            if (accountId != null && card != null && value != null && date != null) {
                return ExpenseDAO.createExpense(accountId, categoryId, card.getId(), value, date, description, formOfPayment.getNum(), numberOfInstallments, status.getNum());
            }
        } else {
            if (accountId != null && value != null && date != null) {
                return ExpenseDAO.createExpense(accountId, categoryId, null, value, date, description, formOfPayment.getNum(), numberOfInstallments, status.getNum());
            }
        }
        return false;
    }

    public void getFormPayList(JComboBox com) {
        com.setModel(new DefaultComboBoxModel<>(FormOfPayment.values()));
    }

    public Double getExpenseValueListByAccountId(Integer accId) throws SQLException {
        if (accId != null) {
            List<Double> values = ExpenseDAO.getExpenseValueListByAccountId(accId);
            Double totalValue = 0.00;

            if (values != null) {
                for (Double val : values) {
                    totalValue += val;
                }
                return totalValue;
            }
            return totalValue;
        }
        return 0.00;
    }

    public List<Expense> getExpenseListByAccountId(Integer accId) throws SQLException {
        if (accId != null) {
            List<Expense> exp = ExpenseDAO.getExpenseListByAccountId(accId);

            if (exp != null) {
                return exp;
            }
            return null;
        }
        return null;
    }

    public boolean deleteExpense(Integer id) throws SQLException {
        if (id != null) {
            return ExpenseDAO.deleteExpense(id);
        }
        return false;
    }

    public boolean updateExpense(Integer id, Integer accountId, Category category, Double value, String date, String description, FormOfPayment formOfPayment, Integer numberOfInstallments, ExpenseStatus status) throws SQLException {
        CardController c = new CardController();
        RevenueController r = new RevenueController();

        Revenue rv = r.getRevenueByAccountId(accountId);

        if ((rv.getValue() - value) < 1) {
            JOptionPane.showMessageDialog(null, "A sua receita do mês não possui saldo suficiente!");
            return false;
        }

        if (value <= 0.00) {
            JOptionPane.showMessageDialog(null, "O valor para a despesa tem que ser maior que zero!");
            return false;
        }

        Integer categoryId = null;
        if (category != null) {
            categoryId = category.getId();
        }

        if (!cmbFormaPay.getSelectedItem().equals(FormOfPayment.DINHEIRO)) {
            Card card = null; // ´Pega esse cara do banco para verificar o TIPO de cartão do usuário

            Integer number = Integer.parseInt(cmbCartao.getSelectedItem().toString()); // NULL*
            card = c.getCardByNumber(number);

            if (card == null) {
                JOptionPane.showMessageDialog(null, "A sua conta não possui um cartão cadastrado!");
                return false;
            }

            if (card.getType() == CardType.CREDITO && formOfPayment != FormOfPayment.CREDITO) {
                JOptionPane.showMessageDialog(null, "O seu cartão é de crédito, mude a forma de pagamento");
                return false;
            }

            if (card.getType() == CardType.DEBITO && formOfPayment != FormOfPayment.DEBITO) {
                JOptionPane.showMessageDialog(null, "O seu cartão é de débito, mude a forma de pagamento");
                return false;
            }

            if (card.getType() == CardType.CREDITO && numberOfInstallments < 0) {
                JOptionPane.showMessageDialog(null, "O número de parcelas é inválido");
                return false;
            }

            if (accountId != null && card != null && value != null && date != null) {
                return ExpenseDAO.updateExpense(id, accountId, categoryId, card.getId(), value, date, description, formOfPayment.getNum(), numberOfInstallments, status.getNum());
            }
        } else {
            if (accountId != null && value != null && date != null) {
                return ExpenseDAO.updateExpense(id, accountId, categoryId, null, value, date, description, formOfPayment.getNum(), numberOfInstallments, status.getNum());
            }
        }
        return false;
    }

    public List<Expense> getExpenseListByDescription(String busca, Integer acc) throws SQLException{
        if (busca != null) {
            List<Expense> exp = ExpenseDAO.getExpenseListByDescription(busca, acc);

            if (exp != null) {
                return exp;
            }
            return null;
        }
        return null;
    }
}
