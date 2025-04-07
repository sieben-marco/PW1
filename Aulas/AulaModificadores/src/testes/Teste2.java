package testes;

import contas.Conta;
import contas.ContaEspecial;

public class Teste2 {

	public static void main(String[] args) {
		
		Conta[] c = new Conta[2];
		//c[0] = new Conta(); // Erro, pois Conta é uma classe abstrata
		c[1] = new ContaEspecial();
		for (Conta conta : c) {
			if (conta != null)
				System.out.println(conta.toString());
		}
	}
	
}
