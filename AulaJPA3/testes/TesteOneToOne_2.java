package testes;

import onetoone.*;
import dao.*;

public class TesteOneToOne_2 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("logradouro1", "complemento1");
		
		Telefone telefone = new Telefone();
		telefone.setDdd(51);
		telefone.setNumero(33445566);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fulano");
		pessoa.setEndereco(endereco);
		pessoa.setTelefone(telefone);
		telefone.setPessoa(pessoa);
		PessoaDAO objPessoaDAO = new PessoaDAO();
		if (objPessoaDAO.salvar(pessoa))
			System.out.print("Pessoa foi salva!!!");

		System.out.println("\nLISTAR TODOS");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());

		
	}
}
