package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.ConsultaController;
import com.artgui.nutrisis.controller.DietaController;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.view.Cliente.DlgVizualizarDieta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DlgConsultaNutricionista extends javax.swing.JDialog {

    private Nutricionista nutricionista;

    private DietaController dietaController;
    private ConsultaController consultaController;

    public DlgConsultaNutricionista(java.awt.Dialog parent, boolean modal, Nutricionista nutricionista) {
        super(parent, modal);

        this.nutricionista = nutricionista;
        this.dietaController = new DietaController();
        this.consultaController = new ConsultaController();

        initComponents();

        this.consultaController.atualizarTabela(grdConsultas, nutricionista);
    }

    private void limparCampos() {
        this.edtNomeCliente.setText("");
        this.edtNomeNutricionista.setText("");
        this.edtStatus.setText("");
        this.edtData.setText("");
        this.edtDescricao.setText("");

        this.dietaController.atualizarTabelaVizualizar(grdDietas, new ArrayList<>());
    }

    private void preencherFormulario(Consulta consulta) {
        this.edtNomeCliente.setText(consulta.getCliente().getNome());
        this.edtNomeNutricionista.setText(consulta.getNutricionista().getNome());
        this.edtStatus.setText(consulta.getStatus());
        this.edtData.setText(consulta.getDataMarcada());
        this.edtDescricao.setText(consulta.getDescricao());

        this.dietaController.atualizarTabelaVizualizar(grdDietas, consulta.getDietasRecomendadas());
    }

    private Object getObjetoSelecionadoNaGridDieta() {
        int rowCliked = this.grdDietas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdDietas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    private Object getObjetoSelecionadoNaGridConsulta() {
        int rowCliked = this.grdConsultas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdConsultas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
    private void VizualizarDieta(){
        Dieta dieta = (Dieta) this.getObjetoSelecionadoNaGridDieta();
        
        if (dieta == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {
            DlgVizualizarDieta dlgVizualizarDieta = new DlgVizualizarDieta(this, true, dieta);
            this.setVisible(false);
            dlgVizualizarDieta.setLocationRelativeTo(this);
            dlgVizualizarDieta.setVisible(true);
            this.setVisible(true);
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
        grdConsultas = new javax.swing.JTable();
        btnAtualizarConsulta = new javax.swing.JButton();
        btnVizualizarConsulta = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblTituloDietas = new javax.swing.JLabel();
        lblTituloOpções = new javax.swing.JLabel();
        panDados = new javax.swing.JPanel();
        panInputs = new javax.swing.JPanel();
        edtNomeCliente = new javax.swing.JTextField();
        edtStatus = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtDescricao = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdDietas = new javax.swing.JTable();
        lblRefeicoes = new javax.swing.JLabel();
        edtData = new javax.swing.JTextField();
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
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panBody.setBackground(new java.awt.Color(71, 71, 71));

        tabsDados.setBackground(new java.awt.Color(204, 204, 204));
        tabsDados.setForeground(new java.awt.Color(0, 0, 0));

        panTodasAsConsultas.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        grdConsultas.setBackground(new java.awt.Color(51, 51, 51));
        grdConsultas.setForeground(new java.awt.Color(255, 255, 255));
        grdConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        grdConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdConsultas);

        btnAtualizarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarConsulta.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnAtualizarConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizarConsulta.setText("Atualizar Consulta");
        btnAtualizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarConsultaActionPerformed(evt);
            }
        });

        btnVizualizarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnVizualizarConsulta.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnVizualizarConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnVizualizarConsulta.setText("Vizualizar Consulta");
        btnVizualizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVizualizarConsultaActionPerformed(evt);
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
        lblTituloDietas.setText("Consultas");

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
                    .addComponent(btnVizualizarConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloOpções, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
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
                        .addComponent(btnAtualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVizualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
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
        edtDescricao.setEnabled(false);
        jScrollPane2.setViewportView(edtDescricao);

        grdDietas.setBackground(new java.awt.Color(51, 51, 51));
        grdDietas.setForeground(new java.awt.Color(255, 255, 255));
        grdDietas.setModel(new javax.swing.table.DefaultTableModel(
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
        grdDietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdDietasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(grdDietas);

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
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addComponent(lblRefeicoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNomeNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(lblRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(847, 847, 847))
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grdConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdConsultasMouseClicked
        if (evt.getClickCount() == 2) {
            this.btnVizualizarConsultaActionPerformed(null);
        }
    }//GEN-LAST:event_grdConsultasMouseClicked

    private void btnAtualizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarConsultaActionPerformed
        Consulta consulta = (Consulta) this.getObjetoSelecionadoNaGridConsulta();

        if (consulta != null) {
            if ("Marcada".equals(consulta.getStatus())) {
                DlgAtualizaConsulta dlgAtualizaConsulta = new DlgAtualizaConsulta(this, true, consulta);
                dlgAtualizaConsulta.setLocationRelativeTo(this);
                dlgAtualizaConsulta.setVisible(true);

                this.consultaController.atualizarTabela(grdConsultas, nutricionista);
            } else {
                if ("Concluida".equals(consulta.getStatus())) {
                    JOptionPane.showMessageDialog(this, "A consulta ja foi Concluida.");
                } else {
                    JOptionPane.showMessageDialog(this, "A consulta esta Em Progresso.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        }
    }//GEN-LAST:event_btnAtualizarConsultaActionPerformed

    private void btnVizualizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVizualizarConsultaActionPerformed

        Consulta consulta = (Consulta) this.getObjetoSelecionadoNaGridConsulta();

        if (consulta == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {
            this.preencherFormulario(consulta);
            this.tabsDados.setSelectedComponent(panDados);
        }
    }//GEN-LAST:event_btnVizualizarConsultaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void grdDietasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdDietasMouseClicked
        if (evt.getClickCount() == 2) {
            int aux = grdDietas.getSelectedColumn();
            if (aux == 1) {
                this.VizualizarDieta();
            }
        }
    }//GEN-LAST:event_grdDietasMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.limparCampos();
        this.tabsDados.setSelectedComponent(panTodasAsConsultas);
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarConsulta;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVizualizarConsulta;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextPane edtDescricao;
    private javax.swing.JTextField edtNomeCliente;
    private javax.swing.JTextField edtNomeNutricionista;
    private javax.swing.JTextField edtStatus;
    private javax.swing.JTable grdConsultas;
    private javax.swing.JTable grdDietas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
