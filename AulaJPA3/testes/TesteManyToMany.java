package testes;

import manytomany.*;
import dao.*;
import java.util.*;

public class TesteManyToMany {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Java 11", 2019, "Editora X" );
		Livro livro2 = new Livro("JPA", 2029, "Editora Y" );
		List<Livro> livros = new LinkedList<>();
		livros.add(livro1);
		livros.add(livro2);
		
		Autor autor = new Autor();
		autor.setNome("Fulano");
		autor.setLivros(livros);
		if (new AutorDAO().salvar(autor))
			System.out.print("Autor e livros salvos!!!");
	}
}
