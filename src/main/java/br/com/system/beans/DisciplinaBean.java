package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Disciplina;
import br.com.system.service.DisciplinaService;
import br.com.system.service.ProfessorService;
import br.com.system.service.TurmaService;

@ManagedBean
public class DisciplinaBean {
	
	private DisciplinaService disciplinaService = new DisciplinaService();
	private ProfessorService professorService = new ProfessorService();
	private TurmaService turmaService = new TurmaService();
	private Disciplina disciplina = new Disciplina();
	
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

	public String salvarDisciplina()
	{
		if(disciplinaService.salvar(disciplina) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoDisciplina";
		}
	}
	
	public String alterarDisciplina()
	{
		if(disciplinaService.alterar(disciplina) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoDisciplina";
		}
	}
	
	public String excluirDisciplina()
	{
		if(disciplinaService.excluir(disciplina) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoDisciplina";
		}
	}
	
	public String buscarDisciplinaId()
	{
		if(disciplinaService.buscarId(disciplina) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdDisciplina";
		}
	}

}
