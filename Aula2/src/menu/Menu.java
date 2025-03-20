package menu;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import contatos.Telefone;
import pessoas.Proprietario;
import veiculos.*;

public class Menu {
	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<>();

		do {

			switch (mostrarMenu()) {
				case 1:
					veiculos.add(criarVeiculo());
					break;
				case 2:
					pesquisarPorAno(veiculos);
					break;
				case 3:
					pesquisarPorPlaca(veiculos);
					break;
				case 4:
					pesquisarPorNomeProprietario(veiculos);
					break;
				case 5:
					pesquisarPorNumeroPropritario(veiculos);
					break;
				case 6:
					listarVeiculos(veiculos);
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Saindo...");
					System.exit(0);
					break;
			}
		} while (true);
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

	/**
	 * Cria uma lista de telefones
	 * 
	 * @return Uma lista de telefones
	 */
	private static ArrayList<Telefone> criarTelefones() {
		ArrayList<Telefone> telefones = new ArrayList<>();
		int qtdTelefones = Integer.parseInt(JOptionPane.showInputDialog("Quantos telefones o proprietario possui?"));

		for (int i = 0; i < qtdTelefones; i++) {
			int ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o DDD do proprietario:"));
			long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número do proprietario:"));

			telefones.add(new Telefone(ddd, numero));
		}

		return telefones;
	}

	/**
	 * Cria um veículo
	 * 
	 * @return Um veículo
	 */
	private static Veiculo criarVeiculo() {
		JOptionPane.showMessageDialog(null, "=== Cadastro de Veículo ===");

		String nomeProprietario = JOptionPane.showInputDialog("Informe o nome do proprietário:");

		ArrayList<Telefone> telefones = criarTelefones();

		Proprietario proprietario = new Proprietario(nomeProprietario, telefones);

		String marca = JOptionPane.showInputDialog("Informe a marca do veículo: ");

		String modelo = JOptionPane.showInputDialog("Informe o modelo do veículo:");

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo:"));

		String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de veículo: \n  1. Carro\n  2. Moto\nEscolha uma opção:"));

		Veiculo veiculo;
		if (tipo == 1) {
			int numPortas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas do carro:"));

			veiculo = new Carro(marca, ano, modelo, placa, proprietario, numPortas);
		} else {
			int cilindradas = Integer.parseInt(JOptionPane.showInputDialog("Informe as cilindradas da moto:"));

			veiculo = new Moto(marca, ano, modelo, placa, proprietario, cilindradas);
		}

		return veiculo;
	}

	/**
	 * Pesquisa os veículos pelo ano
	 * 
	 * @param veiculos Um lista de veículos
	 */
	private static void pesquisarPorAno(ArrayList<Veiculo> veiculos) {
		if (veiculos == null || veiculos.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano que deseja pesquisar:"));

		for (var veiculo : veiculos) {
			if (veiculo != null && veiculo.getAno() == ano) {
				JOptionPane.showMessageDialog(null, veiculo);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
		}
	}

	/**
	 * Pesquisa os veículos pela placa
	 * 
	 * @param veiculos Lista de veículos
	 */
	private static void pesquisarPorPlaca(ArrayList<Veiculo> veiculos) {
		if (veiculos == null || veiculos.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		String placa = JOptionPane.showInputDialog("Informe a placa que deseja pesquisar:");

		for (var veiculo : veiculos) {
			if (veiculo != null && veiculo.getPlaca().equals(placa)) {
				JOptionPane.showMessageDialog(null, veiculo);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
		}
	}

	/**
	 * Pesquisa os veículos pelo nome do proprietário
	 * 
	 * @param veiculos Lista de veículos
	 */
	private static void pesquisarPorNomeProprietario(ArrayList<Veiculo> veiculos) {
		if (veiculos == null || veiculos.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		String nome = JOptionPane.showInputDialog("Informe o nome do proprietário que deseja pesquisar:");

		for (var veiculo : veiculos) {
			if (veiculo != null && veiculo
					.getProprietario()
					.getNome()
					.equals(nome)) {
				JOptionPane.showMessageDialog(null, veiculo);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
		}
	}

	/**
	 * Pesquisa os veículos pelo número de telefone do proprietário
	 * 
	 * @param veiculos Lista de veículos
	 */
	private static void pesquisarPorNumeroPropritario(ArrayList<Veiculo> veiculos) {
		if (veiculos == null || veiculos.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		int ddd = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o DDD do número do proprietário que deseja pesquisar:"));
		long numero = Long
				.parseLong(JOptionPane.showInputDialog("Informe o número do proprietário que deseja pesquisar:"));

		for (Veiculo veiculo : veiculos) {
			if (veiculo != null && veiculo
					.getProprietario()
					.getTelefones()
					.contains(new Telefone(ddd, numero))) {
				JOptionPane.showMessageDialog(null, veiculos);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
		}
	}

	/**
	 * Lista todos os veículos cadastrados
	 * 
	 * @param veiculos Lista de veículos
	 */
	private static void listarVeiculos(ArrayList<Veiculo> veiculos) {
		if (veiculos == null || veiculos.isEmpty()) {
			listaEstaVazia();
			return;
		}

		for (int i = 0; i < veiculos.size(); i++) {
			if (veiculos.get(i) != null) {
				JOptionPane.showMessageDialog(null, "= Veículo " + (i + 1) + "=\n" + veiculos.get(i));
			}
		}
	}

	/**
	 * Exibe mensagem de lista vazia
	 */
	private static void listaEstaVazia() {
		JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado");
	}
}
