package br.com.system.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ProfessorDisciplina implements Serializable{
	

	private static final long serialVersionUID = 5044840920814061495L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PROF_DISC")
	@SequenceGenerator(name="SEQ_PROF_DISC", sequenceName="PROF_DISC_SEQUENCE")
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_disciplina")
	private Disciplina disciplina;
	@ManyToOne
	@JoinColumn(name = "id_professor")
	private Professor professor;

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
	 * @return the disciplina
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}
	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
