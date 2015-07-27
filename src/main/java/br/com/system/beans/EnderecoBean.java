package br.com.system.beans;

import javax.faces.bean.ManagedBean;

import br.com.system.model.Endereco;
import br.com.system.service.EnderecoService;

@ManagedBean
public class EnderecoBean {
	
	private EnderecoService enderecoService;
	private Endereco endereco;
	
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

	public String salvar()
	{
		if(enderecoService.salvar(endereco) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoInclusaoEndereco";
		}
	}
	
	public String alteracao()
	{
		if(enderecoService.alterar(endereco) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoAlteracaoEndereco";
		}
	}
	
	public String excluir()
	{
		if(enderecoService.excluir(endereco) == false)
		{
			return "Erro";
		}
		else
		{
			return "SucessoExclusaoEndereco";
		}
	}
	
	public String buscarId()
	{
		if(enderecoService.buscarId(endereco) == null)
		{
			return "Erro";
		}
		else
		{
			return "SucessoBuscaIdEndereco";
		}
	}

}
