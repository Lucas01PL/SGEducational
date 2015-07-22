package br.com.system.service;

import java.util.List;

import br.com.system.dao.TurmaDao;
import br.com.system.model.Turma;

public class TurmaService {
	
	TurmaDao daoTurma = new TurmaDao();
	
	public Turma salvar(Turma t)
	{
		return daoTurma.salvar(t);
	}
	
	public Turma alterar(Turma t)
	{
		Turma c = new Turma();
		c = daoTurma.buscar(t.getId());
		if(c != null)
		{
			return daoTurma.alterar(t);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Turma t)
	{
		Turma c = new Turma();
		c = daoTurma.buscar(t.getId());
		if(c != null)
		{
			return daoTurma.excluir(t);
		}
		else
		{
			return false;	
		}
	}
	
	public Turma buscar(Turma t)
	{
		if(t.getId() < 0)
		{
			return daoTurma.buscar(t.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Turma> listarTodos(){
		return daoTurma.listarTodos();
	}

}
