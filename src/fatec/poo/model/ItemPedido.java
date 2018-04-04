package fatec.poo.model;

public class ItemPedido {
    
    private int numeroItem;
    private int qtdeVendida;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(int numeroItem, int qtdeVendida) {
        this.numeroItem = numeroItem;
        this.qtdeVendida = qtdeVendida;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        this.produto.setQtdeDisponivel(produto.getQtdeDisponivel() - qtdeVendida);
    }

    public int getNumeroItem() {
        return numeroItem;
    }
    
    @Override
    public int hashCode() {
        //deve ser o mesmo resultado para um mesmo objeto, não pode ser aleatório
        return this.numeroItem;
    }
    
    @Override
    public boolean equals(Object obj) {
        //se nao forem objetos da mesma classe sao objetos diferentes
        if(!(obj instanceof ItemPedido)) return false; 

        //se forem o mesmo objeto, retorna true
        if(obj == this) return true;

        // aqui o cast é seguro por causa do teste feito acima
        ItemPedido itemPedido = (ItemPedido) obj; 

        //aqui você compara a seu gosto, o ideal é comparar atributo por atributo
        return this.numeroItem == itemPedido.getNumeroItem() &&
                this.qtdeVendida == itemPedido.getQtdeVendida() &&
                this.pedido.equals(itemPedido.getPedido()) &&
                this.produto.equals(itemPedido.getProduto());
    }   
}
