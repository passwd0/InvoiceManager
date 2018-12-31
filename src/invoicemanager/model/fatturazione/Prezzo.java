package invoicemanager.model.fatturazione;

public class Prezzo {
	private int id;
	private int codiceListinoPersonalizzato;
	private float prezzo;
	
	public Prezzo(int id, int codiceListinoPersonalizzato, float prezzo) {
		this.id = id;
		this.codiceListinoPersonalizzato = codiceListinoPersonalizzato;
		this.prezzo = prezzo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodiceListinoPersonalizzato() {
		return codiceListinoPersonalizzato;
	}
	public void setCodiceListinoPersonalizzato(int codiceListinoPersonalizzato) {
		this.codiceListinoPersonalizzato = codiceListinoPersonalizzato;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
