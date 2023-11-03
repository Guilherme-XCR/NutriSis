package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.ClienteController;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Cliente;
import javax.swing.JOptionPane;

public class DlgContaCliente extends javax.swing.JDialog {

    Cliente cliente;
    ClienteController clienteController;
    boolean isExcluirConta;

    public DlgContaCliente(java.awt.Dialog parent, boolean modal, Cliente cliente, boolean isExcluirConta) {
        super(parent, modal);

        this.cliente = cliente;
        this.clienteController = new ClienteController();
        this.isExcluirConta = false;

        initComponents();

        this.preencherFormulario(cliente);
        this.habilitarCampos(false);
        this.btnSalvar.setEnabled(false);
    }

    public void habilitarCampos(boolean flag) {
        this.edtNomeCompleto.setEnabled(flag);
        this.edtEmail.setEnabled(flag);
        this.edtSenha.setEnabled(flag);
        this.fEdtCpf.setEnabled(flag);
        this.fEdtTelefone.setEnabled(flag);
        this.fEdtAltura.setEnabled(flag);
        this.fEdtPeso.setEnabled(flag);
        this.fEdtDataNascimento.setEnabled(flag);
        this.fEdtNumeroCartao.setEnabled(flag);
        this.edtSenhaCartao.setEnabled(flag);

        this.comboBoxGenero.setEnabled(flag);
    }

    public void limparCampos() {
        this.edtNomeCompleto.setText("");
        this.edtEmail.setText("");
        this.edtSenha.setText("");
        this.fEdtCpf.setText("");
        this.fEdtTelefone.setText("");
        this.fEdtAltura.setText("");
        this.fEdtPeso.setText("");
        this.fEdtDataNascimento.setText("");
        this.fEdtNumeroCartao.setText("");
        this.edtSenhaCartao.setText("");

        this.comboBoxGenero.setSelectedIndex(0);
    }

    public void preencherFormulario(Cliente cliente) {
        this.edtNomeCompleto.setText(cliente.getNome());
        this.edtEmail.setText(cliente.getEmail());
        this.edtSenha.setText(cliente.getSenha());
        this.fEdtCpf.setText(cliente.getCpf());
        this.fEdtTelefone.setText(cliente.getTelefone());
        this.fEdtAltura.setText(cliente.getAltura() + "");
        this.fEdtPeso.setText(cliente.getPeso() + "");
        this.fEdtDataNascimento.setText(cliente.getDataNascimento());
        this.fEdtNumeroCartao.setText(cliente.getNumeroCartao());
        this.edtSenhaCartao.setText(cliente.getSenhaCartao());

        this.comboBoxGenero.setSelectedItem(cliente.getGenero());
    }

    public void adicionarMascaraNosCampos() {

//        try {
//            MaskFormatter tempoPreparoFormatter = new MaskFormatter("########");
//            MaskFormatter porcoesFormatter = new MaskFormatter("########");
//
//            tempoPreparoFormatter.install(fEdtTempoPreparo);
//            porcoesFormatter.install(fEdtPorcoes);
//
//        } catch (ParseException ex) {
//            Logger.getLogger(DlgReceitaNutricionista.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panUser = new javax.swing.JPanel();
        lblIconUser = new javax.swing.JLabel();
        lblNomeUser = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        panBody = new javax.swing.JPanel();
        panInputs = new javax.swing.JPanel();
        edtNomeCompleto = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        edtSenha = new javax.swing.JPasswordField();
        lblGenero = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        fEdtCpf = new javax.swing.JFormattedTextField();
        fEdtTelefone = new javax.swing.JFormattedTextField();
        fEdtAltura = new javax.swing.JFormattedTextField();
        fEdtPeso = new javax.swing.JFormattedTextField();
        fEdtDataNascimento = new javax.swing.JFormattedTextField();
        fEdtNumeroCartao = new javax.swing.JFormattedTextField();
        edtSenhaCartao = new javax.swing.JPasswordField();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblEditarPerfil = new javax.swing.JLabel();
        panInputs1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        panInputs2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        fEdtValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        panUser.setBackground(new java.awt.Color(237, 249, 253));
        panUser.setForeground(new java.awt.Color(0, 0, 0));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIcon.png"))); // NOI18N

        lblNomeUser.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblNomeUser.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeUser.setText("UserName");
        lblNomeUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("Saldo R$ 0,00");
        lblSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panUserLayout = new javax.swing.GroupLayout(panUser);
        panUser.setLayout(panUserLayout);
        panUserLayout.setHorizontalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIconUser))
        );
        panUserLayout.setVerticalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panBody.setBackground(new java.awt.Color(51, 51, 51));

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

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusable(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(500, 100));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusable(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(500, 100));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setPreferredSize(new java.awt.Dimension(500, 100));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblEditarPerfil.setBackground(new java.awt.Color(255, 255, 255));
        lblEditarPerfil.setFont(new java.awt.Font("Cascadia Mono", 1, 64)); // NOI18N
        lblEditarPerfil.setForeground(new java.awt.Color(204, 255, 255));
        lblEditarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarPerfil.setText("Editar Perfil");

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fEdtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(fEdtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fEdtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(fEdtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxGenero, 0, 0, Short.MAX_VALUE))
                                    .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(fEdtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSenhaCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fEdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fEdtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fEdtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fEdtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSenhaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panInputs1.setBackground(new java.awt.Color(71, 71, 71));

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Excluir conta");

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusable(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(500, 100));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panInputs1Layout = new javax.swing.GroupLayout(panInputs1);
        panInputs1.setLayout(panInputs1Layout);
        panInputs1Layout.setHorizontalGroup(
            panInputs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputs1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputs1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        panInputs1Layout.setVerticalGroup(
            panInputs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputs1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panInputs2.setBackground(new java.awt.Color(71, 71, 71));

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicionar saldo a conta.");

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setFocusable(false);
        btnConfirmar.setPreferredSize(new java.awt.Dimension(500, 100));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        fEdtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor - (R$)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 0, 10), new java.awt.Color(0, 204, 51))); // NOI18N
        fEdtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fEdtValor.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        fEdtValor.setName(""); // NOI18N
        fEdtValor.setPreferredSize(new java.awt.Dimension(294, 40));

        javax.swing.GroupLayout panInputs2Layout = new javax.swing.GroupLayout(panInputs2);
        panInputs2.setLayout(panInputs2Layout);
        panInputs2Layout.setHorizontalGroup(
            panInputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputs2Layout.createSequentialGroup()
                .addGroup(panInputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputs2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
                    .addGroup(panInputs2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(panInputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fEdtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panInputs2Layout.setVerticalGroup(
            panInputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputs2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panBodyLayout = new javax.swing.GroupLayout(panBody);
        panBody.setLayout(panBodyLayout);
        panBodyLayout.setHorizontalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panInputs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panInputs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBodyLayout.setVerticalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panBodyLayout.createSequentialGroup()
                        .addComponent(panInputs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panInputs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.preencherFormulario(cliente);

        this.btnEditar.setEnabled(false);
        this.btnSalvar.setEnabled(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            clienteController.atualizar(
                    cliente.getId(),
                    edtNomeCompleto.getText(),
                    edtEmail.getText(),
                    edtSenha.getText(),
                    edtSenha.getText(),
                    fEdtCpf.getText(),
                    fEdtTelefone.getText(),
                    fEdtAltura.getText(),
                    fEdtPeso.getText(),
                    comboBoxGenero.getSelectedItem() + "",
                    fEdtDataNascimento.getText(),
                    fEdtNumeroCartao.getText(),
                    edtSenhaCartao.getText(),
                    cliente.getSaldoCarto()
            );
        } catch (ClienteException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (fEdtValor.getText() != null && fEdtValor.getText().replaceAll("\\s", "").isEmpty()) {

            float valor = Float.parseFloat(fEdtValor.getText());
            if (valor > 0.0f) {
                String senhaCartaoDigitada = JOptionPane.showInputDialog(this, "Informe a senha do cartão:", "");

                if (senhaCartaoDigitada == cliente.getSenhaCartao()) {
                    cliente.setSaldoCarto(valor);

                    try {
                        clienteController.atualizar(
                                cliente.getId(),
                                cliente.getNome(),
                                cliente.getEmail(),
                                cliente.getSenha(),
                                cliente.getSenha(),
                                cliente.getCpf(),
                                cliente.getTelefone(),
                                cliente.getAltura() + "",
                                cliente.getPeso() + "",
                                cliente.getGenero(),
                                cliente.getDataNascimento(),
                                cliente.getNumeroCartao(),
                                cliente.getSenhaCartao(),
                                valor
                        );
                        JOptionPane.showMessageDialog(this, "R$ " + valor + " adicionados a sua conta.");

                    } catch (ClienteException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Senha incorreta");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Valor inválido");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor não pode estar vazio.");
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int response = JOptionPane.showConfirmDialog(null,
                "Deseja exlcuir a Conta e tudo que ela possui?",
                "Confirmar exclusão",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {

            try {
                clienteController.excluir(cliente);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ClienteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            this.isExcluirConta = true;
            this.dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxGenero;
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
    private javax.swing.JFormattedTextField fEdtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEditarPerfil;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panBody;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panInputs1;
    private javax.swing.JPanel panInputs2;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panUser;
    // End of variables declaration//GEN-END:variables
}
