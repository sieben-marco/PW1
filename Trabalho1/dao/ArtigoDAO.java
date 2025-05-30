package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import submissoes.Artigo;
import util.JPAUtil;

public class ArtigoDAO {
	private EntityManager em;
		
	public boolean salvar(Artigo artigo) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(artigo);
			em.getTransaction().commit();
			return true;
		}
		catch (RuntimeException e) {
			if (em != null && em.getTransaction().isActive())
				em.getTransaction().rollback();
			return false;
		}
	}
	
	public boolean atualizar(Artigo artigo) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(artigo);
			em.getTransaction().commit();
			return true;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return false;
		}
	}
	
	public boolean remover(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Artigo arquivo = em.find(Artigo.class, id);
			em.remove(arquivo);
			em.getTransaction().commit();
			return true;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return false;
		}
	}
	
	public Artigo buscarId(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Artigo arquivo = em.find(Artigo.class, id);
			em.getTransaction().commit();
			return arquivo;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return null;
		}
	}
	
	public List<Artigo> buscar() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Artigo> query = em.createQuery("SELECT obj FROM Submissao obj", Artigo.class);
			List<Artigo> artigos = query.getResultList();
			return artigos;
		}
		catch (RuntimeException e) {
			return null;
		}
	}
}
