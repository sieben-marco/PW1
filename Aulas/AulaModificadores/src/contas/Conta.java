package contas;

public abstract class Conta {

	private double saldo;
	private int numero;
	
	public Conta() {}

	public Conta(double saldo, int numero) {
		this.saldo = saldo;
		this.numero = numero;
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
	
	public double credita(double valor) {
		this.setSaldo(getSaldo() + valor); 
		return this.getSaldo();
	}
	
	public abstract double debita(double valor);

	@Override
	public String toString() {
		return saldo + " - " + numero;
	}
	
}
