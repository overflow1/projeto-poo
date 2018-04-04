package fatec.poo.control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Vendedor;

public class DaoVendedor {
    
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO TBVendedor(CPF,Nome,Endereco,Cidade,CEP,UF,"
                    + "TelefoneDDD,TelefoneNumero,SalarioBase,Comissao) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
            
            ps.execute();
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Vendedor vendedor) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TBVendedor SET Nome = ?, Endereco = ?, Cidade = ?, CEP = ?, UF = ?,"
                    + "TelefoneDDD = ?, TelefoneNumero = ?, SalarioBase = ?, Comissao = ? "
                    + "WHERE CPF = ?");
            
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
            ps.setString(10, vendedor.getCpf());
            
            ps.execute();
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Vendedor consultar (String CPF) {
        Vendedor v = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM TBVendedor WHERE CPF = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true) {
                v = new Vendedor(CPF, rs.getString("Nome"), rs.getDouble("SalarioBase"));
                v.setEndereco(rs.getString("Endereco"));
                v.setCidade(rs.getString("Cidade"));
                v.setCep(rs.getString("CEP"));
                v.setUf(rs.getString("UF"));
                v.setDdd(rs.getString("TelefoneDDD"));
                v.setTelefone(rs.getString("TelefoneNumero"));
                v.setSalarioBase(rs.getDouble("SalarioBase"));
                v.setComissao(rs.getDouble("Comissao"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(v);
    }
    
    public void excluir(Vendedor vendedor) {
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM TBVendedor WHERE CPF = ?");
            
            ps.setString(1, vendedor.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
