package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Aluno;
import br.com.system.service.AlunoService;

@ManagedBean
public class AlunoBean {
	
	private AlunoService alunoService = new AlunoService();
	private Aluno aluno = new Aluno();
	
	public AlunoService getAlunoService() {
		return alunoService;
	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String salvar()
	{
		if(alunoService.salvar(aluno) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoAluno";
		}
	}
	
	public String alteracao()
	{
		if(alunoService.alterar(aluno) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoAluno";
		}
	}
	
	public String excluir()
	{
		if(alunoService.excluir(aluno) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoAluno";
		}
	}
	public String buscarId()
	{
		if(alunoService.buscarId(aluno) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdAluno";
		}
	}

}
