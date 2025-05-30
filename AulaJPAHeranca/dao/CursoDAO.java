package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.singletable.*;

public class CursoDAO {

	private EntityManager em;

	public CursoDAO() {
	}

	public boolean salvar(Curso entity) {
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

	public boolean atualizar(Curso entity) {
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
			Curso entity = em.find(Curso.class, id);
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

	public Curso buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Curso entity = em.find(Curso.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Curso> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Curso> query = em.createQuery("SELECT obj FROM Curso obj", Curso.class);
			List<Curso> cursos = query.getResultList();
			return cursos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
