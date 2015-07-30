package br.com.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FrequenciaTurmaAluno {
	
	@Id
	@GeneratedValue
	private int id;
	private Frequencia frequencia;
	private TurmaAluno turmaAluno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Frequencia getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}
	public TurmaAluno getTurmaAluno() {
		return turmaAluno;
	}
	public void setTurmaAluno(TurmaAluno turmaAluno) {
		this.turmaAluno = turmaAluno;
	}
}
