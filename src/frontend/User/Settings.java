package frontend.User;
import javax.swing.JTextField;
import backend.User;
import backend.Main;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings extends javax.swing.JFrame 
{
    public Settings() 
    {
        initComponents();
        loadUserSettings();
    }

    private void loadUserSettings()
    {
        User user = Main.user;
        
        jNomeField.setText(user.getUsername());
        jLoginField.setText(user.getLogin());
        jNotify.setSelected(user._getNotify() > 0);
    }
    
    private void saveUserSettings(String Username, String Login) throws Exception
    {
       User user = Main.user;
       
       user.setUsername(Username);
       user.setLogin(Login);
       user.setNotify(jNotify.isSelected() ? 1 : 0);
       user.saveUser();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNomeField = new backend.Hints.JTextFieldHint(new JTextField(), "userLogin", "Usuario")
        ;
        jLabel3 = new javax.swing.JLabel();
        jLoginField = new backend.Hints.JTextFieldHint(new JTextField(), "Login", "Login");
        jNotify = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTrocarSenha = new javax.swing.JButton();
        jSalvarButton = new javax.swing.JButton();
        jSairButton = new javax.swing.JButton();
        jError = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/userSettings.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Login:");

        jNotify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNotify.setText("Notificacoes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Senha:");

        jTrocarSenha.setBackground(new java.awt.Color(0, 0, 0));
        jTrocarSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTrocarSenha.setForeground(new java.awt.Color(255, 255, 255));
        jTrocarSenha.setText("Trocar Senha");
        jTrocarSenha.setBorderPainted(false);
        jTrocarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTrocarSenha.setFocusable(false);
        jTrocarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTrocarSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTrocarSenhaMouseExited(evt);
            }
        });
        jTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrocarSenhaActionPerformed(evt);
            }
        });

        jSalvarButton.setBackground(new java.awt.Color(0, 0, 0));
        jSalvarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSalvarButton.setForeground(new java.awt.Color(255, 255, 255));
        jSalvarButton.setText("Salvar");
        jSalvarButton.setBorderPainted(false);
        jSalvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalvarButton.setFocusable(false);
        jSalvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalvarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSalvarButtonMouseExited(evt);
            }
        });
        jSalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarButtonActionPerformed(evt);
            }
        });

        jSairButton.setBackground(new java.awt.Color(0, 0, 0));
        jSairButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSairButton.setForeground(new java.awt.Color(255, 255, 255));
        jSairButton.setText("Sair");
        jSairButton.setBorderPainted(false);
        jSairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSairButton.setFocusable(false);
        jSairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSairButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSairButtonMouseExited(evt);
            }
        });
        jSairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairButtonActionPerformed(evt);
            }
        });

        jError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNomeField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLoginField)
                    .addComponent(jNotify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrocarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSalvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jNotify)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTrocarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrocarSenhaActionPerformed
        Password password = new Password();
        password.setVisible(true);
    }//GEN-LAST:event_jTrocarSenhaActionPerformed

    private void jSalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarButtonActionPerformed
        String Username = jNomeField.getText();
        String Login = jLoginField.getText();
        
        if (Username.length() > 3 && Username.length() < 30)
            if (Login.length() > 3 && Login.length() < 20)
            {
                try 
                {
                    saveUserSettings(Username, Login);
                    dispose();
                } catch (Exception ex) 
                {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            else
                jError.setText("Login Invalido.");
        else
            jError.setText("Nome Invalido.");
            
    }//GEN-LAST:event_jSalvarButtonActionPerformed

    private void jSairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jSairButtonActionPerformed

    private void jTrocarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrocarSenhaMouseEntered
        jTrocarSenha.setBackground(new Color(235, 235, 235));
        jTrocarSenha.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTrocarSenhaMouseEntered

    private void jSalvarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarButtonMouseEntered
        jSalvarButton.setBackground(new Color(235, 235, 235));
        jSalvarButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSalvarButtonMouseEntered

    private void jSairButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairButtonMouseEntered
        jSairButton.setBackground(new Color(235, 235, 235));
        jSairButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairButtonMouseEntered

    private void jTrocarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrocarSenhaMouseExited
        jTrocarSenha.setBackground(Color.BLACK);
        jTrocarSenha.setForeground(Color.WHITE);
    }//GEN-LAST:event_jTrocarSenhaMouseExited

    private void jSalvarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarButtonMouseExited
        jSalvarButton.setBackground(Color.BLACK);
        jSalvarButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSalvarButtonMouseExited

    private void jSairButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairButtonMouseExited
        jSairButton.setBackground(Color.BLACK);
        jSairButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jLoginField;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JCheckBox jNotify;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSairButton;
    private javax.swing.JButton jSalvarButton;
    private javax.swing.JButton jTrocarSenha;
    // End of variables declaration//GEN-END:variables
}
