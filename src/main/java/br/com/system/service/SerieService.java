package br.com.system.service;

import java.util.List;

import br.com.system.dao.SerieDao;
import br.com.system.model.Serie;

public class SerieService {
	
	SerieDao daoSerie = new SerieDao();
	
	public Serie salvar(Serie s)
	{
		return daoSerie.salvar(s);
	}
	
	public Serie alterar(Serie s)
	{
		Serie c = new Serie();
		c = daoSerie.buscar(s.getId());
		if(c != null)
		{
			return daoSerie.alterar(s);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Serie s)
	{
		Serie c = new Serie();
		c = daoSerie.buscar(s.getId());
		if(c != null)
		{
			return daoSerie.excluir(s);
		}
		else
		{
			return false;	
		}
	}
	
	public Serie buscar(Serie s)
	{
		if(s.getId() < 0)
		{
			return daoSerie.buscar(s.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Serie> listarTodos(){
		return daoSerie.listarTodos();
	}

}
