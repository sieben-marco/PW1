package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.tableperclass.*;

public class ContaCorrenteDAO {

	private EntityManager em;

	public ContaCorrenteDAO() {
	}

	public boolean salvar(ContaCorrente entity) {
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

	public boolean atualizar(ContaCorrente entity) {
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
			ContaCorrente entity = em.find(ContaCorrente.class, id);
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

	public ContaCorrente buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			ContaCorrente entity = em.find(ContaCorrente.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<ContaCorrente> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<ContaCorrente> query = em.createQuery("SELECT obj FROM ContaCorrente obj", ContaCorrente.class);
			List<ContaCorrente> contas = query.getResultList();
			return contas;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
