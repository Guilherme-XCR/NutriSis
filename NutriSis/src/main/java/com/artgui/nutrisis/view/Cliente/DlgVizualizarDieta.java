package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.RefeicaoController;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Refeicao;
import javax.swing.JOptionPane;

public class DlgVizualizarDieta extends javax.swing.JDialog {

    private RefeicaoController refeicaoController;
    
    public DlgVizualizarDieta(java.awt.Dialog parent, boolean modal, Dieta dieta) {
        super(parent, modal);
        
        this.refeicaoController = new RefeicaoController();
        
        initComponents();
    
        this.preencherFormulario(dieta);
    }
    
    private void preencherFormulario(Dieta dieta){
        this.edtNome.setText(dieta.getNome());
        this.edtDiasDuracao.setText(dieta.getDiasDuracao() + "");
        this.edtDescricao.setText(dieta.getDescricao());
                
        this.refeicaoController.atualizarTabelaVizualizar(grdRefeicoes, dieta.getRefeicoes());
    }
    
    private Object getObjetoSelecionadoNaGridRefeicao() {
        int rowCliked = this.grdRefeicoes.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = this.grdRefeicoes.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        grdRefeicoes = new javax.swing.JTable();
        panSobreRefeicao = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        edtDiasDuracao = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtDescricao = new javax.swing.JTextPane();
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
        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Refeicoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane.setEnabled(false);

        grdRefeicoes.setBackground(new java.awt.Color(71, 71, 71));
        grdRefeicoes.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdRefeicoes.setForeground(new java.awt.Color(204, 255, 255));
        grdRefeicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grdRefeicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdRefeicoes.setGridColor(new java.awt.Color(0, 0, 0));
        grdRefeicoes.setShowGrid(true);
        grdRefeicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdRefeicoesMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(grdRefeicoes);

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

        edtDiasDuracao.setBackground(new java.awt.Color(71, 71, 71));
        edtDiasDuracao.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDiasDuracao.setForeground(new java.awt.Color(0, 0, 0));
        edtDiasDuracao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dias de Duração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDiasDuracao.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtDiasDuracao.setDoubleBuffered(true);
        edtDiasDuracao.setEnabled(false);
        edtDiasDuracao.setOpaque(true);

        edtDescricao.setBackground(new java.awt.Color(71, 71, 71));
        edtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtDescricao.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        edtDescricao.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtDescricao.setEnabled(false);
        jScrollPane3.setViewportView(edtDescricao);

        javax.swing.GroupLayout panSobreRefeicaoLayout = new javax.swing.GroupLayout(panSobreRefeicao);
        panSobreRefeicao.setLayout(panSobreRefeicaoLayout);
        panSobreRefeicaoLayout.setHorizontalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                        .addComponent(edtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDiasDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panSobreRefeicaoLayout.setVerticalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDiasDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        lblTitle.setText("Dieta");

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

    private void grdRefeicoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdRefeicoesMouseClicked
        if (evt.getClickCount() == 2) {
            int aux = grdRefeicoes.getSelectedColumn();
            if (aux == 1) {
                this.VizualizarRefeicao();
            }
        }
    }//GEN-LAST:event_grdRefeicoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextPane edtDescricao;
    private javax.swing.JTextField edtDiasDuracao;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdRefeicoes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panSobreRefeicao;
    // End of variables declaration//GEN-END:variables
}
