package testes;

import clientes.Cliente;
import documentos.Cpf;

public class Teste {

	public static void main(String[] args) {
		
		Cpf c1 = new Cpf();
		Cpf c2 = new Cpf(1234456, 89);
		System.out.println(c1.toString());

		//O que é criado na linha abaixo?
		//um vetor com 3 posições para armazenar objetos do
		//tipo Cliente
		Cliente vetor[] = new Cliente[3];
		//Qual o valor dos atributo do objeto abaixo?
		//null, null
		vetor[0] = new Cliente(); // tudo null
		//Qual o valor dos atributo do objeto abaixo?
		//Fulano, 0 , 0
		//vetor[1] = new Cliente("Fulano", c1); // existe cpf 0-0
		//Qual o valor dos atributo do objeto abaixo?
		//Beltrano, 1234456 , 89
		//vetor[2] = new Cliente("Beltrano", c2); // existe cpf com valor
		//Qual das linhas abaixo é recomendo usar?
		//Justifique sua resposta
		//linha 30 -> método de classe deve ser chamado pela classe
		System.out.println(Cliente.getContador()); // 3 - chamada recomendada, pois é método de classe
		System.out.println(vetor[1].getContador()); // 3
		
	}

}
