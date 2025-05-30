package submissoes;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

import util.Situacao;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Submissao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date horario;
	
	@Enumerated(EnumType.STRING)
	private Situacao situacao;

	public Submissao() {}

	public Submissao(Date data, Date horario) {
		this.data = data;
		this.horario = horario;
	}

	public Submissao(Date data, Date horario, Situacao situacao) {
		this.data = data;
		this.horario = horario;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, horario, id, situacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Submissao other = (Submissao) obj;
		return Objects.equals(data, other.data) && Objects.equals(horario, other.horario) && id == other.id
				&& situacao == other.situacao;
	}

	/*
	 * @Override public String toString() { return "Submissao [id=" + id + ", data="
	 * + data + ", horario=" + horario + ", situacao=" + situacao + "]"; }
	 */	
}
