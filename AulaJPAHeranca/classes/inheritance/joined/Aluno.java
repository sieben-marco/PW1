package classes.inheritance.joined;

import javax.persistence.*;
import java.io.*;

@Entity
@PrimaryKeyJoinColumn(name = "idAluno", referencedColumnName = "idPessoa")
public class Aluno extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private long matricula;

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

/*	@Override
	public String toString() {
		return super.toString() + "Aluno [matricula=" + matricula + "]";
	}
*/
}
