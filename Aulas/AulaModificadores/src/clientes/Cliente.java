package clientes;

import documentos.Cpf;

public class Cliente {

	private static int contador; // variável de classe
	
	private String nome;
	private Cpf cpf;
	
	public Cliente() { this(null, null); }

	public Cliente(String nome, Cpf cpf) {
		this.nome = nome;
		this.cpf = cpf;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return nome + cpf != null ? cpf.toString() : "Cpf inválido!";
	}
	
}
