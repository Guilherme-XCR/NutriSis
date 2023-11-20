package com.artgui.nutrisis.view.viewOlds;
        
import com.artgui.nutrisis.controller.ClienteController;
import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DlgCRUDCliente extends javax.swing.JDialog {

    ClienteController clienteController;
    int idClienteEditando;
    
    public DlgCRUDCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        clienteController = new ClienteController();
        idClienteEditando = -1;
        
        initComponents();
        
        this.adicionarMascaraNosCampos();
        this.habilitarCampos(false);
        this.limparCampos();
        
        clienteController.atualizarTabela(grdClientes); 
        
    }

    public void habilitarCampos(boolean flag) {
        
        for (int i = 0; i < panInputs.getComponents().length; i++) {
            panInputs.getComponent(i).setEnabled(flag);
        }
    }

    public void limparCampos() {
    
        edtNome.setText("");
        edtEmail.setText("");
        pasEdtSenha.setText("");
        fEdtCpf.setText("");
        fEdtTelefone.setText("");
        fEdtAltura.setText("");
        fEdtPeso.setText("");
        edtGenero.setText("");
        fEdtDataNascimento.setText("");
    }

    public void adicionarMascaraNosCampos() {
      
        try {
            //MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) #####-####");
            //MaskFormatter alturaFormatter = new MaskFormatter("#.##");
            //MaskFormatter pesoFormatter = new MaskFormatter("###.#");
            MaskFormatter dataNascimentoFormatter = new MaskFormatter("##-##-####");

            
            //cpfFormatter.install(fEdtCpf);
            //alturaFormatter.install(fEdtAltura);
            telefoneFormatter.install(fEdtTelefone);   
            //pesoFormatter.install(fEdtPeso);      
            dataNascimentoFormatter.install(fEdtDataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(DlgCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preencherFormulario(Cliente c) {
    
        edtNome.setText(c.getNome());
        edtEmail.setText(c.getEmail());
        pasEdtSenha.setText(c.getSenha());
        fEdtCpf.setText(c.getCpf());
        fEdtTelefone.setText(c.getTelefone());
        fEdtAltura.setText(c.getAltura() + "");
        fEdtPeso.setText(c.getPeso() + "");
        edtGenero.setText(c.getGenero());
        fEdtDataNascimento.setText(c.getDataNascimento() + "");
    }
  
    private Object getObjetoSelecionadoNaGrid() {
        int rowCliked = grdClientes.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdClientes.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    

    private void grdAlunosMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if (evt.getClickCount() == 2) {
            btnEditarActionPerformed(null);
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panButtons = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panInputs = new javax.swing.JPanel();
        panUserInputs = new javax.swing.JPanel();
        panNome = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        panEmail = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        panSenha = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        pasEdtSenha = new javax.swing.JPasswordField();
        panCpf = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        fEdtCpf = new javax.swing.JFormattedTextField();
        panTelefone = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        fEdtTelefone = new javax.swing.JFormattedTextField();
        panClienteInputs = new javax.swing.JPanel();
        panAltura = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        fEdtAltura = new javax.swing.JFormattedTextField();
        panPeso = new javax.swing.JPanel();
        lblPeso = new javax.swing.JLabel();
        fEdtPeso = new javax.swing.JFormattedTextField();
        panGenero = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        edtGenero = new javax.swing.JTextField();
        panDataNascimento = new javax.swing.JPanel();
        lblDataNascimento = new javax.swing.JLabel();
        fEdtDataNascimento = new javax.swing.JFormattedTextField();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdClientes = new javax.swing.JTable();
        lblTituloTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CRUD Cliente");

        panButtons.setBackground(new java.awt.Color(40, 40, 40));

        btnCriar.setBackground(new java.awt.Color(51, 51, 51));
        btnCriar.setForeground(new java.awt.Color(0, 255, 51));
        btnCriar.setText("Criar");
        btnCriar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCriar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setForeground(new java.awt.Color(255, 255, 0));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setForeground(new java.awt.Color(255, 102, 102));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 153, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setForeground(new java.awt.Color(0, 204, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonsLayout = new javax.swing.GroupLayout(panButtons);
        panButtons.setLayout(panButtonsLayout);
        panButtonsLayout.setHorizontalGroup(
            panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panButtonsLayout.setVerticalGroup(
            panButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panInputs.setBackground(new java.awt.Color(40, 40, 40));

        panUserInputs.setBackground(new java.awt.Color(51, 51, 51));

        panNome.setBackground(new java.awt.Color(51, 51, 51));

        lblNome.setBackground(new java.awt.Color(51, 51, 51));
        lblNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 204, 204));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        edtNome.setBackground(new java.awt.Color(51, 51, 51));
        edtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtNome.setForeground(new java.awt.Color(204, 204, 204));
        edtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        panEmail.setBackground(new java.awt.Color(51, 51, 51));

        lblEmail.setBackground(new java.awt.Color(51, 51, 51));
        lblEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        edtEmail.setBackground(new java.awt.Color(51, 51, 51));
        edtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtEmail.setForeground(new java.awt.Color(204, 204, 204));
        edtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        edtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panEmailLayout = new javax.swing.GroupLayout(panEmail);
        panEmail.setLayout(panEmailLayout);
        panEmailLayout.setHorizontalGroup(
            panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmailLayout.createSequentialGroup()
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEmail))
        );
        panEmailLayout.setVerticalGroup(
            panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panSenha.setBackground(new java.awt.Color(51, 51, 51));
        panSenha.setPreferredSize(new java.awt.Dimension(364, 50));

        lblSenha.setBackground(new java.awt.Color(51, 51, 51));
        lblSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(204, 204, 204));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");

        pasEdtSenha.setBackground(new java.awt.Color(51, 51, 51));
        pasEdtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pasEdtSenha.setForeground(new java.awt.Color(204, 204, 204));
        pasEdtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pasEdtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panSenhaLayout = new javax.swing.GroupLayout(panSenha);
        panSenha.setLayout(panSenhaLayout);
        panSenhaLayout.setHorizontalGroup(
            panSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSenhaLayout.createSequentialGroup()
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasEdtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );
        panSenhaLayout.setVerticalGroup(
            panSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(pasEdtSenha)
        );

        panCpf.setBackground(new java.awt.Color(51, 51, 51));
        panCpf.setPreferredSize(new java.awt.Dimension(364, 50));

        lblCpf.setBackground(new java.awt.Color(51, 51, 51));
        lblCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(204, 204, 204));
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("CPF");

        fEdtCpf.setBackground(new java.awt.Color(51, 51, 51));
        fEdtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtCpf.setForeground(new java.awt.Color(204, 204, 204));
        fEdtCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fEdtCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panCpfLayout = new javax.swing.GroupLayout(panCpf);
        panCpf.setLayout(panCpfLayout);
        panCpfLayout.setHorizontalGroup(
            panCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCpfLayout.createSequentialGroup()
                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtCpf))
        );
        panCpfLayout.setVerticalGroup(
            panCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtCpf)
        );

        panTelefone.setBackground(new java.awt.Color(51, 51, 51));
        panTelefone.setPreferredSize(new java.awt.Dimension(352, 50));

        lblTelefone.setBackground(new java.awt.Color(51, 51, 51));
        lblTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(204, 204, 204));
        lblTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefone.setText("Telefone");

        fEdtTelefone.setBackground(new java.awt.Color(51, 51, 51));
        fEdtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        fEdtTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fEdtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panTelefoneLayout = new javax.swing.GroupLayout(panTelefone);
        panTelefone.setLayout(panTelefoneLayout);
        panTelefoneLayout.setHorizontalGroup(
            panTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTelefoneLayout.createSequentialGroup()
                .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtTelefone))
        );
        panTelefoneLayout.setVerticalGroup(
            panTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtTelefone)
        );

        javax.swing.GroupLayout panUserInputsLayout = new javax.swing.GroupLayout(panUserInputs);
        panUserInputs.setLayout(panUserInputsLayout);
        panUserInputsLayout.setHorizontalGroup(
            panUserInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addComponent(panCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addComponent(panTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        panUserInputsLayout.setVerticalGroup(
            panUserInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserInputsLayout.createSequentialGroup()
                .addComponent(panNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        panClienteInputs.setBackground(new java.awt.Color(51, 51, 51));

        panAltura.setBackground(new java.awt.Color(51, 51, 51));

        lblAltura.setBackground(new java.awt.Color(51, 51, 51));
        lblAltura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(204, 204, 204));
        lblAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAltura.setText("Altura");

        fEdtAltura.setBackground(new java.awt.Color(51, 51, 51));
        fEdtAltura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtAltura.setForeground(new java.awt.Color(204, 204, 204));
        fEdtAltura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fEdtAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panAlturaLayout = new javax.swing.GroupLayout(panAltura);
        panAltura.setLayout(panAlturaLayout);
        panAlturaLayout.setHorizontalGroup(
            panAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlturaLayout.createSequentialGroup()
                .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtAltura))
        );
        panAlturaLayout.setVerticalGroup(
            panAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtAltura)
        );

        panPeso.setBackground(new java.awt.Color(51, 51, 51));

        lblPeso.setBackground(new java.awt.Color(51, 51, 51));
        lblPeso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(204, 204, 204));
        lblPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeso.setText("Peso");

        fEdtPeso.setBackground(new java.awt.Color(51, 51, 51));
        fEdtPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtPeso.setForeground(new java.awt.Color(204, 204, 204));
        fEdtPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fEdtPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout panPesoLayout = new javax.swing.GroupLayout(panPeso);
        panPeso.setLayout(panPesoLayout);
        panPesoLayout.setHorizontalGroup(
            panPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesoLayout.createSequentialGroup()
                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtPeso))
        );
        panPesoLayout.setVerticalGroup(
            panPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtPeso)
        );

        panGenero.setBackground(new java.awt.Color(51, 51, 51));
        panGenero.setPreferredSize(new java.awt.Dimension(364, 50));

        lblGenero.setBackground(new java.awt.Color(51, 51, 51));
        lblGenero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(204, 204, 204));
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Genero");

        edtGenero.setBackground(new java.awt.Color(51, 51, 51));
        edtGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtGenero.setForeground(new java.awt.Color(204, 204, 204));
        edtGenero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        edtGenero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));

        javax.swing.GroupLayout panGeneroLayout = new javax.swing.GroupLayout(panGenero);
        panGenero.setLayout(panGeneroLayout);
        panGeneroLayout.setHorizontalGroup(
            panGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneroLayout.createSequentialGroup()
                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtGenero))
        );
        panGeneroLayout.setVerticalGroup(
            panGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panDataNascimento.setBackground(new java.awt.Color(51, 51, 51));
        panDataNascimento.setPreferredSize(new java.awt.Dimension(364, 50));

        lblDataNascimento.setBackground(new java.awt.Color(51, 51, 51));
        lblDataNascimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(204, 204, 204));
        lblDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataNascimento.setText("Data Nascimento");

        fEdtDataNascimento.setBackground(new java.awt.Color(51, 51, 51));
        fEdtDataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        fEdtDataNascimento.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panDataNascimentoLayout = new javax.swing.GroupLayout(panDataNascimento);
        panDataNascimento.setLayout(panDataNascimentoLayout);
        panDataNascimentoLayout.setHorizontalGroup(
            panDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataNascimentoLayout.createSequentialGroup()
                .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtDataNascimento))
        );
        panDataNascimentoLayout.setVerticalGroup(
            panDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(fEdtDataNascimento)
        );

        javax.swing.GroupLayout panClienteInputsLayout = new javax.swing.GroupLayout(panClienteInputs);
        panClienteInputs.setLayout(panClienteInputsLayout);
        panClienteInputsLayout.setHorizontalGroup(
            panClienteInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addComponent(panDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        panClienteInputsLayout.setVerticalGroup(
            panClienteInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClienteInputsLayout.createSequentialGroup()
                .addComponent(panAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panUserInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panClienteInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panUserInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panClienteInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panTable.setBackground(new java.awt.Color(40, 40, 40));

        grdClientes.setBackground(new java.awt.Color(51, 51, 51));
        grdClientes.setForeground(new java.awt.Color(204, 204, 204));
        grdClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        grdClientes.setGridColor(new java.awt.Color(51, 51, 51));
        grdClientes.setSelectionBackground(new java.awt.Color(0, 51, 102));
        grdClientes.setSelectionForeground(new java.awt.Color(153, 255, 255));
        jScrollPane1.setViewportView(grdClientes);

        lblTituloTabela.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTituloTabela.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloTabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTabela.setText("Clientes Cadastrados");

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTituloTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(panTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        
        idClienteEditando = -1;
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Cliente cliente = (Cliente) this.getObjetoSelecionadoNaGrid();
        
        if (cliente == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.preencherFormulario(cliente);
            this.idClienteEditando = cliente.getId();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Cliente cliente = (Cliente) this.getObjetoSelecionadoNaGrid();

        if (cliente == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                clienteController.excluir(cliente);

                clienteController.atualizarTabela(grdClientes);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ClienteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        this.idClienteEditando = -1;
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        idClienteEditando = -1;
        
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        try {
//                     
//            if (idClienteEditando > 0) {
//                clienteController.atualizar(
//                        idClienteEditando,
//                        edtNome.getText(), 
//                        edtEmail.getText(), 
//                        pasEdtSenha.getText(), 
//                        pasEdtSenha.getText(), 
//                        fEdtCpf.getText(), 
//                        fEdtTelefone.getText(), 
//                        Integer.parseInt(fEdtAltura.getText()), 
//                        Float.parseFloat(fEdtPeso.getText()), 
//                        edtGenero.getText(), 
//                        fEdtDataNascimento.getText()
//                );
//            } else {
//                clienteController.cadastrar(
//                        edtNome.getText(), 
//                        edtEmail.getText(), 
//                        pasEdtSenha.getText(),
//                        pasEdtSenha.getText(), 
//                        fEdtCpf.getText(), 
//                        fEdtTelefone.getText(), 
//                        Integer.parseInt(fEdtAltura.getText()), 
//                        Float.parseFloat(fEdtPeso.getText()), 
//                        edtGenero.getText(), 
//                        fEdtDataNascimento.getText()
//                );
//            }
//            idClienteEditando = -1;
//            clienteController.atualizarTabela(grdClientes);
//            this.habilitarCampos(false);
//            this.limparCampos();
//        } catch (ClienteException e) {
//            System.err.println(e.getMessage());
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtGenero;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtAltura;
    private javax.swing.JFormattedTextField fEdtCpf;
    private javax.swing.JFormattedTextField fEdtDataNascimento;
    private javax.swing.JFormattedTextField fEdtPeso;
    private javax.swing.JFormattedTextField fEdtTelefone;
    private javax.swing.JTable grdClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloTabela;
    private javax.swing.JPanel panAltura;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panClienteInputs;
    private javax.swing.JPanel panCpf;
    private javax.swing.JPanel panDataNascimento;
    private javax.swing.JPanel panEmail;
    private javax.swing.JPanel panGenero;
    private javax.swing.JPanel panInputs;
    private javax.swing.JPanel panNome;
    private javax.swing.JPanel panPeso;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panSenha;
    private javax.swing.JPanel panTable;
    private javax.swing.JPanel panTelefone;
    private javax.swing.JPanel panUserInputs;
    private javax.swing.JPasswordField pasEdtSenha;
    // End of variables declaration//GEN-END:variables
}
