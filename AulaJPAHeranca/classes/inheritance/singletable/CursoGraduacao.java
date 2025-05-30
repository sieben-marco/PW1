package classes.inheritance.singletable;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "CG")
public class CursoGraduacao extends Curso implements Serializable {
	private static final long serialVersionUID = 1L;
	private double totalAtividadesComplementares;

	public double getTotalAtividadesComplementares() {
		return totalAtividadesComplementares;
	}

	public void setTotalAtividadesComplementares(double totalAtividadesComplementares) {
		this.totalAtividadesComplementares = totalAtividadesComplementares;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(totalAtividadesComplementares);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CursoGraduacao other = (CursoGraduacao) obj;
		if (Double.doubleToLongBits(totalAtividadesComplementares) != Double
				.doubleToLongBits(other.totalAtividadesComplementares))
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "CursoGraduacao{" + "id=" + super.toString() + ", totalAtividadesComplementares=" + totalAtividadesComplementares
				+ '}';
	}*/

}
