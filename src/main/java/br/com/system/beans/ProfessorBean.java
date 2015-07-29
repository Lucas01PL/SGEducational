package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Professor;
import br.com.system.service.ProfessorService;

@ManagedBean
public class ProfessorBean {
	
	private ProfessorService professorService = new ProfessorService();
	private Professor professor = new Professor();
	
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

	public String salvarProfessor()
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
	
	public String alterarProfessor()
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
	
	public String excluirProfessor()
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
	
	public String buscarProfessorId()
	{
		if(professorService.buscarId(professor) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdProfessor";
		}
	}

}
