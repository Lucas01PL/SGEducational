package br.com.system.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Disciplina implements Serializable{
	
	private static final long serialVersionUID = 5714465716513947305L;
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	@ManyToOne
	private Professor professor;
	@ManyToOne
	private Turma turma;

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
	
}
