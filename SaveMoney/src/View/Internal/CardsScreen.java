/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Controller.AccountController;
import Controller.CardController;
import Model.Entity.*;
import Model.Enums.*;
import View.HomeScreen;
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
public class CardsScreen extends javax.swing.JInternalFrame {

    CardController cc = new CardController();
    AccountController ac = new AccountController();

    public CardsScreen() {
        initComponents();
        cc.getFlagList(cmbFlag);
        cc.getTypeList(cmbType);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        btnSaveCard = new javax.swing.JButton();
        cmbFlag = new javax.swing.JComboBox<>();
        cmbType = new javax.swing.JComboBox<>();
        txtNumber = new javax.swing.JTextField();
        txtLimit = new javax.swing.JTextField();
        txtAnnualValue = new javax.swing.JTextField();
        chosserClosingDate = new com.toedter.calendar.JDateChooser();
        txtDespesas = new javax.swing.JLabel();
        txtDespesas1 = new javax.swing.JLabel();
        txtDespesas2 = new javax.swing.JLabel();
        txtDespesas3 = new javax.swing.JLabel();
        txtDespesas4 = new javax.swing.JLabel();
        txtDespesas5 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);

        pnlFundo.setBackground(new java.awt.Color(34, 36, 81));

        btnSaveCard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveCard.setText("Salvar");
        btnSaveCard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveCardMouseClicked(evt);
            }
        });

        chosserClosingDate.setDateFormatString("dd-MM-yyyy ");

        txtDespesas.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas.setText("Bandeira");

        txtDespesas1.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas1.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas1.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas1.setText("Limite");

        txtDespesas2.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas2.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas2.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas2.setText("Número");

        txtDespesas3.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas3.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas3.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas3.setText("Data de Fechamento");

        txtDespesas4.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas4.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas4.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas4.setText("Tipo");

        txtDespesas5.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas5.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas5.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas5.setText("Valor Anual");

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(txtDespesas2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(txtDespesas1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnnualValue)
                                    .addComponent(txtDespesas4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumber)
                                    .addComponent(cmbType, 0, 220, Short.MAX_VALUE)
                                    .addComponent(txtDespesas5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                                .addComponent(btnSaveCard, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDespesas3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chosserClosingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLimit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbFlag, javax.swing.GroupLayout.Alignment.LEADING, 0, 227, Short.MAX_VALUE))
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDespesas2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDespesas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDespesas4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDespesas5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDespesas3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnnualValue, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(chosserClosingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCardMouseClicked

        try {
            String email = HomeScreen.txtUser.getText();
            Account accountId = ac.getAccountByEmail(email);
            
            Integer number = Integer.parseInt(txtNumber.getText());
            CardType type = (CardType) cmbType.getSelectedItem();
            CardFlag flag = (CardFlag) cmbFlag.getSelectedItem();
            Double limit = Double.parseDouble(txtLimit.getText());
            Double annualValue = Double.parseDouble(txtAnnualValue.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date data = chosserClosingDate.getDate();    
            String dataFormatada = sdf.format(data);
                                     
            boolean sucesso = cc.createCard(accountId.getId(), number, type.getNum(), flag.getNum(), limit, annualValue, dataFormatada);
            
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Cartão salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CardsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveCardMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        txtNumber.setText(null);
        txtLimit.setText(null);
        chosserClosingDate.setDate(new Date());
        txtAnnualValue.setText(null);    
    }//GEN-LAST:event_btnLimparMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSaveCard;
    private com.toedter.calendar.JDateChooser chosserClosingDate;
    private javax.swing.JComboBox<CardFlag> cmbFlag;
    private javax.swing.JComboBox<CardType> cmbType;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JTextField txtAnnualValue;
    private javax.swing.JLabel txtDespesas;
    private javax.swing.JLabel txtDespesas1;
    private javax.swing.JLabel txtDespesas2;
    private javax.swing.JLabel txtDespesas3;
    private javax.swing.JLabel txtDespesas4;
    private javax.swing.JLabel txtDespesas5;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}