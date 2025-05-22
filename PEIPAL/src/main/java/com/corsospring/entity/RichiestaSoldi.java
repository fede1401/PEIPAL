package com.corsospring.entity;

import java.sql.Timestamp;

public class RichiestaSoldi extends Richiesta {
	
	private Double importo;
	private String descrizione;
	
	public RichiestaSoldi() {
	}

	public RichiestaSoldi(Double importo, String descrizione) {
		super();
		this.importo = importo;
		this.descrizione = descrizione;
		
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

	

}
