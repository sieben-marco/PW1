package submissoes;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.Objects;

import javax.persistence.*;

import util.Situacao;

@Entity
public class Artigo extends Submissao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String resumo;
	private String arquivo;
	@ElementCollection
	private Set<String> palavrasChave;

	public Artigo() {
		super();
	}

	public Artigo(Date data, Date horario, String resumo, String arquivo) {
		super(data, horario);
		this.resumo = resumo;
		this.arquivo = arquivo;
	}
	
	public Artigo(Date data, Date horario, Situacao situacao, String resumo, String arquivo) {
		super(data, horario, situacao);
		this.resumo = resumo;
		this.arquivo = arquivo;
	}

	public Artigo(Date data, Date horario, Situacao situacao, String resumo, String arquivo,
			Set<String> palavrasChave) {
		super(data, horario, situacao);
		this.resumo = resumo;
		this.arquivo = arquivo;
		this.palavrasChave = palavrasChave;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public Set<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(Set<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(arquivo, palavrasChave, resumo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artigo other = (Artigo) obj;
		return Objects.equals(arquivo, other.arquivo) && Objects.equals(palavrasChave, other.palavrasChave)
				&& Objects.equals(resumo, other.resumo);
	}

	/*
	 * @Override public String toString() { return "Artigo [resumo=" + resumo +
	 * ", arquivo=" + arquivo + ", palavrasChave=" + palavrasChave + "]"; }
	 */
}
