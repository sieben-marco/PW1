package onetoone;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Endereco
 *
 */
@Entity

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
    private String logradouro;
    private String complemento;

	public Endereco() {
		super();
	}
	

	public Endereco(String logradouro, String complemento) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
	}


	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((idEndereco == null) ? 0 : idEndereco.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
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
		Endereco other = (Endereco) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (idEndereco == null) {
			if (other.idEndereco != null)
				return false;
		} else if (!idEndereco.equals(other.idEndereco))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", complemento=" + complemento
				+ "]";
	}*/
   
}
