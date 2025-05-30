package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.joined.*;

public class AlunoDAO {

	private EntityManager em;

	public AlunoDAO() {
	}

	public boolean salvar(Aluno entity) {
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

	public boolean atualizar(Aluno entity) {
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
			Aluno entity = em.find(Aluno.class, id);
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

	public Pessoa buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Aluno entity = em.find(Aluno.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Aluno> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Aluno> query = em.createQuery("SELECT obj FROM Aluno obj", Aluno.class);
			List<Aluno> alunos = query.getResultList();
			return alunos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
