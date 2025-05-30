package util;

public enum Situacao {
	ENVIADA (1, "Enviada"),
	EM_ANALISE (2, "Em análise"),
	ACEITA (3, "Aceita"),
	REJEITADA (4, "Rejeitada");
	
	private final int id;
	private final String descricao;
	
	private Situacao(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
