package onetoone;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Pessoa  implements Serializable { 
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPessoa")
    private Long idPessoa;
    private String nome;
    @OneToOne (optional=false, cascade= CascadeType.PERSIST)
    @JoinColumn (name="idEndereco")
    private Endereco endereco;
    
    @OneToOne (optional=false, cascade= CascadeType.PERSIST)
    @JoinColumn (name="idTelefone")
    private Telefone telefone;
    
 	public Pessoa(){}
    public Pessoa(Long idPessoa, String nome, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa(String nome, Endereco endereco) {
    	this(-1L, nome, endereco);
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
    

    public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	/*@Override
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

