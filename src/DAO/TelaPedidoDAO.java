/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilitarios.Conexao;
import Utilitarios.CorretorDatas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author welingtonmarquezini
 */
public class TelaPedidoDAO {

    //contrutor
    public TelaPedidoDAO() {
    }
    
    //metodos
    public void MostrarPedidos(DefaultTableModel modelo){
    
         try {
            String SQLPesquisa = "SELECT `ped_cod`,`cli_nome`, `ped_data`, `ped_hora`, `ent_nome` ,`ped_status` FROM ((`pedidos` INNER JOIN `clientes`ON `pedidos`.`ped_cli_cod` = `clientes`.`cli_cod`) INNER JOIN `entregador`ON `pedidos`.`ped-ent-cod`=`entregador`.`ent_cod`) order by `ped_cod` desc;";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLPesquisa);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {// se pesquisa encontrou algo
                modelo.addRow(new Object[] {
                    rs.getString("ped_cod"),
                    rs.getString("cli_nome"),
                    CorretorDatas.ConverterParaJava(rs.getString("ped_data")),
                    rs.getString("ped_hora"),
                    rs.getString("ent_nome"),
                    rs.getString("ped_status")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
              "Erro ao consultar Banco de Dados", "Erro", 0,new ImageIcon("imagens/ico_sair.png"));//mensagem de erro
        }
    }
    
    
    public void alterarPedido(String status,int num_pedido){
        try {
            String SQL = 
            "UPDATE `pedidos` SET `ped_status`=? WHERE `ped_cod`=?";
            PreparedStatement st;
            st = Conexao.getConnection().prepareStatement(SQL);
            st.setString(1,status);
            st.setInt(2,num_pedido);
            st.execute();
            Conexao.getConnection().commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
              "Erro ao Inserir no Banco de Dados", "Erro", 0,new ImageIcon("imagens/ico_sair.png"));//mensagem de erro
        }
            
    }
    
    public List<String> consultarPedido(int num_pedido){
        List<String> list = new ArrayList<>();
        try {
            String SQL = "SELECT `car_descricao`,`item_quantidade` FROM `item` "
                    + "INNER JOIN `cardapio` ON `item`.`item_car_cod`=`cardapio`.`car_cod` WHERE `item_ped_cod`=?;";
            PreparedStatement st;
            st = Conexao.getConnection().prepareStatement(SQL);
            st.setInt(1,num_pedido);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
               list.add(" " + rs.getString("car_descricao"));
               list.add(" --> QTD: " + rs.getString("item_quantidade"));
            }
            return list;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
              "Erro ao Inserir no Banco de Dados", "Erro", 0,new ImageIcon("imagens/ico_sair.png"));//mensagem de erro
        }
        return null;
    }
    
    public double consultarPedidoValor(int num_pedido){
        double valor = 0; 
        try {
            String SQL = "SELECT `ped_total` FROM `pedidos` WHERE `ped_cod`=?;";
            PreparedStatement st;
            st = Conexao.getConnection().prepareStatement(SQL);
            st.setInt(1,num_pedido);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {//somente uma retorno             
               valor = Double.parseDouble(rs.getString("ped_total"));
            }
            return valor;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
              "Erro ao Inserir no Banco de Dados", "Erro", 0,new ImageIcon("imagens/ico_sair.png"));//mensagem de erro
        }
        return 0;
    }
}
