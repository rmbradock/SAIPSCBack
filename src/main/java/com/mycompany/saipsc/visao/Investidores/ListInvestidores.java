/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.saipsc.visao.Investidores;

import com.mycompany.saipsc.Dao.DaoInvestidores;
import com.mycompany.saipsc.Modelo.ModInvestidores;
import com.mycompany.saipsc.ferramentas.DadosTemporarios;
import com.mycompany.saipsc.ferramentas.Formularios;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Batista
 */
public class ListInvestidores extends javax.swing.JFrame {

    /**
     * Creates new form ListInvestidores
     */
    public ListInvestidores() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorId(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarPorId(Integer.parseInt(tfFiltro.getText()));
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorNome(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorObs(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarPorObs(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorInvestimento(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarPorInvestimento(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorPeriodicidade(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableInvestidores.getModel();
            
            tableInvestidores.setModel(defaultTableModel);

            DaoInvestidores daoInvestidores = new DaoInvestidores();

            ResultSet resultSet = daoInvestidores.listarPorPeriodicidade(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String obs = resultSet.getString(3);
                String investimento = resultSet.getString(4);
                String periodicidade = resultSet.getString(5);
                                
                defaultTableModel.addRow(new Object[]{id, nome, obs, investimento, periodicidade});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInvestidores = new javax.swing.JTable();
        jcbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME", "OBS", "INVESTIMENTO", "PERIODICIDADE", " ", " " }));

        tableInvestidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "OBS", "INVESTIMENTO", "PERIODICIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInvestidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInvestidoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableInvestidores);

        jcbBuscar.setText("Buscar");
        jcbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("RMB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFiltro)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbBuscar)
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableInvestidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInvestidoresMouseClicked
        try{
            if (evt.getClickCount() == 2){
                ModInvestidores modInvestidores = new ModInvestidores();

                modInvestidores.setId(Integer.parseInt(String.valueOf(tableInvestidores.getValueAt(tableInvestidores.getSelectedRow(), 0))));
                modInvestidores.setObs(String.valueOf(tableInvestidores.getValueAt(tableInvestidores.getSelectedRow(), 2)));
                modInvestidores.setInvestimento(String.valueOf(tableInvestidores.getValueAt(tableInvestidores.getSelectedRow(), 3)));
                modInvestidores.setPeriodicidade(String.valueOf(tableInvestidores.getValueAt(tableInvestidores.getSelectedRow(), 4)));
                
                DaoInvestidores daoInvestidores = new DaoInvestidores();
                ResultSet resultSet = daoInvestidores.listarPorNome(String.valueOf(tableInvestidores.getValueAt(tableInvestidores.getSelectedRow(), 1)));
                int idPessoa = -1;
                while (resultSet.next ())
                idPessoa = resultSet.getInt("ID");
                modInvestidores.setIdPessoa(idPessoa);
                DadosTemporarios.tempObject = (ModInvestidores) modInvestidores;

                CadInvestidores cadInvestidores = new CadInvestidores();
                cadInvestidores.setVisible(true);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_tableInvestidoresMouseClicked

    private void jcbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
            listarTodos();
            break;
            case 1:
            listarPorId();
            break;
            case 2:
            listarPorNome();
            break;
            case 3:
            listarPorObs();
            break;
            case 4:
            listarPorInvestimento();
            break;
            case 5:
            listarPorPeriodicidade();
            break;
        }
    }//GEN-LAST:event_jcbBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listAluno = null;
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ListInvestidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListInvestidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListInvestidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListInvestidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListInvestidores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jcbBuscar;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableInvestidores;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
