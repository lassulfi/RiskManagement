/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicativo.telas;

import com.aplicativo.controles.RepositoryManager;
import com.aplicativo.controles.RiscoController;
import com.aplicativo.entidades.Risco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis.assulfi
 */
public class TelaRelatorio extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;
    
    
    /**
     * Creates new form TelaRelatorio
     */
    private TelaRelatorio() {
        initComponents();
        carregarJTable();
    }
    
    public TelaRelatorio(TelaPrincipal telaPrincipal){
        //Construtor padrão
        this();
        
        this.telaPrincipal = telaPrincipal;
    }
    
    public void carregarJTable(){
        //Criando a ArrayList contendo os riscos
        ArrayList<Risco> lista = RepositoryManager.getInstance().
                obterListaDeRiscos();
        
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        
        modelo.addColumn("Processo/ Atividade");
        modelo.addColumn("Objetivo");
        modelo.addColumn("Risco");
        modelo.addColumn("Causa");
        modelo.addColumn("Conseqüência");
        modelo.addColumn("Natureza");
        modelo.addColumn("Probabilidade");
        modelo.addColumn("Impacto");
        modelo.addColumn("NRI ( P x I)");
        modelo.addColumn("Tratamento");
        modelo.addColumn("Monitoramento");
        modelo.addColumn("Responsável");
        modelo.addColumn("Prazo");
        modelo.addColumn("Probabilidade");
        modelo.addColumn("Impacto");
        modelo.addColumn("NRI ( P x I)");
        
        //Caso a lista não possua dados indicar na tela que a lista não 
        //tem dados
        if(lista.isEmpty()){
            modelo.addRow(new String[]{"Sem dados",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null});
        }
        
        for (int i = 0; i < lista.size(); i++){
            Risco r = lista.get(i);
            System.out.println(r.toString());
            //Alimenta a lista de dados
            modelo.addRow(new String[]{r.getProcesso(),
                r.getObjetivo(),
                r.getNomeRisco(),
                r.getCausa(),
                r.getConsequencia(),
                r.getNatureza(),
                Integer.toString(r.getProbabilidadeRisco()),
                Integer.toString(r.getImpactoRisco()),
                Integer.toString(r.getNivelDoRisco()),
                r.getTratamentoAcao(),
                r.getMonitoramentoAcao(),
                r.getResponsavelAcao(),
                r.getPrazoAcao().toString(),
                Integer.toString(r.getProbabilidadeAcao()),
                Integer.toString(r.getImpactoAcao()),
                Integer.toString(r.getNivelImpactoAcao())}
            );      
        }
        
        jTableRelatorio.setModel(modelo);
        
    }
    
    /**
     * Método para atualizar a tabela de relatório
     */
    public void atualizarModelo(){
        System.out.println("Atualizando tabela modelo");
        carregarJTable();
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
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();
        jButtonEditarRisco = new javax.swing.JButton();
        jButtonEditarAcao = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de riscos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Relatório de Riscos e Ações");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRelatorio);

        jButtonEditarRisco.setText("Editar risco...");
        jButtonEditarRisco.setEnabled(false);
        jButtonEditarRisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarRiscoActionPerformed(evt);
            }
        });

        jButtonEditarAcao.setText("Editar ação...");
        jButtonEditarAcao.setEnabled(false);
        jButtonEditarAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAcaoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEditarRisco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditarAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarRisco)
                    .addComponent(jButtonEditarAcao)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
        
        telaPrincipal.setEnabled(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatorioMouseClicked
        System.out.println("Usuário clicou na tabela");
        
        //Habilitando os botoes para edição e exclusão
        jButtonEditarAcao.setEnabled(true);
        jButtonEditarRisco.setEnabled(true);
        jButtonExcluir.setEnabled(true);    
    }//GEN-LAST:event_jTableRelatorioMouseClicked

    private void jButtonEditarRiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarRiscoActionPerformed
        
        try{
            int linha = jTableRelatorio.getSelectedRow();
            Risco r = RepositoryManager.getInstance().obterListaDeRiscos().
                    get(linha);
            System.out.println(r.toString());
            
            this.setEnabled(false);
            jButtonEditarRisco.setEnabled(false);
            jButtonEditarAcao.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
            new TelaCadastroRiscos(this, r).setVisible(true);
            
        } catch (Exception e){
        
            JOptionPane.showMessageDialog(this, "Selecione um risco!");
            jButtonEditarRisco.setEnabled(false);
            jButtonEditarAcao.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_jButtonEditarRiscoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.telaPrincipal.setEnabled(true);
        this.telaPrincipal.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonEditarAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAcaoActionPerformed
        System.out.println("Clique no botão Editar Ação");
        try{
            int linha = jTableRelatorio.getSelectedRow();
            Risco r = RepositoryManager.getInstance().obterListaDeRiscos().
                    get(linha);
            System.out.println(r.toString());
            this.setEnabled(false);
            jButtonEditarRisco.setEnabled(false);
            jButtonEditarAcao.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            new TelaCadastroAcoes(this,r).setVisible(true);
            System.out.println("Exibindo tela de cadastro de alções");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Selecione um risco");
            jButtonEditarRisco.setEnabled(false);
            jButtonEditarAcao.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            System.out.println("Nenhum risco selecionado.");
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButtonEditarAcaoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        System.out.println("Clique no botão excluir item");
        
        Object[] opcoes = {"Sim", "Não"};
        int opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão?",
                "Excluir item", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,null,opcoes,opcoes[0]);
        if (opcao == 0 || opcao == -1){
            try{
                //Identificando a linha que será excluida
                int linha = jTableRelatorio.getSelectedRow();
                //Selecionando o risco
                Risco r = RepositoryManager.getInstance().obterListaDeRiscos().
                    get(linha);
                //Criando o objeto controller para realizar a exclusao 
                //segura do risco
                RiscoController controller = new RiscoController();
                if (controller.excluirItemRisco(r)){
                    JOptionPane.showMessageDialog(this, "Risco excluido!");
                    System.out.println("Risco excluido com sucesso!");
                    atualizarModelo();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela.");
                    System.out.println("Erro ao excluir risco!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Selecione um risco");
                jButtonEditarRisco.setEnabled(false);
                jButtonEditarAcao.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                System.out.println("Nenhum risco selecionado.");
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarAcao;
    private javax.swing.JButton jButtonEditarRisco;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorio;
    // End of variables declaration//GEN-END:variables
}