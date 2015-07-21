package br.com.system.dao;

import java.util.List;

import br.com.system.model.Endereco;

public class EnderecoDao extends Dao<Endereco>{

	public Endereco buscar(int id) {
		em.getTransaction().begin();
		Endereco e = em.find(Endereco.class, id);
		em.getTransaction().commit();
		return e;
	}
	
	public List<Endereco> listarTodos(){
		em.getTransaction().begin();
		List<Endereco> lista = (List<Endereco>) em.createQuery("SELECT E FROM Endereco E", Endereco.class).getResultList();
		em.getTransaction().commit();
		return lista;
	}

}
