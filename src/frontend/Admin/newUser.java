package frontend.Admin;
import backend.Main;
import util.MySQL;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class newUser extends javax.swing.JFrame 
{
    public newUser() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNome = new backend.Hints.JTextFieldHint(new JTextField(), "nome", "Nome");
        jLogin = new backend.Hints.JTextFieldHint(new JTextField(), "userLogin", "Login");
        jSenha = new backend.Hints.JTextFieldHint(new JTextField(), "keys", "Senha");
        jRSenha = new backend.Hints.JTextFieldHint(new JTextField(), "keys", "Repita a Senha");
        jCadastrar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jAdmin = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cadastro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jCadastrar.setText("Cadastrar");
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha");

        jAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jAdmin.setText("Administrador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preencha as informacoes:");

        jError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jNome)
                    .addComponent(jLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAdmin)
                .addGap(18, 18, 18)
                .addComponent(jError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        String nome = jNome.getText();
        String login = jLogin.getText();
        int admin = jAdmin.isSelected() ? 1 : 0;
        
        if (nome.length() > 3 && nome.length() <= 25)
            if (login.length() > 0 && login.length() <= 20)
            {
                jError.setText("");
                String password = jSenha.getText();
                String r_password = jRSenha.getText();
                
                if (password.length() > 3 && password.length() <= 20)
                    if (password.equals(r_password))
                    {
                        String SQL = "INSERT INTO usuario(User, Senha, Nome, Notificacoes, Administrador) VALUES('" + login +"', '" + password + "', '" + nome + "', 0, " + admin +");";
                        System.out.println(SQL);
                        
                        try 
                        {
                            MySQL.executeInsert(Main.connection, SQL);
                            dispose();
                        } catch (SQLException ex) 
                        {
                            Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                       jError.setText("As senhas nao coincidem."); 
                else
                   jError.setText("Insira uma senha entre 4 a 20 caracteres."); 
            }
            else
                jError.setText("Insira um nome entre 4 a 25 caracteres.");
        else
            jError.setText("Insira um login entre 4 a 20 caracteres.");
        
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    private void jCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarMouseEntered
        jCadastrar.setBackground(new Color(235, 235, 235));
        jCadastrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCadastrarMouseEntered

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarMouseExited
        jCadastrar.setBackground(Color.BLACK);
        jCadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jCadastrarMouseExited

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAdmin;
    private javax.swing.JButton jCadastrar;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRSenha;
    private javax.swing.JButton jSair;
    private javax.swing.JTextField jSenha;
    // End of variables declaration//GEN-END:variables
}
