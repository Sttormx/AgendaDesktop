package frontend;
import backend.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MySQL;

public class LoginFrame extends javax.swing.JFrame 
{
    public LoginFrame() 
    {
        initComponents();
    }

    public static int VerificarLogin(String Login, String Password) throws Exception
    {
        // Inicia a Conexao;
        Connection conn = MySQL.abrir();
        
        // SQL
        String SQL = "SELECT User_ID FROM usuario WHERE User = '" + Login + "' AND Senha = '" + Password + "';";
        PreparedStatement comando = conn.prepareStatement(SQL);
        ResultSet resultado = comando.executeQuery();
        
        int k = 0;        
        while (resultado.next())
            k = resultado.getInt("User_ID");
            
        resultado.close();
        comando.close();
        conn.close();
        return k;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SairButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        UserField = new javax.swing.JTextField();
        ErrorLabel = new javax.swing.JLabel();
        EntrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGENDA DESKTOP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/agenda.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 0, 70, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 210, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 10, 70, 80);

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SairButton);
        SairButton.setBounds(220, 230, 80, 24);

        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 90, 44, 50);

        jLabel6.setText("Senha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 140, 40, 40);
        getContentPane().add(PasswordField);
        PasswordField.setBounds(270, 150, 110, 30);
        getContentPane().add(UserField);
        UserField.setBounds(270, 100, 110, 30);

        ErrorLabel.setBackground(new java.awt.Color(204, 0, 51));
        ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorLabel.setText(" ");
        getContentPane().add(ErrorLabel);
        ErrorLabel.setBounds(230, 200, 180, 16);

        EntrarButton.setText("Acessar");
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarButton);
        EntrarButton.setBounds(310, 230, 80, 24);

        setSize(new java.awt.Dimension(426, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        dispose();
    }//GEN-LAST:event_SairButtonActionPerformed

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        try 
        {
            int userID = VerificarLogin(UserField.getText(), PasswordField.getText());
            
            if (userID > 0)
            {
                System.out.println("Usuario encontrado!");
                System.out.println("UserID: " + userID);
                dispose();
                
                // Load User Class
                User user = new User();
                user.userID = userID;
                user.loadUser();
                
                // Load MainFrame
                MainFrame screen = new MainFrame();
                screen.setVisible(true);
                screen.loadFrame(user);
                screen.setUserInstance(user);
                
                return;
            }
            
            System.out.println("Usuario nao encontrado.");
            ErrorLabel.setText("Usuario ou Senha invalido(a).");
        } catch (Exception ex) 
        {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EntrarButtonActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> 
        {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SairButton;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
