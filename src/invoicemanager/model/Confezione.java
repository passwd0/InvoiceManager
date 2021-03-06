package invoicemanager.model;
import java.sql.Timestamp;

public class Confezione{
	private String codiceConfezione; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato; // NULL
	private float larghezza; //  NULL
	private float lunghezza; //  NULL
	private float altezza; //  NULL
	private float volume; //  NULL
	private float pesoLordo; //  NULL
	private float pesoTara; //  NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public Confezione(String codiceConfezione){
		this.codiceConfezione = codiceConfezione;
	}

	public Confezione(String codiceConfezione, String descrizione, Stato stato, float larghezza,
			float lunghezza, float altezza, float volume, float pesoLordo, float pesoTara,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceConfezione = codiceConfezione;
		this.descrizione = descrizione;
		this.stato = stato;
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
		this.volume = volume;
		this.pesoLordo = pesoLordo;
		this.pesoTara = pesoTara;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceConfezione() {
		return codiceConfezione;
	}

	public void setCodiceConfezione(String codiceConfezione) {
		this.codiceConfezione = codiceConfezione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	public Stato getStato() {
		return stato;
	}

	public float getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}

	public float getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(float lunghezza) {
		this.lunghezza = lunghezza;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getPesoLordo() {
		return pesoLordo;
	}

	public void setPesoLordo(float pesoLordo) {
		this.pesoLordo = pesoLordo;
	}

	public float getPesoTara() {
		return pesoTara;
	}

	public void setPesoTara(float pesoTara) {
		this.pesoTara = pesoTara;
	}

	public Timestamp getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Timestamp dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Timestamp getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(Timestamp dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}
}
