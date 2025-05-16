
public class ProdutoNaoEncontradoException extends Exception {

	public ProdutoNaoEncontradoException(String nome) { super("Produto não encontrado: " + nome); }
	
}
