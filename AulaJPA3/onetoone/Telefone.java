package onetoone;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefone
 *
 */
@Entity
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;
    private int ddd;
    private long numero;
    @OneToOne (mappedBy = "telefone")
    private Pessoa pessoa;

	public Telefone() {
		super();
	}

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ddd;
		result = prime * result + ((idTelefone == null) ? 0 : idTelefone.hashCode());
		result = prime * result + (int) (numero ^ (numero >>> 32));
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (ddd != other.ddd)
			return false;
		if (idTelefone == null) {
			if (other.idTelefone != null)
				return false;
		} else if (!idTelefone.equals(other.idTelefone))
			return false;
		if (numero != other.numero)
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", ddd=" + ddd + ", numero=" + numero + ", pessoa=" + pessoa
				+ "]";
	}*/
	
	
   
}
