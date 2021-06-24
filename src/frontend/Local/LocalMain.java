package frontend.Local;

import backend.Local;
import backend.Main;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public final class LocalMain extends javax.swing.JFrame 
{

    public LocalMain() 
    {
        initComponents();
        loadLocalPanel(Main.local);
    }

    public void loadLocalPanel(Local instance)
    {
        DefaultListModel listModel;
        listModel = new DefaultListModel();
        
        int tamh = instance.getInstanceArrayLength();
        System.out.println("Tamanho do Array de Instancias: " + tamh);
        if (tamh > 0)
        {
            for(int i = 0; i < tamh; i++)
            {
                System.out.println("Index procurado: " + i);
                listModel.addElement(instance.locais[i].getTitulo());
            }        
        }

        jLocais.setModel(listModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLocais = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jAdicionar = new javax.swing.JButton();
        jDetalhes = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/placeholder.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jLocais);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Lista de Locais:");

        jAdicionar.setBackground(new java.awt.Color(51, 255, 102));
        jAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jAdicionar.setText("Adicionar");
        jAdicionar.setBorderPainted(false);
        jAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdicionar.setFocusable(false);
        jAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAdicionarMouseExited(evt);
            }
        });
        jAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarActionPerformed(evt);
            }
        });

        jDetalhes.setBackground(new java.awt.Color(0, 0, 0));
        jDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        jDetalhes.setText("Detalhes");
        jDetalhes.setBorderPainted(false);
        jDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDetalhes.setFocusable(false);
        jDetalhes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDetalhesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDetalhesMouseExited(evt);
            }
        });
        jDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDetalhesActionPerformed(evt);
            }
        });

        jExcluir.setBackground(new java.awt.Color(255, 0, 0));
        jExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jExcluir.setText("Excluir");
        jExcluir.setBorderPainted(false);
        jExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExcluir.setFocusable(false);
        jExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jExcluirMouseExited(evt);
            }
        });
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jDetalhesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDetalhesMouseEntered
        jDetalhes.setBackground(new Color(235, 235, 235));
        jDetalhes.setForeground(Color.BLACK);
    }//GEN-LAST:event_jDetalhesMouseEntered

    private void jAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdicionarMouseEntered
        jAdicionar.setBackground(new Color(235, 235, 235));
        jAdicionar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jAdicionarMouseEntered

    private void jExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExcluirMouseEntered
        jExcluir.setBackground(new Color(235, 235, 235));
        jExcluir.setForeground(Color.BLACK);
    }//GEN-LAST:event_jExcluirMouseEntered

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    private void jDetalhesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDetalhesMouseExited
        jDetalhes.setBackground(Color.BLACK);
        jDetalhes.setForeground(Color.WHITE);
    }//GEN-LAST:event_jDetalhesMouseExited

    private void jAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdicionarMouseExited
        jAdicionar.setBackground(Color.GREEN);
        jAdicionar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jAdicionarMouseExited

    private void jExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExcluirMouseExited
        jExcluir.setBackground(Color.RED);
        jExcluir.setForeground(Color.WHITE);
    }//GEN-LAST:event_jExcluirMouseExited

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    private void jAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarActionPerformed
        LocalAdd localadd = new LocalAdd(this);
        localadd.setVisible(true);
    }//GEN-LAST:event_jAdicionarActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        int index = jLocais.getSelectedIndex();
        if (index >= 0)
        {
            try 
            {
                Main.local.removeLocal(index);
                Main.local.loadLocalInstances(Main.user.userID);
                loadLocalPanel(Main.local);
            } catch (Exception ex) 
            {
                Logger.getLogger(LocalMain.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDetalhesActionPerformed
        int index = jLocais.getSelectedIndex();
        if (index >= 0)
        {
            LocalDetalhes localdet = new LocalDetalhes(this, index);
            localdet.setVisible(true);
        }
    }//GEN-LAST:event_jDetalhesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionar;
    private javax.swing.JButton jDetalhes;
    private javax.swing.JButton jExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jLocais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
