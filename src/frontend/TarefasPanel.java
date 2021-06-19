package frontend;
import backend.Local;
import backend.User;
import backend.Tarefa;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public final class TarefasPanel extends javax.swing.JFrame 
{
    public User UserInstance;
    public Local LocalInstance;
    public Tarefa TarefaInstance;
    
    public TarefasPanel(User _UserInstance, Local _LocalInstance, Tarefa _TarefaInstance) throws Exception 
    {
        initComponents();
        
        this.UserInstance = _UserInstance;
        this.LocalInstance = _LocalInstance;
        this.TarefaInstance = _TarefaInstance;
        
        loadTarefaPanel(this.TarefaInstance);
    }
    
    public void loadTarefaPanel(Tarefa instance)
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
                listModel.addElement(instance.tarefas[i].getTarefaTitulo());
            }        
        }

        _ListaTarefas.setModel(listModel);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListaTarefas = new javax.swing.JScrollPane();
        _ListaTarefas = new javax.swing.JList<>();
        FecharButton = new javax.swing.JButton();
        DetalhesButton = new javax.swing.JButton();
        AdicionarButton = new javax.swing.JButton();
        RemoverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tarefas");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/lista-de-tarefas.png"))); // NOI18N

        jLabel2.setText("Lista de Tarefas:");

        _ListaTarefas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaTarefas.setViewportView(_ListaTarefas);

        FecharButton.setText("Fechar");
        FecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharButtonActionPerformed(evt);
            }
        });

        DetalhesButton.setText("Detalhes");

        AdicionarButton.setText("Adicionar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        RemoverButton.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ListaTarefas)
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DetalhesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(FecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DetalhesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103)
                .addComponent(FecharButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharButtonActionPerformed
        dispose();
    }//GEN-LAST:event_FecharButtonActionPerformed

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
        AddTarefa addtarefa;
        try 
        {
            addtarefa = new AddTarefa(this.LocalInstance, this.UserInstance, this.TarefaInstance);
            addtarefa.setVisible(true);
            addtarefa.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        } catch (Exception ex) 
        {
            Logger.getLogger(TarefasPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_AdicionarButtonActionPerformed

    // <editor-fold defaultstate="collapsed" desc="NetBeans Default">
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
            java.util.logging.Logger.getLogger(TarefasPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefasPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefasPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefasPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JButton DetalhesButton;
    private javax.swing.JButton FecharButton;
    private javax.swing.JScrollPane ListaTarefas;
    private javax.swing.JButton RemoverButton;
    private javax.swing.JList<String> _ListaTarefas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
