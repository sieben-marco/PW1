package classes.inheritance.joined;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Pessoa  implements Serializable { 
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPessoa")
    private Long idPessoa;
    private String nome;
    
    public Pessoa(){}
    public Pessoa(Long idPessoa, String nome) {
        this.idPessoa = idPessoa;
        this.nome = nome;
    }
   
    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setId(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

   /* @Override
	public String toString() {
		return "Pessoa [id=" + idPessoa + ", nome=" + nome + "]";
	}*/
	public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idPessoa);
        hash = 53 * hash + Objects.hashCode(this.nome);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idPessoa, other.idPessoa)) {
            return false;
        }
        return true;
    }

}

