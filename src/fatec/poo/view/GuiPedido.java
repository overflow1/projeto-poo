package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCliente;
import fatec.poo.control.DaoItemPedido;
import fatec.poo.control.DaoPedido;
import fatec.poo.control.DaoProduto;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuiPedido extends javax.swing.JFrame {

    public GuiPedido() {
        initComponents();
        modTblItem = (DefaultTableModel)tblItem.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        btnConsultarPedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ftxtDtaPedido = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ftxtCPFCliente = new javax.swing.JFormattedTextField();
        btnConsultarCliente = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ftxtCPFVendedor = new javax.swing.JFormattedTextField();
        btnConsultarVendedor = new javax.swing.JButton();
        txtNomeVendedor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        btnConsultarProduto = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdeVendida = new javax.swing.JTextField();
        btnAdicionarItem = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValorTotalPedido = new javax.swing.JTextField();
        txtQtdeItensPedido = new javax.swing.JTextField();
        btnAlterarPedido = new javax.swing.JButton();
        btnIncluirPedido = new javax.swing.JButton();
        btnExcluirPedido = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Número do Pedido");

        txtNumeroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPedidoActionPerformed(evt);
            }
        });

        btnConsultarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data do Pedido");

        try {
            ftxtDtaPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDtaPedido.setEnabled(false);
        ftxtDtaPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtDtaPedidoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ftxtDtaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ftxtDtaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConsultarPedido))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cliente"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CPF Cliente");

        try {
            ftxtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCPFCliente.setEnabled(false);

        btnConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarCliente.setEnabled(false);
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        txtNomeCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ftxtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCliente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarCliente)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(ftxtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Vendedor"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CPF Vendedor");

        try {
            ftxtCPFVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCPFVendedor.setEnabled(false);

        btnConsultarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarVendedor.setEnabled(false);
        btnConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedorActionPerformed(evt);
            }
        });

        txtNomeVendedor.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftxtCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeVendedor)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarVendedor)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ftxtCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do Pedido"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Código do Produto");

        txtCodigoProduto.setEnabled(false);

        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarProduto.setEnabled(false);
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        txtDescricao.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Qtde. Vendida");

        txtQtdeVendida.setEnabled(false);

        btnAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.setEnabled(false);
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        btnRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnRemoverItem.setText("Remover Item");
        btnRemoverItem.setEnabled(false);
        btnRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverItemActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde. Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setShowHorizontalLines(false);
        tblItem.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblItem);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Valor Total do Pedido");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Quantidade de Itens do Pedido ");

        txtValorTotalPedido.setEnabled(false);

        txtQtdeItensPedido.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeVendida)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarItem)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverItem)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdeItensPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarProduto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverItem)
                    .addComponent(btnAdicionarItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQtdeItensPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        btnAlterarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterarPedido.setText("Alterar");
        btnAlterarPedido.setEnabled(false);
        btnAlterarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPedidoActionPerformed(evt);
            }
        });

        btnIncluirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluirPedido.setText("Incluir");
        btnIncluirPedido.setEnabled(false);
        btnIncluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPedidoActionPerformed(evt);
            }
        });

        btnExcluirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluirPedido.setText("Excluir");
        btnExcluirPedido.setEnabled(false);
        btnExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPedidoActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIncluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarPedido)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirPedido)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)
                        .addGap(53, 53, 53))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarPedido, btnExcluirPedido, btnIncluirPedido, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirPedido)
                    .addComponent(btnAlterarPedido)
                    .addComponent(btnExcluirPedido)
                    .addComponent(btnSair))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPedidoActionPerformed

    private void btnIncluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPedidoActionPerformed
        daoPedido.inserir(pedido);
        
        cliente = daoCliente.consultar(pedido.getCliente().getCpf());
        cliente.setLimiteDisp(pedido.getCliente().getLimiteDisp());
        daoCliente.alterar(cliente);
        
        for (int i = 0; i < modTblItem.getRowCount(); i++) {
            itemPedido = new ItemPedido(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()), Integer.parseInt(modTblItem.getValueAt(i, 3).toString()));
            produto = daoProduto.consultar(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()));
            itemPedido.setPedido(pedido);
            itemPedido.setProduto(produto);
            daoProduto.alterar(itemPedido.getProduto());
            daoItemPedido.inserir(itemPedido);
        }
 
        btnConsultarPedido.setEnabled(true);
        txtNumeroPedido.setEnabled(true);
        txtNumeroPedido.setText("");
        ftxtDtaPedido.setText("");
        ftxtCPFCliente.setText("");
        txtNomeCliente.setText("");
        ftxtCPFVendedor.setText("");
        txtNomeVendedor.setText("");
        txtCodigoProduto.setText("");
        txtDescricao.setText("");
        txtQtdeVendida.setText("");
        modTblItem.setRowCount(0);
        txtQtdeItensPedido.setText("");
        txtValorTotalPedido.setText("");
        
        txtCodigoProduto.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
        txtQtdeVendida.setEnabled(false);
        btnAdicionarItem.setEnabled(false);
        btnRemoverItem.setEnabled(false);
        btnIncluirPedido.setEnabled(false);
        btnAlterarPedido.setEnabled(false);
        btnExcluirPedido.setEnabled(false);
    }//GEN-LAST:event_btnIncluirPedidoActionPerformed

    private void btnAlterarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPedidoActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0) {
            
            daoPedido.alterar(pedido);
            cliente = daoCliente.consultar(pedido.getCliente().getCpf());
            cliente.setLimiteDisp(pedido.getCliente().getLimiteDisp());
            daoCliente.alterar(cliente);

            for (int i = 0; i < modTblItem.getRowCount(); i++) { 
                itemPedido = new ItemPedido(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()), Integer.parseInt(modTblItem.getValueAt(i, 3).toString()));
                produto = daoProduto.consultar(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()));
                itemPedido.setPedido(pedido);
                itemPedido.setProduto(produto);
                if ( daoItemPedido.consultar(pedido.getNumero()).contains(itemPedido)) {
                    itemPedido.getProduto().setQtdeDisponivel(produto.getQtdeDisponivel() + (2 * itemPedido.getQtdeVendida()));
                    daoProduto.alterar(itemPedido.getProduto());
                }
            }

            daoItemPedido.excluir(pedido);

            for (int i = 0; i < modTblItem.getRowCount(); i++) {
                itemPedido = new ItemPedido(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()), Integer.parseInt(modTblItem.getValueAt(i, 3).toString()));
                produto = daoProduto.consultar(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()));
                itemPedido.setPedido(pedido);
                itemPedido.setProduto(produto);
                daoProduto.alterar(itemPedido.getProduto());
                daoItemPedido.inserir(itemPedido);

            }

            btnConsultarPedido.setEnabled(true);
            txtNumeroPedido.setEnabled(true);
            txtNumeroPedido.setText("");
            ftxtDtaPedido.setText("");
            ftxtCPFCliente.setText("");
            txtNomeCliente.setText("");
            ftxtCPFVendedor.setText("");
            txtNomeVendedor.setText("");
            txtCodigoProduto.setText("");
            txtDescricao.setText("");
            txtQtdeVendida.setText("");
            modTblItem.setRowCount(0);
            txtQtdeItensPedido.setText("");
            txtValorTotalPedido.setText("");

            txtCodigoProduto.setEnabled(false);
            btnConsultarProduto.setEnabled(false);
            txtQtdeVendida.setEnabled(false);
            btnAdicionarItem.setEnabled(false);
            btnRemoverItem.setEnabled(false);
            btnIncluirPedido.setEnabled(false);
            btnAlterarPedido.setEnabled(false);
            btnExcluirPedido.setEnabled(false);

        }
    }//GEN-LAST:event_btnAlterarPedidoActionPerformed

    private void btnExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPedidoActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?")== 0) {
            
            cliente = daoCliente.consultar(pedido.getCliente().getCpf());
            ValorTotalPedido = Double.parseDouble(txtValorTotalPedido.getText());
            for (int i = 0; i < modTblItem.getRowCount(); i++) {
                itemPedido = new ItemPedido(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()), Integer.parseInt(modTblItem.getValueAt(i, 3).toString()));
                produto = daoProduto.consultar(Integer.parseInt(modTblItem.getValueAt(i, 0).toString()));
                itemPedido.setPedido(pedido);
                itemPedido.setProduto(produto);
                itemPedido.getProduto().setQtdeDisponivel(produto.getQtdeDisponivel() + (2 * itemPedido.getQtdeVendida()));
                daoProduto.alterar(itemPedido.getProduto());
            }
            daoItemPedido.excluir(pedido);
            cliente.setLimiteDisp(pedido.getCliente().getLimiteDisp() + ValorTotalPedido); //Retornando o valor para o lim disp
            daoCliente.alterar(cliente);
            daoPedido.excluir(pedido);

            btnConsultarPedido.setEnabled(true);
            txtNumeroPedido.setEnabled(true);
            txtNumeroPedido.setText("");
            ftxtDtaPedido.setText("");
            ftxtCPFCliente.setText("");
            txtNomeCliente.setText("");
            ftxtCPFVendedor.setText("");
            txtNomeVendedor.setText("");
            txtCodigoProduto.setText("");
            txtDescricao.setText("");
            txtQtdeVendida.setText("");
            modTblItem.setRowCount(0);
            txtQtdeItensPedido.setText("");
            txtValorTotalPedido.setText("");

            txtCodigoProduto.setEnabled(false);
            btnConsultarProduto.setEnabled(false);
            txtQtdeVendida.setEnabled(false);
            btnAdicionarItem.setEnabled(false);
            btnRemoverItem.setEnabled(false);
            btnIncluirPedido.setEnabled(false);
            btnAlterarPedido.setEnabled(false);
            btnExcluirPedido.setEnabled(false);

        }
    }//GEN-LAST:event_btnExcluirPedidoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
        pedido = null;
        try {
            Integer.parseInt(txtNumeroPedido.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um Numero válido.", "Aviso", JOptionPane.ERROR_MESSAGE);
            txtNumeroPedido.requestFocus(true);
        }
        pedido = daoPedido.consultar(Integer.parseInt(txtNumeroPedido.getText()));
        
        if ( pedido == null ) {
            
            txtNumeroPedido.setEnabled(false);
            btnConsultarPedido.setEnabled(false);
            ftxtDtaPedido.setEnabled(true);
            ftxtDtaPedido.requestFocus(true);
            btnIncluirPedido.setEnabled(false);
            btnAlterarPedido.setEnabled(false);
            btnExcluirPedido.setEnabled(false);
            
        } else {
            ValorTotalPedido = 0;
            array = daoItemPedido.consultar(pedido.getNumero());
            for (int i = 0; i < array.size(); i++) {
                pedido.addItemPedido(array.get(i));
            }
            pedido.setCliente(daoCliente.consultar(cpfC));
            pedido.setVendedor(daoVendedor.consultar(cpfV));
            txtNomeCliente.setText(pedido.getCliente().getNome());
            txtNomeVendedor.setText(pedido.getVendedor().getNome());
            ftxtDtaPedido.setText(FormataData(pedido.getDataEmissaoPedido()));
            ftxtCPFCliente.setText(pedido.getCliente().getCpf());
            ftxtCPFVendedor.setText(pedido.getVendedor().getCpf());
            
            for ( int i = 0; i < pedido.getItens().size(); i++ ) {
                String Linha[] = {
                    String.valueOf(pedido.getItens().get(i).getProduto().getCodigo()),
                    pedido.getItens().get(i).getProduto().getDescricao(),
                    String.valueOf(pedido.getItens().get(i).getProduto().getPrecoUnit()),
                    String.valueOf(pedido.getItens().get(i).getQtdeVendida()),
                    String.valueOf((pedido.getItens().get(i).getProduto().getPrecoUnit()) * (pedido.getItens().get(i).getQtdeVendida()))
                };
                modTblItem.addRow(Linha);
                ValorTotalPedido += Double.parseDouble((String) modTblItem.getValueAt(modTblItem.getRowCount()-1, 4));
            }
            QtdeItens = modTblItem.getRowCount();
            txtQtdeItensPedido.setText(String.valueOf(QtdeItens));
            txtValorTotalPedido.setText(String.valueOf(ValorTotalPedido));
            
            txtNumeroPedido.setEnabled(false);
            btnConsultarPedido.setEnabled(false);
            ftxtCPFCliente.setEnabled(false);
            ftxtCPFVendedor.setEnabled(false);
            btnConsultarCliente.setEnabled(false);
            btnConsultarVendedor.setEnabled(false);
            txtCodigoProduto.setEnabled(true);
            btnConsultarProduto.setEnabled(true);
            txtQtdeVendida.setEnabled(true);
            if (txtDescricao.getText().compareTo("") == 0) {
                btnAdicionarItem.setEnabled(false);
            } else {
                btnAdicionarItem.setEnabled(true);
            }
            if (modTblItem.getRowCount() == 0) {
                btnRemoverItem.setEnabled(false);
            } else {
                btnRemoverItem.setEnabled(true);
            }
            btnAlterarPedido.setEnabled(true);
            btnExcluirPedido.setEnabled(true);
            btnIncluirPedido.setEnabled(false);
        }
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed

    private String FormataData (String Data) {
        String data = Data.substring(0, 10).replaceAll("\\D", "/");
        String[] s = data.split("/");
        String novaData = s[2]+"/"+s[1]+"/"+s[0];
        return(novaData);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //conexao = new Conexao("BD1613005","BD1613005");
        conexao = new Conexao("system", "sorvete12");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        //conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
        daoCliente = new DaoCliente(conexao.conectar());
        daoVendedor = new DaoVendedor(conexao.conectar());
        daoPedido = new DaoPedido(conexao.conectar());
        daoItemPedido = new DaoItemPedido(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void ftxtDtaPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtDtaPedidoFocusLost
        //Validação data
        df.setLenient(false);
        try {
            df.parse(ftxtDtaPedido.getText());
            ftxtDtaPedido.setEnabled(false);
            ftxtCPFCliente.setEnabled(true);
            ftxtCPFCliente.requestFocus();
            btnConsultarCliente.setEnabled(true);
            pedido = new Pedido(Integer.parseInt(txtNumeroPedido.getText()), ftxtDtaPedido.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Digite uma data válida", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtDtaPedido.requestFocus(true);
        }
    }//GEN-LAST:event_ftxtDtaPedidoFocusLost

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        cpfC = ftxtCPFCliente.getText().replaceAll("\\D", "");
        cliente = null;
        if (ValidaIguais(cpfC)) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCPFCliente.requestFocus(true);
        } else if (!ValidaDigitos(cpfC)) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCPFCliente.requestFocus(true);
        } else { //CPF Válido
            
            cliente = daoCliente.consultar(cpfC);
            
            if ( cliente == null) { 
                JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Aviso", JOptionPane.ERROR_MESSAGE);
                ftxtCPFCliente.requestFocus(true);
            } else {
                
                ftxtCPFCliente.setEnabled(false);
                txtNomeCliente.setText(cliente.getNome());
                pedido.setCliente(cliente);
                btnConsultarCliente.setEnabled(false);
                ftxtCPFVendedor.setEnabled(true);
                ftxtCPFVendedor.requestFocus(true);
                btnConsultarVendedor.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedorActionPerformed
        cpfV = ftxtCPFVendedor.getText().replaceAll("\\D", "");
        vendedor = null;
        if (ValidaIguais(cpfV)) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCPFVendedor.requestFocus(true);
        } else if (!ValidaDigitos(cpfV)) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCPFVendedor.requestFocus(true);
        } else { //CPF Válido
            
            vendedor = daoVendedor.consultar(cpfV);
            
            if ( vendedor == null) { 
                JOptionPane.showMessageDialog(null, "Vendedor não encontrado", "Aviso", JOptionPane.ERROR_MESSAGE);
                ftxtCPFVendedor.requestFocus(true);
            } else {
                ftxtCPFVendedor.setEnabled(false);
                txtNomeVendedor.setText(vendedor.getNome());
                pedido.setVendedor(vendedor);
                btnConsultarVendedor.setEnabled(false);
                txtCodigoProduto.setEnabled(true);
                txtCodigoProduto.requestFocus(true);
                btnConsultarProduto.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarVendedorActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        produto = null;
        try {
            Integer.parseInt(txtCodigoProduto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um código numérico inteiro.");
            txtCodigoProduto.requestFocus(true);
        }
        produto = daoProduto.consultar(Integer.parseInt(txtCodigoProduto.getText()));
        
        if ( produto == null ) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado", "Aviso", JOptionPane.ERROR_MESSAGE);
            txtCodigoProduto.requestFocus(true);
        } else {
            txtDescricao.setText(produto.getDescricao());
            txtQtdeVendida.setEnabled(true);
            btnAdicionarItem.setEnabled(true);
            btnRemoverItem.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        
        if (txtQtdeVendida.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Digite uma Quantidade Vendida", "Aviso", JOptionPane.ERROR_MESSAGE);
            txtQtdeVendida.requestFocus(true);
        } else if ((Integer.parseInt(txtQtdeVendida.getText())) < 1) {
            JOptionPane.showMessageDialog(null, "A Quantidade vendida deve ser maior que 0", "Aviso", JOptionPane.ERROR_MESSAGE);
            txtQtdeVendida.requestFocus(true);
        } else {
            if (produto.getQtdeDisponivel() < Integer.parseInt(txtQtdeVendida.getText())) {
                JOptionPane.showMessageDialog(null, "A Quantidade informada é superior a Quantidade Disponível em Estoque", "Aviso", JOptionPane.ERROR_MESSAGE);
                txtQtdeVendida.requestFocus(true);
            } else {
                itemPedido = new ItemPedido(Integer.parseInt(txtCodigoProduto.getText()), Integer.parseInt(txtQtdeVendida.getText()));
                itemPedido.setProduto(produto);
                if ((itemPedido.getQtdeVendida() * produto.getPrecoUnit()) > pedido.getCliente().getLimiteDisp()) {
                    JOptionPane.showMessageDialog(null, "O SubTotal é superior ao Limite Disponível do Cliente", "Aviso", JOptionPane.ERROR_MESSAGE);
                    txtQtdeVendida.requestFocus(true);
                } else {
                    
                    
                    pedido.addItemPedido(itemPedido);
                    String Linha[] = {
                        String.valueOf(produto.getCodigo()),
                        produto.getDescricao(),
                        String.valueOf(produto.getPrecoUnit()),
                        String.valueOf(itemPedido.getQtdeVendida()),
                        String.valueOf(produto.getPrecoUnit() * itemPedido.getQtdeVendida())
                    };
                modTblItem.addRow(Linha);
                ValorTotalPedido += Double.parseDouble((String) modTblItem.getValueAt(modTblItem.getRowCount()-1, 4));
                if(modTblItem.getRowCount() == 1) {
                    btnIncluirPedido.setEnabled(true);
                }
                }
                txtValorTotalPedido.setText(String.valueOf(ValorTotalPedido));
                txtQtdeItensPedido.setText(String.valueOf(modTblItem.getRowCount()));
            }
        }
    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void btnRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverItemActionPerformed
        if (tblItem.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            ValorTotalPedido = Double.parseDouble(txtValorTotalPedido.getText());
            ValorTotalPedido -= Double.parseDouble((String) modTblItem.getValueAt(tblItem.getSelectedRow(), 4));
            pedido.getCliente().setLimiteDisp(pedido.getCliente().getLimiteDisp() + Double.parseDouble((String) modTblItem.getValueAt(tblItem.getSelectedRow(), 4)));
            itemPedido = new ItemPedido(Integer.parseInt(modTblItem.getValueAt(tblItem.getSelectedRow(), 0).toString()), Integer.parseInt(modTblItem.getValueAt(tblItem.getSelectedRow(), 3).toString()));
            produto = daoProduto.consultar(Integer.parseInt(modTblItem.getValueAt(tblItem.getSelectedRow(), 0).toString()));
            itemPedido.setProduto(produto);
            itemPedido.getProduto().setQtdeDisponivel(produto.getQtdeDisponivel() + (2 * itemPedido.getQtdeVendida()));
            daoProduto.alterar(itemPedido.getProduto());
            modTblItem.removeRow(tblItem.getSelectedRow());
            txtValorTotalPedido.setText(String.valueOf(ValorTotalPedido));
            txtQtdeItensPedido.setText(String.valueOf(modTblItem.getRowCount()));
        }
    }//GEN-LAST:event_btnRemoverItemActionPerformed

    private boolean ValidaDigitos(String cpf) {
        int soma1 = 0;
        int soma2 = 0;
        int digito1;
        int digito2;
        //Validação 1 digito
        for (int i = 0; i < 9; i++) {
            soma1 += (Integer.parseInt(cpf.substring(i, i+1))) * (i+1);
        }
        
        digito1 = soma1%11;
        
        if (digito1 == 10) digito1 = 0;
        if(cpf.substring(9,10).equals(String.valueOf(digito1))){
            
            //Validação 2 digito
             int cont = 11;
            for (int i = 0; i < 10; i++) {
            soma2 += (Integer.parseInt(cpf.substring(i, i+1))) * cont;
            cont--;
            }
            digito2 = (soma2*10)%11;
            if (digito2 == 10) digito2 = 0;
            if(cpf.substring(10).equals(String.valueOf(digito2))){
                return true;
            }   
        }
        return false;
    }
    private boolean ValidaIguais(String cpf) {
        char comparar = cpf.toCharArray()[0];
        for(char l: cpf.toCharArray()) {
            if (comparar != l) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnAlterarPedido;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnConsultarVendedor;
    private javax.swing.JButton btnExcluirPedido;
    private javax.swing.JButton btnIncluirPedido;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtCPFCliente;
    private javax.swing.JFormattedTextField ftxtCPFVendedor;
    private javax.swing.JFormattedTextField ftxtDtaPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtQtdeItensPedido;
    private javax.swing.JTextField txtQtdeVendida;
    private javax.swing.JTextField txtValorTotalPedido;
    // End of variables declaration//GEN-END:variables
    private DaoPedido daoPedido = null;
    private DaoProduto daoProduto = null;
    private DaoCliente daoCliente = null;
    private DaoVendedor daoVendedor = null;
    private DaoItemPedido daoItemPedido = null;
    private Conexao conexao = null;
    private Pedido pedido = null;
    private ItemPedido itemPedido = null;
    private Cliente cliente = null;
    private Vendedor vendedor = null;
    private Produto produto = null;
    private DefaultTableModel modTblItem;
    private double ValorTotalPedido = 0;
    private int QtdeItens = 0;
    private DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
    private String cpfC;
    private String cpfV;
    private ArrayList<ItemPedido> array;
}