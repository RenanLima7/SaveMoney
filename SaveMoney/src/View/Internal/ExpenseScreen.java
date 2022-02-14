/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Model.Enums.*;
import Controller.*;
import Model.Entity.Account;
import Model.Home.*;
import static View.LoginScreen.email1;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class ExpenseScreen extends javax.swing.JInternalFrame {

    ExpenseController exp = new ExpenseController();
    AccountController ac = new AccountController();
    CardController c = new CardController();
    CategoryController cat = new CategoryController();
    DisplayManager d = new DisplayManager();

    String email = email1;
    Account account = ac.getAccountByEmail(email);

    public ExpenseScreen() throws SQLException {
        initComponents();
        exp.getFormPayList(cmbFormaPay);
        cat.getcategoryList(cmbCategoria, account.getId());
        
        cmbCartao.setVisible(false);
        txtCart.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCart = new javax.swing.JLabel();
        cmbCartao = new javax.swing.JComboBox<>();
        txtNumParc = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        cmbCategoria = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        chooserData = new com.toedter.calendar.JDateChooser();
        txt5 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        cmbFormaPay = new javax.swing.JComboBox<>();
        txt6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 60));
        setBorder(null);

        txtCart.setBackground(new java.awt.Color(255, 255, 255));
        txtCart.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtCart.setForeground(new java.awt.Color(255, 255, 255));
        txtCart.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCart.setText("Cartão");

        cmbCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(255, 255, 255));
        txt1.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("Categoria");

        txt.setBackground(new java.awt.Color(255, 255, 255));
        txt.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt.setText("Valor");

        txt3.setBackground(new java.awt.Color(255, 255, 255));
        txt3.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt3.setText("N° de Parcelas");

        txt4.setBackground(new java.awt.Color(255, 255, 255));
        txt4.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("Data");

        chooserData.setDateFormatString("dd-MM-yyyy");

        txt5.setBackground(new java.awt.Color(255, 255, 255));
        txt5.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("Descrição");

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        cmbFormaPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormaPayActionPerformed(evt);
            }
        });

        txt6.setBackground(new java.awt.Color(255, 255, 255));
        txt6.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt6.setText("Forma de Pagamento");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFormaPay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValor)
                    .addComponent(chooserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, 0, 220, Short.MAX_VALUE)
                    .addComponent(txtCart, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCartao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumParc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbFormaPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumParc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked

        try {
            String name = cmbCategoria.getSelectedItem().toString(); // NULL
            Category category = null;
            if(name != null && !name.isEmpty()){
                category = cat.getCategoryByName(name);
            }
            
            Double value = Double.parseDouble(txtValor.getText());
            String description = txtDescricao.getText(); // NULL           
            FormOfPayment formOfPayment = (FormOfPayment) cmbFormaPay.getSelectedItem();
            Integer numberOfInstallments = Integer.parseInt(txtNumParc.getText());
            ExpenseStatus status = ExpenseStatus.NOT_PAID; // Status = 1 > NOT_PAID

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date data = chooserData.getDate();
            String dataFormatada = sdf.format(data);

            boolean sucesso = exp.createExpense(account.getId(), category, value, dataFormatada, description, formOfPayment, numberOfInstallments, status);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Despesa salva com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CardsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        txtValor.setText(null);
        txtNumParc.setText(null);
        txtDescricao.setText(null);
        chooserData.setDate(new Date());
    }//GEN-LAST:event_btnLimparMouseClicked

    private void cmbFormaPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormaPayActionPerformed
        if (!cmbFormaPay.getSelectedItem().equals(FormOfPayment.DINHEIRO)) {
            try { // Verifica se o Usuário quer pagar com algum cartão
                txtCart.setVisible(true);
                cmbCartao.setVisible(true);
                boolean valid = c.getCardNumberList(cmbCartao, account.getId());

                if (!valid) { // caso não encontre algum cartão
                    btnSave.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ExpenseScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtCart.setVisible(false);
            cmbCartao.setVisible(false);
            btnSave.setVisible(true);
        }
    }//GEN-LAST:event_cmbFormaPayActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser chooserData;
    public static javax.swing.JComboBox<Integer> cmbCartao;
    private javax.swing.JComboBox<String> cmbCategoria;
    public static javax.swing.JComboBox<FormOfPayment> cmbFormaPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txtCart;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumParc;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
