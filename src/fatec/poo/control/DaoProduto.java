package fatec.poo.control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Produto;

public class DaoProduto {

        private Connection conn;

        public DaoProduto(Connection conn) {
             this.conn = conn;
        }

        public void inserir(Produto produto) {
            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("INSERT INTO tbproduto(CodigoProduto, Descricao, QtdeDisponivel, PrecoUnit, EstoqueMinimo)"
                                           + " VALUES(?,?,?,?,?)");
                ps.setInt(1, produto.getCodigo());
                ps.setString(2, produto.getDescricao());
                ps.setInt(3, produto.getQtdeDisponivel());
                ps.setDouble(4, produto.getPrecoUnit());
                ps.setInt(5, produto.getEstoqueMin());

                ps.execute();
            } catch (SQLException ex) {
                 System.out.println(ex.toString());   
            }
        }

        public void alterar(Produto produto) {
            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("UPDATE tbproduto SET Descricao = ?, QtdeDisponivel = ?, PrecoUnit = ?, EstoqueMinimo = ? " +
                                                     "WHERE CodigoProduto = ?");
                
                ps.setString(1, produto.getDescricao());
                ps.setInt(2, produto.getQtdeDisponivel());
                ps.setDouble(3, produto.getPrecoUnit());
                ps.setInt(4, produto.getEstoqueMin());
                ps.setInt(5, produto.getCodigo());

                ps.execute();
            } catch (SQLException ex) {
                 System.out.println(ex.toString());   
            }
        }

         public  Produto consultar (int CodigoProduto) {
            Produto p = null;

            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("SELECT * FROM TBProduto WHERE " +
                                                     "CodigoProduto = ?");

                ps.setInt(1, CodigoProduto);
                ResultSet rs = ps.executeQuery();

                if (rs.next() == true) {
                    p = new Produto (CodigoProduto, rs.getString("Descricao"));
                    p.setQtdeDisponivel(rs.getInt("QtdeDisponivel"));
                    p.setEstoqueMin(rs.getInt("EstoqueMinimo"));
                    p.setPrecoUnit(rs.getDouble("PrecoUnit"));
                }
            }
            catch (SQLException ex) { 
                 System.out.println(ex.toString());   
            }
            return (p);
        }    

         public void excluir(Produto produto) {
            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("DELETE FROM TBProduto WHERE CodigoProduto = ?");

                ps.setInt(1, produto.getCodigo());

                ps.execute();
            } catch (SQLException ex) {
                 System.out.println(ex.toString());   
            }
        }
    
}
