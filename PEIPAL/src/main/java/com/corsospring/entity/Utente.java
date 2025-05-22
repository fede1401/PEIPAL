package com.corsospring.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String username;
	
	@Column(nullable = false)
	private String email;
	private String password;
	
	@Column(nullable = false)
	private Stato stato;
	
	private Double saldo;
	
	private Integer punteggio;

	public Utente() {
	}
	
	public Utente(String username, String email, String password, Double saldo, Integer punteggio, Stato stato) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.saldo = saldo;
		this.punteggio = punteggio;
		this.stato = stato;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(Integer punteggio) {
		this.punteggio = punteggio;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
