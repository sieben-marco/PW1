package contas;

import clientes.Cliente;

public class ContaEspecial extends Conta {

	private double limite;
	
	public ContaEspecial() {}

	public ContaEspecial(double saldo, int numero, Cliente cliente, double limite) {
		super(saldo, numero, cliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return super.toString() + "limite = " + limite;
	}
	
	@Override
	public double debita(double valor) {
		if (super.getSaldo() + this.getLimite() <= valor) {
			super.setSaldo(getSaldo() - valor);
		}
		return super.getSaldo();
	}
	
}
