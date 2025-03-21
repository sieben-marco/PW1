import java.util.ArrayList;

public class Usuario extends Pessoa { // Herança: classe Usuario herda a classe Pessoa
    private String cpf;
    private ArrayList<Livro> livros;

    public Usuario() { }

    public Usuario(String nome, String cpf, ArrayList<Livro> livros) {
        super(nome);
        this.cpf = cpf;
        this.livros = livros;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void emprestarLivro(Livro livro) {
        if (livro == null) return;
        if (this.livros.contains(livro)) return;

        this.livros.add(livro);
    }

    public void devolverLivro(Livro livro) {
        if (livro == null) return;

        this.livros.remove(livro);
    }

    public void ListarLivrosEmprestados() {
        if (this.livros == null) return;

        for (Livro livro : this.livros) {
            if (livro == null) continue;

            System.out.println(livro.getTitulo());
        }
    }

    private String listarLivros() {
        if (this.livros == null) return "Sem livros emprestados\n";

        String aux = "";
        for (Livro livro : this.livros) {
            if (livro == null) continue;
            aux += livro.toString() + "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        return "---" +
                "\nUsuario:" +
                "\nnome = " + this.getNome() +
                "\ncpf = " + this.cpf +
                "\n" + this.listarLivros();
    }
}
