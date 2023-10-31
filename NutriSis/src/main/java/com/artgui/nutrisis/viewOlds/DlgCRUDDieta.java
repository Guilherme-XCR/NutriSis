package com.artgui.nutrisis.viewOlds;

import com.artgui.nutrisis.controller.DietaController;
import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.controller.RefeicaoController;
import com.artgui.nutrisis.exceptions.DietaException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Refeicao;
import com.artgui.nutrisis.view.DlgCRUDRefeicao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DlgCRUDDieta extends javax.swing.JDialog {

    DietaController dietaController;
    RefeicaoController refeicaoController;
    ReceitaController receitaController;
    
    int idDietaEditando;
    
    List<Refeicao> refeicoes;
    
    public DlgCRUDDieta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        idDietaEditando = -1;
        dietaController = new DietaController();
        refeicaoController = new RefeicaoController();
        receitaController = new ReceitaController();
        
        refeicoes = new ArrayList<>();
        
        initComponents();
        
        this.habilitarCampos(false);
        this.limparCampos();
             
        dietaController.atualizarTabela(grdDietas);
        refeicaoController.atualizarTabela(grdRefeicoes, new ArrayList<>());
    }

    public void habilitarCampos(boolean flag) {
        
        for (int i = 0; i < panInputs.getComponents().length; i++) {
            panInputs.getComponent(i).setEnabled(flag);
        }
    }

    public void limparCampos() {
    
        edtNome.setText("");
        edtDescricao.setText("");
        fEdtDiasDuracao.setText("");
        fEdtIdNutricionista.setText("");
        
        refeicaoController.atualizarTabela(grdRefeicoes, new ArrayList<>());
        
    }

    public void adicionarMascaraNosCampos() {
      
//        try {
//            MaskFormatter diasDuracaoFormatter = new MaskFormatter("###");
//            MaskFormatter idNutricionistaFormatter = new MaskFormatter("#########");
//            
//            diasDuracaoFormatter.install(fEdtDiasDuracao);
//            idNutricionistaFormatter.install(fEdtIdNutricionista);
//                    
//        } catch (ParseException ex) {
//            Logger.getLogger(DlgCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public void preencherFormulario(Dieta d) {
    
        edtNome.setText(d.getNome());
        edtDescricao.setText(d.getDescricao());
        fEdtDiasDuracao.setText(d.getDiasDuracao() + "");
        fEdtIdNutricionista.setText(d.getNutricionista().getId() + "");
        
        List<Refeicao> refeicoes = d.getRefeicoes();
        refeicaoController.atualizarTabela(grdRefeicoes, refeicoes);
        
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
    

    private void grdDietasMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if (evt.getClickCount() == 2) {
            btnEditarActionPerformed(null);
        }
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
        panDescricao = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        panDiasDuracao = new javax.swing.JPanel();
        lblDiasDuracao = new javax.swing.JLabel();
        fEdtDiasDuracao = new javax.swing.JFormattedTextField();
        panIdNutricionista = new javax.swing.JPanel();
        lblIdNutricionista = new javax.swing.JLabel();
        fEdtIdNutricionista = new javax.swing.JFormattedTextField();
        panRefeicao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdRefeicoes = new javax.swing.JTable();
        lblTituloRefeicao = new javax.swing.JLabel();
        btnCriarRefeicao = new javax.swing.JButton();
        btnEditarRefeicao = new javax.swing.JButton();
        btnExcluirRefeicao = new javax.swing.JButton();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdDietas = new javax.swing.JTable();
        lblTituloTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CRUD Dieta");

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

        lblNome.setBackground(new java.awt.Color(51, 51, 51));
        lblNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 204, 204));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        edtNome.setBackground(new java.awt.Color(60, 60, 60));
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

        panDescricao.setBackground(new java.awt.Color(51, 51, 51));

        lblDescricao.setBackground(new java.awt.Color(51, 51, 51));
        lblDescricao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(204, 204, 204));
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descrição");

        edtDescricao.setBackground(new java.awt.Color(60, 60, 60));
        edtDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        edtDescricao.setForeground(new java.awt.Color(204, 204, 204));
        edtDescricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panDescricaoLayout = new javax.swing.GroupLayout(panDescricao);
        panDescricao.setLayout(panDescricaoLayout);
        panDescricaoLayout.setHorizontalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescricaoLayout.createSequentialGroup()
                .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDescricao))
        );
        panDescricaoLayout.setVerticalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panDiasDuracao.setBackground(new java.awt.Color(51, 51, 51));
        panDiasDuracao.setPreferredSize(new java.awt.Dimension(364, 50));

        lblDiasDuracao.setBackground(new java.awt.Color(51, 51, 51));
        lblDiasDuracao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDiasDuracao.setForeground(new java.awt.Color(204, 204, 204));
        lblDiasDuracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiasDuracao.setText("Dias Duração");

        fEdtDiasDuracao.setBackground(new java.awt.Color(60, 60, 60));
        fEdtDiasDuracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        fEdtDiasDuracao.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panDiasDuracaoLayout = new javax.swing.GroupLayout(panDiasDuracao);
        panDiasDuracao.setLayout(panDiasDuracaoLayout);
        panDiasDuracaoLayout.setHorizontalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDiasDuracaoLayout.createSequentialGroup()
                .addComponent(lblDiasDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtDiasDuracao))
        );
        panDiasDuracaoLayout.setVerticalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiasDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtDiasDuracao)
        );

        panIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        panIdNutricionista.setPreferredSize(new java.awt.Dimension(364, 50));

        lblIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        lblIdNutricionista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));
        lblIdNutricionista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdNutricionista.setText("ID Nutricionista");

        fEdtIdNutricionista.setBackground(new java.awt.Color(60, 60, 60));
        fEdtIdNutricionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        fEdtIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));

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
            .addComponent(lblIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtIdNutricionista)
        );

        panRefeicao.setBackground(new java.awt.Color(51, 51, 51));

        grdRefeicoes.setBackground(new java.awt.Color(51, 51, 51));
        grdRefeicoes.setForeground(new java.awt.Color(204, 204, 204));
        grdRefeicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        grdRefeicoes.setGridColor(new java.awt.Color(51, 51, 51));
        grdRefeicoes.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdRefeicoes.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane3.setViewportView(grdRefeicoes);

        lblTituloRefeicao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloRefeicao.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloRefeicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRefeicao.setText("Refeições");

        btnCriarRefeicao.setBackground(new java.awt.Color(51, 51, 51));
        btnCriarRefeicao.setForeground(new java.awt.Color(0, 255, 51));
        btnCriarRefeicao.setText("Criar");
        btnCriarRefeicao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCriarRefeicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarRefeicao.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCriarRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarRefeicaoActionPerformed(evt);
            }
        });

        btnEditarRefeicao.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarRefeicao.setForeground(new java.awt.Color(255, 255, 0));
        btnEditarRefeicao.setText("Editar");
        btnEditarRefeicao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnEditarRefeicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarRefeicao.setPreferredSize(new java.awt.Dimension(100, 50));
        btnEditarRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRefeicaoActionPerformed(evt);
            }
        });

        btnExcluirRefeicao.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirRefeicao.setForeground(new java.awt.Color(255, 102, 102));
        btnExcluirRefeicao.setText("Excluir");
        btnExcluirRefeicao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnExcluirRefeicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirRefeicao.setPreferredSize(new java.awt.Dimension(100, 50));
        btnExcluirRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRefeicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRefeicaoLayout = new javax.swing.GroupLayout(panRefeicao);
        panRefeicao.setLayout(panRefeicaoLayout);
        panRefeicaoLayout.setHorizontalGroup(
            panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(panRefeicaoLayout.createSequentialGroup()
                        .addComponent(btnCriarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnEditarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnExcluirRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panRefeicaoLayout.setVerticalGroup(
            panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDiasDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(panIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(panRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDiasDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panIdNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panTable.setBackground(new java.awt.Color(40, 40, 40));

        grdDietas.setBackground(new java.awt.Color(51, 51, 51));
        grdDietas.setForeground(new java.awt.Color(204, 204, 204));
        grdDietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        grdDietas.setGridColor(new java.awt.Color(51, 51, 51));
        grdDietas.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdDietas.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane1.setViewportView(grdDietas);

        lblTituloTabela.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloTabela.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloTabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTabela.setText("Dietas Cadastradas");

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
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        idDietaEditando = -1;
        
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Dieta dieta = (Dieta) this.getObjetoSelecionadoNaGridDieta();
        
        if (dieta == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.idDietaEditando = dieta.getId();

            this.habilitarCampos(true);
            this.limparCampos();

            this.preencherFormulario(dieta);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Dieta dieta = (Dieta) this.getObjetoSelecionadoNaGridDieta();
        
        if (dieta == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                dietaController.excluir(dieta);
                dietaController.atualizarTabela(grdDietas);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (DietaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        this.idDietaEditando = -1;
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        idDietaEditando = -1;
        
        this.habilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        Nutricionista nutricionista = new Nutricionista("teste", "teste@teste", "senhateste", "cpfTeste", "teste", "teste", "teste");
//        
//        try {
//            if (idDietaEditando > 0) {
//                dietaController.atualizar(idDietaEditando, edtNome.getText(), edtDescricao.getText(),Integer.parseInt(fEdtDiasDuracao.getText()), refeicoes, nutricionista);
//            } else {
//                for(Refeicao ref: refeicoes){
//                    for(Receita rec: ref.getReceitas()){
//                        receitaController.atualizar(
//                                rec.getId(),
//                                rec.getNome(),
//                                rec.getModoPreparo(),
//                                rec.getTempoPreparo(),
//                                rec.getPorcoes(), 
//                                rec.getCategoria(),
//                                rec.getIngredientes(),
//                                rec.getNutricionista()
//                        );
//                    }
//                }
//                dietaController.cadastrar(edtNome.getText(), edtDescricao.getText(),Integer.parseInt(fEdtDiasDuracao.getText()), refeicoes, nutricionista);
//                
//            }
//            idDietaEditando = -1;
//            dietaController.atualizarTabela(grdDietas);
//            this.habilitarCampos(false);
//            this.limparCampos();
//        } catch (DietaException e) {
//            System.err.println(e.getMessage());
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        } 
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void btnCriarRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarRefeicaoActionPerformed
        Refeicao refeicao = new Refeicao();
        
        DlgCRUDRefeicao dlgCRUDRefeicao = new DlgCRUDRefeicao(this, true, refeicao, false);
        dlgCRUDRefeicao.setLocationRelativeTo(this);
        dlgCRUDRefeicao.setVisible(true);
        
        if(refeicao != null){
        refeicoes.add(refeicao);
        refeicaoController.atualizarTabela(grdRefeicoes, refeicoes);
        }else{
            JOptionPane.showMessageDialog(this, "Criação cancelada!");
        }
    }//GEN-LAST:event_btnCriarRefeicaoActionPerformed

    private void btnEditarRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRefeicaoActionPerformed
       Refeicao refeicaoEditando = (Refeicao) this.getObjetoSelecionadoNaGridRefeicao();

       
     
        if (refeicaoEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        }else {
            
            
            Refeicao refeicaoRetonar = new Refeicao();
            refeicaoRetonar.copy(refeicaoEditando);
       
            DlgCRUDRefeicao dlgCRUDRefeicao = new DlgCRUDRefeicao(this, true, refeicaoRetonar, true);
            dlgCRUDRefeicao.setLocationRelativeTo(this);
            dlgCRUDRefeicao.setVisible(true);

            if (refeicaoRetonar.getId() == -1){
                JOptionPane.showMessageDialog(this, "Edição cancelada");
            }else{
                refeicaoEditando.setNome(refeicaoRetonar.getNome());
                refeicaoEditando.setHorario(refeicaoRetonar.getHorario());
                refeicaoEditando.setCalorias(refeicaoRetonar.getCalorias());
                refeicaoEditando.setReceitas(refeicaoRetonar.getReceitas());
                refeicaoEditando.setDieta(refeicaoRetonar.getDieta());
                refeicaoEditando.setNutricionista(refeicaoRetonar.getNutricionista());
                
                refeicaoController.atualizarTabela(grdRefeicoes, refeicoes);
            }
        }
    }//GEN-LAST:event_btnEditarRefeicaoActionPerformed

    private void btnExcluirRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRefeicaoActionPerformed
//        Refeicao refeicao = (Refeicao) this.getObjetoSelecionadoNaGridRefeicao();
//
//        if (refeicao == null)
//            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
//        else {
//            try {   
//                Refeicao r = refeicaoController.buscar(refeicao);
//                if(r != null){
//                    refeicaoController.excluir(refeicao);
//                }
//                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
//            } catch (RefeicaoException ex) {
//                JOptionPane.showMessageDialog(this, ex.getMessage());
//            }
//            refeicoes.remove(refeicao);                refeicoes.remove(refeicao);
//
//            refeicaoController.atualizarTabela(grdRefeicoes, refeicoes);
//
//        }  
    }//GEN-LAST:event_btnExcluirRefeicaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnCriarRefeicao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarRefeicao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirRefeicao;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtDiasDuracao;
    private javax.swing.JFormattedTextField fEdtIdNutricionista;
    private javax.swing.JTable grdDietas;
    private javax.swing.JTable grdRefeicoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDiasDuracao;
    private javax.swing.JLabel lblIdNutricionista;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloRefeicao;
    private javax.swing.JLabel lblTituloTabela;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panDescricao;
    private javax.swing.JPanel panDiasDuracao;
    private javax.swing.JPanel panIdNutricionista;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panNome;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panRefeicao;
    private javax.swing.JPanel panTable;
    // End of variables declaration//GEN-END:variables
}
