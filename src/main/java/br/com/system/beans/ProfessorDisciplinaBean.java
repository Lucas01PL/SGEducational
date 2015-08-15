package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Disciplina;
import br.com.system.model.Professor;
import br.com.system.model.ProfessorDisciplina;
import br.com.system.service.DisciplinaService;
import br.com.system.service.ProfessorDisciplinaService;
import br.com.system.service.ProfessorService;

@ManagedBean
public class ProfessorDisciplinaBean {
	
	private ProfessorDisciplinaService profDiscService = new ProfessorDisciplinaService();
	private ProfessorDisciplina profDisc = new ProfessorDisciplina();
	private int[] disciplinas;
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
	
	public int[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(int[] disciplinas) {
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
		String msg = "SucessoInclusaoProfDisc";
		DisciplinaService discService = new DisciplinaService();
		ProfessorService profService = new ProfessorService();
		Professor p = new Professor();
		p.setMatricula(idProfessor);
		p = profService.buscarId(p);
		for (int i = 0; i < disciplinas.length; i++) {
			profDisc.setProfessor(p);
			Disciplina d = new Disciplina();
			d.setId(disciplinas[i]);
			Disciplina c = new Disciplina();
			c = discService.buscarId(d);
			profDisc.setDisciplina(c);
			if(profDiscService.salvar(profDisc) == null)
			{
				msg = "Erro";
			}
			profDisc = new ProfessorDisciplina();
		}
		return msg;
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
