package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Aluno;
import br.com.system.model.Endereco;
import br.com.system.model.Professor;
import br.com.system.service.EnderecoService;
import br.com.system.service.ProfessorService;

@ManagedBean
public class ProfessorBean {
	
	private ProfessorService professorService = new ProfessorService();
	private Professor professor = new Professor();
	private EnderecoService enderecoService = new EnderecoService();
	private Endereco endereco = new Endereco();
	
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
	
	public EnderecoService getEnderecoService() {
		return enderecoService;
	}

	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String salvarProfessor()
	{
		professor.setEndereco(endereco);
		enderecoService.salvar(endereco);
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
		professor.setEndereco(endereco);
		enderecoService.salvar(endereco);
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
		professor.setEndereco(endereco);
		enderecoService.salvar(endereco);
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
