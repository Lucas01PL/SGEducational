package br.com.system.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.system.model.Endereco;
import br.com.system.service.EnderecoService;
import br.com.system.util.EstadosBrasileiros;

@ManagedBean
@ViewScoped
public class EnderecoBean {
	
	private EnderecoService enderecoService;
	private Endereco endereco = new Endereco();
	
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

	public String salvarEndereco()
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
	
	public String alteracaoEndereco()
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
	
	public String excluirEndereco()
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
	
	public String buscarEnderecoId()
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
	
	public boolean obterCep(Endereco endereco){
		if(endereco.getCep() == 0)
		{
			endereco.setLogradouro("");
			endereco.setNumero(0);
			return true;
		}
		else if(endereco.getCep() == 1)
		{
			endereco.setLogradouro("Rua Chico Silvestre");
			endereco.setNumero(50);
			endereco.setBairro("Lagoa Redonda");
			endereco.setCidade("Fortaleza");
			endereco.setEstado(EstadosBrasileiros.CE);
			return true;
		}
		else
		{
			endereco.setLogradouro("Rua Dr. Fernando Hugo");
			endereco.setNumero(249);
			return true;
		}
	}

}
