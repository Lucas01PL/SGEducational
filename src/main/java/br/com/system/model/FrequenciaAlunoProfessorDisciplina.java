package br.com.system.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class FrequenciaAlunoProfessorDisciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_FRE_ALU_PRO_DIS")
	@SequenceGenerator(name="SEQ_FRE_ALU_PRO_DIS", sequenceName="FRE_ALU_PRO_DIS_SEQUENCE")
	private int id;
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "id_professor_disciplina")
	private ProfessorDisciplina professorDisciplina;
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "id_aluno")
	private Aluno aluno;

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
	 * @return the professorDisciplina
	 */
	public ProfessorDisciplina getProfessorDisciplina() {
		return professorDisciplina;
	}
	/**
	 * @param professorDisciplina the professorDisciplina to set
	 */
	public void setProfessorDisciplina(ProfessorDisciplina professorDisciplina) {
		this.professorDisciplina = professorDisciplina;
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
	
}
