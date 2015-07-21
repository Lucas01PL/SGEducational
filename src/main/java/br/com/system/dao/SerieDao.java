package br.com.system.dao;

import java.util.List;

import br.com.system.model.Serie;

public class SerieDao extends Dao<Serie>{

	public Serie buscar(int id) {
		em.getTransaction().begin();
		Serie s = em.find(Serie.class, id);
		em.getTransaction().commit();
		return s;
	}
	
	public List<Serie> listarTodos(){
		em.getTransaction().begin();
		List<Serie> lista = (List<Serie>) em.createQuery("SELECT S FROM Serie S", Serie.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
