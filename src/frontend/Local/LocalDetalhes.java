package frontend.Local;

import backend.Local;
import backend.Main;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class LocalDetalhes extends javax.swing.JFrame 
{
    int LocalID;
    LocalMain local;
    
    public LocalDetalhes(LocalMain Local, int _LocalID) 
    {
        initComponents();
        this.local = Local;
        this.LocalID = _LocalID;
        loadDetalhes();
    }

    private void loadDetalhes()
    {
        Local._Local _local = Main.local.locais[this.LocalID];
        
        if (local != null)
        {
            jNome.setText(_local.getTitulo());
            jDesc.setText(_local.getDescricao());  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNome = new backend.Hints.JTextFieldHint(new JTextField(), "Casa", "Nome");
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesc = new javax.swing.JTextArea();
        jSalvar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/planeta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Descricao");

        jDesc.setColumns(20);
        jDesc.setRows(5);
        jScrollPane1.setViewportView(jDesc);

        jSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNome)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    private void jSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarMouseEntered
        jSalvar.setBackground(new Color(235, 235, 235));
        jSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSalvarMouseEntered

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarMouseExited
        jSalvar.setBackground(Color.BLACK);
        jSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSalvarMouseExited

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        String Nome = jNome.getText();
        String desc = jDesc.getText();
        
        if (Nome.length() > 3 && Nome.length() <= 20)
        {
            try 
            {
                Main.local.updateLocal(this.LocalID, Nome, desc);
                Main.local.loadLocalInstances(Main.user.userID);
                local.loadLocalPanel(Main.local);
                dispose();
            } catch (Exception ex) 
            {
                Logger.getLogger(LocalDetalhes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            jError.setText("Insira um nome entre 4 a 20 caracteres.");
    }//GEN-LAST:event_jSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jDesc;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    private javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
