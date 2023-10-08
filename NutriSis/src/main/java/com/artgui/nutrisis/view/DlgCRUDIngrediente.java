package com.artgui.nutrisis.view;

import com.artgui.nutrisis.model.Ingrediente;

public class DlgCRUDIngrediente extends javax.swing.JDialog {

    private Ingrediente  ingredienteRetornar;
    
    public DlgCRUDIngrediente(java.awt.Dialog parent, boolean modal, Ingrediente ingredienteRetornar, boolean isEditando) {
        super(parent, modal);
        
        this.ingredienteRetornar = ingredienteRetornar;
        
        initComponents();
        
        if(isEditando){
            this.preencherFormulario(ingredienteRetornar);
        }
    }

    public void preencherFormulario(Ingrediente i) {
    System.out.println("\n\n\n"
               + "Nome i: " + i.getNome()
               + "\n\n\n");
        
        edtNome.setText(i.getNome() + "");
        edtUnidadeMedida.setText(i.getUnidadeMedida() + "");
        fEdtQuantidade.setText(i.getQuantidade() + "");
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
        edtUnidadeMedida = new javax.swing.JTextField();
        panDiasDuracao = new javax.swing.JPanel();
        lblCalorias = new javax.swing.JLabel();
        fEdtQuantidade = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CRUD Ingrediente");

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
        lblHorario.setText("Unidade Medida");

        edtUnidadeMedida.setBackground(new java.awt.Color(51, 51, 51));
        edtUnidadeMedida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtUnidadeMedida.setForeground(new java.awt.Color(204, 204, 204));
        edtUnidadeMedida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));

        javax.swing.GroupLayout panDescricaoLayout = new javax.swing.GroupLayout(panDescricao);
        panDescricao.setLayout(panDescricaoLayout);
        panDescricaoLayout.setHorizontalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescricaoLayout.createSequentialGroup()
                .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtUnidadeMedida))
        );
        panDescricaoLayout.setVerticalGroup(
            panDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtUnidadeMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panDiasDuracao.setBackground(new java.awt.Color(51, 51, 51));
        panDiasDuracao.setPreferredSize(new java.awt.Dimension(364, 50));

        lblCalorias.setBackground(new java.awt.Color(51, 51, 51));
        lblCalorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCalorias.setForeground(new java.awt.Color(204, 204, 204));
        lblCalorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalorias.setText("Quantidade");

        fEdtQuantidade.setBackground(new java.awt.Color(51, 51, 51));
        fEdtQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtQuantidade.setForeground(new java.awt.Color(204, 204, 204));
        fEdtQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panDiasDuracaoLayout = new javax.swing.GroupLayout(panDiasDuracao);
        panDiasDuracao.setLayout(panDiasDuracaoLayout);
        panDiasDuracaoLayout.setHorizontalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDiasDuracaoLayout.createSequentialGroup()
                .addComponent(lblCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtQuantidade))
        );
        panDiasDuracaoLayout.setVerticalGroup(
            panDiasDuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fEdtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDiasDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ingredienteRetornar.setId(-1);
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        ingredienteRetornar.setNome(edtNome.getText());
        ingredienteRetornar.setUnidadeMedida(edtUnidadeMedida.getText());
        ingredienteRetornar.setQuantidade(Float.parseFloat(fEdtQuantidade.getText()));
        
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtUnidadeMedida;
    private javax.swing.JFormattedTextField fEdtQuantidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panDescricao;
    private javax.swing.JPanel panDiasDuracao;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panNome;
    private javax.swing.JPanel panPrincipal;
    // End of variables declaration//GEN-END:variables
}
