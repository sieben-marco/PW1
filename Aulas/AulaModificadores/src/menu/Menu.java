package menu;

import clientes.Cliente;
import contas.Conta;
import contas.ContaEspecial;
import documentos.Cpf;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Menu/* implements Validador*/ {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();

		do {

			switch (mostrarMenu()) {

				case 1 -> clientes.add(criarCliente());
				case 2 -> JOptionPane.showMessageDialog(null, Cliente.getContador());
				case 3 -> pesquisarNomeCliente(clientes);
				case 4 -> pesquisarCpfCliente(clientes);
				case 5 -> listarClientes(clientes);
				case 6 -> {
					JOptionPane.showMessageDialog(null, "Saindo...");
					System.exit(0);
				}

			}

		} while (true);
		
	}

	/**
	 * Mostra as opções do menu
	 * @return A opção escolhida
	 */
	public static byte mostrarMenu() {

		String menu = "";

		for (OpcoesMenu opcao : OpcoesMenu.values()) {
			menu += (opcao.ordinal() + 1) + " - " + opcao.getDescricao() + "\n";
		}

		return Byte.parseByte(JOptionPane.showInputDialog(menu));

	}

	/**
	 * Exibe mensagem de lista vazia
	 */
	public static void listaEstaVazia() {
		JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado.");
	}


	/**
	 * Cria uma lista de contas
	 * @param cliente Cliente que possui a conta
	 * @return Lista de contas
	 */
	public static List<Conta> criarContas(Cliente cliente) {
		// Contas
		byte qtdContas = Byte.parseByte(JOptionPane.showInputDialog("Quantas contas o cliente possui?"));
		List<Conta> contas = new LinkedList<>();
		for (byte i = 0; i < qtdContas; i++) {
			int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta " + (i+1)));
			contas.add(new ContaEspecial(
					Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta " + (i+1))),
					numeroConta,
					cliente,
					Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta " + (i+1)))
			));
		}

		return contas;
	}

	/**
	 * Cria um cliente
	 * @return Um cliente
	 */
	public static Cliente criarCliente() {

		String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");

		// CPF
		long numeroCpf = Long.parseLong(JOptionPane.showInputDialog("Digite o número do CPF: "));
		int digitoCpf = Integer.parseInt(JOptionPane.showInputDialog("Digite os dígitos do CPF: "));

		// Cliente sem conta
		Cliente cliente = new Cliente(
				nome,
				new Cpf(numeroCpf, digitoCpf)
		);

		List<Conta> contas = criarContas(cliente);

		// Cliente com contas
		cliente.setContas(contas);

		return cliente;

	}

	/**
	 * Pesquisa os clientes por nome
	 * @param clientes Lista de clientes
	 */
	public static void pesquisarNomeCliente(List<Cliente> clientes) {
		if (clientes == null || clientes.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");

		for (Cliente cliente : clientes) {
			if (cliente != null && cliente.getNome().equals(nomeCliente)) {
				JOptionPane.showMessageDialog(null, cliente);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
		}
	}

	/**
	 * Pesquisa os clientes por CPF
	 * @param clientes Lista de clientes
	 */
	public static void pesquisarCpfCliente(List<Cliente> clientes) {
		if (clientes == null || clientes.isEmpty()) {
			listaEstaVazia();
			return;
		}

		boolean flag = false;

		long numeroCpf = Long.parseLong(JOptionPane.showInputDialog("Informe o número do CPF do cliente:"));
		int digitoCpf = Integer.parseInt(JOptionPane.showInputDialog("Informe o digito do CPF do cliente:"));

		for (Cliente cliente : clientes) {
			if (cliente != null && cliente.getCpf().getNumero() == numeroCpf && cliente.getCpf().getDigito() == digitoCpf) {
				JOptionPane.showMessageDialog(null, cliente);
				flag = true;
			}
		}

		if (!flag) {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
		}
	}

	/**
	 * Lista todos os clientes cadastrados
	 * @param clientes Lista de clientes
	 */
	public static void listarClientes(List<Cliente> clientes) {
		if (clientes == null || clientes.isEmpty()) {
			listaEstaVazia();
			return;
		}

		for (int i = 0; i < clientes.size(); i++){
			if (clientes.get(i) != null) {
				JOptionPane.showMessageDialog(null, "= Cliente "+ (i+1) + "=\n" + clientes.get(i));
			}
		}
	}

//	public static boolean validaItem(Cpf cpf) {
//
//		if (cpf == null) return false;
//
//		char[] numero = Long.toString(cpf.getNumero()).toCharArray();
//		char[] digito = Integer.toString(cpf.getDigito()).toCharArray();
//
//		if (numero.length != 9 && digito.length != 2) return false;
//
//		for (int i = 0; i < digito.length; i++) {
//
//			short soma = 0;
//			for (int j = 0; j < numero.length; j++){
//				byte num = (byte)(numero[j] - 48);
//				soma += (short)(num * (10 + i - j));
//			}
//
//			byte resto = (byte)(11 - (soma % 11));
//
//			if (resto == 10 || resto == 11) {
//				if (digito[i] != '0') return false;
//			}
//			else if (digito[i] != (char)(resto + 48)) return false;
//
//		}
//
//		return true;
//	}
}
