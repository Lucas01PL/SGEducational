package br.com.system.dao;

import java.util.List;

import br.com.system.model.Disciplina;

public class DisciplinaDao extends Dao<Disciplina>{

	public Disciplina buscar(int id) {
		em.getTransaction().begin();
		Disciplina s = em.find(Disciplina.class, id);
		em.getTransaction().commit();
		return s;
	}
	
	public List<Disciplina> listarTodos(){
		em.getTransaction().begin();
		List<Disciplina> lista = (List<Disciplina>) em.createQuery("SELECT D FROM Disciplia D", Disciplina.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
