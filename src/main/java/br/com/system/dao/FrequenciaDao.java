package br.com.system.dao;

import java.util.List;

import br.com.system.model.Frequencia;

public class FrequenciaDao extends Dao<Frequencia>{

	public Frequencia buscarId(int id) {
		em.getTransaction().begin();
		Frequencia f = em.find(Frequencia.class, id);
		em.getTransaction().commit();
		return f;
	}
	
	public List<Frequencia> listarTodos(){
		em.getTransaction().begin();
		List<Frequencia> lista = (List<Frequencia>) em.createQuery("SELECT F FROM Frequencia F", Frequencia.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
