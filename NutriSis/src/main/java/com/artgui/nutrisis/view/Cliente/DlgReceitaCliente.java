package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.IngredienteController;
import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.model.Receita;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DlgReceitaCliente extends javax.swing.JDialog {

    IngredienteController ingredienteController;
    ReceitaController receitaController;
        
    public DlgReceitaCliente(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ingredienteController = new IngredienteController();
        receitaController = new ReceitaController();
        
        this.limparCampos();
        this.habilitarCampos(false);
        
        //******
        this.receitaController.atualizarTabela(grdReceitas);
        //******
        
        
    }
    
    public void habilitarCampos(boolean flag) {
        
        for (int i = 0; i < this.panAutorNutricionista.getComponents().length; i++) {
            this.panAutorNutricionista.getComponent(i).setEnabled(flag);
        }
        for (int i = 0; i < this.panReceitaInfo.getComponents().length; i++) {
            this.panReceitaInfo.getComponent(i).setEnabled(flag);
        }
        this.edtModoPreparoReceita.setEnabled(flag);
        this.grdIngredientes.setEnabled(flag);
        
    }

    public void limparCampos() {
    
        this.edtNomeAutor.setText("");
        this.edtEmailAutor.setText("");
        this.edtEspecializacaoAutor.setText("");
        this.edtNomeReceita.setText("");
        this.edtTempoPreparoReceita.setText("");
        this.edtPorcoesReceita.setText("");
        this.edtCategoriaReceita.setText("");
        this.edtModoPreparoReceita.setText("");
        this.ingredienteController.atualizarTabela(grdIngredientes, new ArrayList());

    }
    
    public void preencherFormulario(Receita receita){
        this.edtNomeAutor.setText(receita.getNutricionista().getNome());
        this.edtEmailAutor.setText(receita.getNutricionista().getEmail());
        this.edtEspecializacaoAutor.setText(receita.getNutricionista().getEspecializacao());
        this.edtNomeReceita.setText(receita.getNome());
        this.edtTempoPreparoReceita.setText(receita.getTempoPreparo() + "");
        this.edtPorcoesReceita.setText(receita.getPorcoes() + "");
        this.edtCategoriaReceita.setText(receita.getCategoria());
        this.edtModoPreparoReceita.setText(receita.getModoPreparo());
        this.ingredienteController.atualizarTabela(grdIngredientes, receita.getIngredientes());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader1 = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        panEscolha = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnVerReceita = new javax.swing.JButton();
        panVizualizar = new javax.swing.JPanel();
        panAutorNutricionista = new javax.swing.JPanel();
        edtNomeAutor = new javax.swing.JTextField();
        edtEmailAutor = new javax.swing.JTextField();
        edtEspecializacaoAutor = new javax.swing.JTextField();
        panReceitaInfo = new javax.swing.JPanel();
        edtNomeReceita = new javax.swing.JTextField();
        edtTempoPreparoReceita = new javax.swing.JTextField();
        edtPorcoesReceita = new javax.swing.JTextField();
        edtCategoriaReceita = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtModoPreparoReceita = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdIngredientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        panHeader1.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cascadia Mono", 0, 98)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Receitas");

        javax.swing.GroupLayout panHeader1Layout = new javax.swing.GroupLayout(panHeader1);
        panHeader1.setLayout(panHeader1Layout);
        panHeader1Layout.setHorizontalGroup(
            panHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeader1Layout.createSequentialGroup()
                .addComponent(lblLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panHeader1Layout.setVerticalGroup(
            panHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panEscolha.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receitas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        grdReceitas.setBackground(new java.awt.Color(71, 71, 71));
        grdReceitas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdReceitas.setForeground(new java.awt.Color(255, 153, 0));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
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
        grdReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdReceitas.setGridColor(new java.awt.Color(0, 0, 0));
        grdReceitas.setShowGrid(true);
        grdReceitas.setShowHorizontalLines(false);
        grdReceitas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(grdReceitas);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusable(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnVerReceita.setBackground(new java.awt.Color(255, 255, 255));
        btnVerReceita.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        btnVerReceita.setForeground(new java.awt.Color(0, 0, 0));
        btnVerReceita.setText("Ver receita");
        btnVerReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerReceita.setFocusable(false);
        btnVerReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEscolhaLayout = new javax.swing.GroupLayout(panEscolha);
        panEscolha.setLayout(panEscolhaLayout);
        panEscolhaLayout.setHorizontalGroup(
            panEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panEscolhaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnVoltar)
                .addGap(18, 18, 18)
                .addComponent(btnVerReceita)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panEscolhaLayout.setVerticalGroup(
            panEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEscolhaLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panVizualizar.setBackground(new java.awt.Color(71, 71, 71));

        panAutorNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        panAutorNutricionista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        edtNomeAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtNomeAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeAutor.setText("Nome Nutricionista");
        edtNomeAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeAutor.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtNomeAutor.setEnabled(false);
        edtNomeAutor.setOpaque(true);

        edtEmailAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtEmailAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtEmailAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtEmailAutor.setText("Email");
        edtEmailAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtEmailAutor.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtEmailAutor.setEnabled(false);
        edtEmailAutor.setOpaque(true);

        edtEspecializacaoAutor.setBackground(new java.awt.Color(71, 71, 71));
        edtEspecializacaoAutor.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtEspecializacaoAutor.setForeground(new java.awt.Color(0, 0, 0));
        edtEspecializacaoAutor.setText("Especialização");
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
                .addComponent(edtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEmailAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtEspecializacaoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
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

        panReceitaInfo.setBackground(new java.awt.Color(51, 51, 51));
        panReceitaInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre a receita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        edtNomeReceita.setBackground(new java.awt.Color(71, 71, 71));
        edtNomeReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNomeReceita.setForeground(new java.awt.Color(0, 0, 0));
        edtNomeReceita.setText("jTextField4");
        edtNomeReceita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeReceita.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtNomeReceita.setEnabled(false);
        edtNomeReceita.setOpaque(true);

        edtTempoPreparoReceita.setBackground(new java.awt.Color(71, 71, 71));
        edtTempoPreparoReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtTempoPreparoReceita.setForeground(new java.awt.Color(0, 0, 0));
        edtTempoPreparoReceita.setText("jTextField4");
        edtTempoPreparoReceita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo Preparo (Min)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51)))); // NOI18N
        edtTempoPreparoReceita.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtTempoPreparoReceita.setEnabled(false);
        edtTempoPreparoReceita.setOpaque(true);

        edtPorcoesReceita.setBackground(new java.awt.Color(71, 71, 71));
        edtPorcoesReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtPorcoesReceita.setForeground(new java.awt.Color(0, 0, 0));
        edtPorcoesReceita.setText("jTextField4");
        edtPorcoesReceita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtPorcoesReceita.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtPorcoesReceita.setEnabled(false);
        edtPorcoesReceita.setOpaque(true);

        edtCategoriaReceita.setBackground(new java.awt.Color(71, 71, 71));
        edtCategoriaReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtCategoriaReceita.setForeground(new java.awt.Color(0, 0, 0));
        edtCategoriaReceita.setText("jTextField4");
        edtCategoriaReceita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtCategoriaReceita.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtCategoriaReceita.setEnabled(false);
        edtCategoriaReceita.setOpaque(true);

        edtModoPreparoReceita.setBackground(new java.awt.Color(71, 71, 71));
        edtModoPreparoReceita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo de Preparo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtModoPreparoReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtModoPreparoReceita.setForeground(new java.awt.Color(0, 0, 0));
        edtModoPreparoReceita.setText("Modo de preparo");
        edtModoPreparoReceita.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtModoPreparoReceita.setEnabled(false);
        jScrollPane3.setViewportView(edtModoPreparoReceita);

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrediente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setEnabled(false);

        grdIngredientes.setBackground(new java.awt.Color(71, 71, 71));
        grdIngredientes.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdIngredientes.setForeground(new java.awt.Color(204, 255, 255));
        grdIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Unidade de Medida", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        grdIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdIngredientes.setEnabled(false);
        grdIngredientes.setGridColor(new java.awt.Color(0, 0, 0));
        grdIngredientes.setShowGrid(true);
        jScrollPane2.setViewportView(grdIngredientes);
        if (grdIngredientes.getColumnModel().getColumnCount() > 0) {
            grdIngredientes.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panReceitaInfoLayout = new javax.swing.GroupLayout(panReceitaInfo);
        panReceitaInfo.setLayout(panReceitaInfoLayout);
        panReceitaInfoLayout.setHorizontalGroup(
            panReceitaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panReceitaInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReceitaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(panReceitaInfoLayout.createSequentialGroup()
                        .addComponent(edtNomeReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTempoPreparoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtPorcoesReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panReceitaInfoLayout.setVerticalGroup(
            panReceitaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panReceitaInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReceitaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTempoPreparoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPorcoesReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panVizualizarLayout = new javax.swing.GroupLayout(panVizualizar);
        panVizualizar.setLayout(panVizualizarLayout);
        panVizualizarLayout.setHorizontalGroup(
            panVizualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVizualizarLayout.createSequentialGroup()
                .addGroup(panVizualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panReceitaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAutorNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panVizualizarLayout.setVerticalGroup(
            panVizualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVizualizarLayout.createSequentialGroup()
                .addComponent(panAutorNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panReceitaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panVizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panVizualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReceitaActionPerformed
        Receita receita = (Receita)  this.getObjetoSelecionadoNaGrid();
        
        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.preencherFormulario(receita);
        }   
    }//GEN-LAST:event_btnVerReceitaActionPerformed

    private Object getObjetoSelecionadoNaGrid() {
        int rowCliked = grdReceitas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdReceitas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    

    private void grdAlunosMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if (evt.getClickCount() == 2) {
            btnVerReceitaActionPerformed(null);
        }
    }  
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerReceita;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCategoriaReceita;
    private javax.swing.JTextField edtEmailAutor;
    private javax.swing.JTextField edtEspecializacaoAutor;
    private javax.swing.JTextPane edtModoPreparoReceita;
    private javax.swing.JTextField edtNomeAutor;
    private javax.swing.JTextField edtNomeReceita;
    private javax.swing.JTextField edtPorcoesReceita;
    private javax.swing.JTextField edtTempoPreparoReceita;
    private javax.swing.JTable grdIngredientes;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panAutorNutricionista;
    private javax.swing.JPanel panEscolha;
    private javax.swing.JPanel panHeader1;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panReceitaInfo;
    private javax.swing.JPanel panVizualizar;
    // End of variables declaration//GEN-END:variables
}
