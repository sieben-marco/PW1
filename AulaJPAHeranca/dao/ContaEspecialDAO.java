package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.tableperclass.*;

public class ContaEspecialDAO {

	private EntityManager em;

	public ContaEspecialDAO() {
	}

	public boolean salvar(ContaEspecial entity) {
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

	public boolean atualizar(ContaEspecial entity) {
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
			ContaEspecial entity = em.find(ContaEspecial.class, id);
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

	public ContaEspecial buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			ContaEspecial entity = em.find(ContaEspecial.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<ContaEspecial> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<ContaEspecial> query = em.createQuery("SELECT obj FROM ContaEspecial obj", ContaEspecial.class);
			List<ContaEspecial> contas = query.getResultList();
			return contas;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
