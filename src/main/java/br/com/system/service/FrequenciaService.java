package br.com.system.service;

import java.util.List;

import br.com.system.dao.FrequenciaDao;
import br.com.system.model.Frequencia;

public class FrequenciaService {
	
	FrequenciaDao daoFrequencia = new FrequenciaDao();
	
	public Frequencia salvar(Frequencia f)
	{
		return daoFrequencia.salvar(f);
	}
	
	public Frequencia alterar(Frequencia f)
	{
		Frequencia c = new Frequencia();
		c = daoFrequencia.buscarId(f.getId());
		if(c != null)
		{
			return daoFrequencia.alterar(f);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(Frequencia f)
	{
		Frequencia c = new Frequencia();
		c = daoFrequencia.buscarId(f.getId());
		if(c != null)
		{
			return daoFrequencia.excluir(f);
		}
		else
		{
			return false;	
		}
	}
	
	public Frequencia buscarId(Frequencia f)
	{
		if(f.getId() > 0)
		{
			return daoFrequencia.buscarId(f.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<Frequencia> listarTodos(){
		return daoFrequencia.listarTodos();
	}

}
