package agenda;

// definição da interface genérica
public interface OperacoesAgenda<E> {

	// definição do método com parâmetro genérico
	public boolean cadastrar(E e);
	public String listaTodos();
	public int totalizar();
	public boolean pesquisar(E e);
	public boolean remover(E e);
	
}
