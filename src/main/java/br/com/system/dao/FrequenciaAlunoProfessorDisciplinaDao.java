package br.com.system.dao;

import java.util.List;

import br.com.system.model.FrequenciaAlunoProfessorDisciplina;

public class FrequenciaAlunoProfessorDisciplinaDao extends Dao<FrequenciaAlunoProfessorDisciplina>{

	public FrequenciaAlunoProfessorDisciplina buscarId(int id) {
		em.getTransaction().begin();
		FrequenciaAlunoProfessorDisciplina fapd = em.find(FrequenciaAlunoProfessorDisciplina.class, id);
		em.getTransaction().commit();
		return fapd;
	}
	
	public List<FrequenciaAlunoProfessorDisciplina> listarTodos(){
		em.getTransaction().begin();
		List<FrequenciaAlunoProfessorDisciplina> lista = (List<FrequenciaAlunoProfessorDisciplina>) em.createQuery("SELECT FAPD FROM FrequenciaAlunoProfessorDisciplina FAPD", FrequenciaAlunoProfessorDisciplina.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
