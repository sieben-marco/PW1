package agenda;

public enum OpcoesMenu {
	CAD_PESSOA ("Cadastrar Pessoa"),
	PESQ_ALL_ORD ("Listar todos ordenados"), 
	LIST_TOTAL("Listar o número total de contatos"), 
	PESQ_PESSOA ("Pesquisar Pessoa"),
	SAIR("Sair");
	
	private String descricao;
	
	private OpcoesMenu(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
