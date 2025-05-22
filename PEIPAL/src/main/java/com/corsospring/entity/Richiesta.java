package com.corsospring.entity;

import java.sql.Timestamp;

public class Richiesta {

private Long id;
private Utente mittente;
private Utente destinatario;
private Timestamp timestamp;
private Double importo;
private String descrizione;
private Transazione transazioneOverBudg;

private TipoRichiesta tipoRichiesta;

public Richiesta() {
}

public Richiesta(Utente mittente, Utente destinatario, Timestamp timestamp, Double importo, String descrizione,
Transazione transazioneOverBudg, TipoRichiesta tipoRichiesta) {
super();
this.mittente = mittente;
this.destinatario = destinatario;
this.timestamp = timestamp;
this.importo = importo;
this.descrizione = descrizione;
this.transazioneOverBudg = transazioneOverBudg;
this.tipoRichiesta = tipoRichiesta;
}

public Utente getMittente() {
return mittente;
}

public void setMittente(Utente mittente) {
this.mittente = mittente;
}

public Utente getDestinatario() {
return destinatario;
}

public void setDestinatario(Utente destinatario) {
this.destinatario = destinatario;
}

public Timestamp getTimestamp() {
return timestamp;
}

public void setTimestamp(Timestamp timestamp) {
this.timestamp = timestamp;
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

public Transazione getTransazioneOverBudg() {
return transazioneOverBudg;
}

public void setTransazioneOverBudg(Transazione transazioneOverBudg) {
this.transazioneOverBudg = transazioneOverBudg;
}

public TipoRichiesta getTipoRichiesta() {
return tipoRichiesta;
}

public void setTipoRichiesta(TipoRichiesta tipoRichiesta) {
this.tipoRichiesta = tipoRichiesta;
}

public Long getId() {
return id;
}

}