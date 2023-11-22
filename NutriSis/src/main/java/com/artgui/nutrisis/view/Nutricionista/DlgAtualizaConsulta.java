package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.ConsultaController;
import com.artgui.nutrisis.controller.DietaController;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Dieta;
import javax.swing.JOptionPane;

public class DlgAtualizaConsulta extends javax.swing.JDialog {

    private Consulta consulta;
    private ConsultaController consultaController;
    private DietaController dietaController;

    public DlgAtualizaConsulta(java.awt.Dialog parent, boolean modal, Consulta consulta) {
        super(parent, modal);

        this.consulta = consulta;
        this.consulta.setStatus("Em Progresso");
        this.dietaController = new DietaController();
        this.consultaController = new ConsultaController();
        initComponents();

        preencherFormulario(consulta);
    }

    private void preencherFormulario(Consulta consulta) {
        this.edtNomeCliente.setText(consulta.getCliente().getNome());
        this.edtNomeNutricionista.setText(consulta.getNutricionista().getNome());
        this.edtStatus.setText(consulta.getStatus());
        this.edtData.setText(consulta.getDataMarcada());
        this.edtDescricao.setText(consulta.getDescricao());

        this.dietaController.atualizarTabelaExcluir(grdDietas, consulta.getDietasRecomendadas());
    }

    private Object getObjetoSelecionadoNaGridDieta() {
        int rowCliked = this.grdDietas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdDietas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    private void removerDieta(){
    Dieta dieta = (Dieta) this.getObjetoSelecionadoNaGridDieta();

        if (consulta != null) {
            this.consulta.removeRecomendacaoDieta(dieta);
            this.dietaController.atualizarTabelaExcluir(grdDietas, consulta.getDietasRecomendadas());
        } else {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panDados = new javax.swing.JPanel();
        panInputs = new javax.swing.JPanel();
        edtNomeCliente = new javax.swing.JTextField();
        edtStatus = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtDescricao = new javax.swing.JTextPane();
        lblRefeicoes = new javax.swing.JLabel();
        edtData = new javax.swing.JTextField();
        edtNomeNutricionista = new javax.swing.JTextField();
        btnAdicionarDietaRecomendada = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdDietas = new javax.swing.JTable();
        panBotoes = new javax.swing.JPanel();
        btnConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panMain.setBackground(new java.awt.Color(51, 51, 51));

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        panDados.setBackground(new java.awt.Color(51, 51, 51));

        panInputs.setBackground(new java.awt.Color(51, 51, 51));

        edtNomeCliente.setBackground(new java.awt.Color(204, 204, 204));
        edtNomeCliente.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeCliente.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtNomeCliente.setEnabled(false);

        edtStatus.setBackground(new java.awt.Color(204, 204, 204));
        edtStatus.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtStatus.setForeground(new java.awt.Color(0, 0, 0));
        edtStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtStatus.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtStatus.setEnabled(false);

        edtDescricao.setBackground(new java.awt.Color(204, 204, 204));
        edtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDescricao.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        edtDescricao.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        jScrollPane2.setViewportView(edtDescricao);

        lblRefeicoes.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        lblRefeicoes.setForeground(new java.awt.Color(204, 255, 255));
        lblRefeicoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefeicoes.setText("Dietas Recomendadas");

        edtData.setBackground(new java.awt.Color(204, 204, 204));
        edtData.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtData.setForeground(new java.awt.Color(0, 0, 0));
        edtData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtData.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtData.setEnabled(false);

        edtNomeNutricionista.setBackground(new java.awt.Color(204, 204, 204));
        edtNomeNutricionista.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeNutricionista.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeNutricionista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nutricionista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeNutricionista.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtNomeNutricionista.setEnabled(false);

        btnAdicionarDietaRecomendada.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionarDietaRecomendada.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnAdicionarDietaRecomendada.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionarDietaRecomendada.setText("Adicionar");
        btnAdicionarDietaRecomendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDietaRecomendadaActionPerformed(evt);
            }
        });

        grdDietas.setBackground(new java.awt.Color(51, 51, 51));
        grdDietas.setForeground(new java.awt.Color(255, 255, 255));
        grdDietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grdDietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdDietasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(grdDietas);

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(edtNomeNutricionista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtStatus)
                            .addComponent(edtData)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(btnAdicionarDietaRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNomeNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRefeicoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAdicionarDietaRecomendada, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panBotoes.setBackground(new java.awt.Color(51, 51, 51));

        btnConcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnConcluir.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnConcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBotoesLayout.createSequentialGroup()
                .addGap(847, 847, 847)
                .addComponent(btnConcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panDadosLayout = new javax.swing.GroupLayout(panDados);
        panDados.setLayout(panDadosLayout);
        panDadosLayout.setHorizontalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panDadosLayout.setVerticalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addContainerGap(940, Short.MAX_VALUE))
            .addComponent(panDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grdDietasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdDietasMouseClicked
    if (evt.getClickCount() == 2) {
            int aux = grdDietas.getSelectedColumn();
            if (aux == 1) {
                this.removerDieta();
            } 
        }
    }//GEN-LAST:event_grdDietasMouseClicked

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        this.consulta.setDescricao(edtDescricao.getText());
        this.consulta.setStatus("Concluida");
        this.consultaController.atualizar(consulta.getId(), consulta.getDataMarcada(), consulta.getDescricao(), consulta.getStatus(), consulta.getDietasRecomendadas(),consulta.getCliente(), consulta.getNutricionista());
        this.dispose();
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnAdicionarDietaRecomendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDietaRecomendadaActionPerformed
        Dieta dieta = new Dieta();

        DlgAdicionarDietaNutricionista dlgAdicionarDietaNutricionista = new DlgAdicionarDietaNutricionista(this, true, dieta);
        dlgAdicionarDietaNutricionista.setLocationRelativeTo(this);
        dlgAdicionarDietaNutricionista.setVisible(true);

        if (dieta.getId() == -1) {
            JOptionPane.showMessageDialog(this, "Adição cancelada");
        } else {
            consulta.addRecomendacaoDieta(dieta);
            dietaController.atualizarTabelaExcluir(grdDietas, consulta.getDietasRecomendadas());
        }
    }//GEN-LAST:event_btnAdicionarDietaRecomendadaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDietaRecomendada;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextPane edtDescricao;
    private javax.swing.JTextField edtNomeCliente;
    private javax.swing.JTextField edtNomeNutricionista;
    private javax.swing.JTextField edtStatus;
    private javax.swing.JTable grdDietas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRefeicoes;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panMain;
    // End of variables declaration//GEN-END:variables
}
