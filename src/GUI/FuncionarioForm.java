/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Beans.FuncionarioBeans;
import Controller.ClienteController;
import Utilitarios.CorretorDatas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author welingtonmarquezini
 */
public class FuncionarioForm extends javax.swing.JInternalFrame {
    /**
     * Creates new form ClienteForm
     */
    MaskFormatter formatoTel;
    SimpleDateFormat formatoData;
    Date dataAtual;
    FuncionarioBeans funcionarioBeans;
    ClienteController clienteController;
    CorretorDatas corretorDatas;
    DefaultTableModel modeloTabela;
    
    public FuncionarioForm() {
        initComponents();
        txt_codigo.setEnabled(false);
        habilitarCampos(false);

        funcionarioBeans = new FuncionarioBeans();
        clienteController = new ClienteController();
        modeloTabela = (DefaultTableModel) tb_clientes.getModel(); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") // linhas do formulario
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        cb_cargo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Funcionários");

        jLabel1.setText("Código:");

        txt_codigo.setEditable(false);

        jLabel2.setText("Nome:");

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel3.setText("Cargo:");

        jLabel6.setText("Data:");

        txt_data.setEditable(false);

        jLabel7.setText("Buscar:");

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Rua", "Bairro", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_clientesMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_clientes);

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir.png"))); // NOI18N
        btn_novo.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_novo.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btn_cadastrar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_cadastrar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar.png"))); // NOI18N
        btn_editar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_editar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Cargo", "Atendente", "Motoboy(Entregadores)", "Caixa", "Chapeiro", "Gerente", "Administrador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_buscar)
                    .addComponent(txt_nome))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setBounds(50, 0, 499, 488);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        habilitarCampos(true);
        txt_codigo.setText(clienteController.controleDeCódigo());
        formatoData = new SimpleDateFormat("dd/MM/yyyy");
        dataAtual = new Date();
        txt_data.setText(formatoData.format(dataAtual));
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        popularClienteBeans();
        //clienteController.verificarDados(funcionarioBeans);// verifica se está tudo preenchido
        LimparCampos();
        txt_codigo.setText(clienteController.controleDeCódigo());
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        // TODO add your handling code here: enquanto estou digitando o texto
        modeloTabela.setNumRows(0);//posicao
        clienteController.controlePesquisa(txt_buscar.getText(), modeloTabela);
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void tb_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_clientesMouseClicked

    private void tb_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMousePressed
        // TODO add your handling code here: quando da click na tabela
        habilitarCampos(true);
        /*funcionarioBeans = clienteController.controlePreencherCampos(
                Integer.parseInt(modeloTabela.getValueAt( 
                        tb_clientes.getSelectedRow(),0
                    ).toString()
                )
        );//pegar o click e fazer a consulta*/
        txt_codigo.setText(funcionarioBeans.getCodigo() + "");
        txt_nome.setText(funcionarioBeans.getNome());
        
        txt_data.setText(funcionarioBeans.getDataCad());
    }//GEN-LAST:event_tb_clientesMousePressed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        popularClienteBeans();
        //clienteController.verificarDadosEditar(funcionarioBeans);// verifica se está tudo preenchido
        LimparCampos();
        txt_buscar.setText("");
        habilitarCampos(false);        
    }//GEN-LAST:event_btn_editarActionPerformed

    final void habilitarCampos(boolean valor){
        txt_nome.setEnabled(valor);
        txt_data.setEnabled(valor);
        cb_cargo.setEnabled(valor);
    }
    
    final void popularClienteBeans() {//void não retorna nenhum metodo
        funcionarioBeans.setNome(txt_nome.getText());
        funcionarioBeans.setDataCad(txt_data.getText());
        funcionarioBeans.setCargo(cb_cargo.getSelectedItem().toString());
    }
    
    final void LimparCampos(){
        txt_codigo.setText("");
        txt_nome.setText("");
        txt_data.setText("");
        cb_cargo.setSelectedIndex(0);//combo box
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
