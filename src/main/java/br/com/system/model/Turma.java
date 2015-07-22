package br.com.system.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Turma implements Serializable{

	private static final long serialVersionUID = 3032168094264822615L;
	@Id
	@GeneratedValue
	private int id;
	private String descricao;
	@Transient
	private List<Aluno> listaAlunos;
	@Transient
	private List<Disciplina> listaDisciplinas;
	@Column(columnDefinition="check turno in ('M' or 'T')")
	private String turno;

	/**
	 * @return the codigo
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	/**
	 * @return the listaAlunos
	 */
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}
	/**
	 * @param listaAlunos the listaAlunos to set
	 */
	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	/**
	 * @return the listaDisciplinas
	 */
	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	/**
	 * @param listaDisciplinas the listaDisciplinas to set
	 */
	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}
	@Override
	public String toString() {
		//System.out.println("Código: "+codigo+" | Descrição"+descricao);
		return "Código: "+id+" | Descrição: "+descricao;
	}
}
