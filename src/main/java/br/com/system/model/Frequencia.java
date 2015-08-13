package br.com.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Frequencia implements Serializable{

	private static final long serialVersionUID = 3713301830272843245L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_FREQUENCIA")
	@SequenceGenerator(name="SEQ_FREQUENCIA", sequenceName="FREQUENCIA_SEQUENCE") 
	private int id;
	@Temporal(TemporalType.DATE)
	private Date data;
	
	
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
	
}
