package testes;
import onetoone.*;
import dao.*;

public class TesteOneToOne_1 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("logradouro1", "complemento1");
		Pessoa pessoa = new Pessoa("Fulano", endereco);
		PessoaDAO objPessoaDAO = new PessoaDAO();
		if (objPessoaDAO.salvar(pessoa))
			System.out.print("Pessoa foi salva!!!");

		System.out.println("\nLISTAR TODOS");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());

		
	}
}
