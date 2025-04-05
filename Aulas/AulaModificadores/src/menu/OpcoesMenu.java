package menu;

public enum OpcoesMenu {
	CADASTRAR ("Cadastrar cliente e suas contas"),
	LISTAR_TOTAL_CLIENTES ("Listar o número total de clientes"),
	PESQUISAR_NOME_CLIENTE ("Pesquisar cliente usando o nome"),
	PESQUISAR_CPF_CLIENTE ("Pesquisar cliente usando o CPF"),
	LISTAR_TODOS ("Listar todos os clientes");
	
	String descricao;
	
	OpcoesMenu(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
