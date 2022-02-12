/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.Entity.*;
import Model.Enums;
import Model.Home.*;
import View.Internal.*;
import java.awt.*;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Jocelio
 */
public class HomeScreen extends javax.swing.JFrame {

    DisplayManager d = new DisplayManager();

    public HomeScreen() {
        initComponents();
        setIcon();
        pegarResolucao();
        setLocationRelativeTo(null);  //Carrega o form no centro da tela
    }

    private void pegarResolucao() {         //Calcula a resoluçao para se adaptara diferentes telas
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width + 5), (dimensao.height - 38));
    }

    private void setIcon() {
        URL url = this.getClass().getResource("/Images/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PainelLateral = new javax.swing.JPanel();
        PainelLateralTop = new javax.swing.JPanel();
        txtUser = new javax.swing.JLabel();
        pnlCategorias = new javax.swing.JPanel();
        lblIconCategoria = new javax.swing.JLabel();
        txtCategorias = new javax.swing.JLabel();
        pnlCartao = new javax.swing.JPanel();
        lblIconCartao = new javax.swing.JLabel();
        txtCartao = new javax.swing.JLabel();
        pnlReceitas = new javax.swing.JPanel();
        lblIconReceitas = new javax.swing.JLabel();
        txtReceitas = new javax.swing.JLabel();
        pnlDespesas = new javax.swing.JPanel();
        lblIconDespesas = new javax.swing.JLabel();
        txtDespesas = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        PainelTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SaveMoney");
        setLocationByPlatform(true);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelLateral.setBackground(new java.awt.Color(54, 33, 89));
        PainelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelLateralTop.setBackground(new java.awt.Color(29, 31, 62));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 20);
        flowLayout1.setAlignOnBaseline(true);
        PainelLateralTop.setLayout(flowLayout1);

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("USER");
        PainelLateralTop.add(txtUser);

        PainelLateral.add(PainelLateralTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        pnlCategorias.setBackground(new java.awt.Color(85, 65, 118));
        pnlCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCategoriasMouseExited(evt);
            }
        });

        lblIconCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N

        txtCategorias.setBackground(new java.awt.Color(213, 220, 224));
        txtCategorias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCategorias.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCategorias.setText("Categorias");

        javax.swing.GroupLayout pnlCategoriasLayout = new javax.swing.GroupLayout(pnlCategorias);
        pnlCategorias.setLayout(pnlCategoriasLayout);
        pnlCategoriasLayout.setHorizontalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblIconCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(txtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCategoriasLayout.setVerticalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelLateral.add(pnlCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 310, 60));

        pnlCartao.setBackground(new java.awt.Color(85, 65, 118));
        pnlCartao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCartaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCartaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCartaoMouseExited(evt);
            }
        });

        lblIconCartao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconCartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_bank_card_dollar_48px.png"))); // NOI18N

        txtCartao.setBackground(new java.awt.Color(213, 220, 224));
        txtCartao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCartao.setForeground(new java.awt.Color(255, 255, 255));
        txtCartao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCartao.setText("Cartões");

        javax.swing.GroupLayout pnlCartaoLayout = new javax.swing.GroupLayout(pnlCartao);
        pnlCartao.setLayout(pnlCartaoLayout);
        pnlCartaoLayout.setHorizontalGroup(
            pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblIconCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCartaoLayout.setVerticalGroup(
            pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelLateral.add(pnlCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 310, 60));

        pnlReceitas.setBackground(new java.awt.Color(85, 65, 118));
        pnlReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReceitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReceitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReceitasMouseExited(evt);
            }
        });

        lblIconReceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_money_bag_48px.png"))); // NOI18N

        txtReceitas.setBackground(new java.awt.Color(213, 220, 224));
        txtReceitas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtReceitas.setForeground(new java.awt.Color(255, 255, 255));
        txtReceitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReceitas.setText("Receitas");

        javax.swing.GroupLayout pnlReceitasLayout = new javax.swing.GroupLayout(pnlReceitas);
        pnlReceitas.setLayout(pnlReceitasLayout);
        pnlReceitasLayout.setHorizontalGroup(
            pnlReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceitasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblIconReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(txtReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlReceitasLayout.setVerticalGroup(
            pnlReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceitasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelLateral.add(pnlReceitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 310, 60));

        pnlDespesas.setBackground(new java.awt.Color(85, 65, 118));
        pnlDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDespesasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDespesasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDespesasMouseExited(evt);
            }
        });

        lblIconDespesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_money_box_48px.png"))); // NOI18N

        txtDespesas.setBackground(new java.awt.Color(213, 220, 224));
        txtDespesas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDespesas.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas.setText("Despesas");

        javax.swing.GroupLayout pnlDespesasLayout = new javax.swing.GroupLayout(pnlDespesas);
        pnlDespesas.setLayout(pnlDespesasLayout);
        pnlDespesasLayout.setHorizontalGroup(
            pnlDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDespesasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblIconDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDespesasLayout.setVerticalGroup(
            pnlDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDespesasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelLateral.add(pnlDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 310, 60));

        Background.add(PainelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 720));

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setMaximumSize(new java.awt.Dimension(1170, 640));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        Background.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1170, 640));

        PainelTopo.setBackground(new java.awt.Color(122, 72, 221));
        PainelTopo.setPreferredSize(new java.awt.Dimension(1043, 115));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("PRINCIPAL");

        javax.swing.GroupLayout PainelTopoLayout = new javax.swing.GroupLayout(PainelTopo);
        PainelTopo.setLayout(PainelTopoLayout);
        PainelTopoLayout.setHorizontalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopoLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTopoLayout.setVerticalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTopoLayout.createSequentialGroup()
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(PainelTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1171, 86));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EFEITO HOVER//
    public void mouseEnteredButton(JPanel p, JLabel l) {
        p.setBackground(new Color(29, 31, 62));
        //l.setFont(font);
    }

    public void mouseExitedButton(JPanel p, JLabel l) {
        p.setBackground(new Color(51, 51, 76));
    }
    //FIM DO EFEITO//    

    private void pnlCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriasMouseEntered
        mouseEnteredButton(pnlCategorias, txtCategorias);
    }//GEN-LAST:event_pnlCategoriasMouseEntered

    private void pnlCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriasMouseExited
        mouseExitedButton(pnlCategorias, txtCategorias);
    }//GEN-LAST:event_pnlCategoriasMouseExited

    private void pnlCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriasMouseClicked
        txtTitulo.setText("CATEGORIAS");

        d.openCategory(desktop);
    }//GEN-LAST:event_pnlCategoriasMouseClicked

    private void pnlCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCartaoMouseClicked
        txtTitulo.setText("CARTÕES");

        AccountController ac = new AccountController();
        CardController c = new CardController();

        String email = HomeScreen.txtUser.getText();

        try {
            Account account = ac.getAccountByEmail(email);
            Card card = c.getCardByAccountId(account.getId());

            if (card.getId() != null) {
                CardViewScreenn screen = new CardViewScreenn();
                d.openInternalFrame(desktop, screen);
            } else { // Se o usuário não tiver cartão
                CardsScreen screen = new CardsScreen();
                d.openInternalFrame(desktop, screen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlCartaoMouseClicked

    private void pnlCartaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCartaoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCartaoMouseEntered

    private void pnlCartaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCartaoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCartaoMouseExited

    private void pnlReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReceitasMouseClicked
        txtTitulo.setText("RECEITAS");
    }//GEN-LAST:event_pnlReceitasMouseClicked

    private void pnlReceitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReceitasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlReceitasMouseEntered

    private void pnlReceitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReceitasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlReceitasMouseExited

    private void pnlDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDespesasMouseClicked
        txtTitulo.setText("DESPESAS");

        try {
            d.openExpense(desktop);
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlDespesasMouseClicked

    private void pnlDespesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDespesasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDespesasMouseEntered

    private void pnlDespesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDespesasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDespesasMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JPanel PainelLateralTop;
    private javax.swing.JPanel PainelTopo;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel lblIconCartao;
    private javax.swing.JLabel lblIconCategoria;
    private javax.swing.JLabel lblIconDespesas;
    private javax.swing.JLabel lblIconReceitas;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlDespesas;
    private javax.swing.JPanel pnlReceitas;
    private javax.swing.JLabel txtCartao;
    private javax.swing.JLabel txtCategorias;
    private javax.swing.JLabel txtDespesas;
    private javax.swing.JLabel txtReceitas;
    private javax.swing.JLabel txtTitulo;
    public static javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
