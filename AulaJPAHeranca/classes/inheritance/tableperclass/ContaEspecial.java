package classes.inheritance.tableperclass;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class ContaEspecial extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private double limite;
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(limite);
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
		ContaEspecial other = (ContaEspecial) obj;
		if (Double.doubleToLongBits(limite) != Double.doubleToLongBits(other.limite))
			return false;
		return true;
	}
	/*@Override
	public String toString() {
		return super.toString() + " ContaEspecial [limite=" + limite + "]";
	}*/
    
    

}
