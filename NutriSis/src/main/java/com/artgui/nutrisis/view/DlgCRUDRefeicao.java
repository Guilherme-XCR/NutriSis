package com.artgui.nutrisis.view;

import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.controller.RefeicaoController;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgCRUDRefeicao extends javax.swing.JDialog {

    private ReceitaController receitaController;
    
    private int idRefeicaoEditando;
    
    private List<Receita> receitas;
    private Refeicao refeicaoRetornar;
     
    public DlgCRUDRefeicao(java.awt.Dialog parent, boolean modal, Refeicao refeicaoRetornar, boolean isEditando) {
        super(parent, modal);
        
        receitaController = new ReceitaController();
        receitas = new ArrayList<>();
                
        this.refeicaoRetornar = refeicaoRetornar;
        
        if(isEditando){
            this.idRefeicaoEditando = refeicaoRetornar.getId();
            this.preencherFormulario(refeicaoRetornar);
        }else{
            this.idRefeicaoEditando = -1;
            
        }
        
        initComponents();
        
        adicionarMascaraNosCampos();
    }
    
    // Não preciso habilitar ou desabilitar
    // Não preciso limpar os campos
    
    public void adicionarMascaraNosCampos() {
      
        try {
            MaskFormatter horarioFormatter = new MaskFormatter("##:##");
            MaskFormatter idNutricionistaFormatter = new MaskFormatter("########");
            
            horarioFormatter.install(fEdtHorario);
            idNutricionistaFormatter.install(fEdtIdNutricionista);
            
        } catch (ParseException ex) {
            Logger.getLogger(DlgCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preencherFormulario(Refeicao r) {
    
        edtNome.setText(r.getNome());
        fEdtHorario.setText(r.getHorario());
        edtCalorias.setText(r.getCalorias() + "");
        fEdtIdNutricionista.setText(r.getNutricionista().getId() + "");
        
        receitas = r.getReceitas();
        //atualiza tabela
    }
    
    private Object getObjetoSelecionadoNaGrid() {
        int rowCliked = grdReceita.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdReceita.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panInputs = new javax.swing.JPanel();
        panNome = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        panDescricao = new javax.swing.JPanel();
        lblHorario = new javax.swing.JLabel();
        fEdtHorario = new javax.swing.JFormattedTextField();
        panDiasDuracao = new javax.swing.JPanel();
        lblCalorias = new javax.swing.JLabel();
        edtCalorias = new javax.swing.JTextField();
        panIdNutricionista = new javax.swing.JPanel();
        lblIdNutricionista = new javax.swing.JLabel();
        fEdtIdNutricionista = new javax.swing.JFormattedTextField();
        panRefeicao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdReceita = new javax.swing.JTable();
        lblTituloRefeicao = new javax.swing.JLabel();
        btnAdicionarReceita = new javax.swing.JButton();
        btnRemoverReceita = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CRUD Refeição");

        panInputs.setBackground(new java.awt.Color(40, 40, 40));

        panNome.setBackground(new java.awt.Color(51, 51, 51));

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

        panDescricao.setBackground(new java.awt.Color(51, 51, 51));

        lblHorario.setBackground(new java.awt.Color(51, 51, 51));
        lblHorario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(204, 204, 204));
        lblHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHorario.setText("Horario");

        fEdtHorario.setBackground(new java.awt.Color(51, 51, 51));
        fEdtHorario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtHorario.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panDescricaoLayout = new javax.swing.GroupLayout(panDescricao);
        panDescricao.setLayout(panDescricaoLayout);
        panDescricaoLayout.setHorizontalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescricaoLayout.createSequentialGroup()
                .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtHorario))
        );
        panDescricaoLayout.setVerticalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panDiasDuracao.setBackground(new java.awt.Color(51, 51, 51));
        panDiasDuracao.setPreferredSize(new java.awt.Dimension(364, 50));

        lblCalorias.setBackground(new java.awt.Color(51, 51, 51));
        lblCalorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCalorias.setForeground(new java.awt.Color(204, 204, 204));
        lblCalorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalorias.setText("Calorias");

        edtCalorias.setBackground(new java.awt.Color(51, 51, 51));
        edtCalorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        edtCalorias.setForeground(new java.awt.Color(204, 204, 204));
        edtCalorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panDiasDuracaoLayout = new javax.swing.GroupLayout(panDiasDuracao);
        panDiasDuracao.setLayout(panDiasDuracaoLayout);
        panDiasDuracaoLayout.setHorizontalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDiasDuracaoLayout.createSequentialGroup()
                .addComponent(lblCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCalorias))
        );
        panDiasDuracaoLayout.setVerticalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        panIdNutricionista.setPreferredSize(new java.awt.Dimension(364, 50));

        lblIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        lblIdNutricionista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdNutricionista.setForeground(new java.awt.Color(204, 204, 204));
        lblIdNutricionista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdNutricionista.setText("ID Nutricionista");

        fEdtIdNutricionista.setBackground(new java.awt.Color(51, 51, 51));
        fEdtIdNutricionista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
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
            .addComponent(lblIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panRefeicao.setBackground(new java.awt.Color(51, 51, 51));

        grdReceita.setBackground(new java.awt.Color(51, 51, 51));
        grdReceita.setForeground(new java.awt.Color(204, 204, 204));
        grdReceita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        grdReceita.setGridColor(new java.awt.Color(51, 51, 51));
        grdReceita.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdReceita.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane3.setViewportView(grdReceita);

        lblTituloRefeicao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloRefeicao.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloRefeicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRefeicao.setText("Receita");

        btnAdicionarReceita.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarReceita.setForeground(new java.awt.Color(0, 255, 51));
        btnAdicionarReceita.setText("Adiconar");
        btnAdicionarReceita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnAdicionarReceita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarReceita.setPreferredSize(new java.awt.Dimension(100, 50));
        btnAdicionarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarReceitaActionPerformed(evt);
            }
        });

        btnRemoverReceita.setBackground(new java.awt.Color(51, 51, 51));
        btnRemoverReceita.setForeground(new java.awt.Color(255, 102, 102));
        btnRemoverReceita.setText("Remover");
        btnRemoverReceita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnRemoverReceita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemoverReceita.setPreferredSize(new java.awt.Dimension(100, 50));
        btnRemoverReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRefeicaoLayout = new javax.swing.GroupLayout(panRefeicao);
        panRefeicao.setLayout(panRefeicaoLayout);
        panRefeicaoLayout.setHorizontalGroup(
            panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panRefeicaoLayout.createSequentialGroup()
                        .addComponent(lblTituloRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE))
                .addContainerGap())
        );
        panRefeicaoLayout.setVerticalGroup(
            panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(panDiasDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addComponent(panIdNutricionista, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
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

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 153, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setForeground(new java.awt.Color(0, 153, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnAdicionarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaActionPerformed
        
        String idReceita = JOptionPane.showInputDialog(this ,"Informe o id da receita a ser adicionada:", "");
        Receita receita = receitaController.buscar(Integer.parseInt(idReceita));

        if (receita == null) {
            JOptionPane.showMessageDialog(this, "Receita " + idReceita + " não existe!");
        } else {
            receitas.add(receita);
            receitaController.atualizarTabela(grdReceita, receitas);
        }
    }//GEN-LAST:event_btnAdicionarReceitaActionPerformed

    private void btnRemoverReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverReceitaActionPerformed
        
        Receita receita = (Receita) this.getObjetoSelecionadoNaGrid();
        
        if (receita == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            receitas.remove(receita);
            receitaController.atualizarTabela(grdReceita, receitas);
        }
    }//GEN-LAST:event_btnRemoverReceitaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        refeicaoRetornar.setNome(edtNome.getText());
        refeicaoRetornar.setHorario(fEdtHorario.getText());
        refeicaoRetornar.setCalorias(Float.parseFloat(edtCalorias.getText()));
        
        //pegar o nutricionista quando tiver o Login
        Nutricionista nutricionista = new Nutricionista("Teste", "Teste@teste.com", "teste", "teste", "teste", "teste", "teste");
        refeicaoRetornar.setNutricionista(nutricionista);
        
        refeicaoRetornar.setReceitas(receitas);
        
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarReceita;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemoverReceita;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCalorias;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtHorario;
    private javax.swing.JFormattedTextField fEdtIdNutricionista;
    private javax.swing.JTable grdReceita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblIdNutricionista;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloRefeicao;
    private javax.swing.JPanel panDescricao;
    private javax.swing.JPanel panDiasDuracao;
    private javax.swing.JPanel panIdNutricionista;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panNome;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panRefeicao;
    // End of variables declaration//GEN-END:variables
}
