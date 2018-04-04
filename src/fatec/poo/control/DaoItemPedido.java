package fatec.poo.control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import java.util.ArrayList;

public class DaoItemPedido {
    
    private Connection conn;
    private ArrayList<ItemPedido> array;
    private DaoProduto daoProduto;
    private DaoPedido daoPedido;

    public DaoItemPedido(Connection conn) {
        this.conn = conn;
        daoProduto = new DaoProduto(conn);
        daoPedido = new DaoPedido(conn);
        array = new ArrayList<ItemPedido>();
    }
    
    public void inserir(ItemPedido ip) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TBITEMPEDIDO(NumeroPedido, CodigoProduto, QtdeVendida)" +
                                        "VALUES (?,?,?)");
            ps.setInt(1, ip.getPedido().getNumero());
            ps.setInt(2, ip.getProduto().getCodigo());
            ps.setInt(3, ip.getQtdeVendida());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ArrayList<ItemPedido> consultar(int Numero) {
        ItemPedido ip = null;
        array.clear();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TBITEMPEDIDO WHERE NumeroPedido = ?");
            
            ps.setInt(1, Numero);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                ip = new ItemPedido(rs.getInt("CodigoProduto"), rs.getInt("QtdeVendida"));
                ip.setProduto(daoProduto.consultar(rs.getInt("CodigoProduto")));
                ip.setPedido(daoPedido.consultar(rs.getInt("NumeroPedido")));
                array.add(ip);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(array);
    }
    
    
    
    public void excluir(Pedido p) {
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM TBITEMPEDIDO WHERE NumeroPedido = ?");
            
            ps.setInt(1, p.getNumero());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
