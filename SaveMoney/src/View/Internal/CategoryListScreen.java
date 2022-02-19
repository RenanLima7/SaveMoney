/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Controller.AccountController;
import Controller.CategoryController;
import Controller.DisplayManager;
import Controller.ExpenseController;
import Model.Entity.Account;
import Model.Home.Category;
import Model.Home.Expense;
import static View.HomeScreen.desktop;
import static View.LoginScreen.email1;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class CategoryListScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form CategoryScreen
     */
    CategoryController c = new CategoryController();
    DisplayManager d = new DisplayManager();

    public CategoryListScreen() throws SQLException {
        initComponents();
        c.getcategoryNameList(cmbCatList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbCatList = new javax.swing.JComboBox<>();
        txtCat = new javax.swing.JTextField();
        txtUpdate = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(30, 30, 60));
        setBorder(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categoria");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("ATUALIZAR");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        cmbCatList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCatListActionPerformed(evt);
            }
        });

        txtCat.setEnabled(false);

        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate1.setText("EXCLUIR");
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1018, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
            .addGroup(layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUpdate)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCatList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(cmbCatList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            Category cat = c.getCategoryByName(cmbCatList.getSelectedItem().toString());
            String update = txtUpdate.getText();

            if (cat == null) {
                JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
            } else if (update.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O Nome da categoria deve ser preenchido!");
            } else {
                boolean sucesso = c.updateCategory(cat.getId(), update);

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso!");
                    this.dispose();
                    d.openInternalFrame(desktop, new CategoryListScreen());
                } else {
                    JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryListScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cmbCatListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCatListActionPerformed
        txtCat.setText(cmbCatList.getSelectedItem().toString());
    }//GEN-LAST:event_cmbCatListActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        int count = 0;
        try {
            Category cat = c.getCategoryByName(cmbCatList.getSelectedItem().toString());

            if (cat == null) {
                JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
            } else {
                ExpenseController exp = new ExpenseController();
                AccountController ac = new AccountController();
                Account account = ac.getAccountByEmail(email1);
                List<Expense> expense = exp.getExpenseListByAccountId(account.getId());
                if (expense != null) {
                    if (expense.size() > 0) {
                        for (Expense e : expense) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "Você não pode excluir a conta!"
                                + "\nEla está cadastrada em " + count + " Despesa(s)!");
                    } else {
                        boolean sucesso = c.deleteCategory(cat.getId());

                        if (sucesso) {
                            JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso!");
                            this.dispose();
                            d.openInternalFrame(desktop, new CategoryListScreen());
                        } else {
                            JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryListScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnClose1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cmbCatList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtUpdate;
    // End of variables declaration//GEN-END:variables
}