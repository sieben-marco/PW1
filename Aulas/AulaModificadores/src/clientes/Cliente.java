package clientes;

import contas.Conta;
import documentos.Cpf;

import java.util.List;

public class Cliente {

	private static int contador; // variável de classe
	
	private String nome;
	private Cpf cpf;
	private List<Conta> contas;
	
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

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return nome + cpf != null ? cpf.toString() : "Cpf inválido!" + this.contas;
	}
	
}
