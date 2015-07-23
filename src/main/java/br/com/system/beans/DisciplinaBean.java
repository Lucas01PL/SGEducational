package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Disciplina;
import br.com.system.service.DisciplinaService;

@ManagedBean
public class DisciplinaBean {
	
	private DisciplinaService disciplinaService;
	private Disciplina disciplina;
	
	public DisciplinaService getDisciplinaService() {
		return disciplinaService;
	}

	public void setDisciplinaService(DisciplinaService disciplinaService) {
		this.disciplinaService = disciplinaService;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String salvar()
	{
		if(disciplinaService.salvar(disciplina) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusao";
		}
	}
	
	public String alteracao()
	{
		if(disciplinaService.alterar(disciplina) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracao";
		}
	}
	
	public String excluir()
	{
		if(disciplinaService.excluir(disciplina) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusao";
		}
	}

}
