package com.corsospring.entity;

import java.sql.Timestamp;

public abstract class Richiesta {
	
	private Long id;
	private Utente mittente;
	private Utente destinatario;
	private Timestamp timestamp;
	
	private TipoRichiesta tipoRichiesta;
	
}
