package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.AcompanhamentoController;
import com.artgui.nutrisis.controller.RegistroDiarioController;
import com.artgui.nutrisis.model.Acompanhamento;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.view.Cliente.DlgVizualizarRegistroDiario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DlgAcompanhamentoNutricionista extends javax.swing.JDialog {

    private Acompanhamento acompanhamento;
    private AcompanhamentoController acompanhamentoController;
    private RegistroDiarioController registroDiarioController;

    public DlgAcompanhamentoNutricionista(java.awt.Dialog parent, boolean modal, Nutricionista nutricionista) {
        super(parent, modal);
        
        acompanhamentoController = new AcompanhamentoController();
        registroDiarioController = new RegistroDiarioController();
        
        initComponents();

        acompanhamentoController.atualizarTabela(grdAcompanhamentos, nutricionista);
    }

    private void limparCampos() {
        this.edtNomeCliente.setText("");
        this.edtNomeNutricionista.setText("");
        this.edtDataInicio.setText("");
        this.edtDataFinal.setText("");

        this.registroDiarioController.atualizarTabelaVizualizar(grdRegistroDiarios, new ArrayList<>());
    }

    private void preencherFormulario(Acompanhamento acompanhamento) {
        this.edtNomeCliente.setText(acompanhamento.getCliente().getNome());
        this.edtNomeNutricionista.setText(acompanhamento.getNutricionista().getNome());
        this.edtDataInicio.setText(acompanhamento.getDataInicio());
        this.edtDataFinal.setText(acompanhamento.getDataFinal());

        this.registroDiarioController.atualizarTabelaVizualizar(grdRegistroDiarios, acompanhamento.getRegistrosDiarios());

    }

    private Object getObjetoSelecionadoNaGridAcompanhamento() {
        int rowCliked = this.grdAcompanhamentos.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdAcompanhamentos.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    private Object getObjetoSelecionadoNaGridRegistroDiario() {
        int rowCliked = this.grdRegistroDiarios.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdRegistroDiarios.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    private void VizualizarRegistroDiario() {

        RegistroDiario registroDiario = (RegistroDiario) getObjetoSelecionadoNaGridRegistroDiario();

        if (registroDiario == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {

            DlgVizualizarRegistroDiario dlgVizualizarRegistroDiario = new DlgVizualizarRegistroDiario(this, true, registroDiario);
            dlgVizualizarRegistroDiario.setLocationRelativeTo(this);
            dlgVizualizarRegistroDiario.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panBody = new javax.swing.JPanel();
        tabsDados = new javax.swing.JTabbedPane();
        panTodasAsConsultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdAcompanhamentos = new javax.swing.JTable();
        btnVizualizarAcompanhamento = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblTituloDietas = new javax.swing.JLabel();
        lblTituloOpções = new javax.swing.JLabel();
        panDados = new javax.swing.JPanel();
        panInputs = new javax.swing.JPanel();
        edtNomeCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdRegistroDiarios = new javax.swing.JTable();
        lblRefeicoes = new javax.swing.JLabel();
        edtDataInicio = new javax.swing.JTextField();
        edtDataFinal = new javax.swing.JTextField();
        edtNomeNutricionista = new javax.swing.JTextField();
        panBotoes = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        panBody.setBackground(new java.awt.Color(71, 71, 71));

        tabsDados.setBackground(new java.awt.Color(204, 204, 204));
        tabsDados.setForeground(new java.awt.Color(0, 0, 0));

        panTodasAsConsultas.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        grdAcompanhamentos.setBackground(new java.awt.Color(51, 51, 51));
        grdAcompanhamentos.setForeground(new java.awt.Color(255, 255, 255));
        grdAcompanhamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        grdAcompanhamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdAcompanhamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdAcompanhamentos);

        btnVizualizarAcompanhamento.setBackground(new java.awt.Color(255, 255, 255));
        btnVizualizarAcompanhamento.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnVizualizarAcompanhamento.setForeground(new java.awt.Color(0, 0, 0));
        btnVizualizarAcompanhamento.setText("Vizualizar Acompanhamento");
        btnVizualizarAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVizualizarAcompanhamentoActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblTituloDietas.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTituloDietas.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloDietas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloDietas.setText("Acompanhamentos");

        lblTituloOpções.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTituloOpções.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloOpções.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloOpções.setText("Opções");

        javax.swing.GroupLayout panTodasAsConsultasLayout = new javax.swing.GroupLayout(panTodasAsConsultas);
        panTodasAsConsultas.setLayout(panTodasAsConsultasLayout);
        panTodasAsConsultasLayout.setHorizontalGroup(
            panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTodasAsConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVizualizarAcompanhamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloOpções, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(lblTituloDietas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTodasAsConsultasLayout.setVerticalGroup(
            panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTodasAsConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloDietas)
                    .addComponent(lblTituloOpções, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTodasAsConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panTodasAsConsultasLayout.createSequentialGroup()
                        .addComponent(btnVizualizarAcompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsDados.addTab("Todas as Consultas", panTodasAsConsultas);

        panDados.setBackground(new java.awt.Color(51, 51, 51));

        panInputs.setBackground(new java.awt.Color(51, 51, 51));

        edtNomeCliente.setBackground(new java.awt.Color(204, 204, 204));
        edtNomeCliente.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeCliente.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtNomeCliente.setEnabled(false);

        grdRegistroDiarios.setBackground(new java.awt.Color(51, 51, 51));
        grdRegistroDiarios.setForeground(new java.awt.Color(255, 255, 255));
        grdRegistroDiarios.setModel(new javax.swing.table.DefaultTableModel(
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
        grdRegistroDiarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdRegistroDiariosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(grdRegistroDiarios);

        lblRefeicoes.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        lblRefeicoes.setForeground(new java.awt.Color(204, 255, 255));
        lblRefeicoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefeicoes.setText("Registro Diarios");

        edtDataInicio.setBackground(new java.awt.Color(204, 204, 204));
        edtDataInicio.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        edtDataInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDataInicio.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtDataInicio.setEnabled(false);

        edtDataFinal.setBackground(new java.awt.Color(204, 204, 204));
        edtDataFinal.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        edtDataFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Encerramento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDataFinal.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtDataFinal.setEnabled(false);

        edtNomeNutricionista.setBackground(new java.awt.Color(204, 204, 204));
        edtNomeNutricionista.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeNutricionista.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeNutricionista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nutricionista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeNutricionista.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        edtNomeNutricionista.setEnabled(false);

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(edtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtNomeCliente)
                    .addComponent(edtNomeNutricionista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(edtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edtNomeNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(panInputsLayout.createSequentialGroup()
                .addComponent(lblRefeicoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        panBotoes.setBackground(new java.awt.Color(51, 51, 51));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(847, 847, 847))
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsDados.addTab("Dados", panDados);

        javax.swing.GroupLayout panBodyLayout = new javax.swing.GroupLayout(panBody);
        panBody.setLayout(panBodyLayout);
        panBodyLayout.setHorizontalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsDados)
                .addContainerGap())
        );
        panBodyLayout.setVerticalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsDados))
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grdAcompanhamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdAcompanhamentosMouseClicked
        if (evt.getClickCount() == 2) {
            this.btnVizualizarAcompanhamentoActionPerformed(null);
        }
    }//GEN-LAST:event_grdAcompanhamentosMouseClicked

    private void btnVizualizarAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVizualizarAcompanhamentoActionPerformed

        acompanhamento = (Acompanhamento) this.getObjetoSelecionadoNaGridAcompanhamento();

        if (acompanhamento == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {
            this.preencherFormulario(acompanhamento);
            this.tabsDados.setSelectedComponent(panDados);
        }
    }//GEN-LAST:event_btnVizualizarAcompanhamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void grdRegistroDiariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdRegistroDiariosMouseClicked
        if (evt.getClickCount() == 2) {
            int aux = grdRegistroDiarios.getSelectedColumn();
            if (aux == 1) {
                this.VizualizarRegistroDiario();
            }
        }
    }//GEN-LAST:event_grdRegistroDiariosMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.limparCampos();
        this.tabsDados.setSelectedComponent(panTodasAsConsultas);
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVizualizarAcompanhamento;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtDataFinal;
    private javax.swing.JTextField edtDataInicio;
    private javax.swing.JTextField edtNomeCliente;
    private javax.swing.JTextField edtNomeNutricionista;
    private javax.swing.JTable grdAcompanhamentos;
    private javax.swing.JTable grdRegistroDiarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRefeicoes;
    private javax.swing.JLabel lblTituloDietas;
    private javax.swing.JLabel lblTituloOpções;
    private javax.swing.JPanel panBody;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panTodasAsConsultas;
    private javax.swing.JTabbedPane tabsDados;
    // End of variables declaration//GEN-END:variables
}
