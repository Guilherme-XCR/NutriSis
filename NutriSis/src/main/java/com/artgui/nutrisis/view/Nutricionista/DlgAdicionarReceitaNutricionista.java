package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.model.Receita;
import javax.swing.JOptionPane;

public class DlgAdicionarReceitaNutricionista extends javax.swing.JDialog {

    private Receita receita;
    private ReceitaController receitaController;
    
    public DlgAdicionarReceitaNutricionista(java.awt.Dialog parent, boolean modal, Receita receita, boolean isEditando) {
        super(parent, modal);
        
        this.receita = receita;
        this.receitaController = new ReceitaController();
        
        initComponents();
        
        this.receitaController.atualizarTabela(grdReceitas);
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

        panMain = new javax.swing.JPanel();
        lblTituloReceitas = new javax.swing.JLabel();
        panPesquisa = new javax.swing.JPanel();
        lblTituloPesquisa = new javax.swing.JLabel();
        edtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panMain.setBackground(new java.awt.Color(51, 51, 51));

        lblTituloReceitas.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTituloReceitas.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloReceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloReceitas.setText("Receitas");

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

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        grdReceitas.setBackground(new java.awt.Color(51, 51, 51));
        grdReceitas.setForeground(new java.awt.Color(255, 255, 255));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(grdReceitas);

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
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

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(lblTituloReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void edtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPesquisaKeyReleased
        String nomeDigitado = edtPesquisa.getText();
        if(!nomeDigitado.isEmpty())
        this.receitaController.atualizarTabela(grdReceitas, nomeDigitado);
        else
        this.receitaController.atualizarTabela(grdReceitas);
    }//GEN-LAST:event_edtPesquisaKeyReleased

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        Receita r = (Receita) this.getObjetoSelecionadoNaGridReceita();
        
        if (r == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.receita.copy(r);
            this.dispose();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.receita.setId(-1);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTituloReceitas;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panPesquisa;
    // End of variables declaration//GEN-END:variables
}
