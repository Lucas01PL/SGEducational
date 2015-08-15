package br.com.system.beans;

import java.util.List;

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
	private Turma turma;
	private List<Aluno> alunos;
		
	/**
	 * @return the alunoService
	 */
	public AlunoService getAlunoService() {
		return alunoService;
	}

	/**
	 * @param alunoService the alunoService to set
	 */
	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	/**
	 * @return the enderecoService
	 */
	public EnderecoService getEnderecoService() {
		return enderecoService;
	}

	/**
	 * @param enderecoService the enderecoService to set
	 */
	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}

	/**
	 * @return the turmaService
	 */
	public TurmaService getTurmaService() {
		return turmaService;
	}

	/**
	 * @param turmaService the turmaService to set
	 */
	public void setTurmaService(TurmaService turmaService) {
		this.turmaService = turmaService;
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the turma
	 */
	public Turma getTurma() {
		return turma;
	}

	/**
	 * @param turma the turma to set
	 */
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	/**
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String salvarAluno()
	{
		//Turma t = new Turma();
		//t.setId(idTurma);
		//t = turmaService.buscarId(t);
		aluno.setEndereco(endereco);
		aluno.setTurma(turma);
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
			aluno = alunoService.buscarId(aluno);
			return "SucessoBuscaIdAluno";
		}
	}
	
	public String buscarAluno()
	{
		if(aluno.getMatricula() > 0 && aluno.getNomeCompleto().equals("") & aluno.getTurma() == null)
		{
			buscarAlunoId();
			alunos.add(aluno);
		}
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
