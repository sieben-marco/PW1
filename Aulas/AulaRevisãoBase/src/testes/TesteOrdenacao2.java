package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import contatos.Telefone;
import pessoas.ComparatorNome;
import pessoas.Pessoa;

public class TesteOrdenacao2 {

public static void main(String[] args) {
		
		ArrayList<Pessoa> lista = new ArrayList<>(
			List.of(
				new Pessoa("fulana", "123", new Telefone(), 23),
				new Pessoa("ciclano", "125", null, 87),
				new Pessoa("beltrano", "124", new Telefone(51, 55667787), 80)
			)
		);
		
		lista.forEach(pessoa -> {
			if (pessoa != null) System.out.println(pessoa.toString());
			System.out.println("-------");
		});
		
		System.out.println("\n================\n");
		ComparatorNome comparator = new ComparatorNome();
		Collections.sort(lista, comparator);
		
		lista.forEach(pessoa -> {
			if (pessoa != null) System.out.println(pessoa.toString());
			System.out.println("-------");
		});
		
	}
	
}
