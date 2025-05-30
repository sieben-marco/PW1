package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import manytomany.Autor;

public class AutorDAO {

	private EntityManager em;

	public AutorDAO() {
	}

	public boolean salvar(Autor entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Autor entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public boolean remover(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Autor entity = em.find(Autor.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public Autor buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Autor entity = em.find(Autor.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Autor> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Autor> query = em.createQuery("SELECT obj FROM Autor obj", Autor.class);
			List<Autor> alunos = query.getResultList();
			return alunos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
