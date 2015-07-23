package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Professor;
import br.com.system.service.ProfessorService;

@ManagedBean
public class ProfessorBean {
	
	private ProfessorService professorService;
	private Professor professor;
	
	public ProfessorService getProfessorService() {
		return professorService;
	}

	public void setProfessorService(ProfessorService professorService) {
		this.professorService = professorService;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String salvar()
	{
		if(professorService.salvar(professor) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoProfessor";
		}
	}
	
	public String alteracao()
	{
		if(professorService.alterar(professor) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoProfessor";
		}
	}
	
	public String excluir()
	{
		if(professorService.excluir(professor) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoProfessor";
		}
	}

}
