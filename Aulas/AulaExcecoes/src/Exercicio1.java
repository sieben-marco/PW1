public class Exercicio1 {
	public static void main(String[] args) {
		Cpf cpfs[] = new Cpf[5];
		cpfs[0] = new Cpf();
		cpfs[2] = new Cpf(55667788, 98);

		// para o loop ao encontrar uma exceção
		try {
			for (int i = 0; i < cpfs.length; i++) { // index 1 é null
				// if (cpfs[i] != null)
				System.out.println(cpfs[i].toString());
			}
		} catch (NullPointerException e) {
			System.out.println("posição do vetor nula");
		} catch (Exception e) {
			System.out.println("exceção desconhecida");
		}

		// executa todo o loop
		for (int i = 0; i < cpfs.length; i++) { // index 1 é null
			try {
				System.out.println(cpfs[i].toString());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("posição do vetor nula");
			} catch (Exception e) {
				System.out.println("exceção desconhecida");
			}
		}
	}
}