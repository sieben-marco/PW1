package agenda;

import javax.swing.JOptionPane;

import contatos.Telefone;
import pessoas.Pessoa;

public class MenuAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();

		do {

			switch (mostrarMenu()) {
				case 1:
					criarPessoa(agenda);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, agenda.listaTodos());
					break;
				case 3:
					totalPessoas(agenda);
					break;
				case 4:
					// TODO: concluir
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Saindo...");
					System.exit(0);
					break;
			}
		} while (true);

	}

	/**
	 * Verifica o total de pessoas
	 *
	 * @param agenda Conjunto de pessoas
	 */
	private static void totalPessoas(Agenda agenda) {
		if (agenda.totalizar() == 0)
			JOptionPane.showMessageDialog(null, "Agenda vazia!");
		else
			JOptionPane.showMessageDialog(null, "Total de contatos: " + agenda.totalizar());
	}
	
	/**
	 * Cria uma lista de telefones
	 * 
	 * @return Uma lista de telefones
	 */
	private static Telefone criarTelefone() {
		int ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o DDD do proprietario:"));
		long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número do proprietario:"));

		return new Telefone(ddd, numero);
	}
	
	/**
	 * Cria um veículo
	 * 
	 * @return Um veículo
	 */
	private static void criarPessoa(Agenda agenda) {
		JOptionPane.showMessageDialog(null, "=== Cadastro de Pessoa ===");

		String nome = JOptionPane.showInputDialog("Informe o nome da pessoa:");
		
		String cpf = JOptionPane.showInputDialog("Informe o CPF da pessoa:");

		Telefone telefone = criarTelefone();
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa:"));

		Pessoa pessoa = new Pessoa(nome, cpf, telefone, idade);
		
		agenda.cadastrar(pessoa);
	}
	
	/**
	 * Monta o menu
	 * 
	 * @return A opção escolhida
	 */
	public static int mostrarMenu() {
		String menu = "";

		for (OpcoesMenu opcao : OpcoesMenu.values()) {
			menu += (opcao.ordinal() + 1) + " - " + opcao.getDescricao() + "\n";
		}

		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
