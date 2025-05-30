package manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAutor;
    private String nome;
    @ManyToMany (cascade= CascadeType.PERSIST)
    @JoinTable( name="autor_rel_livro", 
                joinColumns={ @JoinColumn(name="idAutor")}, 
         inverseJoinColumns={@JoinColumn(name="idLivro")})
    private List<Livro> livros;
    
	public Long getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAutor == null) ? 0 : idAutor.hashCode());
		result = prime * result + ((livros == null) ? 0 : livros.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Autor other = (Autor) obj;
		if (idAutor == null) {
			if (other.idAutor != null)
				return false;
		} else if (!idAutor.equals(other.idAutor))
			return false;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String aux = "";
		for (Livro livro : livros) {
			aux += livro.toString() + "\n";
		}
		return "Autor [idAutor=" + idAutor + ", nome=" + nome + ", livros=" + aux + "]";
	}
   
}
