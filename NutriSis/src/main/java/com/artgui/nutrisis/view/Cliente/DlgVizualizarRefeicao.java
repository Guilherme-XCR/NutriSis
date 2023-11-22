package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.ReceitaController;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import javax.swing.JOptionPane;

public class DlgVizualizarRefeicao extends javax.swing.JDialog {

    private ReceitaController receitaController;
    
    public DlgVizualizarRefeicao(java.awt.Dialog parent, boolean modal, Refeicao refeicao) {
        super(parent, modal);
        
        this.receitaController = new ReceitaController();
        
        initComponents();
        
        this.preencherFormulario(refeicao);
    }

    private void preencherFormulario(Refeicao refeicao){
        this.edtNome.setText(refeicao.getNome());
        this.edtHorario.setText(refeicao.getHorario());
        this.edtCalorias.setText(refeicao.getCalorias()+ "");
        
        this.receitaController.atualizarTabelaVizualizar(grdReceitas, refeicao.getReceitas());
    }
    
    private Object getObjetoSelecionadoNaGridReceita() {
        int rowCliked = grdReceitas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdReceitas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        grdReceitas = new javax.swing.JTable();
        panSobreRefeicao = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        edtHorario = new javax.swing.JTextField();
        edtCalorias = new javax.swing.JTextField();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

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
        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receitas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jScrollPane.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane.setEnabled(false);

        grdReceitas.setBackground(new java.awt.Color(71, 71, 71));
        grdReceitas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        grdReceitas.setForeground(new java.awt.Color(204, 255, 255));
        grdReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grdReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grdReceitas.setGridColor(new java.awt.Color(0, 0, 0));
        grdReceitas.setShowGrid(true);
        grdReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdReceitasMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(grdReceitas);

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

        edtHorario.setBackground(new java.awt.Color(71, 71, 71));
        edtHorario.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtHorario.setForeground(new java.awt.Color(0, 0, 0));
        edtHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtHorario.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtHorario.setDoubleBuffered(true);
        edtHorario.setEnabled(false);
        edtHorario.setOpaque(true);

        edtCalorias.setBackground(new java.awt.Color(71, 71, 71));
        edtCalorias.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtCalorias.setForeground(new java.awt.Color(0, 0, 0));
        edtCalorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtCalorias.setDisabledTextColor(new java.awt.Color(204, 255, 255));
        edtCalorias.setDoubleBuffered(true);
        edtCalorias.setEnabled(false);
        edtCalorias.setOpaque(true);

        javax.swing.GroupLayout panSobreRefeicaoLayout = new javax.swing.GroupLayout(panSobreRefeicao);
        panSobreRefeicao.setLayout(panSobreRefeicaoLayout);
        panSobreRefeicaoLayout.setHorizontalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtNome)
                .addGap(0, 0, 0)
                .addComponent(edtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panSobreRefeicaoLayout.setVerticalGroup(
            panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSobreRefeicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSobreRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cascadia Mono", 0, 98)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Refeição");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void grdReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdReceitasMouseClicked
        if (evt.getClickCount() == 2) {
            int aux = grdReceitas.getSelectedColumn();
            if (aux == 1) {
                this.VizualizarReceita();
            }
        }
    }//GEN-LAST:event_grdReceitasMouseClicked

    private void VizualizarReceita() {
        Receita receita = (Receita) this.getObjetoSelecionadoNaGridReceita();

        if (receita == null) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        } else {
            DlgVizualizarReceita dlgVizualizarReceita = new DlgVizualizarReceita(this, true, receita);
            this.setVisible(false);
            dlgVizualizarReceita.setLocationRelativeTo(this);
            dlgVizualizarReceita.setVisible(true);
            this.setVisible(true);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCalorias;
    private javax.swing.JTextField edtHorario;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdReceitas;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panSobreRefeicao;
    // End of variables declaration//GEN-END:variables
}
