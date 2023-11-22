package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.DietaController;
import com.artgui.nutrisis.controller.RefeicaoController;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Refeicao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DlgDietaCliente extends javax.swing.JDialog {

    DietaController dietaController;
    RefeicaoController refeicaoController;

    public DlgDietaCliente(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);

        dietaController = new DietaController();
        refeicaoController = new RefeicaoController();

        initComponents();

        this.limparCampos();
        this.habilitarCampos(false);

        this.dietaController.atualizarTabela(grdDietas);
    }

    public void habilitarCampos(boolean flag) {

        for (int i = 0; i < this.panAutorNutricionista.getComponents().length; i++) {
            this.panAutorNutricionista.getComponent(i).setEnabled(flag);
        }
        for (int i = 0; i < this.panDietaInfo.getComponents().length; i++) {
            this.panDietaInfo.getComponent(i).setEnabled(flag);
        }
        this.edtDescricao.setEnabled(flag);

        this.edtPesquisar.setEnabled(true);
        this.grdRefeicoes.setEnabled(true);
    }

    public void limparCampos() {

        this.edtNomeAutor.setText("");
        this.edtEmailAutor.setText("");
        this.edtEspecializacaoAutor.setText("");
        this.edtNomeDieta.setText("");
        this.edtDiaDuracao.setText("");
        this.edtDescricao.setText("");

        this.refeicaoController.atualizarTabelaVizualizar(grdRefeicoes, new ArrayList<>());
    }

    public void preencherFormulario(Dieta dieta) {
        this.edtNomeAutor.setText(dieta.getNutricionista().getNome());
        this.edtEmailAutor.setText(dieta.getNutricionista().getEmail());
        this.edtEspecializacaoAutor.setText(dieta.getNutricionista().getEspecializacao());
        this.edtNomeDieta.setText(dieta.getNome());
        this.edtDiaDuracao.setText(dieta.getDiasDuracao() + "");
        this.edtDescricao.setText(dieta.getDescricao());

        this.refeicaoController.atualizarTabelaVizualizar(grdRefeicoes, dieta.getRefeicoes());
    }

    private Object getObjetoSelecionadoNaGridDieta() {
        int rowCliked = grdDietas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdDietas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    private Object getObjetoSelecionadoNaGridRefeicao() {
        int rowCliked = grdRefeicoes.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdRefeicoes.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain1 = new javax.swing.JPanel();
        panHeader2 = new javax.swing.JPanel();
        lblLogo2 = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        panEscolha1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdDietas = new javax.swing.JTable();
        btnVoltar1 = new javax.swing.JButton();
        btnVerDieta = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        edtPesquisar = new javax.swing.JTextField();
        panVizualizar = new javax.swing.JPanel();
        panAutorNutricionista = new javax.swing.JPanel();
        edtNomeAutor = new javax.swing.JTextField();
        edtEmailAutor = new javax.swing.JTextField();
        edtEspecializacaoAutor = new javax.swing.JTextField();
        panDietaInfo = new javax.swing.JPanel();
        edtNomeDieta = new javax.swing.JTextField();
        edtDiaDuracao = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtDescricao = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        grdRefeicoes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panHeader2.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        lblTitle1.setFont(new java.awt.Font("Cascadia Mono", 0, 98)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Dietas");

        javax.swing.GroupLayout panHeader2Layout = new javax.swing.GroupLayout(panHeader2);
        panHeader2.setLayout(panHeader2Layout);
        panHeader2Layout.setHorizontalGroup(
            panHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeader2Layout.createSequentialGroup()
                .addComponent(lblLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panHeader2Layout.setVerticalGroup(
            panHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panEscolha1.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dietas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        grdDietas.setBackground(new java.awt.Color(71, 71, 71));
        grdDietas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdDietas.setForeground(new java.awt.Color(255, 255, 255));
        grdDietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        grdDietas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdDietas.setFocusTraversalPolicyProvider(true);
        grdDietas.setFocusable(false);
        grdDietas.setGridColor(new java.awt.Color(0, 0, 0));
        grdDietas.setShowGrid(true);
        grdDietas.setShowHorizontalLines(false);
        grdDietas.setShowVerticalLines(false);
        grdDietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdDietasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grdDietas);

        btnVoltar1.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar1.setText("Voltar");
        btnVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar1.setFocusable(false);
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnVerDieta.setBackground(new java.awt.Color(255, 255, 255));
        btnVerDieta.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        btnVerDieta.setForeground(new java.awt.Color(0, 0, 0));
        btnVerDieta.setText("Vizualizar");
        btnVerDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerDieta.setFocusable(false);
        btnVerDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDietaActionPerformed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(0, 204, 51));
        lblPesquisar.setText("Pesquisar");

        edtPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        edtPesquisar.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        edtPesquisar.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtPesquisar.setOpaque(true);
        edtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panEscolha1Layout = new javax.swing.GroupLayout(panEscolha1);
        panEscolha1.setLayout(panEscolha1Layout);
        panEscolha1Layout.setHorizontalGroup(
            panEscolha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEscolha1Layout.createSequentialGroup()
                .addGroup(panEscolha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEscolha1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panEscolha1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtPesquisar))
                    .addGroup(panEscolha1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnVoltar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btnVerDieta)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        panEscolha1Layout.setVerticalGroup(
            panEscolha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEscolha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panEscolha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panEscolha1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(edtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addComponent(lblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEscolha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panVizualizar.setBackground(new java.awt.Color(71, 71, 71));

        panAutorNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        panAutorNutricionista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        edtNomeAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtNomeAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeAutor.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtNomeAutor.setEnabled(false);
        edtNomeAutor.setOpaque(true);

        edtEmailAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtEmailAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtEmailAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtEmailAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtEmailAutor.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtEmailAutor.setEnabled(false);
        edtEmailAutor.setOpaque(true);

        edtEspecializacaoAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtEspecializacaoAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtEspecializacaoAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtEspecializacaoAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialização", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtEspecializacaoAutor.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtEspecializacaoAutor.setEnabled(false);
        edtEspecializacaoAutor.setOpaque(true);

        javax.swing.GroupLayout panAutorNutricionistaLayout = new javax.swing.GroupLayout(panAutorNutricionista);
        panAutorNutricionista.setLayout(panAutorNutricionistaLayout);
        panAutorNutricionistaLayout.setHorizontalGroup(
            panAutorNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAutorNutricionistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtNomeAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEmailAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEspecializacaoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panAutorNutricionistaLayout.setVerticalGroup(
            panAutorNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAutorNutricionistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAutorNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEmailAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEspecializacaoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panDietaInfo.setBackground(new java.awt.Color(51, 51, 51));
        panDietaInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre a dieta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        edtNomeDieta.setBackground(new java.awt.Color(71, 71, 71));
        edtNomeDieta.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeDieta.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeDieta.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtNomeDieta.setEnabled(false);
        edtNomeDieta.setOpaque(true);

        edtDiaDuracao.setBackground(new java.awt.Color(71, 71, 71));
        edtDiaDuracao.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDiaDuracao.setForeground(new java.awt.Color(0, 0, 0));
        edtDiaDuracao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dias de Duração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDiaDuracao.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtDiaDuracao.setEnabled(false);
        edtDiaDuracao.setOpaque(true);

        edtDescricao.setBackground(new java.awt.Color(71, 71, 71));
        edtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDescricao.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        edtDescricao.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtDescricao.setEnabled(false);
        jScrollPane3.setViewportView(edtDescricao);

        jScrollPane4.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Refeições", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane4.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setEnabled(false);

        grdRefeicoes.setBackground(new java.awt.Color(71, 71, 71));
        grdRefeicoes.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdRefeicoes.setForeground(new java.awt.Color(255, 255, 255));
        grdRefeicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grdRefeicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdRefeicoes.setEnabled(false);
        grdRefeicoes.setGridColor(new java.awt.Color(0, 0, 0));
        grdRefeicoes.setShowGrid(true);
        grdRefeicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdRefeicoesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(grdRefeicoes);

        javax.swing.GroupLayout panDietaInfoLayout = new javax.swing.GroupLayout(panDietaInfo);
        panDietaInfo.setLayout(panDietaInfoLayout);
        panDietaInfoLayout.setHorizontalGroup(
            panDietaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDietaInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDietaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDietaInfoLayout.createSequentialGroup()
                        .addComponent(edtNomeDieta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDiaDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
                .addContainerGap())
        );
        panDietaInfoLayout.setVerticalGroup(
            panDietaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDietaInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDietaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNomeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDiaDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panVizualizarLayout = new javax.swing.GroupLayout(panVizualizar);
        panVizualizar.setLayout(panVizualizarLayout);
        panVizualizarLayout.setHorizontalGroup(
            panVizualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAutorNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panDietaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panVizualizarLayout.setVerticalGroup(
            panVizualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVizualizarLayout.createSequentialGroup()
                .addComponent(panAutorNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panDietaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panMain1Layout = new javax.swing.GroupLayout(panMain1);
        panMain1.setLayout(panMain1Layout);
        panMain1Layout.setHorizontalGroup(
            panMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMain1Layout.createSequentialGroup()
                .addComponent(panEscolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panVizualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMain1Layout.setVerticalGroup(
            panMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMain1Layout.createSequentialGroup()
                .addComponent(panHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panEscolha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panVizualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnVerDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDietaActionPerformed
        Dieta dieta = (Dieta) this.getObjetoSelecionadoNaGridDieta();

        if (dieta == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.preencherFormulario(dieta);
        }
    }//GEN-LAST:event_btnVerDietaActionPerformed

    private void grdDietasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdDietasMouseClicked
        if (evt.getClickCount() == 2) {
            btnVerDietaActionPerformed(null);
        }
    }//GEN-LAST:event_grdDietasMouseClicked

    private void edtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPesquisarKeyReleased
        String nomeDigitado = edtPesquisar.getText();
        if (!nomeDigitado.isEmpty()) {
            this.dietaController.atualizarTabela(grdDietas, nomeDigitado);
        } else {
            this.dietaController.atualizarTabela(grdDietas);
        }
    }//GEN-LAST:event_edtPesquisarKeyReleased

    private void grdRefeicoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdRefeicoesMouseClicked
        if (evt.getClickCount() == 2) {
            int aux = grdRefeicoes.getSelectedColumn();
            if (aux == 1) {
                this.VizualizarRefeicao();
            }
        }
    }//GEN-LAST:event_grdRefeicoesMouseClicked

    private void VizualizarRefeicao() {
        Refeicao refeicao = (Refeicao) this.getObjetoSelecionadoNaGridRefeicao();

        if (refeicao == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {
            DlgVizualizarRefeicao dlgRefeicaoCliente = new DlgVizualizarRefeicao(this, true, refeicao);
            this.setVisible(false);
            dlgRefeicaoCliente.setLocationRelativeTo(this);
            dlgRefeicaoCliente.setVisible(true);
            this.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerDieta;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JTextPane edtDescricao;
    private javax.swing.JTextField edtDiaDuracao;
    private javax.swing.JTextField edtEmailAutor;
    private javax.swing.JTextField edtEspecializacaoAutor;
    private javax.swing.JTextField edtNomeAutor;
    private javax.swing.JTextField edtNomeDieta;
    private javax.swing.JTextField edtPesquisar;
    private javax.swing.JTable grdDietas;
    private javax.swing.JTable grdRefeicoes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel panAutorNutricionista;
    private javax.swing.JPanel panDietaInfo;
    private javax.swing.JPanel panEscolha1;
    private javax.swing.JPanel panHeader2;
    private javax.swing.JPanel panMain1;
    private javax.swing.JPanel panVizualizar;
    // End of variables declaration//GEN-END:variables
}
