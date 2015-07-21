package br.com.system.service;

import java.util.List;

import br.com.system.dao.EnderecoDao;
import br.com.system.model.Endereco;

public class EnderecoService {
	
	EnderecoDao daoEndereco = new EnderecoDao();
	
	public Endereco salvar(Endereco e)
	{
		return daoEndereco.salvar(e);
	}
	
	public Endereco alterar(Endereco e)
	{
		Endereco c = new Endereco();
		c = daoEndereco.buscar(e.getId());
		if(c != null)
		{
			return daoEndereco.alterar(e);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Endereco e)
	{
		Endereco c = new Endereco();
		c = daoEndereco.buscar(e.getId());
		if(c != null)
		{
			return daoEndereco.excluir(e);
		}
		else
		{
			return false;	
		}
	}
	
	public Endereco buscar(Endereco e)
	{
		if(e.getId() < 0)
		{
			return daoEndereco.buscar(e.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Endereco> listarTodos(){
		return daoEndereco.listarTodos();
	}

}
