
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;
import fatec.poo.model.Produto;

public class AplicTeste {

    public static void main(String[] args) {
        
        Vendedor vend = new Vendedor("15151515","Ricardinho",1000);
        Cliente cliente =  new Cliente("13131313","Rafael", 2000);
        Produto prod = new Produto(1515,"tesoura");
        Produto prod2 = new Produto(1514,"papel");
        prod.setQtdeDisponivel(100);
        prod.setEstoqueMin(50);
        prod.setPrecoUnit(10);
        prod2.setPrecoUnit(20);
        prod2.setEstoqueMin(50);
        prod2.setQtdeDisponivel(100);
        
        ItemPedido ip = new ItemPedido(1515,50);
        ItemPedido ip2 = new ItemPedido(1514,50);
        
        Pedido pedido = new Pedido(10,"08/07/2017");
        
        vend.addPedido(pedido);
        cliente.addPedido(pedido);
        ip.setProduto(prod);
        ip2.setProduto(prod2);
        
        pedido.addItemPedido(ip);
        pedido.addItemPedido(ip2);
        
        System.out.println("Saldo Limite Disp: " + cliente.getLimiteDisp());
        System.out.println("Qtdfe disp: " + prod.getQtdeDisponivel());
        
    }
    
}
