package com.artgui.nutrisis.view.Nutricionista;

import com.artgui.nutrisis.controller.IngredienteController;
import com.artgui.nutrisis.model.exceptions.IngredienteException;
import com.artgui.nutrisis.model.Ingrediente;
import javax.swing.JOptionPane;

public class DlgIngredienteNutricionista extends javax.swing.JDialog {

    private Ingrediente ingrediente;
    private IngredienteController ingredienteController;

    public DlgIngredienteNutricionista(java.awt.Dialog parent, boolean modal, Ingrediente ingrediente, boolean isEditando) {
        super(parent, modal);

        this.ingrediente = ingrediente;
        this.ingredienteController = new IngredienteController();

        initComponents();

        if (isEditando) {
            this.preencherFormulario(ingrediente);
        }

    }

    private void preencherFormulario(Ingrediente ingrediente) {
        edtNome.setText(ingrediente.getNome() + "");
        edtUnidadeMedida.setText(ingrediente.getUnidadeMedida() + "");
        edtQuantidade.setText(ingrediente.getQuantidade() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        edtUnidadeMedida = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        edtQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(51, 51, 51));

        edtNome.setBackground(new java.awt.Color(204, 204, 204));
        edtNome.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        edtUnidadeMedida.setBackground(new java.awt.Color(204, 204, 204));
        edtUnidadeMedida.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtUnidadeMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtUnidadeMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidade de Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoIngrediente.png"))); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        edtQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        edtQuantidade.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNome)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(edtUnidadeMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtQuantidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            ingrediente.copy(
                    ingredienteController.criar(
                    edtNome.getText(),
                    edtUnidadeMedida.getText(),
                    edtQuantidade.getText()
                    )
            );
            dispose();
        } catch (IngredienteException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ingrediente.setId(-1);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtUnidadeMedida;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panMain;
    // End of variables declaration//GEN-END:variables
}
