package contas;

import clientes.Cliente;

public abstract class Conta {

	private double saldo;
	private int numero;
	private Cliente cliente;
	
	public Conta() {}

	public Conta(double saldo, int numero, Cliente cliente) {
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double credita(double valor) {
		this.setSaldo(getSaldo() + valor); 
		return this.getSaldo();
	}
	
	public abstract double debita(double valor);

	@Override
	public String toString() {
		return saldo + " - " + numero + " - " + this.cliente;
	}
	
}
