package documentos;

import java.util.Objects;

public final class Cpf implements Comparable<Cpf> {
	private long numero;
	private int digito;
	
	public Cpf() {}
	
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
		return this.numero + "-" + this.digito;
	}

	@Override
	public int compareTo(Cpf cpf) {
		// compara o número
		int compare = Long.compare(numero, cpf.getNumero());
		if (compare != 0) return compare;
		// compara o dígito
		return Integer.compare(digito, cpf.getDigito());
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