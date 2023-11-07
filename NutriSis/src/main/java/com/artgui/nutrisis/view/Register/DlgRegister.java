package com.artgui.nutrisis.view.Register;

import com.artgui.nutrisis.controller.ClienteController;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.view.Cliente.DlgMainCliente;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgRegister extends javax.swing.JDialog {

    private ClienteController clienteController;
    private Cliente cliente;

    public DlgRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        this.clienteController = new ClienteController();

        initComponents();

        adicionarMascaraNosCampos();
    }

    public void adicionarMascaraNosCampos() {

        try {
            MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) #####-####");
            MaskFormatter alturaFormatter = new MaskFormatter("###");
            MaskFormatter pesoFormatter = new MaskFormatter("###.##");
            MaskFormatter dataNascimentoFormatter = new MaskFormatter("##/##/####");

            cpfFormatter.install(fEdtCpf);
            alturaFormatter.install(fEdtAltura);
            telefoneFormatter.install(fEdtTelefone);
            pesoFormatter.install(fEdtPeso);
            dataNascimentoFormatter.install(fEdtDataNascimento);

        } catch (ParseException ex) {
            Logger.getLogger(DlgRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        panRegister = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panInputs = new javax.swing.JPanel();
        edtNomeCompleto = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        edtSenha = new javax.swing.JPasswordField();
        edtConfirmarSenha = new javax.swing.JPasswordField();
        lblGenero = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        fEdtCpf = new javax.swing.JFormattedTextField();
        fEdtTelefone = new javax.swing.JFormattedTextField();
        fEdtAltura = new javax.swing.JFormattedTextField();
        fEdtPeso = new javax.swing.JFormattedTextField();
        fEdtDataNascimento = new javax.swing.JFormattedTextField();
        fEdtNumeroCartao = new javax.swing.JFormattedTextField();
        edtSenhaCartao = new javax.swing.JPasswordField();
        btnSair = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImgReistro-Login.png"))); // NOI18N

        panRegister.setBackground(new java.awt.Color(51, 51, 51));
        panRegister.setPreferredSize(new java.awt.Dimension(560, 720));

        lblTitulo.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Realizar Registro");

        panInputs.setBackground(new java.awt.Color(71, 71, 71));

        edtNomeCompleto.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        edtNomeCompleto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        edtNomeCompleto.setPreferredSize(new java.awt.Dimension(294, 40));

        edtEmail.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        edtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        edtEmail.setPreferredSize(new java.awt.Dimension(294, 40));

        edtSenha.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        edtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        edtSenha.setPreferredSize(new java.awt.Dimension(294, 40));

        edtConfirmarSenha.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        edtConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        edtConfirmarSenha.setPreferredSize(new java.awt.Dimension(294, 40));

        lblGenero.setFont(new java.awt.Font("Cascadia Mono", 0, 16)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Genero");
        lblGenero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGenero.setPreferredSize(new java.awt.Dimension(150, 40));

        comboBoxGenero.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxGenero.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        comboBoxGenero.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Masculino", "Feminino", "Outro" }));
        comboBoxGenero.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtCpf.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtCpf.setName(""); // NOI18N
        fEdtCpf.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtTelefone.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtTelefone.setName(""); // NOI18N
        fEdtTelefone.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Altura - cm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtAltura.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtAltura.setName(""); // NOI18N
        fEdtAltura.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso (Kg)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtPeso.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtPeso.setName(""); // NOI18N
        fEdtPeso.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtDataNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Nascimento (dd/mm/aaaa)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtDataNascimento.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtDataNascimento.setName(""); // NOI18N
        fEdtDataNascimento.setPreferredSize(new java.awt.Dimension(294, 40));

        fEdtNumeroCartao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número do Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtNumeroCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtNumeroCartao.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtNumeroCartao.setName(""); // NOI18N
        fEdtNumeroCartao.setPreferredSize(new java.awt.Dimension(294, 40));

        edtSenhaCartao.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        edtSenhaCartao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha do Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Code", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        edtSenhaCartao.setPreferredSize(new java.awt.Dimension(294, 40));

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(edtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtConfirmarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fEdtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(fEdtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fEdtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxGenero, 0, 0, Short.MAX_VALUE))
                            .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(fEdtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtSenhaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(edtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fEdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fEdtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(edtSenhaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fEdtNumeroCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 48)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegisterLayout = new javax.swing.GroupLayout(panRegister);
        panRegister.setLayout(panRegisterLayout);
        panRegisterLayout.setHorizontalGroup(
            panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegisterLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panInputs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegisterLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        panRegisterLayout.setVerticalGroup(
            panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegisterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
                clienteController.cadastrar(
                        edtNomeCompleto.getText(),
                        edtEmail.getText(),
                        edtSenha.getText(),
                        edtConfirmarSenha.getText(),
                        fEdtCpf.getText(),
                        fEdtTelefone.getText(),
                        fEdtAltura.getText(),
                        fEdtPeso.getText(),
                        comboBoxGenero.getSelectedItem() + "",
                        fEdtDataNascimento.getText(),
                        fEdtNumeroCartao.getText(),
                        edtSenhaCartao.getText()
                );

                this.cliente = clienteController.buscarPorEmail(edtEmail.getText());

                DlgMainCliente dlgMainCliente = new DlgMainCliente(this, true, cliente);
                this.setVisible(false);
                dlgMainCliente.setLocationRelativeTo(this);
                dlgMainCliente.setVisible(true);

                this.dispose();
             
        } catch (ClienteException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JPasswordField edtConfirmarSenha;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtNomeCompleto;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JPasswordField edtSenhaCartao;
    private javax.swing.JFormattedTextField fEdtAltura;
    private javax.swing.JFormattedTextField fEdtCpf;
    private javax.swing.JFormattedTextField fEdtDataNascimento;
    private javax.swing.JFormattedTextField fEdtNumeroCartao;
    private javax.swing.JFormattedTextField fEdtPeso;
    private javax.swing.JFormattedTextField fEdtTelefone;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panRegister;
    // End of variables declaration//GEN-END:variables
}
