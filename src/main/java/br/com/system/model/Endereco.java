package br.com.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.system.util.EstadosBrasileiros;

@Entity
public class Endereco implements Serializable{

	private static final long serialVersionUID = -5999797637353386139L;
	
	@Id
	@GeneratedValue
	private int id;
	private int cep;
	private String logradouro;
	private int numero;
	@Column(name="uf")
	@Enumerated(value = EnumType.STRING)
	private EstadosBrasileiros estado;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cep
	 */
	public int getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(int cep) {
		this.cep = cep;
	}
	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the estado
	 */
	public EstadosBrasileiros getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadosBrasileiros estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: "+id+" | Cep: "+cep+" | Logradouro: "+logradouro+" | Numero: "+numero;
	}
}
