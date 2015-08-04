package br.com.system.dao;

import java.util.List;

import br.com.system.model.ProfessorDisciplina;

public class ProfessorDisciplinaDao extends Dao<ProfessorDisciplina>{

	public ProfessorDisciplina buscarId(int id) {
		em.getTransaction().begin();
		ProfessorDisciplina pd = em.find(ProfessorDisciplina.class, id);
		em.getTransaction().commit();
		return pd;
	}
	
	public List<ProfessorDisciplina> listarTodos(){
		em.getTransaction().begin();
		List<ProfessorDisciplina> lista = (List<ProfessorDisciplina>) em.createQuery("SELECT PD FROM ProfessorDisciplina PD", ProfessorDisciplina.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
}
