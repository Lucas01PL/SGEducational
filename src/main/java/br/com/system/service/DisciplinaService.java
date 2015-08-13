package br.com.system.service;

import java.util.List;

import br.com.system.dao.DisciplinaDao;
import br.com.system.model.Disciplina;

public class DisciplinaService {
	
	DisciplinaDao daoDisciplina = new DisciplinaDao();
	
	public Disciplina salvar(Disciplina d)
	{
		return daoDisciplina.salvar(d);
	}
	
	public Disciplina alterar(Disciplina d)
	{
		Disciplina c = new Disciplina();
		c = daoDisciplina.buscarId(d.getId());
		if(c != null)
		{
			return daoDisciplina.alterar(d);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Disciplina d)
	{
		Disciplina c = new Disciplina();
		c = daoDisciplina.buscarId(d.getId());
		if(c != null)
		{
			return daoDisciplina.excluir(d);
		}
		else
		{
			return false;	
		}
	}
	
	public Disciplina buscarId(Disciplina d)
	{
		if(d.getId() > 0)
		{
			return daoDisciplina.buscarId(d.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Disciplina> listarTodos(){
		return daoDisciplina.listarTodos();
	}

}
