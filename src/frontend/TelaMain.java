package frontend;
import backend.Main;
import frontend.User.Settings;
import frontend.Admin.Admin;
import frontend.Local.LocalMain;
import frontend.Tarefa.TarefaMain;
import java.awt.Color;

public class TelaMain extends javax.swing.JFrame 
{
    public TelaMain() 
    {
        initComponents();
        loadFrame();
    }

    private void loadFrame()
    {
        UsernameLabel.setText(Main.user.getUsername());
        
        if (Main.user.isAdmin())
            jPainelAdmin.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserIcon = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        jPainelAdmin = new javax.swing.JButton();
        PainelUsuarioButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();
        jCalendar = new com.toedter.calendar.JCalendar();
        jTarefas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLocais = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        UserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 42));

        jPainelAdmin.setBackground(new java.awt.Color(0, 0, 0));
        jPainelAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPainelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jPainelAdmin.setText("Painel do Admin");
        jPainelAdmin.setBorderPainted(false);
        jPainelAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPainelAdmin.setEnabled(false);
        jPainelAdmin.setFocusable(false);
        jPainelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPainelAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPainelAdminMouseExited(evt);
            }
        });
        jPainelAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPainelAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jPainelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 284, 197, 40));

        PainelUsuarioButton.setBackground(new java.awt.Color(0, 0, 0));
        PainelUsuarioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PainelUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        PainelUsuarioButton.setText("Painel do Usuario");
        PainelUsuarioButton.setBorderPainted(false);
        PainelUsuarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PainelUsuarioButton.setFocusable(false);
        PainelUsuarioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PainelUsuarioButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PainelUsuarioButtonMouseExited(evt);
            }
        });
        PainelUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PainelUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PainelUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 197, 40));

        SairButton.setBackground(new java.awt.Color(0, 0, 0));
        SairButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SairButton.setForeground(new java.awt.Color(255, 255, 255));
        SairButton.setText("Sair");
        SairButton.setBorderPainted(false);
        SairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairButton.setFocusable(false);
        SairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairButtonMouseExited(evt);
            }
        });
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 452, 197, 40));

        jCalendar.setDecorationBackgroundColor(new java.awt.Color(235, 235, 235));
        jCalendar.setDecorationBordersVisible(true);
        jCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarMouseClicked(evt);
            }
        });
        getContentPane().add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 205, 600, 290));

        jTarefas.setBackground(new java.awt.Color(0, 0, 0));
        jTarefas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTarefas.setForeground(new java.awt.Color(255, 255, 255));
        jTarefas.setText("Tarefas");
        jTarefas.setBorderPainted(false);
        jTarefas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTarefas.setFocusable(false);
        jTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTarefasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTarefasMouseExited(evt);
            }
        });
        jTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTarefasActionPerformed(evt);
            }
        });
        getContentPane().add(jTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 260, 30));

        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 500));

        jLocais.setBackground(new java.awt.Color(0, 0, 0));
        jLocais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLocais.setForeground(new java.awt.Color(255, 255, 255));
        jLocais.setText("Locais");
        jLocais.setBorderPainted(false);
        jLocais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLocais.setFocusable(false);
        jLocais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLocaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLocaisMouseExited(evt);
            }
        });
        jLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLocaisActionPerformed(evt);
            }
        });
        getContentPane().add(jLocais, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 280, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calendario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 630, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairButtonActionPerformed

    private void PainelUsuarioButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelUsuarioButtonMouseEntered
        PainelUsuarioButton.setBackground(new Color(235, 235, 235));
        PainelUsuarioButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_PainelUsuarioButtonMouseEntered

    private void jPainelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPainelAdminMouseEntered
        jPainelAdmin.setBackground(new Color(235, 235, 235));
        jPainelAdmin.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPainelAdminMouseEntered

    private void SairButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairButtonMouseEntered
        SairButton.setBackground(new Color(235, 235, 235));
        SairButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_SairButtonMouseEntered

    private void PainelUsuarioButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelUsuarioButtonMouseExited
        PainelUsuarioButton.setBackground(Color.BLACK);
        PainelUsuarioButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_PainelUsuarioButtonMouseExited

    private void jPainelAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPainelAdminMouseExited
        jPainelAdmin.setBackground(Color.BLACK);
        jPainelAdmin.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPainelAdminMouseExited

    private void SairButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairButtonMouseExited
        SairButton.setBackground(Color.BLACK);
        SairButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_SairButtonMouseExited

    private void PainelUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PainelUsuarioButtonActionPerformed
        Settings settings = new Settings();
        settings.setVisible(true);
    }//GEN-LAST:event_PainelUsuarioButtonActionPerformed

    private void jPainelAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPainelAdminActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_jPainelAdminActionPerformed

    private void jCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMouseClicked
        
    }//GEN-LAST:event_jCalendarMouseClicked

    private void jTarefasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTarefasMouseEntered
        jTarefas.setBackground(new Color(235, 235, 235));
        jTarefas.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTarefasMouseEntered

    private void jLocaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLocaisMouseEntered
        jLocais.setBackground(new Color(235, 235, 235));
        jLocais.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLocaisMouseEntered

    private void jTarefasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTarefasMouseExited
        jTarefas.setBackground(Color.BLACK);
        jTarefas.setForeground(Color.WHITE);
    }//GEN-LAST:event_jTarefasMouseExited

    private void jLocaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLocaisMouseExited
        jLocais.setBackground(Color.BLACK);
        jLocais.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLocaisMouseExited

    private void jTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTarefasActionPerformed
        TarefaMain tarefas = new TarefaMain();
        tarefas.setVisible(true);
    }//GEN-LAST:event_jTarefasActionPerformed

    private void jLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLocaisActionPerformed
        LocalMain localmain = new LocalMain();
        localmain.setVisible(true);
    }//GEN-LAST:event_jLocaisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PainelUsuarioButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel UsernameLabel;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLocais;
    private javax.swing.JButton jPainelAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jTarefas;
    // End of variables declaration//GEN-END:variables
}
