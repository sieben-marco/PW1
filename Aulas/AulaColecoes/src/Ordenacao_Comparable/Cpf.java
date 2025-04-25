package Ordenacao_Comparable;

import java.util.Objects;

public class Cpf implements Comparable<Cpf> {
	private long numero;
	private int digito;
	
	public int compareTo(Cpf cpf) {
		// compara o número
//		if (numero > cpf.getNumero()) return 1;
//		if (numero < cpf.getNumero()) return -1;
		// compara o dígito
//		if (digito > cpf.getDigito()) return 1;
//		if (digito < cpf.getDigito()) return -1;
//		return 0;

		// compara o número
		int compare = Long.compare(numero, cpf.getNumero());
		if (compare != 0) return compare;
		// compara o dígito
		return Integer.compare(digito, cpf.getDigito());
	}
	
	public Cpf(long numero, int digito) {
		this.digito = digito;
		this.numero = numero;
	}
	
	public int getDigito() {
		return this.digito;
	}
	
	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	public long getNumero() {
		return this.numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Ordenacao_Comparable.Cpf [digito=" + this.digito + ", numero=" + this.numero + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cpf cpf = (Cpf)o;
		return numero == cpf.numero && digito == cpf.digito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, digito);
	}
}
