package com.corsospring.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transazione {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private Long mittente;
	private Long destinatario;
	private Double importo;
	private String descrizione;
	private Timestamp timestamp;
	
	public Transazione() {
	}

	public Transazione(Long mittente, Long destinatario, Double importo, String descrizione, Timestamp timestamp) {
		super();
		this.mittente = mittente;
		this.destinatario = destinatario;
		this.importo = importo;
		this.descrizione = descrizione;
		this.timestamp = timestamp;
	}

	public Long getMittente() {
		return mittente;
	}

	public void setMittente(Long mittente) {
		this.mittente = mittente;
	}

	public Long getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Long destinatario) {
		this.destinatario = destinatario;
	}

	public Double getImporto() {
		return importo;
	}

	public void setImporto(Double importo) {
		this.importo = importo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
