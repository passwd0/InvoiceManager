package invoicemanager.ui.model;

import invoicemanager.model.UnitaMisura;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class TableCorpo {
	private SimpleStringProperty codiceArticolo;
	private SimpleStringProperty descrizione;
	private SimpleFloatProperty quantita;
	private SimpleFloatProperty prezzo;
	private SimpleObjectProperty<UnitaMisura> unitaMisura;
	private SimpleFloatProperty scontoCliente;
	
	public TableCorpo(String codiceArticolo, String descrizione,
			float quantita, float prezzo, UnitaMisura unitaMisura,
			float scontoCliente) {
		this.codiceArticolo = new SimpleStringProperty(codiceArticolo);
		this.descrizione = new SimpleStringProperty(descrizione);
		this.quantita = new SimpleFloatProperty(quantita);
		this.prezzo = new SimpleFloatProperty(prezzo);
		this.unitaMisura = new SimpleObjectProperty<>(unitaMisura);
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
		return unitaMisura.get() == null ? null : unitaMisura.get().getCodiceUnitaMisura();
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
	public void setUnitaMisura(SimpleObjectProperty<UnitaMisura> unitaMisura) {
		this.unitaMisura = unitaMisura;
	}
	public void setScontoCliente(SimpleFloatProperty scontoCliente) {
		this.scontoCliente = scontoCliente;
	}
	
}
