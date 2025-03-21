public class Autor extends Pessoa { // Herança: classe Autor herda a classe Pessoa
    private Endereco endereco;
    private long telefone;

    public Autor() { }

    public Autor(String nome, Endereco endereco, long telefone) {
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "---" +
                "\nAutor:" +
                "\nnome = " + this.getNome() +
                "\ntelefone = " + this.telefone +
                "\n" + this.endereco.toString();
    }
}
