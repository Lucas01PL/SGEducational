package br.com.system.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.system.model.Disciplina;
import br.com.system.service.DisciplinaService;
import br.com.system.service.ProfessorService;
import br.com.system.service.TurmaService;

@ManagedBean
@ViewScoped
public class DisciplinaBean {
	
	private DisciplinaService disciplinaService = new DisciplinaService();
	private ProfessorService professorService = new ProfessorService();
	private TurmaService turmaService = new TurmaService();
	private Disciplina disciplina = new Disciplina();
	private List<Disciplina> disciplinas;
		
	
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
	
	public List<Disciplina> getDisciplinas() {
		disciplinas = disciplinaService.listarTodos();
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
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
