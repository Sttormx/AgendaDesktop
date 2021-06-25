package frontend.Admin;
import backend.Main;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import util.MySQL;

public class userControl extends javax.swing.JFrame 
{
    // Array com todos os users
    int users[] = new int[50];
    
    public userControl() throws SQLException 
    {
        initComponents();
        loadAllUsers();
    }

    private void loadAllUsers() throws SQLException
    {
        String SQL = "SELECT User_ID, nome FROM usuario;";
        
        int k = 0;
        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL)) 
        {
            while (resultado.next())
            {
                this.users[k] = resultado.getInt("User_ID");
                this.jUserBox.addItem(resultado.getString("Nome"));
                k++;
            }
        }  
    }
    
    private void loadUser(int UserID) throws SQLException
    {
        String SQL = "SELECT * FROM usuario WHERE User_ID = " + this.users[UserID] + ";";
        
        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL))
        {
            while (resultado.next())
            {
                jNome.setText(resultado.getString("Nome"));
                jLogin.setText(resultado.getString("User"));
                jSenha.setText(resultado.getString("Senha"));
                jNotify.setSelected(resultado.getInt("Notificacoes") > 0);
                jAdmin.setSelected(resultado.getInt("Administrador") > 0);
            }  
        }
    }
    
    private void saveUser(int UserID, String newName, String newLogin, String newSenha, int Notify, int Admin) throws SQLException
    {
        String SQL = "UPDATE usuario SET ";
        SQL += "User = '" + newLogin + "', ";
        SQL += "Senha = '" + newSenha + "', ";
        SQL += "Nome = '" + newName + "', ";
        SQL += "Notificacoes = " + Notify + ", ";
        SQL += "Administrador = " + Admin + " ";
        SQL += "WHERE User_ID = " + this.users[UserID] + ";";
        
        System.out.println(SQL);
        MySQL.executeUpdate(Main.connection, SQL);
    }
    
    private void deleteUser(int UserID) throws SQLException
    {
        String SQL = "DELETE FROM usuario WHERE User_ID = " + UserID + ";";
        MySQL.executeDelete(Main.connection, SQL);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jUserBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jNome = new backend.Hints.JTextFieldHint(new JTextField(), "nome", "Nome");
        jLabel3 = new javax.swing.JLabel();
        jLogin = new backend.Hints.JTextFieldHint(new JTextField(), "userLogin", "Login");
        jSenha = new backend.Hints.JTextFieldHint(new JTextField(), "keys", "Senha");
        jSalvar = new javax.swing.JButton();
        jDeletar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jNotify = new javax.swing.JCheckBox();
        jAdmin = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/controles.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jUserBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Escolha o Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Informacoes do Usuario:");

        jSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jSalvar.setText("Salvar");
        jSalvar.setBorderPainted(false);
        jSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalvar.setFocusable(false);
        jSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSalvarMouseExited(evt);
            }
        });
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jDeletar.setBackground(new java.awt.Color(255, 51, 51));
        jDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDeletar.setForeground(new java.awt.Color(255, 255, 255));
        jDeletar.setText("Deletar");
        jDeletar.setBorderPainted(false);
        jDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDeletar.setFocusable(false);
        jDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDeletarMouseExited(evt);
            }
        });
        jDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarActionPerformed(evt);
            }
        });

        jSair.setBackground(new java.awt.Color(0, 0, 0));
        jSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jNotify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNotify.setText("Notificacoes");

        jAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAdmin.setText("Administrador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Login");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Senha");

        jError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSenha)
                    .addComponent(jLogin)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNotify)
                            .addComponent(jUserBox, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAdmin)
                            .addComponent(jDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jNotify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jError)
                .addGap(18, 18, 18)
                .addComponent(jSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jUserBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserBoxActionPerformed
        int userID = jUserBox.getSelectedIndex();
        
        if (userID >= 0)
        {
            try 
            {
                loadUser(userID);
            } catch (SQLException ex) 
            {
                Logger.getLogger(userControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jUserBoxActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    private void jSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarMouseEntered
        jSalvar.setBackground(new Color(235, 235, 235));
        jSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSalvarMouseEntered

    private void jDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeletarMouseEntered
        jDeletar.setBackground(new Color(235, 235, 235));
        jDeletar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jDeletarMouseEntered

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarMouseExited
        jSalvar.setBackground(Color.BLACK);
        jSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSalvarMouseExited

    private void jDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeletarMouseExited
        jDeletar.setBackground(Color.RED);
        jDeletar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jDeletarMouseExited

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        int userID = jUserBox.getSelectedIndex();
        
        if (userID < 0)
        {
            jError.setText("Selecione um usuario.");
            return;
        }
        
        String Nome = jNome.getText();
        String Login = jLogin.getText();
        String Senha = jSenha.getText();
        int notify = jNotify.isSelected() ? 1 : 0;
        int admin = jAdmin.isSelected() ? 1 : 0;
        
        if (Nome.length() > 3 && Nome.length() <= 25)
            if (Login.length() > 3 && Login.length() <= 20)
                if (Senha.length() > 3 && Senha.length() <= 20)
                {
                    try 
                    {
                        saveUser(userID, Nome, Login, Senha, notify, admin);
                        jError.setText("");
                        dispose();
                    } catch (SQLException ex) 
                    {
                        Logger.getLogger(userControl.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                }
                else
                    jError.setText("Digite uma senha entre 4 a 20 caracteres.");
            else
                jError.setText("Digite um login entre 4 a 20 caracteres.");
        else
            jError.setText("Digite um nome entre 4 a 20 caracteres.");
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarActionPerformed
        int UserID = this.users[jUserBox.getSelectedIndex()];
        
        if (UserID < 0)
        {
            jError.setText("Selecione um usuario.");
            return;
        }
        
        if (UserID == Main.user.userID)
        {
            jError.setText("Voce nao pode deletar si mesmo.");
            return;  
        }
        
        try 
        {
            deleteUser(UserID);
            this.jUserBox.removeAllItems();
            this.loadAllUsers();
            jError.setText("");
        } catch (SQLException ex) 
        {
            Logger.getLogger(userControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDeletarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAdmin;
    private javax.swing.JButton jDeletar;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNome;
    private javax.swing.JCheckBox jNotify;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    private javax.swing.JButton jSalvar;
    private javax.swing.JTextField jSenha;
    private javax.swing.JComboBox<String> jUserBox;
    // End of variables declaration//GEN-END:variables
}
