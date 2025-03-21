import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> acervo; // Ocorrencia de composição
    private ArrayList<Usuario> usuarios; // Ocorrencia de composição

    public Biblioteca() { }

    public Biblioteca(String nome, ArrayList<Livro> acervo, ArrayList<Usuario> usuarios) {
        this.nome = nome;
        this.acervo = acervo;
        this.usuarios = usuarios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getAcervo() {
        return this.acervo;
    }

    public void setAcervo(ArrayList<Livro> acervo) {
        this.acervo = acervo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    private String mostrarAcervo() {
        if (this.acervo == null) return "Sem livros emprestados\n";

        String aux = "";
        for (Livro livro : this.acervo) {
            if (livro == null) continue;
            aux += livro.toString() + "\n";
        }
        return aux;
    }

    private String mostrarUsuarios() {
        if (this.usuarios == null) return "Sem usarios cadastrados\n";

        String aux = "";
        for (Usuario usuario : this.usuarios) {
            if (usuario == null) continue;
            aux += usuario.toString() + "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        return "---" +
                "\nBiblioteca:" +
                "\nnome = " + this.nome +
                "\n" + this.mostrarAcervo() +
                "\n" + this.mostrarUsuarios();
    }
}
