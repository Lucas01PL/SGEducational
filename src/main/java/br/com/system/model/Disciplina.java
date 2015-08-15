package br.com.system.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
public class Disciplina implements Serializable{
	
	private static final long serialVersionUID = 5714465716513947305L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_DISCIPLINA")
	@SequenceGenerator(name="SEQ_DISCIPLINA", sequenceName="DISCIPLINA_SEQUENCE") 
	private int id;
	private String nome;
	@Transient
	private List<ProfessorDisciplina> professorDisciplina;

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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
