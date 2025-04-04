package pessoas;

import contatos.Contato;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String cpf;
	private Contato contato;
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, Contato contato, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa \n" +
				"Nome: " + nome +
				"\nCPF: " + cpf +
				"\nIdade: " + idade +
				"\nContato:\n" + (contato != null ? contato.toString() : "Contato inválido");
	}

	@Override
	public int compareTo(Pessoa p) {
		if (idade > p.getIdade()) return 1;
		if (idade > p.getIdade()) return -1;
		return 0;
	}
	
}
