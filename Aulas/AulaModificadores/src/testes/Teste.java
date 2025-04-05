package testes;

import clientes.Cliente;
import documentos.Cpf;

public class Teste {

	public static void main(String[] args) {
		
		Cpf c1 = new Cpf();
		Cpf c2 = new Cpf(1234456, 89);
		System.out.println(c1.toString());
		
		Cliente vetor[] = new Cliente[3];
		vetor[0] = new Cliente(); // tudo null
		vetor[1] = new Cliente("Fulano", c1); // existe cpf 0-0
		vetor[2] = new Cliente("Beltrano", c2); // existe cpf com valor
		System.out.println(Cliente.getContador()); // chamada recomendada, pois é método de classe
		System.out.println(vetor[1].getContador());
		
	}

}
