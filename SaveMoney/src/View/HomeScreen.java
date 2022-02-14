/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.Entity.*;
import Model.Home.*;
import View.Internal.*;
import static View.LoginScreen.*;
import java.awt.*;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Jocelio
 */
public final class HomeScreen extends javax.swing.JFrame {

    DisplayManager d = new DisplayManager();
    AccountController ac = new AccountController();
    String email = ac.getAccountByEmail(email1).getEmail();

    public HomeScreen() throws Exception {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        d.pegarResolucao(this);
        d.openInternalFrame(desktop, new DashboardScreen());
        // Hover
        mouseResetButton();
        mouseClickedButton(pnlDashboard, txtDashboard);
        // Usuário
        String[] firstName = name1.split(" ");
        txtUser.setText(firstName[0]);
        txtEmail.setText(email1);
        blobToImage(avatar, labelAvatar);
    }

    private void setIcon() {
        URL url = this.getClass().getResource("/Images/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    public void blobToImage(Blob blobBD, JLabel label) throws Exception {
        //Converte blob em Image
        byte[] image = blobBD.getBytes(1, (int) blobBD.length());
        Image img = Toolkit.getDefaultToolkit().createImage(image);

        //Escala imagen dentro do JLabel (no meu caso o JLabel possui: 272 por 192)
        Image newimg = img.getScaledInstance(labelAvatar.getWidth(), labelAvatar.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);

        //Apresenta a imagem no componente JLabel
        label.setIcon(imageIcon);
    }

    //EFEITO HOVER//
    public void mouseClickedButton(JPanel p, JLabel l) {
        p.setBackground(new Color(85, 65, 118));
        l.setForeground(new Color(255, 255, 255));
    }

    public void mouseResetButton() {
        pnlDashboard.setBackground(new Color(64, 43, 100));
        pnlDespesas.setBackground(new Color(64, 43, 100));
        pnlReceitas.setBackground(new Color(64, 43, 100));
        pnlCartoes.setBackground(new Color(64, 43, 100));
        pnlCategorias.setBackground(new Color(64, 43, 100));

        txtDashboard.setForeground(new Color(200, 200, 200));
        txtDespesas.setForeground(new Color(200, 200, 200));
        txtReceitas.setForeground(new Color(200, 200, 200));
        txtCartoes.setForeground(new Color(200, 200, 200));
        txtCategorias.setForeground(new Color(200, 200, 200));
    }
    //FIM DO EFEITO//        

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
        pnlCategorias = new javax.swing.JPanel();
        IconCategoria = new javax.swing.JLabel();
        txtCategorias = new javax.swing.JLabel();
        pnlDespesas = new javax.swing.JPanel();
        txtDespesas = new javax.swing.JLabel();
        IconDespesas = new javax.swing.JLabel();
        pnlReceitas = new javax.swing.JPanel();
        txtReceitas = new javax.swing.JLabel();
        IconReceitas = new javax.swing.JLabel();
        pnlUsuario = new javax.swing.JPanel();
        labelAvatar = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        IconCategoria1 = new javax.swing.JLabel();
        pnlConfig = new javax.swing.JPanel();
        IconCategoria2 = new javax.swing.JLabel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        txtDashboard = new javax.swing.JLabel();
        IconDashboard = new javax.swing.JLabel();
        pnlCartoes = new javax.swing.JPanel();
        txtCartoes = new javax.swing.JLabel();
        IconCartoes = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        PainelTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SaveMoney");
        setLocationByPlatform(true);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(34, 36, 81));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelLateral.setBackground(new java.awt.Color(54, 33, 89));
        PainelLateral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCategorias.setBackground(new java.awt.Color(64, 43, 100));
        pnlCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCategoriasMouseClicked(evt);
            }
        });
        pnlCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_management_48px.png"))); // NOI18N
        pnlCategorias.add(IconCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtCategorias.setBackground(new java.awt.Color(213, 220, 224));
        txtCategorias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCategorias.setForeground(new java.awt.Color(200, 200, 200));
        txtCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCategorias.setText("Categorias");
        pnlCategorias.add(txtCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 200, 70));

        PainelLateral.add(pnlCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 310, 70));

        pnlDespesas.setBackground(new java.awt.Color(64, 43, 100));
        pnlDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDespesasMouseClicked(evt);
            }
        });

        txtDespesas.setBackground(new java.awt.Color(213, 220, 224));
        txtDespesas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDespesas.setForeground(new java.awt.Color(200, 200, 200));
        txtDespesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas.setText("Despesas");

        IconDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_money_box_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlDespesasLayout = new javax.swing.GroupLayout(pnlDespesas);
        pnlDespesas.setLayout(pnlDespesasLayout);
        pnlDespesasLayout.setHorizontalGroup(
            pnlDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDespesasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(IconDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDespesasLayout.setVerticalGroup(
            pnlDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDespesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDespesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconDespesas)
                .addContainerGap())
        );

        PainelLateral.add(pnlDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 310, 70));

        pnlReceitas.setBackground(new java.awt.Color(64, 43, 100));
        pnlReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReceitasMouseClicked(evt);
            }
        });

        txtReceitas.setBackground(new java.awt.Color(213, 220, 224));
        txtReceitas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtReceitas.setForeground(new java.awt.Color(200, 200, 200));
        txtReceitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReceitas.setText("Receitas");

        IconReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_money_bag_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlReceitasLayout = new javax.swing.GroupLayout(pnlReceitas);
        pnlReceitas.setLayout(pnlReceitasLayout);
        pnlReceitasLayout.setHorizontalGroup(
            pnlReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReceitasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(IconReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(txtReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlReceitasLayout.setVerticalGroup(
            pnlReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReceitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReceitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconReceitas)
                .addContainerGap())
        );

        PainelLateral.add(pnlReceitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, 70));

        pnlUsuario.setBackground(new java.awt.Color(30, 20, 60));

        labelAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        labelAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelAvatar.setMinimumSize(new java.awt.Dimension(30, 20));

        txtEmail.setBackground(new java.awt.Color(213, 220, 224));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(213, 220, 224));
        txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmail.setText("Email");

        txtUser.setBackground(new java.awt.Color(213, 220, 224));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtUser.setForeground(new java.awt.Color(213, 220, 224));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUser.setText("User");

        pnlLogout.setBackground(new java.awt.Color(64, 43, 100));
        pnlLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseClicked(evt);
            }
        });
        pnlLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconCategoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_exit_48px_1.png"))); // NOI18N
        pnlLogout.add(IconCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        pnlConfig.setBackground(new java.awt.Color(64, 43, 100));
        pnlConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConfigMouseClicked(evt);
            }
        });
        pnlConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconCategoria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_settings_48px.png"))); // NOI18N
        pnlConfig.add(IconCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(pnlConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PainelLateral.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 310, 240));

        pnlLogo.setBackground(new java.awt.Color(30, 20, 60));

        lblLogo.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("SAVE MONEY");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap())
        );

        PainelLateral.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        pnlDashboard.setBackground(new java.awt.Color(85, 65, 118));
        pnlDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDashboardMouseClicked(evt);
            }
        });

        txtDashboard.setBackground(new java.awt.Color(213, 220, 224));
        txtDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDashboard.setForeground(new java.awt.Color(255, 255, 255));
        txtDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDashboard.setText("Dashboard");

        IconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_pulse_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(IconDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txtDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconDashboard)
                .addContainerGap())
        );

        PainelLateral.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 310, 70));

        pnlCartoes.setBackground(new java.awt.Color(64, 43, 100));
        pnlCartoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCartoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCartoesMouseClicked(evt);
            }
        });

        txtCartoes.setBackground(new java.awt.Color(213, 220, 224));
        txtCartoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCartoes.setForeground(new java.awt.Color(200, 200, 200));
        txtCartoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCartoes.setText("Cartões");

        IconCartoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_bank_card_dollar_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlCartoesLayout = new javax.swing.GroupLayout(pnlCartoes);
        pnlCartoes.setLayout(pnlCartoesLayout);
        pnlCartoesLayout.setHorizontalGroup(
            pnlCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCartoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(IconCartoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(txtCartoes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCartoesLayout.setVerticalGroup(
            pnlCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCartoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCartoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconCartoes)
                .addContainerGap())
        );

        PainelLateral.add(pnlCartoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 310, 70));

        Background.add(PainelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 730));

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        desktop.setMaximumSize(new java.awt.Dimension(1170, 640));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        Background.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1170, 650));

        PainelTopo.setBackground(new java.awt.Color(115, 60, 200));
        PainelTopo.setPreferredSize(new java.awt.Dimension(1043, 115));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelTopoLayout = new javax.swing.GroupLayout(PainelTopo);
        PainelTopo.setLayout(PainelTopoLayout);
        PainelTopoLayout.setHorizontalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTopoLayout.createSequentialGroup()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        PainelTopoLayout.setVerticalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelTopoLayout.createSequentialGroup()
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(PainelTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1070, 86));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriasMouseClicked
        txtTitulo.setText("Categorias");
        mouseResetButton();
        mouseClickedButton(pnlCategorias, txtCategorias);
        d.openInternalFrame(desktop, new CategoryScreen());
    }//GEN-LAST:event_pnlCategoriasMouseClicked

    private void pnlCartoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCartoesMouseClicked
        txtTitulo.setText("Cartões");
        mouseResetButton();
        mouseClickedButton(pnlCartoes, txtCartoes);

        AccountController ac = new AccountController();
        CardController c = new CardController();

        String email = this.email;

        try {
            Account account = ac.getAccountByEmail(email);
            Card card = c.getCardByAccountId(account.getId());

            if (card != null) {
                d.openInternalFrame(desktop, new CardViewScreen());
            } else { // Se o usuário não tiver cartão
                d.openInternalFrame(desktop, new CardsScreen());
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlCartoesMouseClicked

    private void pnlDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDespesasMouseClicked
        txtTitulo.setText("Despesas");
        mouseResetButton();
        mouseClickedButton(pnlDespesas, txtDespesas);

        try {
            d.openInternalFrame(desktop, new ExpenseScreen());
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlDespesasMouseClicked

    private void pnlReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReceitasMouseClicked
        txtTitulo.setText("Receitas");
        mouseResetButton();
        mouseClickedButton(pnlReceitas, txtReceitas);
        d.openInternalFrame(desktop, new RevenueScreen());
    }//GEN-LAST:event_pnlReceitasMouseClicked

    private void pnlDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMouseClicked
        txtTitulo.setText("Dashboard");
        mouseResetButton();
        mouseClickedButton(pnlDashboard, txtDashboard);
        d.openInternalFrame(desktop, new DashboardScreen());
    }//GEN-LAST:event_pnlDashboardMouseClicked

    private void pnlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseClicked
        int close = JOptionPane.showConfirmDialog(this, "Você será deslogado, quer continuar?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (close == JOptionPane.YES_OPTION) {
            d.openFrame(new LoginScreen());
            this.dispose();
        }
    }//GEN-LAST:event_pnlLogoutMouseClicked

    private void pnlConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfigMouseClicked
        // Config do Usuário
    }//GEN-LAST:event_pnlConfigMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int close = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (close == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
                try {
                    new HomeScreen().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel IconCartoes;
    private javax.swing.JLabel IconCategoria;
    private javax.swing.JLabel IconCategoria1;
    private javax.swing.JLabel IconCategoria2;
    private javax.swing.JLabel IconDashboard;
    private javax.swing.JLabel IconDespesas;
    private javax.swing.JLabel IconReceitas;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JPanel PainelTopo;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel labelAvatar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlCartoes;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlConfig;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlDespesas;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlReceitas;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JLabel txtCartoes;
    private javax.swing.JLabel txtCategorias;
    private javax.swing.JLabel txtDashboard;
    private javax.swing.JLabel txtDespesas;
    public static javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtReceitas;
    private javax.swing.JLabel txtTitulo;
    public static javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
