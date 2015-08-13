 package br.com.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.system.util.Sexo;

@Entity
public class Aluno implements Serializable{

	private static final long serialVersionUID = -3950808448024948332L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ALUNO")
	@SequenceGenerator(name="SEQ_ALUNO", sequenceName="ALUNO_SEQUENCE")  
	private int matricula;
	private String nomeCompleto;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	@Enumerated(value = EnumType.STRING)
	private Sexo sexo;
	@OneToOne
	private Endereco endereco;
	private int telefone;
	@ManyToOne
	private Turma turma;

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	/**
	 * @param nomeCompleto the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Matricula: "+matricula+" | Nome: "+nomeCompleto+" | Data Nascimento: "+dataNascimento+" | Sexo: "+sexo;
	}
	
}
