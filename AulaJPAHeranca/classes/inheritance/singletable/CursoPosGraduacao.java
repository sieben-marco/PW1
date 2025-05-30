package classes.inheritance.singletable;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "CPG")
public class CursoPosGraduacao extends Curso implements Serializable {
	private static final long serialVersionUID = 1L;
	private String area;
	private String classificacao;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.area);
		hash = 79 * hash + Objects.hashCode(this.classificacao);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CursoPosGraduacao other = (CursoPosGraduacao) obj;
		if (!Objects.equals(this.area, other.area)) {
			return false;
		}
		if (!Objects.equals(this.classificacao, other.classificacao)) {
			return false;
		}
		return true;
	}

	/*@Override
	public String toString() {
		return "CursoPosGraduacao{" + "area=" + area + ", classificacao=" + classificacao + '}';
	}*/

}
