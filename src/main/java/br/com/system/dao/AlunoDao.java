package br.com.system.dao;

import java.util.List;

import br.com.system.model.Aluno;

public class AlunoDao extends Dao<Aluno>{

	
	public Aluno buscarId(int id) {
		em.getTransaction().begin();
		Aluno a = em.find(Aluno.class, id);
		em.getTransaction().commit();
		return a;
	}
	
	public List<Aluno> listarTodos(){
		em.getTransaction().begin();
		List<Aluno> lista = (List<Aluno>) em.createQuery("SELECT A FROM Aluno A", Aluno.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}
	
	public String retornarNome() {
		return "Teste";
		
	}
}
