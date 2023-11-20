package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.IngredienteController;
import com.artgui.nutrisis.model.Receita;

public class DlgVizualizarReceita extends javax.swing.JDialog {

    private IngredienteController ingredienteController;
    
    public DlgVizualizarReceita(java.awt.Dialog parent, boolean modal, Receita receita) {
        super(parent, modal);
        
        this.ingredienteController = new IngredienteController();
        
        initComponents();
    
        this.preencherFormulario(receita);
    }
    
    private void preencherFormulario(Receita receita){
        this.edtNome.setText(receita.getNome());
        this.edtTempoPreparo.setText(receita.getTempoPreparo() + "");
        this.edtPorcoes.setText(receita.getPorcoes() + "");
        this.edtCategoria.setText(receita.getCategoria());
        this.edtModoPreparo.setText(receita.getModoPreparo());
                
        this.ingredienteController.atualizarTabela(grdIngredientes, receita.getIngredientes());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        grdIngredientes = new javax.swing.JTable();
        panSobreRefeicao = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        edtPorcoes = new javax.swing.JTextField();
        edtCategoria = new javax.swing.JTextField();
        edtTempoPreparo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtModoPreparo = new javax.swing.JTextPane();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panMain.setBackground(new java.awt.Color(51, 51, 51));
        panMain.setForeground(new java.awt.Color(0, 0, 0));

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

        jScrollPane.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingredientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane.setEnabled(false);

        grdIngredientes.setBackground(new java.awt.Color(71, 71, 71));
        grdIngredientes.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdIngredientes.setForeground(new java.awt.Color(204, 255, 255));
        grdIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grdIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdIngredientes.setEnabled(false);
        grdIngredientes.setGridColor(new java.awt.Color(0, 0, 0));
        grdIngredientes.setShowGrid(true);
        jScrollPane.setViewportView(grdIngredientes);

        panSobreRefeicao.setBackground(new java.awt.Color(51, 51, 51));
        panSobreRefeicao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        panSobreRefeicao.setEnabled(false);

        edtNome.setBackground(new java.awt.Color(71, 71, 71));
        edtNome.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNome.setForeground(new java.awt.Color(0, 0, 0));
        edtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNome.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtNome.setDoubleBuffered(true);
        edtNome.setEnabled(false);
        edtNome.setOpaque(true);

        edtPorcoes.setBackground(new java.awt.Color(71, 71, 71));
        edtPorcoes.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtPorcoes.setForeground(new java.awt.Color(0, 0, 0));
        edtPorcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtPorcoes.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtPorcoes.setDoubleBuffered(true);
        edtPorcoes.setEnabled(false);
        edtPorcoes.setOpaque(true);

        edtCategoria.setBackground(new java.awt.Color(71, 71, 71));
        edtCategoria.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtCategoria.setForeground(new java.awt.Color(0, 0, 0));
        edtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtCategoria.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtCategoria.setDoubleBuffered(true);
        edtCategoria.setEnabled(false);
        edtCategoria.setOpaque(true);

        edtTempoPreparo.setBackground(new java.awt.Color(71, 71, 71));
        edtTempoPreparo.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtTempoPreparo.setForeground(new java.awt.Color(0, 0, 0));
        edtTempoPreparo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtTempoPreparo.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtTempoPreparo.setDoubleBuffered(true);
        edtTempoPreparo.setEnabled(false);
        edtTempoPreparo.setOpaque(true);

        edtModoPreparo.setBackground(new java.awt.Color(71, 71, 71));
        edtModoPreparo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo de Preparo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtModoPreparo.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtModoPreparo.setForeground(new java.awt.Color(0, 0, 0));
        edtModoPreparo.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtModoPreparo.setEnabled(false);
        jScrollPane3.setViewportView(edtModoPreparo);

        javax.swing.GroupLayout panSobreRefeicaoLayout = new javax.swing.GroupLayout(panSobreRefeicao);
        panSobreRefeicao.setLayout(panSobreRefeicaoLayout);
        panSobreRefeicaoLayout.setHorizontalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                        .addComponent(edtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTempoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panSobreRefeicaoLayout.setVerticalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTempoPreparo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addComponent(panSobreRefeicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panSobreRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cascadia Mono", 0, 98)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Receita");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCategoria;
    private javax.swing.JTextPane edtModoPreparo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPorcoes;
    private javax.swing.JTextField edtTempoPreparo;
    private javax.swing.JTable grdIngredientes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panSobreRefeicao;
    // End of variables declaration//GEN-END:variables
}
