package com.artgui.nutrisis.view;

import com.artgui.nutrisis.controller.IngredienteController;
import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgCRUDReceita extends javax.swing.JDialog {

    ReceitaController receitaController = new ReceitaController();
    IngredienteController ingredienteController = new IngredienteController();
    
    int idReceitaEditando;
    
    List<Ingrediente> ingredientes;
    
    public DlgCRUDReceita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        receitaController = new ReceitaController();
        ingredienteController = new IngredienteController();
        
        idReceitaEditando = -1;
        ingredientes = new ArrayList<>();
        
        initComponents();
        
        this.habilitarCampos(false);
        this.limparCampos();
        
        receitaController.atualizarTabela(grdReceitas);
        ingredienteController.atualizarTabela(grdIngredientes, ingredientes);
    }
    
    public void habilitarCampos(boolean flag) {
        
        for (int i = 0; i < panInputs.getComponents().length; i++) {
            panInputs.getComponent(i).setEnabled(flag);
        }
    }

    public void limparCampos() {
    
        edtNome.setText("");
        fEdtTempoPreparo.setText("");
        fEdtPorcoes.setText("");
        edtCategoria.setText("");
        fEdtIdNutricionista.setText("");
        edtModoDePreparo.setText("");
        
        ingredientes = new ArrayList<>();
        ingredienteController.atualizarTabela(grdIngredientes, ingredientes);
    }

    public void adicionarMascaraNosCampos() {
      
        try {
            MaskFormatter tempoPreparoFormatter = new MaskFormatter("##:##");
            MaskFormatter porcoesFormatter = new MaskFormatter("#########");
            MaskFormatter idNutricionistaFormatter = new MaskFormatter("#########");
            
            tempoPreparoFormatter.install(fEdtTempoPreparo);
            porcoesFormatter.install(fEdtPorcoes);
            idNutricionistaFormatter.install(fEdtIdNutricionista);
        } catch (ParseException ex) {
            Logger.getLogger(DlgCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preencherFormulario(Receita r) {
    
        edtNome.setText(r.getNome());
        fEdtTempoPreparo.setText(r.getTempoPreparo());
        fEdtPorcoes.setText(r.getPorcoes() + "");
        edtCategoria.setText(r.getCategoria());
        fEdtIdNutricionista.setText(r.getNutricionista().getId() + "");
        edtModoDePreparo.setText(r.getModoPreparo());
        ingredientes = new ArrayList<>(r.getIngredientes());
        
        ingredienteController.atualizarTabela(grdIngredientes, ingredientes);        
    }
  
    private Object getObjetoSelecionadoNaGridReceita() {
        int rowCliked = grdReceitas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdReceitas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    

    private Object getObjetoSelecionadoNaGridIngrediente() {
        int rowCliked = grdIngredientes.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdIngredientes.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panButtons = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panInputs = new javax.swing.JPanel();
        panNome = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        panTempoPreparo = new javax.swing.JPanel();
        lblTempoPreparo = new javax.swing.JLabel();
        fEdtTempoPreparo = new javax.swing.JFormattedTextField();
        panPorcoes = new javax.swing.JPanel();
        lblPorcoes = new javax.swing.JLabel();
        fEdtPorcoes = new javax.swing.JFormattedTextField();
        panCategoria = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        edtCategoria = new javax.swing.JTextField();
        panIdNutricionista = new javax.swing.JPanel();
        lblIdNutricionista = new javax.swing.JLabel();
        fEdtIdNutricionista = new javax.swing.JFormattedTextField();
        panModoDePreparo = new javax.swing.JPanel();
        lblModoPreparo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtModoDePreparo = new javax.swing.JTextArea();
        panIngredientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdIngredientes = new javax.swing.JTable();
        lblTituloIngrediente = new javax.swing.JLabel();
        btnCriarIngrediente = new javax.swing.JButton();
        btnEditarIngrediente = new javax.swing.JButton();
        btnExcluirIngrediente = new javax.swing.JButton();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();
        lblTituloTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CRUD Receita");

        panButtons.setBackground(new java.awt.Color(40, 40, 40));

        btnCriar.setBackground(new java.awt.Color(51, 51, 51));
        btnCriar.setForeground(new java.awt.Color(0, 255, 51));
        btnCriar.setText("Criar");
        btnCriar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCriar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setForeground(new java.awt.Color(255, 255, 0));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setForeground(new java.awt.Color(255, 102, 102));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 153, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setForeground(new java.awt.Color(0, 204, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonsLayout = new javax.swing.GroupLayout(panButtons);
        panButtons.setLayout(panButtonsLayout);
        panButtonsLayout.setHorizontalGroup(
            panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panButtonsLayout.setVerticalGroup(
            panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panInputs.setBackground(new java.awt.Color(40, 40, 40));

        panNome.setBackground(new java.awt.Color(51, 51, 51));
        panNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panNome.setForeground(new java.awt.Color(204, 204, 204));

        lblNome.setBackground(new java.awt.Color(51, 51, 51));
        lblNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 204, 204));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        edtNome.setBackground(new java.awt.Color(51, 51, 51));
        edtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        edtNome.setForeground(new java.awt.Color(204, 204, 204));
        edtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panNomeLayout = new javax.swing.GroupLayout(panNome);
        panNome.setLayout(panNomeLayout);
        panNomeLayout.setHorizontalGroup(
            panNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNomeLayout.createSequentialGroup()
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNome))
        );
        panNomeLayout.setVerticalGroup(
            panNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panTempoPreparo.setBackground(new java.awt.Color(51, 51, 51));
        panTempoPreparo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panTempoPreparo.setForeground(new java.awt.Color(204, 204, 204));

        lblTempoPreparo.setBackground(new java.awt.Color(51, 51, 51));
        lblTempoPreparo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTempoPreparo.setForeground(new java.awt.Color(204, 204, 204));
        lblTempoPreparo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoPreparo.setText("Tempo Preparo");

        fEdtTempoPreparo.setBackground(new java.awt.Color(51, 51, 51));
        fEdtTempoPreparo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtTempoPreparo.setForeground(new java.awt.Color(204, 204, 204));
        fEdtTempoPreparo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panTempoPreparoLayout = new javax.swing.GroupLayout(panTempoPreparo);
        panTempoPreparo.setLayout(panTempoPreparoLayout);
        panTempoPreparoLayout.setHorizontalGroup(
            panTempoPreparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTempoPreparoLayout.createSequentialGroup()
                .addComponent(lblTempoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtTempoPreparo))
        );
        panTempoPreparoLayout.setVerticalGroup(
            panTempoPreparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTempoPreparo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtTempoPreparo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panPorcoes.setBackground(new java.awt.Color(51, 51, 51));
        panPorcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panPorcoes.setForeground(new java.awt.Color(204, 204, 204));
        panPorcoes.setPreferredSize(new java.awt.Dimension(364, 50));

        lblPorcoes.setBackground(new java.awt.Color(51, 51, 51));
        lblPorcoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPorcoes.setForeground(new java.awt.Color(204, 204, 204));
        lblPorcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcoes.setText("Porcoes");

        fEdtPorcoes.setBackground(new java.awt.Color(51, 51, 51));
        fEdtPorcoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtPorcoes.setForeground(new java.awt.Color(204, 204, 204));
        fEdtPorcoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panPorcoesLayout = new javax.swing.GroupLayout(panPorcoes);
        panPorcoes.setLayout(panPorcoesLayout);
        panPorcoesLayout.setHorizontalGroup(
            panPorcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPorcoesLayout.createSequentialGroup()
                .addComponent(lblPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtPorcoes))
        );
        panPorcoesLayout.setVerticalGroup(
            panPorcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPorcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtPorcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        panCategoria.setBackground(new java.awt.Color(51, 51, 51));
        panCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panCategoria.setForeground(new java.awt.Color(204, 204, 204));
        panCategoria.setPreferredSize(new java.awt.Dimension(364, 50));

        lblCategoria.setBackground(new java.awt.Color(51, 51, 51));
        lblCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(204, 204, 204));
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoria");

        edtCategoria.setBackground(new java.awt.Color(51, 51, 51));
        edtCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        edtCategoria.setForeground(new java.awt.Color(204, 204, 204));
        edtCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panCategoriaLayout = new javax.swing.GroupLayout(panCategoria);
        panCategoria.setLayout(panCategoriaLayout);
        panCategoriaLayout.setHorizontalGroup(
            panCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCategoriaLayout.createSequentialGroup()
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCategoria))
        );
        panCategoriaLayout.setVerticalGroup(
            panCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        panIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        panIdNutricionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));

        lblIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        lblIdNutricionista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));
        lblIdNutricionista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdNutricionista.setText("ID Nutricionista");

        fEdtIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        fEdtIdNutricionista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));
        fEdtIdNutricionista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panIdNutricionistaLayout = new javax.swing.GroupLayout(panIdNutricionista);
        panIdNutricionista.setLayout(panIdNutricionistaLayout);
        panIdNutricionistaLayout.setHorizontalGroup(
            panIdNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIdNutricionistaLayout.createSequentialGroup()
                .addComponent(lblIdNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtIdNutricionista))
        );
        panIdNutricionistaLayout.setVerticalGroup(
            panIdNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panModoDePreparo.setBackground(new java.awt.Color(51, 51, 51));
        panModoDePreparo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        panModoDePreparo.setForeground(new java.awt.Color(204, 204, 204));

        lblModoPreparo.setBackground(new java.awt.Color(51, 51, 51));
        lblModoPreparo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblModoPreparo.setForeground(new java.awt.Color(204, 204, 204));
        lblModoPreparo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModoPreparo.setText("Modo de Preparo");

        edtModoDePreparo.setBackground(new java.awt.Color(51, 51, 51));
        edtModoDePreparo.setColumns(20);
        edtModoDePreparo.setForeground(new java.awt.Color(204, 204, 204));
        edtModoDePreparo.setRows(5);
        edtModoDePreparo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        edtModoDePreparo.setCaretColor(new java.awt.Color(51, 51, 51));
        edtModoDePreparo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(edtModoDePreparo);

        javax.swing.GroupLayout panModoDePreparoLayout = new javax.swing.GroupLayout(panModoDePreparo);
        panModoDePreparo.setLayout(panModoDePreparoLayout);
        panModoDePreparoLayout.setHorizontalGroup(
            panModoDePreparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModoDePreparoLayout.createSequentialGroup()
                .addComponent(lblModoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );
        panModoDePreparoLayout.setVerticalGroup(
            panModoDePreparoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModoPreparo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panIngredientes.setBackground(new java.awt.Color(51, 51, 51));

        grdIngredientes.setBackground(new java.awt.Color(51, 51, 51));
        grdIngredientes.setForeground(new java.awt.Color(204, 204, 204));
        grdIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Und. Medida", "Quantidade"
            }
        ));
        grdIngredientes.setGridColor(new java.awt.Color(51, 51, 51));
        grdIngredientes.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdIngredientes.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane3.setViewportView(grdIngredientes);

        lblTituloIngrediente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloIngrediente.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloIngrediente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloIngrediente.setText("Ingredientes");

        btnCriarIngrediente.setBackground(new java.awt.Color(51, 51, 51));
        btnCriarIngrediente.setForeground(new java.awt.Color(0, 255, 51));
        btnCriarIngrediente.setText("Criar");
        btnCriarIngrediente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCriarIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarIngrediente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCriarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarIngredienteActionPerformed(evt);
            }
        });

        btnEditarIngrediente.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarIngrediente.setForeground(new java.awt.Color(255, 255, 0));
        btnEditarIngrediente.setText("Editar");
        btnEditarIngrediente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnEditarIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarIngrediente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnEditarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIngredienteActionPerformed(evt);
            }
        });

        btnExcluirIngrediente.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirIngrediente.setForeground(new java.awt.Color(255, 102, 102));
        btnExcluirIngrediente.setText("Excluir");
        btnExcluirIngrediente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnExcluirIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirIngrediente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnExcluirIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panIngredientesLayout = new javax.swing.GroupLayout(panIngredientes);
        panIngredientes.setLayout(panIngredientesLayout);
        panIngredientesLayout.setHorizontalGroup(
            panIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(panIngredientesLayout.createSequentialGroup()
                        .addComponent(btnCriarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnEditarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnExcluirIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panIngredientesLayout.setVerticalGroup(
            panIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panModoDePreparo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panTempoPreparo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panPorcoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(panCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(panIngredientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTempoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panIdNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panModoDePreparo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panTable.setBackground(new java.awt.Color(40, 40, 40));

        grdReceitas.setBackground(new java.awt.Color(51, 51, 51));
        grdReceitas.setForeground(new java.awt.Color(204, 204, 204));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        grdReceitas.setGridColor(new java.awt.Color(51, 51, 51));
        grdReceitas.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdReceitas.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane1.setViewportView(grdReceitas);

        lblTituloTabela.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloTabela.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloTabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTabela.setText("Receitas Cadastradas");

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(lblTituloTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panInputs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        idReceitaEditando = -1;
        
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Receita receita = (Receita) this.getObjetoSelecionadoNaGridReceita();
        
        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.idReceitaEditando = receita.getId();

            this.habilitarCampos(true);
            this.limparCampos();

            this.preencherFormulario(receita);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Receita receita = (Receita) this.getObjetoSelecionadoNaGridReceita();

        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                receitaController.excluir(receita);

                receitaController.atualizarTabela(grdReceitas);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ClienteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        this.idReceitaEditando = -1;
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        idReceitaEditando = -1;
        
        this.habilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Nutricionista nutricionista = new Nutricionista("teste", "teste@teste", "senhateste", "cpfTeste", "teste", "teste", "teste");
        
        try {
            if (idReceitaEditando > 0) {
                receitaController.atualizar(idReceitaEditando, edtNome.getText(), edtModoDePreparo.getText(), fEdtTempoPreparo.getText(), Integer.parseInt(fEdtPorcoes.getText()), edtCategoria.getText(), ingredientes, nutricionista);
            } else {
                receitaController.cadastrar(edtNome.getText(), edtModoDePreparo.getText(), fEdtTempoPreparo.getText(), Integer.parseInt(fEdtPorcoes.getText()), edtCategoria.getText(), ingredientes, nutricionista);
            }
            idReceitaEditando = -1;
            receitaController.atualizarTabela(grdReceitas);
            this.habilitarCampos(false);
            this.limparCampos();
        } catch (ClienteException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCriarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarIngredienteActionPerformed
        Ingrediente ingrediente = new Ingrediente();

        DlgCRUDIngrediente dlgCRUDIngrediente = new DlgCRUDIngrediente(this, true, ingrediente, false);
        dlgCRUDIngrediente.setLocationRelativeTo(this);
        dlgCRUDIngrediente.setVisible(true);
        
        if (ingrediente.getId() == -1){
            JOptionPane.showMessageDialog(this, "Criação cancelada");
        }else{
            ingredientes.add(ingrediente);
            ingredienteController.atualizarTabela(grdIngredientes, ingredientes);
        }   
    }//GEN-LAST:event_btnCriarIngredienteActionPerformed

    private void btnEditarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIngredienteActionPerformed
       Ingrediente ingredienteEditando = (Ingrediente) this.getObjetoSelecionadoNaGridIngrediente();

       Ingrediente ingredienteRetonar = new Ingrediente();
       ingredienteRetonar.copy(ingredienteEditando);
       
       System.out.println("\n\n\n"
               + "Nome edt: " + ingredienteEditando.getNome()
               + "Nome ret: " + ingredienteRetonar.getNome()
               + "\n\n\n");
       
        if (ingredienteEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        }else {
            
            DlgCRUDIngrediente dlgCRUDIngrediente = new DlgCRUDIngrediente(this, true, ingredienteRetonar, true);
            dlgCRUDIngrediente.setLocationRelativeTo(this);
            dlgCRUDIngrediente.setVisible(true);

            if (ingredienteRetonar.getId() == -1){
                JOptionPane.showMessageDialog(this, "Edição cancelada");
            }else{
                ingredienteEditando.setNome(ingredienteRetonar.getNome());
                ingredienteEditando.setUnidadeMedida(ingredienteRetonar.getUnidadeMedida());
                ingredienteEditando.setQuantidade(ingredienteRetonar.getQuantidade());
                
                ingredienteController.atualizarTabela(grdIngredientes, ingredientes);
            }
        }
    }//GEN-LAST:event_btnEditarIngredienteActionPerformed

    private void btnExcluirIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirIngredienteActionPerformed
     
        Ingrediente ingrediente = (Ingrediente) this.getObjetoSelecionadoNaGridIngrediente();

        if (ingrediente == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {   
                Ingrediente i = ingredienteController.buscar(ingrediente);
                if(i != null){
                    ingredienteController.excluir(ingrediente);
                }
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ClienteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            ingredientes.remove(ingrediente);                ingredientes.remove(ingrediente);

            ingredienteController.atualizarTabela(grdIngredientes, ingredientes);

        }  
    }//GEN-LAST:event_btnExcluirIngredienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnCriarIngrediente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarIngrediente;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirIngrediente;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCategoria;
    private javax.swing.JTextArea edtModoDePreparo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtIdNutricionista;
    private javax.swing.JFormattedTextField fEdtPorcoes;
    private javax.swing.JFormattedTextField fEdtTempoPreparo;
    private javax.swing.JTable grdIngredientes;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblIdNutricionista;
    private javax.swing.JLabel lblModoPreparo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPorcoes;
    private javax.swing.JLabel lblTempoPreparo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloIngrediente;
    private javax.swing.JLabel lblTituloTabela;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panCategoria;
    private javax.swing.JPanel panIdNutricionista;
    private javax.swing.JPanel panIngredientes;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panModoDePreparo;
    private javax.swing.JPanel panNome;
    private javax.swing.JPanel panPorcoes;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panTable;
    private javax.swing.JPanel panTempoPreparo;
    // End of variables declaration//GEN-END:variables
}
