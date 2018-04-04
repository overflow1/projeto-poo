package fatec.poo.control;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoPedido {
    
    private Connection conn;
    private DaoCliente daoCliente;
    private DaoVendedor daoVendedor;
    private ArrayList<ItemPedido> array;

    public DaoPedido(Connection conn) {
        this.conn = conn;
        daoCliente = new DaoCliente(conn);
        daoVendedor = new DaoVendedor(conn);
        array = new ArrayList<ItemPedido>();
    }
    
    public  Pedido consultar (int Numero) {
            Pedido p = null;

            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("SELECT * FROM TBPedido WHERE " +
                                                     "Numero = ?");

                ps.setInt(1, Numero);
                ResultSet rs = ps.executeQuery();

                if (rs.next() == true) {
                    p = new Pedido (Numero, rs.getString("DataPedido"));
                    p.setCliente(daoCliente.consultar(rs.getString("CPFCliente")));
                    p.setVendedor(daoVendedor.consultar(rs.getString("CPFVendedor")));
                    p.setDataPagto(rs.getString("DataPagto"));
                    p.setStatus(rs.getBoolean("Status"));
                    
                    
                }
            }
            catch (SQLException ex) { 
                 System.out.println(ex.toString());   
            }
            return (p);
    }
    
    public void inserir (Pedido p) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TBPEDIDO(Numero, CPFCliente, CPFVendedor, Status, DataPedido, DataPagto)"
                                        +   "VALUES(?,?,?,?,?,?)");
            ps.setInt(1, p.getNumero());
            ps.setString(2, p.getCliente().getCpf());
            ps.setString(3, p.getVendedor().getCpf());
            ps.setBoolean(4, p.isStatus());
            ps.setString(5, p.getDataEmissaoPedido());
            ps.setString(6, p.getDataPagto());
            
            ps.execute();
                    
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Pedido p) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TBPEDIDO SET CPFCLIENTE = ?, CPFVENDEDOR = ?, STATUS = ?, DATAPEDIDO = ?,"
                    + "DATAPAGTO = ? WHERE NUMERO = ?");
            
            ps.setString(1, p.getCliente().getCpf());
            ps.setString(2, p.getVendedor().getCpf());
            ps.setBoolean(3, p.isStatus());
            ps.setString(4, FormataData(p.getDataEmissaoPedido()));
            ps.setString(5, p.getDataPagto());
            ps.setInt(6, p.getNumero());
            
            ps.execute();
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    private String FormataData (String Data) {
        String data = Data.substring(0, 10).replaceAll("\\D", "/");
        String[] s = data.split("/");
        String novaData = s[2]+"/"+s[1]+"/"+s[0];
        return(novaData);
    }
    public void excluir(Pedido p) {
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM TBPEDIDO WHERE NUMERO = ?");
            
            ps.setInt(1, p.getNumero());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
