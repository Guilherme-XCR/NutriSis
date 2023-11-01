package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.controller.RefeicaoController;
import com.artgui.nutrisis.exceptions.RefeicaoException;
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

public class DlgRefeicaoNutricionista extends javax.swing.JDialog {

    private Refeicao refeicao;
    private RefeicaoController refeicaoController;
    private List<Receita> receitas;
    private ReceitaController receitaController;


    public DlgRefeicaoNutricionista(java.awt.Dialog parent, boolean modal, Refeicao refeicao, boolean isEditando) {
        super(parent, modal);

        this.refeicao = refeicao;
        refeicaoController = new RefeicaoController();
        receitas = new ArrayList<>();
        receitaController = new ReceitaController();

        initComponents();

        if (isEditando) {
            this.preencherFormulario(this.refeicao);
        }

        this.adicionarMascaraNosCampos();
    }

    private void preencherFormulario(Refeicao refeicao) {
        edtNome.setText(refeicao.getNome());
        fEdtHorario.setText(refeicao.getHorario());
        fEdtCalorias.setText(refeicao.getCalorias() + "");
    }

    public void adicionarMascaraNosCampos() {
        try {
            MaskFormatter horarioFormatter = new MaskFormatter("##:##");
            MaskFormatter caloriasFormatter = new MaskFormatter("########");

            horarioFormatter.install(fEdtHorario);
            caloriasFormatter.install(fEdtCalorias);
        } catch (ParseException ex) {
            Logger.getLogger(DlgRefeicaoNutricionista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        lblLogoRefeicoes = new javax.swing.JLabel();
        lblTituloReceitas = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        fEdtHorario = new javax.swing.JFormattedTextField();
        fEdtCalorias = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAdicionarReceita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panMain.setBackground(new java.awt.Color(51, 51, 51));

        lblLogoRefeicoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoRefeicoes.png"))); // NOI18N

        lblTituloReceitas.setFont(new java.awt.Font("Cascadia Mono", 1, 36)); // NOI18N
        lblTituloReceitas.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloReceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloReceitas.setText("Receitas");

        edtNome.setBackground(new java.awt.Color(204, 204, 204));
        edtNome.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNome.setForeground(new java.awt.Color(0, 0, 0));
        edtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        fEdtHorario.setBackground(new java.awt.Color(204, 204, 204));
        fEdtHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtHorario.setForeground(new java.awt.Color(0, 0, 0));
        fEdtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtHorario.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N

        fEdtCalorias.setBackground(new java.awt.Color(204, 204, 204));
        fEdtCalorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtCalorias.setForeground(new java.awt.Color(0, 0, 0));
        fEdtCalorias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtCalorias.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAdicionarReceita.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionarReceita.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnAdicionarReceita.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionarReceita.setText("Add");
        btnAdicionarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarReceitaActionPerformed(evt);
            }
        });

        grdReceitas.setBackground(new java.awt.Color(51, 51, 51));
        grdReceitas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdReceitas.setForeground(new java.awt.Color(255, 255, 255));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(grdReceitas);

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panMainLayout.createSequentialGroup()
                                        .addComponent(fEdtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fEdtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(lblLogoRefeicoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(lblLogoRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fEdtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fEdtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTituloReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Nutricionista nutricionista = new Nutricionista("teste", "teste@teste", "senhateste", "cpfTeste", "teste", "teste", "teste");

        try {
            refeicao.copy(
                    refeicaoController.criar(
                            edtNome.getText(),
                            fEdtHorario.getText(),
                            fEdtCalorias.getText(),
                            receitas,
                            nutricionista
                    )
            );
            dispose();
        } catch (RefeicaoException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.refeicao.setId(-1);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaActionPerformed
        Receita receita = new Receita();
        
        DlgAdicionarReceitaNutricionista dlgAdicionarReceitaNutricionista = new DlgAdicionarReceitaNutricionista(this, true, receita, false);
        dlgAdicionarReceitaNutricionista.setLocationRelativeTo(this);
        dlgAdicionarReceitaNutricionista.setVisible(true);
        
        if (receita.getId() == -1) {
            JOptionPane.showMessageDialog(this, "Adição cancelada");
        } else {
            receitas.add(receita);
            receitaController.atualizarTabela(grdReceitas, receitas);
        }
        
    }//GEN-LAST:event_btnAdicionarReceitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarReceita;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtCalorias;
    private javax.swing.JFormattedTextField fEdtHorario;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogoRefeicoes;
    private javax.swing.JLabel lblTituloReceitas;
    private javax.swing.JPanel panMain;
    // End of variables declaration//GEN-END:variables
}
