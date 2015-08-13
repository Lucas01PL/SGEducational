package br.com.system.service;

import java.util.List;

import br.com.system.dao.ProfessorDao;
import br.com.system.model.Professor;

public class ProfessorService {
	
	ProfessorDao daoProfessor = new ProfessorDao();
	
	public Professor salvar(Professor p)
	{
		return daoProfessor.salvar(p);
	}
	
	public Professor alterar(Professor p)
	{
		Professor c = new Professor();
		c = daoProfessor.buscarId(c.getMatricula());
		if(c != null)
		{
			return daoProfessor.alterar(c);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Professor p)
	{
		Professor c = new Professor();
		c = daoProfessor.buscarId(p.getMatricula());
		if(c != null)
		{
			return daoProfessor.excluir(c);
		}
		else
		{
			return false;	
		}
	}
	
	public Professor buscarId(Professor p)
	{
		if(p.getMatricula() > 0)
		{
			return daoProfessor.buscarId(p.getMatricula());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Professor> listarTodos(){
		return daoProfessor.listarTodos();
	}

}
