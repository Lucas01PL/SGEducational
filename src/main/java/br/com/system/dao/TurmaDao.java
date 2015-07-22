package br.com.system.dao;

import java.util.List;

import br.com.system.model.Turma;

public class TurmaDao extends Dao<Turma>{

	public Turma buscar(int id) {
		em.getTransaction().begin();
		Turma s = em.find(Turma.class, id);
		em.getTransaction().commit();
		return s;
	}
	
	public List<Turma> listarTodos(){
		em.getTransaction().begin();
		List<Turma> lista = (List<Turma>) em.createQuery("SELECT T FROM Turma T", Turma.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
