package frontend.Tarefa;

import backend.Local;
import backend.Main;
import backend.Tarefa;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

public class TarefaDetalhes extends javax.swing.JFrame 
{
    int LocalID;
    TarefaMain Tarefa;
    
    public TarefaDetalhes(TarefaMain _Tarefa, int _LocalID) 
    {
        initComponents();
        this.Tarefa = _Tarefa;
        this.LocalID = _LocalID;
        loadTarefa();
    }

    private void loadTarefa()
    {
        Tarefa._Tarefa tarefa = Main.tarefa.tarefas[this.LocalID];
        
        NomeField.setText(tarefa.getTarefaTitulo());
        DescField.setText(tarefa.getTarefaDesc());
        DataField.setDate(tarefa.getDataTarefa());
        HoraField.setValue(tarefa.getHoraInt());
        MinutosField.setValue(tarefa.getMinutosInt());
        loadLocals();
    }
    
    private void loadLocals()
    {
        Local local = Main.local;
        
        for(int i = 0; i < local.getInstanceArrayLength(); i++)
            LocalField.addItem(local.locais[i].getTitulo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomeField = new backend.Hints.JTextFieldHint(new JTextField(), "agenda16", "Nome");
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescField = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        DataField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        HoraField = new javax.swing.JSpinner();
        MinutosField = new javax.swing.JSpinner();
        LocalField = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jAdd = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/detalhe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Descricao");

        DescField.setColumns(20);
        DescField.setRows(5);
        jScrollPane1.setViewportView(DescField);

        jLabel3.setText("Data");

        jLabel4.setText("Horario");

        HoraField.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        MinutosField.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        jLabel5.setText("Local");

        jAdd.setBackground(new java.awt.Color(0, 0, 0));
        jAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 255, 255));
        jAdd.setText("Adicionar");
        jAdd.setBorderPainted(false);
        jAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdd.setFocusable(false);
        jAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAddMouseExited(evt);
            }
        });
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
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
        jError.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(NomeField)
                    .addComponent(DataField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MinutosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocalField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinutosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LocalField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jError)
                .addGap(22, 22, 22)
                .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddMouseEntered
        jAdd.setBackground(new Color(235, 235, 235));
        jAdd.setForeground(Color.BLACK);
    }//GEN-LAST:event_jAddMouseEntered

    private void jAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddMouseExited
        jAdd.setBackground(Color.BLACK);
        jAdd.setForeground(Color.WHITE);
    }//GEN-LAST:event_jAddMouseExited

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        SimpleDateFormat formatadorSQL = new SimpleDateFormat("yyyy/MM/dd");

        if (!"".equals(NomeField.getText()))
            if (NomeField.getText().length() > 3 && NomeField.getText().length() <= 20)
                if (!"".equals(DescField.getText()))
                    if (DataField.getDate() != null)
                        if (LocalField.getSelectedIndex() >= 0)
                        {
                            String nData = formatadorSQL.format(DataField.getDate());
                            String nHorario = HoraField.getValue().toString() + ":" + MinutosField.getValue().toString() + ":" + "00";
                            
                            System.out.println("OK");
                            try 
                            {
                                Main.tarefa.updateTarefa(Main.tarefa.tarefas[this.LocalID].getTarefaID() , NomeField.getText(), DescField.getText(), nData, nHorario, Main.local.locais[LocalField.getSelectedIndex()].getLocalID());
                                Main.tarefa.loadTarefasInstances(Main.user.userID);
                                this.Tarefa.loadTarefaPanel();
                                dispose();
                            } catch (Exception ex) 
                            {
                                java.util.logging.Logger.getLogger(TarefaDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                        }
                        else
                            jError.setText("Local Invalido.");
                    else
                        jError.setText("Data Invalida.");
                else
                    jError.setText("Digite uma descricao valida");
            else
                jError.setText("Digite um nome entre 4 a 20 caracteres.");
        else
            jError.setText("Digite um nome valido.");
    }//GEN-LAST:event_jAddActionPerformed

    private void jSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseEntered
        jSair.setBackground(new Color(235, 235, 235));
        jSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSairMouseEntered

    private void jSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseExited
        jSair.setBackground(Color.BLACK);
        jSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jSairMouseExited

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        dispose();
    }//GEN-LAST:event_jSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataField;
    private javax.swing.JTextArea DescField;
    private javax.swing.JSpinner HoraField;
    private javax.swing.JComboBox<String> LocalField;
    private javax.swing.JSpinner MinutosField;
    private javax.swing.JTextField NomeField;
    private javax.swing.JButton jAdd;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
