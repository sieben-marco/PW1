
public abstract class Produto implements Comparable<Produto> {
    protected String nome;
    protected double preco;
    
    public Produto() {}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.getNome());
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
