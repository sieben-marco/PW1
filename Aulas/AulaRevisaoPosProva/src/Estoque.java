
import java.util.*;

public class Estoque<T extends Produto> {
    private Set<T> produtos = new TreeSet<>();

    public void adicionar(T produto) {
        produtos.add(produto);
    }

    public void remover(T produto) throws ProdutoNaoEncontradoException {
    	boolean removido = produtos.removeIf(p -> p == produto);
        if (!removido)
        	throw new ProdutoNaoEncontradoException(produto.nome);
    }

    public String listar() {
        if (produtos.isEmpty()) {
            return "Estoque vazio.";
        }
        
        String aux = "";
        for (T obj : produtos) {
        	if (obj != null) {
        		aux += obj.toString() + "\n";
        	}
        }
        
        return aux;
    }
}
