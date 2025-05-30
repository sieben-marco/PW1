package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.singletable.*;

public class CursoGraducaoDAO {

	private EntityManager em;

	public CursoGraducaoDAO() {
	}

	public boolean salvar(CursoGraduacao entity) {
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

	public boolean atualizar(CursoGraduacao entity) {
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
			CursoGraduacao entity = em.find(CursoGraduacao.class, id);
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

	public CursoGraduacao buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			CursoGraduacao entity = em.find(CursoGraduacao.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<CursoGraduacao> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<CursoGraduacao> query = em.createQuery("SELECT obj FROM CursoGraducao obj", CursoGraduacao.class);
			List<CursoGraduacao> cursos = query.getResultList();
			return cursos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
