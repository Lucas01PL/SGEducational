package br.com.system.service;

import java.util.List;

import br.com.system.dao.ProfessorDisciplinaDao;
import br.com.system.model.ProfessorDisciplina;

public class ProfessorDisciplinaService {
	
	ProfessorDisciplinaDao daoProfDisc = new ProfessorDisciplinaDao();
	
	public ProfessorDisciplina salvar(ProfessorDisciplina pd)
	{
		return daoProfDisc.salvar(pd);
	}
	
	public ProfessorDisciplina alterar(ProfessorDisciplina pd)
	{
		ProfessorDisciplina c = new ProfessorDisciplina();
		c = daoProfDisc.buscarId(c.getId());
		if(c != null)
		{
			return daoProfDisc.alterar(c);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(ProfessorDisciplina pd)
	{
		ProfessorDisciplina c = new ProfessorDisciplina();
		c = daoProfDisc.buscarId(pd.getId());
		if(c != null)
		{
			return daoProfDisc.excluir(c);
		}
		else
		{
			return false;	
		}
	}
	
	public ProfessorDisciplina buscarId(ProfessorDisciplina pd)
	{
		if(pd.getId() > 0)
		{
			return daoProfDisc.buscarId(pd.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<ProfessorDisciplina> listarTodos(){
		return daoProfDisc.listarTodos();
	}

}
