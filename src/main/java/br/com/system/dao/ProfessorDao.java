package br.com.system.dao;

import java.util.List;

import br.com.system.model.Professor;

public class ProfessorDao extends Dao<Professor>{

	public Professor buscarId(int id) {
		em.getTransaction().begin();
		Professor s = em.find(Professor.class, id);
		em.getTransaction().commit();
		return s;
	}
	
	public List<Professor> listarTodos(){
		em.getTransaction().begin();
		List<Professor> lista = (List<Professor>) em.createQuery("SELECT P FROM Professor P", Professor.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
