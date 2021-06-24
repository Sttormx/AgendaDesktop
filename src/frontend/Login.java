package frontend;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import backend.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MySQL;

public class Login extends javax.swing.JFrame 
{
    public Login() 
    {
        initComponents();
    }

    private int VerifyLogin(String Login, String Password) throws Exception
    {
        // SQL
        String SQL = "SELECT * FROM usuario WHERE User = '" + Login + "' AND Senha = '" + Password + "';";
        
        int k = 0;
        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL)) 
        {
            while (resultado.next())
            {
                String _Login = resultado.getString("User");
                String _Password = resultado.getString("Senha");
                
                if (Login.equals(_Login) && Password.equals(_Password))
                {
                    System.out.println("Iniciando Login");
                    Main.loadSystem(resultado.getInt("User_ID"));
                    dispose();
                }
            }
            
            resultado.close();
        }
        
        return k;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Imagem = new javax.swing.JLabel();
        PasswordField = new backend.Hints.JPassWordFieldHint(new JPasswordField(), "keys", "Senha");
        LoginField = new backend.Hints.JTextFieldHint(new JTextField(), "userLogin", "Usuario")
        ;
        FecharButton = new javax.swing.JButton();
        EntrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entre com suas credenciais");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FecharButton.setBackground(new java.awt.Color(0, 0, 0));
        FecharButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FecharButton.setForeground(new java.awt.Color(255, 255, 255));
        FecharButton.setText("Sair");
        FecharButton.setBorderPainted(false);
        FecharButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FecharButton.setFocusable(false);
        FecharButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FecharButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FecharButtonMouseExited(evt);
            }
        });
        FecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharButtonActionPerformed(evt);
            }
        });

        EntrarButton.setBackground(new java.awt.Color(0, 0, 0));
        EntrarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EntrarButton.setForeground(new java.awt.Color(255, 255, 255));
        EntrarButton.setText("Entrar");
        EntrarButton.setBorderPainted(false);
        EntrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarButton.setFocusable(false);
        EntrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarButtonMouseExited(evt);
            }
        });
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FecharButtonActionPerformed

    private void EntrarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtonMouseEntered
        EntrarButton.setBackground(new Color(235, 235, 235));
        EntrarButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_EntrarButtonMouseEntered

    private void FecharButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharButtonMouseEntered
        FecharButton.setBackground(new Color(235, 235, 235));
        FecharButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_FecharButtonMouseEntered

    private void EntrarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtonMouseExited
        EntrarButton.setBackground(Color.BLACK);
        EntrarButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_EntrarButtonMouseExited

    private void FecharButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharButtonMouseExited
        FecharButton.setBackground(Color.BLACK);
        FecharButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_FecharButtonMouseExited

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        try 
        {
            this.VerifyLogin(LoginField.getText(), PasswordField.getText());
        } catch (Exception ex) 
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EntrarButtonActionPerformed

    public static void main(String args[]) 
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButton;
    private javax.swing.JButton FecharButton;
    private javax.swing.JLabel Imagem;
    private javax.swing.JTextField LoginField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
