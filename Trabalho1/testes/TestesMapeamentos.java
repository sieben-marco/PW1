package testes;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import dao.ArtigoDAO;
import submissoes.Artigo;
import util.Situacao;

public class TestesMapeamentos {

	public static void main(String[] args) {
		Artigo art1 = new Artigo(new Date(), new Date(), "RESUMO 1", "ARQUIVO 1");
		art1.setSituacao(Situacao.ENVIADA);
		art1.setPalavrasChave(new HashSet<String>(
				Set.of(
					"palavra1", "palavra2", "palavra3", "palavra4"
				)));
		
		Artigo art2 = new Artigo(new Date(), new Date(), "RESUMO 2", "ARQUIVO 2");
		art2.setSituacao(Situacao.EM_ANALISE);
		art2.setPalavrasChave(new HashSet<String>(
				Set.of(
					"palavra5", "palavra6", "palavra7", "palavra8"
				)));
		
		ArtigoDAO artigoDAO = new ArtigoDAO();
		
		System.out.print("Salvar Artigo: ");
		if (artigoDAO.salvar(art1))
			System.out.println("Artigo criado com sucesso!");
		
		System.out.print("Salvar Artigo: ");
		if (artigoDAO.salvar(art2))
			System.out.println("Artigo criado com sucesso!");
		
		/*
		 * System.out.println("Listar Artigos:"); for (Artigo a : artigoDAO.buscar())
		 * System.out.println(a.toString()); //artigoDAO.buscar().forEach(a ->
		 * System.out.println(a.toString()));
		 * 
		 * System.out.println("Obter Artigo por Id:");
		 * System.out.println(artigoDAO.buscarId(art2.getId()).toString());
		 * 
		 * System.out.print("Remover Artigo:"); if (artigoDAO.remover(art2.getId()))
		 * System.out.println("Artigo removido com sucesso!");
		 * 
		 * System.out.println("Listar Artigos:"); for (Artigo a : artigoDAO.buscar())
		 * System.out.println(a.toString()); //artigoDAO.buscar().forEach(a ->
		 * System.out.println(a.toString()));
		 * 
		 * System.out.print("Atualizar Artigo:"); art1.setResumo("RESUMO ATUALIZADO");
		 * if (artigoDAO.atualizar(art1))
		 * System.out.println("Artigo atualizado com sucesso!");
		 * 
		 * System.out.println("Listar Artigos:"); for (Artigo a : artigoDAO.buscar())
		 * System.out.println(a.toString()); //artigoDAO.buscar().forEach(a ->
		 * System.out.println(a.toString()));
		 */	}

}
