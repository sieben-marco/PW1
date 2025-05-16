
public final class ProdutoPerecivel extends Produto {
    private String dataValidade;
    public static final double TAXA_DESCONTO = 0.1;
    
    public ProdutoPerecivel() {}

    public ProdutoPerecivel(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() { return dataValidade; }
    
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    @Override
    public String toString() {
        return super.toString() + " - Validade: " + dataValidade;
    }
}
