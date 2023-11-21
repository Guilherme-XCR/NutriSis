package com.artgui.nutrisis.view.Cliente;

import com.artgui.nutrisis.controller.ClienteController;
import com.artgui.nutrisis.model.Cliente;

public class DlgMainCliente extends javax.swing.JDialog {

    Cliente cliente;

    public DlgMainCliente(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);

        this.cliente = cliente;

        initComponents();

        this.lblNomeUser.setText(cliente.getNome());
        this.lblSaldo.setText("Saldo R$ " + cliente.getSaldoCartao());
    }

    public DlgMainCliente(java.awt.Dialog parent, boolean modal, Cliente cliente) {
        super(parent, modal);

        this.cliente = cliente;

        initComponents();

        this.atualizarInfoCliente();
    }

    private void atualizarInfoCliente() {
        this.lblNomeUser.setText(cliente.getNome());
        this.lblSaldo.setText("Saldo R$ " + cliente.getSaldoCartao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panUser = new javax.swing.JPanel();
        btnConta = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblIconUser = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblNomeUser = new javax.swing.JLabel();
        panBody = new javax.swing.JPanel();
        panReceitas = new javax.swing.JPanel();
        btnReceitas = new javax.swing.JButton();
        lblReceitas = new javax.swing.JLabel();
        panDietas = new javax.swing.JPanel();
        btnDietas = new javax.swing.JButton();
        lblDietas = new javax.swing.JLabel();
        panConsultas = new javax.swing.JPanel();
        btnConsultas = new javax.swing.JButton();
        lblConsultas = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnAcompanhamentos = new javax.swing.JButton();
        lblAcompanhamentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panHeader.setBackground(new java.awt.Color(237, 249, 253));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniLogo.png"))); // NOI18N

        panUser.setBackground(new java.awt.Color(237, 249, 253));
        panUser.setForeground(new java.awt.Color(0, 0, 0));

        btnConta.setBackground(new java.awt.Color(255, 255, 255));
        btnConta.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnConta.setForeground(new java.awt.Color(0, 0, 0));
        btnConta.setText("Conta");
        btnConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConta.setFocusable(false);
        btnConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Deslogar");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIcon.png"))); // NOI18N

        javax.swing.GroupLayout panUserLayout = new javax.swing.GroupLayout(panUser);
        panUser.setLayout(panUserLayout);
        panUserLayout.setHorizontalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconUser)
                .addGap(18, 18, 18)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panUserLayout.setVerticalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnConta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblIconUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("Saldo R$ 0,00");
        lblSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblNomeUser.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblNomeUser.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeUser.setText("UserName");
        lblNomeUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(lblNomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panBody.setBackground(new java.awt.Color(51, 51, 51));

        panReceitas.setBackground(new java.awt.Color(71, 71, 71));

        btnReceitas.setBackground(new java.awt.Color(255, 255, 255));
        btnReceitas.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        btnReceitas.setForeground(new java.awt.Color(0, 0, 0));
        btnReceitas.setText("Receitas");
        btnReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReceitas.setFocusable(false);
        btnReceitas.setPreferredSize(new java.awt.Dimension(500, 100));
        btnReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitasActionPerformed(evt);
            }
        });

        lblReceitas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        lblReceitas.setForeground(new java.awt.Color(255, 255, 255));
        lblReceitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReceitas.setText("Para acessar as receitas cadastradas pelos nutricionistas");

        javax.swing.GroupLayout panReceitasLayout = new javax.swing.GroupLayout(panReceitas);
        panReceitas.setLayout(panReceitasLayout);
        panReceitasLayout.setHorizontalGroup(
            panReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReceitasLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(lblReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panReceitasLayout.setVerticalGroup(
            panReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panDietas.setBackground(new java.awt.Color(71, 71, 71));

        btnDietas.setBackground(new java.awt.Color(255, 255, 255));
        btnDietas.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        btnDietas.setForeground(new java.awt.Color(0, 0, 0));
        btnDietas.setText("Dietas");
        btnDietas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDietas.setFocusable(false);
        btnDietas.setPreferredSize(new java.awt.Dimension(500, 100));
        btnDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietasActionPerformed(evt);
            }
        });

        lblDietas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        lblDietas.setForeground(new java.awt.Color(255, 255, 255));
        lblDietas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDietas.setText("Para acessar as dietas cadastradas pelos nutricionista");

        javax.swing.GroupLayout panDietasLayout = new javax.swing.GroupLayout(panDietas);
        panDietas.setLayout(panDietasLayout);
        panDietasLayout.setHorizontalGroup(
            panDietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDietasLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDietasLayout.setVerticalGroup(
            panDietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDietasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDietas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panConsultas.setBackground(new java.awt.Color(71, 71, 71));

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultas.setText("Consultas");
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.setFocusable(false);
        btnConsultas.setPreferredSize(new java.awt.Dimension(500, 100));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        lblConsultas.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConsultas.setText("Para marcar, adiar ou cancelar consulta, ou ver consultas passadas.");

        javax.swing.GroupLayout panConsultasLayout = new javax.swing.GroupLayout(panConsultas);
        panConsultas.setLayout(panConsultasLayout);
        panConsultasLayout.setHorizontalGroup(
            panConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultasLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panConsultasLayout.setVerticalGroup(
            panConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConsultasLayout.createSequentialGroup()
                        .addComponent(btnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panConsultasLayout.createSequentialGroup()
                        .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel9.setBackground(new java.awt.Color(71, 71, 71));

        btnAcompanhamentos.setBackground(new java.awt.Color(255, 255, 255));
        btnAcompanhamentos.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        btnAcompanhamentos.setForeground(new java.awt.Color(0, 0, 0));
        btnAcompanhamentos.setText("Acompanhamentos");
        btnAcompanhamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcompanhamentos.setFocusable(false);
        btnAcompanhamentos.setPreferredSize(new java.awt.Dimension(500, 100));
        btnAcompanhamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcompanhamentosActionPerformed(evt);
            }
        });

        lblAcompanhamentos.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        lblAcompanhamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblAcompanhamentos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcompanhamentos.setText("Para iniciar acompanhamento, registrar dia ou verificar recomendações");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblAcompanhamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnAcompanhamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAcompanhamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblAcompanhamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panBodyLayout = new javax.swing.GroupLayout(panBody);
        panBody.setLayout(panBodyLayout);
        panBodyLayout.setHorizontalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDietas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBodyLayout.setVerticalGroup(
            panBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBodyLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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

    private void btnReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitasActionPerformed
        DlgReceitaCliente dlgReceitaCliente = new DlgReceitaCliente(this, true);

        this.setVisible(false);
        dlgReceitaCliente.setLocationRelativeTo(this);
        dlgReceitaCliente.setVisible(true);

        this.setVisible(true);
    }//GEN-LAST:event_btnReceitasActionPerformed

    private void btnDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietasActionPerformed
        DlgDietaCliente dlgDietaCliente = new DlgDietaCliente(this, true);

        this.setVisible(false);
        dlgDietaCliente.setLocationRelativeTo(this);
        dlgDietaCliente.setVisible(true);

        this.setVisible(true);
    }//GEN-LAST:event_btnDietasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        DlgConsultaCliente dlgConsultaCliente = new DlgConsultaCliente(this, true, cliente);

        this.setVisible(false);
        dlgConsultaCliente.setLocationRelativeTo(this);
        dlgConsultaCliente.setVisible(true);

        this.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnAcompanhamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcompanhamentosActionPerformed
        DlgAcompanhamentoCliente dlgAcompanhamentoCliente = new DlgAcompanhamentoCliente(this, true);

        this.setVisible(false);
        dlgAcompanhamentoCliente.setLocationRelativeTo(this);
        dlgAcompanhamentoCliente.setVisible(true);

        this.setVisible(true);
    }//GEN-LAST:event_btnAcompanhamentosActionPerformed

    private void btnContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaActionPerformed

        DlgContaCliente dlgContaCliente = new DlgContaCliente(this, true, cliente);
        this.setVisible(false);
        dlgContaCliente.setLocationRelativeTo(this);
        dlgContaCliente.setVisible(true);
        
        this.setVisible(true);
        
        this.atualizarInfoCliente();

    }//GEN-LAST:event_btnContaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcompanhamentos;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnConta;
    private javax.swing.JButton btnDietas;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReceitas;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAcompanhamentos;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblDietas;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblReceitas;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panBody;
    private javax.swing.JPanel panConsultas;
    private javax.swing.JPanel panDietas;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panReceitas;
    private javax.swing.JPanel panUser;
    // End of variables declaration//GEN-END:variables
}
