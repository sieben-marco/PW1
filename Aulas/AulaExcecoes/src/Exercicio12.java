class ProprioErro extends Exception {
	private int erro;

	ProprioErro(int erro) {
		this.erro = erro;
	}

	public String toString() {
		return ("ProprioErro[" + erro + "]");
	}
}

public class Exercicio12 {
	static void calcula(int a) throws ProprioErro {
		if (a <= 12)
			throw new ProprioErro(a);
	}

	public static void main(String args[]) {
		try {
			calcula(9);
			calcula(11);
		} catch (ProprioErro e) {
			System.out.println("Erro encontrado: " + e);
		}
	}
}
