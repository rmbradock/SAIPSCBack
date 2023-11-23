/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.saipsc.visao.MenuPrincipalP;

import com.mycompany.saipsc.Visao.Aluno.ListAluno;
import com.mycompany.saipsc.Visao.Campeonato.ListCampeonato;
import com.mycompany.saipsc.ferramentas.Formularios;
import com.mycompany.saipsc.visao.Equipe.ListEquipe;
import com.mycompany.saipsc.visao.Investidores.ListInvestidores;
import com.mycompany.saipsc.visao.KimonoF.ListKimonoF;
import com.mycompany.saipsc.visao.Participacao.ListParticipacao;
import com.mycompany.saipsc.visao.Patrimonio.ListPatrimonio;
import com.mycompany.saipsc.visao.Polos.ListPolos;

/**
 *
 * @author Batista
 */
public class MenuInstrutores extends javax.swing.JFrame {

    /**
     * Creates new form MenuInstrutores
     */
    public MenuInstrutores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuListar = new javax.swing.JMenu();
        jMLAluno = new javax.swing.JMenuItem();
        jmlCampeonato = new javax.swing.JMenuItem();
        jmlEquipe = new javax.swing.JMenuItem();
        jmlInvestidores = new javax.swing.JMenuItem();
        jmlKimonoF = new javax.swing.JMenuItem();
        jmlParticipacao = new javax.swing.JMenuItem();
        jmlPatrimonio = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("SAIPSC");

        jLabel2.setText("Instrutores");

        jMenuListar.setText("Listar");

        jMLAluno.setText("Aluno");
        jMLAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLAlunoActionPerformed(evt);
            }
        });
        jMenuListar.add(jMLAluno);

        jmlCampeonato.setText("Campeonatos");
        jmlCampeonato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlCampeonatoActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlCampeonato);

        jmlEquipe.setText("Equipe");
        jmlEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlEquipeActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlEquipe);

        jmlInvestidores.setText("Investidores");
        jmlInvestidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlInvestidoresActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlInvestidores);

        jmlKimonoF.setText("Kimonos e Faixas");
        jmlKimonoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlKimonoFActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlKimonoF);

        jmlParticipacao.setText("Participação em Campeonatos");
        jmlParticipacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlParticipacaoActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlParticipacao);

        jmlPatrimonio.setText("Patrimonio");
        jmlPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlPatrimonioActionPerformed(evt);
            }
        });
        jMenuListar.add(jmlPatrimonio);

        jMenuItem27.setText("Polos");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenuListar.add(jMenuItem27);

        jMenuBar1.add(jMenuListar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMLAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLAlunoActionPerformed
        if (Formularios.listAluno == null)
        Formularios.listAluno = new ListAluno();

        Formularios.listAluno.setVisible(true);
    }//GEN-LAST:event_jMLAlunoActionPerformed

    private void jmlCampeonatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlCampeonatoActionPerformed
        if (Formularios.listCampeonato == null)
        Formularios.listCampeonato = new ListCampeonato();

        Formularios.listCampeonato.setVisible(true);
    }//GEN-LAST:event_jmlCampeonatoActionPerformed

    private void jmlEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlEquipeActionPerformed
        if (Formularios.listEquipe == null)
        Formularios.listEquipe = new ListEquipe();

        Formularios.listEquipe.setVisible(true);
    }//GEN-LAST:event_jmlEquipeActionPerformed

    private void jmlInvestidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlInvestidoresActionPerformed
        if (Formularios.listInvestidores == null)
        Formularios.listInvestidores = new ListInvestidores();

        Formularios.listInvestidores.setVisible(true);
    }//GEN-LAST:event_jmlInvestidoresActionPerformed

    private void jmlKimonoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlKimonoFActionPerformed
        if (Formularios.listKimonoF == null)
        Formularios.listKimonoF = new ListKimonoF();

        Formularios.listKimonoF.setVisible(true);
    }//GEN-LAST:event_jmlKimonoFActionPerformed

    private void jmlParticipacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlParticipacaoActionPerformed
        if (Formularios.listParticipacao == null)
        Formularios.listParticipacao = new ListParticipacao();

        Formularios.listParticipacao.setVisible(true);
    }//GEN-LAST:event_jmlParticipacaoActionPerformed

    private void jmlPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlPatrimonioActionPerformed
        if (Formularios.listPatrimonio == null)
        Formularios.listPatrimonio = new ListPatrimonio();

        Formularios.listPatrimonio.setVisible(true);
    }//GEN-LAST:event_jmlPatrimonioActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        if (Formularios.listPolos == null)
        Formularios.listPolos = new ListPolos();

        Formularios.listPolos.setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInstrutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMLAluno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenu jMenuListar;
    private javax.swing.JMenuItem jmlCampeonato;
    private javax.swing.JMenuItem jmlEquipe;
    private javax.swing.JMenuItem jmlInvestidores;
    private javax.swing.JMenuItem jmlKimonoF;
    private javax.swing.JMenuItem jmlParticipacao;
    private javax.swing.JMenuItem jmlPatrimonio;
    // End of variables declaration//GEN-END:variables
}
