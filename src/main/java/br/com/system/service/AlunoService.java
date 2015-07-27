package br.com.system.service;

import java.util.List;

import br.com.system.dao.AlunoDao;
import br.com.system.model.Aluno;

public class AlunoService {
	
	AlunoDao daoAluno = new AlunoDao();
	
	public Aluno salvar(Aluno a)
	{
		return daoAluno.salvar(a);
	}
	
	public Aluno alterar(Aluno a)
	{
		Aluno c = new Aluno();
		c = daoAluno.buscarId(a.getMatricula());
		if(c != null)
		{
			return daoAluno.alterar(a);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Aluno a)
	{
		Aluno c = new Aluno();
		c = daoAluno.buscarId(a.getMatricula());
		if(c != null)
		{
			return daoAluno.excluir(a);
		}
		else
		{
			return false;	
		}
	}
	
	public Aluno buscarId(Aluno a)
	{
		if(a.getMatricula() < 0)
		{
			return daoAluno.buscarId(a.getMatricula());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Aluno> listarTodos(){
		return daoAluno.listarTodos();
	}

}
