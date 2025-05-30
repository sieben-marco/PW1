package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import submissoes.Submissao;
import util.JPAUtil;

public class SubmissaoDAO {
	private EntityManager em;
	
	public boolean salvar(Submissao submissao) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(submissao);
			em.getTransaction().commit();
			return true;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return false;
		}
	}
	
	public boolean atualizar(Submissao submissao) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(submissao);
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
			Submissao submissao = em.find(Submissao.class, id);
			em.remove(submissao);
			em.getTransaction().commit();
			return true;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return false;
		}
	}
	
	public Submissao buscarId(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Submissao submissao = em.find(Submissao.class, id);
			em.getTransaction().commit();
			return submissao;
		}
		catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			return null;
		}
	}
	
	public List<Submissao> buscar() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Submissao> query = em.createQuery("SELECT obj FROM Submissao obj", Submissao.class);
			List<Submissao> submissoes = query.getResultList();
			return submissoes;
		}
		catch (RuntimeException e) {
			return null;
		}
	}
}
