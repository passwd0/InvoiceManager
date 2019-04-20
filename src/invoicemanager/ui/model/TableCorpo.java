package invoicemanager.ui.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class TableCorpo {
	private SimpleStringProperty codiceArticolo;
	private SimpleStringProperty descrizione;
	private SimpleFloatProperty quantita;
	private SimpleFloatProperty prezzo;
	private SimpleStringProperty codiceUnitaMisura;
	private SimpleFloatProperty scontoCliente;
	
	public TableCorpo(String codiceArticolo, String descrizione,
			float quantita, float prezzo, String codiceUnitaMisura,
			float scontoCliente) {
		this.codiceArticolo = new SimpleStringProperty(codiceArticolo);
		this.descrizione = new SimpleStringProperty(descrizione);
		this.quantita = new SimpleFloatProperty(quantita);
		this.prezzo = new SimpleFloatProperty(prezzo);
		this.codiceUnitaMisura = new SimpleStringProperty(codiceUnitaMisura);
		this.scontoCliente = new SimpleFloatProperty(scontoCliente);
	}
	public String getCodiceArticolo() {
		return codiceArticolo.get();
	}
	public String getDescrizione() {
		return descrizione.get();
	}
	public float getQuantita() {
		return quantita.get();
	}
	public float getPrezzo() {
		return prezzo.get();
	}
	public String getUnitaMisura() {
		return codiceUnitaMisura.get();
	}
	public float getScontoCliente() {
		return scontoCliente.get();
	}
	public void setCodiceArticolo(SimpleStringProperty codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}
	public void setDescrizione(SimpleStringProperty descrizione) {
		this.descrizione = descrizione;
	}
	public void setQuantita(SimpleFloatProperty quantita) {
		this.quantita = quantita;
	}
	public void setPrezzo(SimpleFloatProperty prezzo) {
		this.prezzo = prezzo;
	}
	public void setUnitaMisura(SimpleStringProperty codiceUnitaMisura) {
		this.codiceUnitaMisura = codiceUnitaMisura;
	}
	public void setScontoCliente(SimpleFloatProperty scontoCliente) {
		this.scontoCliente = scontoCliente;
	}
	
}
