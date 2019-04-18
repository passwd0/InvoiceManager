package invoicemanager.model;
import java.time.LocalDate;
import java.sql.Timestamp;

public class ListinoArticolo implements Listino {
	private String codiceArticolo; //(30) NOT NULL
	private int progressivo; //  NOT NULL
	private String codiceDivisa; //(4) NOT NULL
	private float prezzo; // (19, 5) NULL
	private int numeroDecimali; //  NULL
	private LocalDate dataDecorrenza; //  NULL
	private LocalDate dataValidita; //  NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public ListinoArticolo(String codiceArticolo, int progressivo, String codiceDivisa){
		this.codiceArticolo = codiceArticolo;
		this.progressivo = progressivo;
		this.codiceDivisa = codiceDivisa;
	}

	public ListinoArticolo(String codiceArticolo, int progressivo, String codiceDivisa, float prezzo,
			int numeroDecimali, LocalDate dataDecorrenza, LocalDate dataValidita, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceArticolo = codiceArticolo;
		this.progressivo = progressivo;
		this.codiceDivisa = codiceDivisa;
		this.prezzo = prezzo;
		this.numeroDecimali = numeroDecimali;
		this.dataDecorrenza = dataDecorrenza;
		this.dataValidita = dataValidita;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public int getProgressivo() {
		return progressivo;
	}

	public void setProgressivo(int progressivo) {
		this.progressivo = progressivo;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumeroDecimali() {
		return numeroDecimali;
	}

	public void setNumeroDecimali(int numeroDecimali) {
		this.numeroDecimali = numeroDecimali;
	}

	public LocalDate getDataDecorrenza() {
		return dataDecorrenza;
	}

	public void setDataDecorrenza(LocalDate dataDecorrenza) {
		this.dataDecorrenza = dataDecorrenza;
	}

	public LocalDate getDataValidita() {
		return dataValidita;
	}

	public void setDataValidita(LocalDate dataValidita) {
		this.dataValidita = dataValidita;
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
