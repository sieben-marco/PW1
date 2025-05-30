package manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro implements Serializable {  
	private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivro;
	private String  titulo;
	private int anoPublicacao;
    private String editora;
    @ManyToMany(mappedBy="livros")
    private List<Autor> autores;
        
    public Livro() {}
	public Livro(String titulo, int anoPublicacao, String editora) {
		super();
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
	}
	public Long getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoPublicacao;
		result = prime * result + ((editora == null) ? 0 : editora.hashCode());
		result = prime * result + ((idLivro == null) ? 0 : idLivro.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (anoPublicacao != other.anoPublicacao)
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (idLivro == null) {
			if (other.idLivro != null)
				return false;
		} else if (!idLivro.equals(other.idLivro))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	/*@Override
	public String toString() {
		String aux = "";
		for (Autor autor : autores) {
			aux += autor.toString() + "\n";
		}
		return "Livro [idLivro=" + idLivro + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + ", editora="
				+ editora + ", autores =" + aux +"]";
	}*/
    
}
