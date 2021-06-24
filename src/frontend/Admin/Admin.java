package frontend.Admin;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends javax.swing.JFrame 
{
    public Admin() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSair = new javax.swing.JButton();
        jCadastrar = new javax.swing.JButton();
        jControle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jSair.setBackground(new java.awt.Color(0, 0, 0));
        jSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSair.setForeground(new java.awt.Color(255, 255, 255));
        jSair.setText("Sair");
        jSair.setBorderPainted(false);
        jSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair.setFocusable(false);
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSairMouseExited(evt);
            }
        });
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });

        jCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jCadastrar.setText("Cadastrar Usuario");
        jCadastrar.setBorderPainted(false);
        jCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCadastrar.setFocusable(false);
        jCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCadastrarMouseExited(evt);
            }
        });
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jControle.setBackground(new java.awt.Color(0, 0, 0));
        jControle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jControle.setForeground(new java.awt.Color(255, 255, 255));
        jControle.setText("Controle de Usuarios");
        jControle.setBorderPainted(false);
        jControle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jControle.setFocusable(false);
        jControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jControleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jControleMouseExited(evt);
            }
        });
        jControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jControleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jControle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        newUser newuser = new newUser();
        newuser.setVisible(true);
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarMouseEntered
        jCadastrar.setBackground(new Color(235, 235, 235));
        jCadastrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCadastrarMouseEntered

    private void jControleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jControleMouseEntered
        jControle.setBackground(new Color(235, 235, 235));
        jControle.setForeground(Color.BLACK);
    }//GEN-LAST:event_jControleMouseEntered

    private void jCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarMouseExited
        jCadastrar.setBackground(Color.BLACK);
        jCadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jCadastrarMouseExited

    private void jControleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jControleMouseExited
        jControle.setBackground(Color.BLACK);
        jControle.setForeground(Color.WHITE);
    }//GEN-LAST:event_jControleMouseExited

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    private void jControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jControleActionPerformed
        userControl usercontrol;
        try 
        {
            usercontrol = new userControl();
            usercontrol.setVisible(true);
        } catch (SQLException ex) 
        {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jControleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrar;
    private javax.swing.JButton jControle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    // End of variables declaration//GEN-END:variables
}
