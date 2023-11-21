package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.ConsultaController;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.exceptions.ConsultaException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgMarcarConsulta extends javax.swing.JDialog {

    private Nutricionista nutricionista;
    private Cliente cliente;
    private Consulta consulta;
    private ConsultaController consultaController;

    public DlgMarcarConsulta(java.awt.Dialog parent, boolean modal, Consulta consulta, Cliente cliente) {
        super(parent, modal);

        this.nutricionista = new Nutricionista();
        this.cliente = cliente;
        this.consulta = consulta;
        this.consultaController = new ConsultaController();

        initComponents();

        this.adicionarMascaraNosCampos();

    }

    public void adicionarMascaraNosCampos() {

        try {
            MaskFormatter dataNascimentoFormatter = new MaskFormatter("##/##/####");
            dataNascimentoFormatter.install(fEdtData);
        } catch (ParseException ex) {
            Logger.getLogger(DlgMarcarConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        edtNutricionista = new javax.swing.JTextField();
        btnAdicionarNutricionista = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        fEdtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panMain.setBackground(new java.awt.Color(51, 51, 51));

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        edtNutricionista.setBackground(new java.awt.Color(255, 255, 255));
        edtNutricionista.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        edtNutricionista.setForeground(new java.awt.Color(0, 0, 0));
        edtNutricionista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nutricionista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNutricionista.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        edtNutricionista.setEnabled(false);

        btnAdicionarNutricionista.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionarNutricionista.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnAdicionarNutricionista.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionarNutricionista.setText("Add");
        btnAdicionarNutricionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNutricionistaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        fEdtData.setBackground(new java.awt.Color(255, 255, 255));
        fEdtData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data  (dd/mm/aaaa)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtData.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtData.setName(""); // NOI18N
        fEdtData.setPreferredSize(new java.awt.Dimension(294, 40));

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(edtNutricionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarNutricionista))
                    .addComponent(fEdtData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(fEdtData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAdicionarNutricionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNutricionistaActionPerformed

        DlgAdicionaNutricionista dlgAdicionaNutricionista = new DlgAdicionaNutricionista(this, true, nutricionista);
        dlgAdicionaNutricionista.setLocationRelativeTo(this);
        dlgAdicionaNutricionista.setVisible(true);

        if (nutricionista.getId() == -1) {
            JOptionPane.showMessageDialog(this, "Adição cancelada");
        } else {
            this.edtNutricionista.setText(nutricionista.getNome());
        }

    }//GEN-LAST:event_btnAdicionarNutricionistaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.consulta.setId(-1);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            consulta.copy(consultaController.criar(fEdtData.getText(), cliente, nutricionista));
            this.dispose();
        } catch (ConsultaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarNutricionista;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField edtNutricionista;
    private javax.swing.JFormattedTextField fEdtData;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMain;
    // End of variables declaration//GEN-END:variables
}
