
public class GerenciamentoDeEstoque {
    public static void main(String[] args) {
    	ProdutoPerecivel p1 = new ProdutoPerecivel("Leite", 1, "12/2025");
    	ProdutoPerecivel p2 = new ProdutoPerecivel("Arroz", 1, "12/2025");
    	ProdutoPerecivel p3 = new ProdutoPerecivel("Feijão", 1, "12/2025");
        Estoque<ProdutoPerecivel> estoque = new Estoque<>();
                
        System.out.println("==== Adicionar ====");
        estoque.adicionar(p1);
        estoque.adicionar(p2);        
        System.out.println(estoque.listar());
        
        System.out.println("==== Remover ====");
        try {
        	estoque.remover(p1);
	        System.out.println(estoque.listar());
	        estoque.remover(p3);
	        System.out.println(estoque.listar());
        }
        catch (ProdutoNaoEncontradoException e) {
        	System.out.println("==== Exceção ====");
        	System.out.println(e.getMessage());
        }
        
    }
}
