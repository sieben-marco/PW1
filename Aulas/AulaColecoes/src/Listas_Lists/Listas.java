package Listas_Lists;

import java.util.LinkedList;

public class Listas {
	public static void main(String[] args) {
		 // cria
		 LinkedList<String> lista = new LinkedList<>();
		 
		 // adiciona
		 lista.add("um");
		 lista.add("dois");
		 lista.add("Sorvete");
		 lista.add("Café");
		 lista.add("cinco");
		 
		 // primeira
		 System.out.println(lista.getFirst());
		 
		 // sorvete
		 System.out.println(lista.contains("Sorvete"));
		 
		 // size
		 System.out.println(lista.size());
		 
		 // remove ultimo
		 lista.removeLast();
		 
		 // size
		 System.out.println(lista.size());
		 
		 // indice cafe
		 System.out.println(lista.lastIndexOf("Café"));
		 
		 // remove todos
		 lista.removeAll(lista); // usado para diferenças de conjuntos, remove todos os elementos da lista passados no parametro
		 lista.clear(); // remove todos os elementos da lista
		 
		// size
		System.out.println(lista.size());
	}
}
