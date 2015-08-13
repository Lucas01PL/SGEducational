package br.com.system.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Disciplina;
import br.com.system.model.ProfessorDisciplina;
import br.com.system.service.ProfessorDisciplinaService;

@ManagedBean
public class ProfessorDisciplinaBean {
	
	private ProfessorDisciplinaService profDiscService = new ProfessorDisciplinaService();
	private ProfessorDisciplina profDisc = new ProfessorDisciplina();
	private List<Disciplina> disciplinas;
	private int idProfessor;
	
	public ProfessorDisciplinaService getProfDiscService() {
		return profDiscService;
	}

	public void setProfDiscService(ProfessorDisciplinaService profDiscService) {
		this.profDiscService = profDiscService;
	}

	public ProfessorDisciplina getProfDisc() {
		return profDisc;
	}

	public void setProfDisc(ProfessorDisciplina profDisc) {
		this.profDisc = profDisc;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String salvarProfDisc()
	{
		if(profDiscService.salvar(profDisc) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoProfDisc";
		}
	}
	
	public String alterarProfDisc()
	{
		if(profDiscService.alterar(profDisc) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoProfDisc";
		}
	}
	
	public String excluirProfDisc()
	{
		if(profDiscService.excluir(profDisc) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoProfDisc";
		}
	}
	
	public String buscarProfDiscId()
	{
		if(profDiscService.buscarId(profDisc) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdProfDisc";
		}
	}

}
