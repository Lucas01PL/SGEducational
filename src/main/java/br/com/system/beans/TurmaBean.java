package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Turma;
import br.com.system.service.TurmaService;

@ManagedBean
public class TurmaBean {

	private TurmaService turmaService;
	private Turma turma = new Turma();
	
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

	public String salvar()
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
	
	public String alteracao()
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
	
	public String excluir()
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
	
	public String buscarId()
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
