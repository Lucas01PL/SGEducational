package br.com.system.service;

import java.util.List;

import br.com.system.dao.FrequenciaAlunoProfessorDisciplinaDao;
import br.com.system.model.FrequenciaAlunoProfessorDisciplina;

public class FrequenciaAlunoProfessorDisciplinaService {
	
	FrequenciaAlunoProfessorDisciplinaDao daoFreqAlunoProfTurma = new FrequenciaAlunoProfessorDisciplinaDao();
	
	public FrequenciaAlunoProfessorDisciplina salvar(FrequenciaAlunoProfessorDisciplina fapd)
	{
		return daoFreqAlunoProfTurma.salvar(fapd);
	}
	
	public FrequenciaAlunoProfessorDisciplina alterar(FrequenciaAlunoProfessorDisciplina fapd)
	{
		FrequenciaAlunoProfessorDisciplina c = new FrequenciaAlunoProfessorDisciplina();
		c = daoFreqAlunoProfTurma.buscarId(fapd.getId());
		if(c != null)
		{
			return daoFreqAlunoProfTurma.alterar(fapd);
		}
		else
		{
			return null;	
		}
	}
	
	public boolean excluir(FrequenciaAlunoProfessorDisciplina fapd)
	{
		FrequenciaAlunoProfessorDisciplina c = new FrequenciaAlunoProfessorDisciplina();
		c = daoFreqAlunoProfTurma.buscarId(fapd.getId());
		if(c != null)
		{
			return daoFreqAlunoProfTurma.excluir(fapd);
		}
		else
		{
			return false;	
		}
	}
	
	public FrequenciaAlunoProfessorDisciplina buscarId(FrequenciaAlunoProfessorDisciplina fapd)
	{
		if(fapd.getId() > 0)
		{
			return daoFreqAlunoProfTurma.buscarId(fapd.getId());
		}
		else
		{
			return null;	
		}
	}
	
	public List<FrequenciaAlunoProfessorDisciplina> listarTodos(){
		return daoFreqAlunoProfTurma.listarTodos();
	}

}
