package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {
    
    private int Numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itenspedidos;

    public Pedido(int Numero, String dataEmissaoPedido) {
        this.Numero = Numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
        itenspedidos = new ArrayList<ItemPedido>();
    }

    public int getNumero() {
        return Numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void addItemPedido(ItemPedido ip) {
        itenspedidos.add(ip);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (ip.getProduto().getPrecoUnit()*ip.getQtdeVendida()));
        ip.setPedido(this);
    }
    
    public ArrayList<ItemPedido> getItens() {
        return itenspedidos;
    }
    
    @Override
    public int hashCode() {
        //deve ser o mesmo resultado para um mesmo objeto, não pode ser aleatório
        return this.Numero;
    }

    @Override
    public boolean equals(Object obj) {
        //se nao forem objetos da mesma classe sao objetos diferentes
        if(!(obj instanceof Pedido)) return false; 

        //se forem o mesmo objeto, retorna true
        if(obj == this) return true;

        // aqui o cast é seguro por causa do teste feito acima
        Pedido pedido = (Pedido) obj; 

        //aqui você compara a seu gosto, o ideal é comparar atributo por atributo
        return this.Numero == pedido.getNumero() &&
                this.dataEmissaoPedido.equals(pedido.getDataEmissaoPedido());
    }
    
}
