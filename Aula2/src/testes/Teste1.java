package testes;

import pessoas.Proprietario;
import veiculos.Veiculo;

public class Teste1 {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();

		Veiculo v2 = new Veiculo(
				"Fiat", 2008,
				"Uno", "IXS2432",
				new Proprietario());
				
		System.out.println(v1.toString());
		System.out.println(v2.toString());

	}
}
