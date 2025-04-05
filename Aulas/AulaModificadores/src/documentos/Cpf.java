package documentos;

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
	
	public int compareTo(Cpf cpf) {
		if (digito > cpf.getNumero()) return 1;
		if (digito < cpf.getNumero()) return -1;
		return 0;
	}
}