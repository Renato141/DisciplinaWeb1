package com.ifce.br.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Nba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	
	private String time;
	private String confe;
	private int titulos;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getConfe() {
		return confe;
	}
	public void setConfe(String confe) {
		this.confe = confe;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	
	
	

}
