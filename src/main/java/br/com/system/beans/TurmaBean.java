package br.com.system.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Turma;
import br.com.system.service.TurmaService;

@ManagedBean
public class TurmaBean {

	private TurmaService turmaService = new TurmaService();
	private Turma turma = new Turma();
	private List<Turma> turmas;
	
	public TurmaService getTurmaService() {
		return turmaService;
	}

	public void setTurmaService(TurmaService turmaService) {
		this.turmaService = turmaService;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Turma> getTurmas() {
		turmas = turmaService.listarTodos();
		return turmas;
	}

	public String salvarTurma()
	{
		if(turmaService.salvar(turma) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoTurma";
		}
	}
	
	public String alterarTurma()
	{
		if(turmaService.alterar(turma) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoTurma";
		}
	}
	
	public String excluirTurma()
	{
		if(turmaService.excluir(turma) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoTurma";
		}
	}
	
	public String buscarTurmaId()
	{
		if(turmaService.buscarId(turma) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdTurma";
		}
	}
}
