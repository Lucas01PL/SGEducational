package br.com.system.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Turma implements Serializable{

	private static final long serialVersionUID = 3032168094264822615L;
	@Id
	@GeneratedValue
	private int id;
	private String descricao;
	@Column(columnDefinition="check turno in ('M','T','N')")
	private String turno;
	private Double valor;
	@OneToMany
	private List<ProfessorDisciplina> professorDisciplina;
	@Transient
	private List<Aluno> listaAlunos;

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
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/**
	 * @return the professorDisciplina
	 */
	public List<ProfessorDisciplina> getProfessorDisciplina() {
		return professorDisciplina;
	}
	/**
	 * @param professorDisciplina the professorDisciplina to set
	 */
	public void setProfessorDisciplina(List<ProfessorDisciplina> professorDisciplina) {
		this.professorDisciplina = professorDisciplina;
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

	@Override
	public String toString() {
		//System.out.println("Código: "+codigo+" | Descrição"+descricao);
		return "Código: "+id+" | Descrição: "+descricao;
	}
}
