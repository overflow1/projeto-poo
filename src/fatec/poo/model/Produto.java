package fatec.poo.model;

public class Produto {
    
    private int codigo;
    private String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public int hashCode() {
        //deve ser o mesmo resultado para um mesmo objeto, não pode ser aleatório
        return this.codigo;
    }

    @Override
    public boolean equals(Object obj) {
        //se nao forem objetos da mesma classe sao objetos diferentes
        if(!(obj instanceof Produto)) return false; 

        //se forem o mesmo objeto, retorna true
        if(obj == this) return true;

        // aqui o cast é seguro por causa do teste feito acima
        Produto produto = (Produto) obj; 

        //aqui você compara a seu gosto, o ideal é comparar atributo por atributo
        return this.codigo == produto.getCodigo()&&
                this.descricao.equals(produto.getDescricao()) &&
                this.estoqueMin == produto.getEstoqueMin() &&
                this.precoUnit == produto.getPrecoUnit() &&
                this.qtdeDisponivel == produto.getQtdeDisponivel();
    }
    
}
