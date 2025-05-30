package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.singletable.*;

public class CursoPosGraducaoDAO {

	private EntityManager em;

	public CursoPosGraducaoDAO() {
	}

	public boolean salvar(CursoPosGraduacao entity) {
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

	public boolean atualizar(CursoPosGraduacao entity) {
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
			CursoPosGraduacao entity = em.find(CursoPosGraduacao.class, id);
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

	public CursoPosGraduacao buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			CursoPosGraduacao entity = em.find(CursoPosGraduacao.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<CursoPosGraduacao> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<CursoPosGraduacao> query = em.createQuery("SELECT obj FROM CursoPosGraduacao obj", CursoPosGraduacao.class);
			List<CursoPosGraduacao> cursos = query.getResultList();
			return cursos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
