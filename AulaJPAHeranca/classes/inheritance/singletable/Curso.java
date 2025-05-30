package classes.inheritance.singletable;

import javax.persistence.*;
import java.io.*;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 3, 
   discriminatorType = DiscriminatorType.STRING)
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
	@Column(name = "tipo", updatable=false)
    private String tipo;
    private String nome;
    private double cargaHorariaTotal;
    
    public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}
	public void setCargaHorariaTotal(double cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cargaHorariaTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((idCurso == null) ? 0 : idCurso.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Curso other = (Curso) obj;
		if (Double.doubleToLongBits(cargaHorariaTotal) != Double.doubleToLongBits(other.cargaHorariaTotal))
			return false;
		if (idCurso == null) {
			if (other.idCurso != null)
				return false;
		} else if (!idCurso.equals(other.idCurso))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
/*	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", tipo=" + tipo + ", nome=" + nome + ", cargaHorariaTotal="
				+ cargaHorariaTotal + "]";
	}
  */  
	
    
}
