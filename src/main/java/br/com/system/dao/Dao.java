package br.com.system.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.system.util.JPAUtil;

public abstract class Dao<Entidade> {
	
	EntityManager em = JPAUtil.getEntityManager();

	public Entidade salvar(Entidade e){
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		return e;
	}
	
	public Entidade alterar(Entidade e){
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		return e;
	}
	
	public boolean excluir(Entidade e){
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		return true;
	}
	
	public abstract Entidade buscar(int id);
	
	public abstract List<Entidade> listarTodos();
	
}
