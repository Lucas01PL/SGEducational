package br.com.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Frequencia implements Serializable{

	private static final long serialVersionUID = 3713301830272843245L;
	
	@Id
	@GeneratedValue
	private int id;
	@Temporal(TemporalType.DATE)
	private Date data;
	@ManyToOne
	private Disciplina disciplina;
	
	
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
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the materiaEscolar
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}
	/**
	 * @param materiaEscolar the materiaEscolar to set
	 */
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
