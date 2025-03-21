import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua", "casa", 900);
        Autor autor = new Autor("Marco", endereco, 999);
        Livro l1 = new Livro("algum", autor, 777);
        Livro l2 = new Livro("algum2", autor, 457);
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        Usuario usuario = new Usuario("Lari", "123445677",livros);
        Usuario usuario2 = new Usuario("Marco", "123445678",livros);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        Biblioteca biblioteca = new Biblioteca("sao paulo", livros, usuarios);

        System.out.println(endereco);
        System.out.println();
        System.out.println(autor);
        System.out.println();
        System.out.println(l1);
        System.out.println();
        System.out.println(usuario);
        System.out.println();
        System.out.println(biblioteca);
    }
}
