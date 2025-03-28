package Conjuntos_Sets;

import java.util.HashSet;

public class Conjuntos {
	public static void main(String[] args) {
		// criar um conjunto usando a tabela hash
		HashSet<String> conjunto = new HashSet<>();
		
		// add
		conjunto.add("carlos");
		conjunto.add("eduardo");
		conjunto.add("josé");
		conjunto.add("marcos");
		conjunto.add("josé");
		
		// listar todo o conjunto
		for (String c : conjunto) {
			System.out.println(c);
		}
	}
}
