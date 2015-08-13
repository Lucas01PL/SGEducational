package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Aluno;
import br.com.system.model.Endereco;
import br.com.system.model.Turma;
import br.com.system.service.AlunoService;
import br.com.system.service.EnderecoService;
import br.com.system.service.TurmaService;

@ManagedBean
public class AlunoBean {
	
	private AlunoService alunoService = new AlunoService();
	private EnderecoService enderecoService = new EnderecoService();
	private TurmaService turmaService = new TurmaService();
	private Aluno aluno = new Aluno();
	private Endereco endereco = new Endereco();
	private int idTurma;
	
	public AlunoService getAlunoService() {
		return alunoService;
	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	public TurmaService getTurmaService() {
		return turmaService;
	}

	public void setTurmaService(TurmaService turmaService) {
		this.turmaService = turmaService;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EnderecoService getEnderecoService() {
		return enderecoService;
	}

	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}
	
	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String salvarAluno()
	{
		Turma t = new Turma();
		t.setId(idTurma);
		t = turmaService.buscarId(t);
		aluno.setEndereco(endereco);
		aluno.setTurma(t);
		enderecoService.salvar(endereco);
		if(alunoService.salvar(aluno) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoAluno";
		}
	}
	
	public String alterarAluno()
	{
		aluno.setEndereco(endereco);
		enderecoService.alterar(endereco);
		if(alunoService.alterar(aluno) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoAluno";
		}
	}
	
	public String excluirAluno()
	{
		aluno.setEndereco(endereco);
		enderecoService.excluir(endereco);
		if(alunoService.excluir(aluno) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoAluno";
		}
	}
	
	public String buscarAlunoId()
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
