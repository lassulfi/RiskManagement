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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author luis.assulfi
 */
public class TelaCadastroAcoes extends javax.swing.JFrame {

    //Atributos
    private TelaPrincipal telaPrincipal;
    private Risco risco;
    private TelaRelatorio telaRelatorio;

    /**
     * Creates new form TelaCasdastroAcoes
     */
    private TelaCadastroAcoes() {
        initComponents();
    }

    public TelaCadastroAcoes(TelaPrincipal telaPrincipal) {
        //Construtor padrão
        this();
        this.telaPrincipal = telaPrincipal;
        carregarJComboBoxRisco();
    }
    
    public TelaCadastroAcoes(TelaPrincipal telaPrincipal, Risco r) {
        //Construtor padrão
        this();
        this.telaPrincipal = telaPrincipal;
        this.risco = r;
        carregarJComboBoxRisco();
    }


    public TelaCadastroAcoes(TelaRelatorio telaRelatorio, Risco r) {
        this();
        this.telaRelatorio = telaRelatorio;
        this.risco = r;

        //Tornando visivel na tela os valores que serão editados
        jComboBoxRisco.removeAll();
        jComboBoxRisco.addItem(r.getNomeRisco());
        jComboBoxRisco.setEnabled(false);
        jTextFieldMonitoramento.setText(r.getMonitoramentoAcao());
        jTextFieldResponsavel.setText(r.getResponsavelAcao());
        jTextFieldTratamento.setText(r.getTratamentoAcao());
        jXDatePicker1.setDate(r.getPrazoAcao());
        switch (r.getImpactoAcao()) {
            case 1:
                jRadioButton6.setSelected(true);
                break;
            case 2:
                jRadioButton7.setSelected(true);
                break;
            case 3:
                jRadioButton8.setSelected(true);
                break;
            case 4:
                jRadioButton9.setSelected(true);
                break;
            case 5:
                jRadioButton10.setSelected(true);
                break;
        }
        switch (r.getProbabilidadeAcao()) {
            case 1:
                jRadioButton11.setSelected(true);
                break;
            case 2:
                jRadioButton15.setSelected(true);
                break;
            case 3:
                jRadioButton14.setSelected(true);
                break;
            case 4:
                jRadioButton13.setSelected(true);
                break;
            case 5:
                jRadioButton12.setSelected(true);
                break;
        }

    }

    /**
     * Método para carregar as informações da classe risco para a JComboBoxRisco
     */
    public void carregarJComboBoxRisco() {
        //Criando uma ArrayList com a lista de riscos
        ArrayList<Risco> risco = RepositoryManager.getInstance().
                obterListaDeRiscos();

        //Caso a lista não possua dados indicar na tela que a lista não 
        //tem dados
        if (risco.isEmpty()) {
            jComboBoxRisco.addItem("Sem riscos listados");
        }

        for (int i = 0; i < risco.size(); i++) {
            Risco r = risco.get(i);
            jComboBoxRisco.addItem(r.getNomeRisco());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRisco = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTratamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMonitoramento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldResponsavel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mapeamento das ações para os riscos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Risco");

        jLabel2.setText("Tratamento:");

        jLabel3.setText("Monitoramento:");

        jLabel4.setText("Responsável:");

        jLabel5.setText("Prazo:");

        jXDatePicker1.setLightWeightPopupEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Risco tratado"));

        jLabel6.setText("Probabilidade de ocorrência:");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("1");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("2");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("3");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("4");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("5");

        jLabel8.setText("Impacto da ocorrência:");

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setSelected(true);
        jRadioButton11.setText("1");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setText("5");

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setText("4");

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setText("3");

        buttonGroup2.add(jRadioButton15);
        jRadioButton15.setText("2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton11)
                        .addComponent(jRadioButton15)
                        .addComponent(jRadioButton14)
                        .addComponent(jRadioButton13)
                        .addComponent(jRadioButton12))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRisco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTratamento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMonitoramento))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldResponsavel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxRisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldMonitoramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.out.println("Clique no botão para sair da tela de cadastro "
                + "de acoes para riscos");
        //Mata a tela atual
        this.dispose();
        //Verificando qual tela está em segundo plano para atualizar
        if (this.telaPrincipal != null) {
            //Trazendo a tela principal para primeiro plano
            telaPrincipal.setEnabled(true);
        }

        if (this.telaRelatorio != null) {
            telaRelatorio.setEnabled(true);
        }

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.out.println("Método sair da tela de cadastro de acoes acionado");

        //Verificando qual tela está em segundo plano para atualizar
        if (this.telaPrincipal != null) {
            //Configurar para habilitar a tela principal
            telaPrincipal.setEnabled(true);
            //Trazendo a tela principal para primeiro plano
            telaPrincipal.toFront();
        }

        if (this.telaRelatorio != null) {
            telaRelatorio.setEnabled(true);
            telaRelatorio.toFront();
        }

    }//GEN-LAST:event_formWindowClosed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        System.out.println("Clique no botão casdastrar acoes");
        System.out.println("Cadastro de ações para os riscos");

        //A classe risco já deve ter sido criada!
        int codigo = jComboBoxRisco.getSelectedIndex();
        String tratamento = jTextFieldTratamento.getText();
        String monitoramento = jTextFieldMonitoramento.getText();
        String responsavel = jTextFieldResponsavel.getText();
        Date prazo = jXDatePicker1.getDate();
        int probabilidade = 0;
        if (jRadioButton6.isSelected()) {
            probabilidade = 1;
        } else if (jRadioButton7.isSelected()) {
            probabilidade = 2;
        } else if (jRadioButton8.isSelected()) {
            probabilidade = 3;
        } else if (jRadioButton9.isSelected()) {
            probabilidade = 4;
        } else if (jRadioButton10.isSelected()) {
            probabilidade = 5;
        }
        int impacto = 0;
        if (jRadioButton11.isSelected()) {
            impacto = 1;
        } else if (jRadioButton15.isSelected()) {
            impacto = 2;
        } else if (jRadioButton14.isSelected()) {
            impacto = 3;
        } else if (jRadioButton13.isSelected()) {
            impacto = 4;
        } else if (jRadioButton12.isSelected()) {
            impacto = 5;
        }

        int nivelRisco = impacto * probabilidade;

        /*
        //Criando uma ArrayList com os riscos cadastrados até o momento
        ArrayList<Risco> listaRiscos = RepositoryManager.
                getInstance().obterListaDeRiscos();

        //Atualizando os dados na lista de riscos
        if (!listaRiscos.isEmpty()) {
            listaRiscos.get(codigo).setTratamentoAcao(tratamento);
            listaRiscos.get(codigo).setMonitoramentoAcao(monitoramento);
            listaRiscos.get(codigo).setResponsavelAcao(responsavel);
            listaRiscos.get(codigo).setPrazoAcao(prazo);
            listaRiscos.get(codigo).setProbabilidadeAcao(probabilidade);
            listaRiscos.get(codigo).setImpactoAcao(impacto);
            listaRiscos.get(codigo).setNivelImpactoAcao(nivelRisco);
            JOptionPane.showMessageDialog(this, "Ação cadastrada!");
            System.out.println("Ação cadastrada com sucesso! Fechando tela");
            this.dispose();
            this.telaPrincipal.toFront();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar! "
                    + "Verifique os dados!");
        }
        */
        
        Risco r = this.risco;
        
        if (r == null){
             //Criando uma ArrayList com os riscos cadastrados até o momento
            ArrayList<Risco> listaRiscos = RepositoryManager.
                    getInstance().obterListaDeRiscos();

            //Atualizando os dados na lista de riscos
            if (!listaRiscos.isEmpty()) {
                listaRiscos.get(codigo).setTratamentoAcao(tratamento);
                listaRiscos.get(codigo).setMonitoramentoAcao(monitoramento);
                listaRiscos.get(codigo).setResponsavelAcao(responsavel);
                listaRiscos.get(codigo).setPrazoAcao(prazo);
                listaRiscos.get(codigo).setProbabilidadeAcao(probabilidade);
                listaRiscos.get(codigo).setImpactoAcao(impacto);
                listaRiscos.get(codigo).setNivelImpactoAcao(nivelRisco);
                JOptionPane.showMessageDialog(this, "Ação cadastrada!");
                System.out.println("Ação cadastrada com sucesso! Fechando tela");
                this.dispose();
                this.telaPrincipal.toFront();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar! "
                        + "Verifique os dados!");
            }
        } else {
            r.setTratamentoAcao(tratamento);
            r.setMonitoramentoAcao(monitoramento);
            r.setResponsavelAcao(responsavel);
            r.setPrazoAcao(prazo);
            r.setProbabilidadeAcao(probabilidade);
            r.setImpactoAcao(impacto);
            r.setNivelImpactoAcao(nivelRisco);
            
            RiscoController controller = new RiscoController();
            
            if(controller.atualizarAcoes(r)){
                JOptionPane.showMessageDialog(this, "Ação atualizada!");
                System.out.println("Ação atualizada com sucesso!");
                if(this.telaRelatorio != null){
                    System.out.println("Tenta atualizar tela");
                    this.telaRelatorio.atualizarModelo();
                }
                this.dispose();
                telaRelatorio.toFront();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela!"
                        + " Verifique os dados!"); 
            }
        
        }
        
        
        /*
        if(r == null){
            JOptionPane.showMessageDialog(this, "Nenhum risco cadastrado! "
                    + "Revise os dados!");
            this.dispose();
            if (this.telaPrincipal != null){
                telaPrincipal.setEnabled(true);
                telaPrincipal.toFront();
            }
            if(this.telaRelatorio != null){
                telaRelatorio.setEnabled(true);
                telaRelatorio.toFront();
            }     
        } else {
            r.setTratamentoAcao(tratamento);
            r.setMonitoramentoAcao(monitoramento);
            r.setResponsavelAcao(responsavel);
            r.setPrazoAcao(prazo);
            r.setProbabilidadeAcao(probabilidade);
            r.setImpactoAcao(impacto);
            r.setNivelImpactoAcao(nivelRisco);
        }
        */
        
        /*
        
        //Chama o controller para tentar cadastrar
        RiscoController controller = new RiscoController();
        if (this.risco == null) {
            //Tentar cadastrar novo
            if (controller.cadastrarAcoes(r)) {
                JOptionPane.showMessageDialog(this, "Ação cadastrada!");
                System.out.println("Ação cadastrada com sucesso! Fechando tela");
                this.dispose();
                this.telaPrincipal.toFront();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar! "
                        + "Verifique os dados!");
            }
        } else {
            if(controller.atualizarAcoes(r)){
                JOptionPane.showMessageDialog(this, "Ação atualizada!");
                System.out.println("Ação atualizada com sucesso!");
                if(this.telaRelatorio != null){
                    System.out.println("Tenta atualizar tela");
                    this.telaRelatorio.atualizarModelo();
                }
                this.dispose();
                telaRelatorio.toFront();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela!"
                        + " Verifique os dados!"); 
            }
        }
        
        */
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxRisco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextFieldMonitoramento;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JTextField jTextFieldTratamento;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
