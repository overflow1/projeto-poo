package fatec.poo.control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Cliente;
public class DaoCliente {
    
    
    private Connection conn;
    
    public DaoCliente(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO TBCliente(CPF, Nome, Endereco, Cidade, CEP, UF,"
                    + " TelefoneDDD, TelefoneNumero, LimiteCredito, LimiteDisponivel) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCred());
            ps.setDouble(10, cliente.getLimiteDisp());
            
            ps.execute();
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Cliente cliente) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TBCliente SET Nome = ?, Endereco = ?, Cidade = ?, CEP = ?, UF = ?,"
                    + "TelefoneDDD = ?, TelefoneNumero = ?, LimiteCredito = ?, LimiteDisponivel = ? "
                    + "WHERE CPF = ?");
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setDouble(9, cliente.getLimiteDisp());
            ps.setString(10, cliente.getCpf());
            
            ps.execute();
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Cliente consultar (String CPF) {
        Cliente c = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM TBCliente WHERE CPF = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true) {
                c = new Cliente(CPF, rs.getString("Nome"), rs.getDouble("LimiteCredito"));
                c.setEndereco(rs.getString("Endereco"));
                c.setCidade(rs.getString("Cidade"));
                c.setCep(rs.getString("CEP"));
                c.setUf(rs.getString("UF"));
                c.setDdd(rs.getString("TelefoneDDD"));
                c.setTelefone(rs.getString("TelefoneNumero"));
                c.setLimiteCred(rs.getDouble("LimiteCredito"));
                c.setLimiteDisp(rs.getDouble("LimiteDisponivel"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(c);
    }
    
    public void excluir(Cliente cliente) {
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM TBCliente WHERE CPF = ?");
            
            ps.setString(1, cliente.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
