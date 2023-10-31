package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.IngredienteController;
import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.view.Register.DlgRegister;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgReceitaNutricionista extends javax.swing.JDialog {

    IngredienteController ingredienteController;
    ReceitaController receitaController;

    int idReceitaEditando;
    List<Ingrediente> ingredientes;

    public DlgReceitaNutricionista(java.awt.Dialog parent, boolean modal) {

        super(parent, modal);

        receitaController = new ReceitaController();
        ingredienteController = new IngredienteController();
        idReceitaEditando = -1;
        ingredientes = new ArrayList<>();

        initComponents();

        this.habilitarCampos(false);
        this.limparCampos();
        this.adicionarMascaraNosCampos();
        receitaController.atualizarTabela(grdReceitas);
        ingredienteController.atualizarTabela(grdIngredientes, ingredientes);

    }

    public void habilitarCampos(boolean flag) {
        this.edtNome.setEnabled(flag);
        this.fEdtTempoPreparo.setEnabled(flag);
        this.fEdtPorcoes.setEnabled(flag);
        this.edtCategoria.setEnabled(flag);
        this.edtModoPreparo.setEnabled(flag);

        this.grdIngredientes.setEnabled(flag);

        this.btnAdicionarIngrediente.setEnabled(flag);
        this.btnCancelar.setEnabled(flag);
        this.btnSalvar.setEnabled(flag);
    }

    public void limparCampos() {
        this.edtNome.setText("");
        this.fEdtTempoPreparo.setText("");
        this.fEdtPorcoes.setText("");
        this.edtCategoria.setText("");
        this.edtModoPreparo.setText("");

        this.ingredienteController.atualizarTabela(grdIngredientes, new ArrayList<>());
    }

    public void preencherFormulario(Receita receita) {
        this.edtNome.setText(receita.getNome());
        this.fEdtTempoPreparo.setText(receita.getTempoPreparo() + "");
        this.fEdtPorcoes.setText(receita.getPorcoes() + "");
        this.edtCategoria.setText(receita.getCategoria());
        this.edtModoPreparo.setText(receita.getModoPreparo());

        this.ingredienteController.atualizarTabela(grdIngredientes, receita.getIngredientes());
    }

    public void adicionarMascaraNosCampos() {

        try {
            MaskFormatter tempoPreparoFormatter = new MaskFormatter("########");
            MaskFormatter porcoesFormatter = new MaskFormatter("########");

            tempoPreparoFormatter.install(fEdtTempoPreparo);
            porcoesFormatter.install(fEdtPorcoes);

        } catch (ParseException ex) {
            Logger.getLogger(DlgReceitaNutricionista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Object getObjetoSelecionadoNaGridReceita() {
        int rowCliked = this.grdReceitas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdReceitas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panBody = new javax.swing.JPanel();
        tabsDados = new javax.swing.JTabbedPane();
        panTodasAsReceitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblTituloReceitas = new javax.swing.JLabel();
        lblTituloOpções = new javax.swing.JLabel();
        panPesquisa = new javax.swing.JPanel();
        lblTituloPesquisa = new javax.swing.JLabel();
        edtPesquisa = new javax.swing.JTextField();
        panFormulario = new javax.swing.JPanel();
        panInputs = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        fEdtTempoPreparo = new javax.swing.JFormattedTextField();
        fEdtPorcoes = new javax.swing.JFormattedTextField();
        edtCategoria = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtModoPreparo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdIngredientes = new javax.swing.JTable();
        lblIngredientes = new javax.swing.JLabel();
        btnAdicionarIngrediente = new javax.swing.JButton();
        panBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
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

        panTodasAsReceitas.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        grdReceitas.setBackground(new java.awt.Color(51, 51, 51));
        grdReceitas.setForeground(new java.awt.Color(255, 255, 255));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(grdReceitas);

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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

        lblTituloReceitas.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTituloReceitas.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloReceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloReceitas.setText("Receitas");

        lblTituloOpções.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTituloOpções.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloOpções.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloOpções.setText("Opções");

        panPesquisa.setBackground(new java.awt.Color(71, 71, 71));

        lblTituloPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloPesquisa.setForeground(new java.awt.Color(0, 204, 51));
        lblTituloPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPesquisa.setText("Pesquisar");

        edtPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        edtPesquisa.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        edtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panPesquisaLayout = new javax.swing.GroupLayout(panPesquisa);
        panPesquisa.setLayout(panPesquisaLayout);
        panPesquisaLayout.setHorizontalGroup(
            panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPesquisa)
                .addContainerGap())
        );
        panPesquisaLayout.setVerticalGroup(
            panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtPesquisa)
                    .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panTodasAsReceitasLayout = new javax.swing.GroupLayout(panTodasAsReceitas);
        panTodasAsReceitas.setLayout(panTodasAsReceitasLayout);
        panTodasAsReceitasLayout.setHorizontalGroup(
            panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTodasAsReceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloOpções, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(panPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTodasAsReceitasLayout.setVerticalGroup(
            panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTodasAsReceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloReceitas)
                    .addComponent(lblTituloOpções, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTodasAsReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panTodasAsReceitasLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTodasAsReceitasLayout.createSequentialGroup()
                        .addComponent(panPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsDados.addTab("Todas as Receitas", panTodasAsReceitas);

        panFormulario.setBackground(new java.awt.Color(51, 51, 51));

        panInputs.setBackground(new java.awt.Color(51, 51, 51));

        edtNome.setBackground(new java.awt.Color(204, 204, 204));
        edtNome.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNome.setForeground(new java.awt.Color(0, 0, 0));
        edtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N

        fEdtTempoPreparo.setBackground(new java.awt.Color(204, 204, 204));
        fEdtTempoPreparo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo (Min)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtTempoPreparo.setForeground(new java.awt.Color(0, 0, 0));
        fEdtTempoPreparo.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N

        fEdtPorcoes.setBackground(new java.awt.Color(204, 204, 204));
        fEdtPorcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtPorcoes.setForeground(new java.awt.Color(0, 0, 0));
        fEdtPorcoes.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N

        edtCategoria.setBackground(new java.awt.Color(204, 204, 204));
        edtCategoria.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtCategoria.setForeground(new java.awt.Color(0, 0, 0));
        edtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N

        edtModoPreparo.setBackground(new java.awt.Color(204, 204, 204));
        edtModoPreparo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo de Preparo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtModoPreparo.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtModoPreparo.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(edtModoPreparo);

        grdIngredientes.setBackground(new java.awt.Color(51, 51, 51));
        grdIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        grdIngredientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(grdIngredientes);

        lblIngredientes.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        lblIngredientes.setForeground(new java.awt.Color(204, 255, 255));
        lblIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngredientes.setText("Ingredientes");

        btnAdicionarIngrediente.setBackground(new java.awt.Color(216, 229, 205));
        btnAdicionarIngrediente.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnAdicionarIngrediente.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionarIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconIgredientes.png"))); // NOI18N
        btnAdicionarIngrediente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicionarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(fEdtTempoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fEdtPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCategoria))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(btnAdicionarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fEdtTempoPreparo)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fEdtPorcoes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panBotoes.setBackground(new java.awt.Color(51, 51, 51));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panFormularioLayout = new javax.swing.GroupLayout(panFormulario);
        panFormulario.setLayout(panFormularioLayout);
        panFormularioLayout.setHorizontalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panFormularioLayout.setVerticalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsDados.addTab("Formulário", panFormulario);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.idReceitaEditando = -1;
        this.tabsDados.setSelectedComponent(panFormulario);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Receita receita = (Receita) this.getObjetoSelecionadoNaGridReceita();

        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.preencherFormulario(receita);
            this.idReceitaEditando = receita.getId();
            this.tabsDados.setSelectedComponent(panFormulario);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Receita receita = (Receita) this.getObjetoSelecionadoNaGridReceita();

        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {

            int response = JOptionPane.showConfirmDialog(null,
                    "Deseja exlcuir a Receita  \n(" + receita.getNome() + ") ?",
                    "Confirmar exclusão",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {

                try {
                    receitaController.excluir(receita);
                    receitaController.atualizarTabela(grdReceitas);
                    JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
                } catch (ReceitaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Nutricionista nutricionista = new Nutricionista("teste", "teste@teste", "senhateste", "cpfTeste", "teste", "teste", "teste");

        try {
            if (idReceitaEditando > 0) {
                receitaController.atualizar(
                        idReceitaEditando,
                        edtNome.getText(), edtModoPreparo.getText(),
                        fEdtTempoPreparo.getText(),
                        fEdtPorcoes.getText(),
                        edtCategoria.getText(),
                        ingredientes, nutricionista
                );
            } else {
                receitaController.cadastrar(
                        edtNome.getText(),
                        edtModoPreparo.getText(),
                        fEdtTempoPreparo.getText(),
                        fEdtPorcoes.getText(),
                        edtCategoria.getText(),
                        ingredientes,
                        nutricionista
                );
            }
            idReceitaEditando = -1;
            receitaController.atualizarTabela(grdReceitas);
            this.habilitarCampos(false);
            this.limparCampos();
        } catch (ReceitaException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.tabsDados.setSelectedComponent(this.panTodasAsReceitas);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarIngredienteActionPerformed
        Ingrediente ingrediente = new Ingrediente();

        DlgIngredienteNutricionista dlgIngredienteNutricionista = new DlgIngredienteNutricionista(this, true, ingrediente, false);
        dlgIngredienteNutricionista.setLocationRelativeTo(this);
        dlgIngredienteNutricionista.setVisible(true);

        if (ingrediente.getId() == -1) {
            JOptionPane.showMessageDialog(this, "Criação cancelada");
        } else {
            ingredientes.add(ingrediente);
            ingredienteController.atualizarTabela(grdIngredientes, ingredientes);
        }
    }//GEN-LAST:event_btnAdicionarIngredienteActionPerformed

    private void edtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPesquisaKeyReleased
        String nomeDigitado = edtPesquisa.getText();
        if(!nomeDigitado.isEmpty())
            this.receitaController.atualizarTabela(grdReceitas, nomeDigitado);
        else
            this.receitaController.atualizarTabela(grdReceitas);
    }//GEN-LAST:event_edtPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarIngrediente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCategoria;
    private javax.swing.JTextPane edtModoPreparo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JFormattedTextField fEdtPorcoes;
    private javax.swing.JFormattedTextField fEdtTempoPreparo;
    private javax.swing.JTable grdIngredientes;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTituloOpções;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTituloReceitas;
    private javax.swing.JPanel panBody;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panFormulario;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panPesquisa;
    private javax.swing.JPanel panTodasAsReceitas;
    private javax.swing.JTabbedPane tabsDados;
    // End of variables declaration//GEN-END:variables
}
