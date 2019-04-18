package invoicemanager.model;
import java.sql.Timestamp;

public class Magazzino{
	private String codiceMagazzino; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // NULL
	private String codiceTipoMagazzino; //(15) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public Magazzino(String codiceMagazzino){
		this.codiceMagazzino = codiceMagazzino;
	}

	public Magazzino(String codiceMagazzino, String descrizione, Stato stato, String codiceTipoMagazzino,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceMagazzino = codiceMagazzino;
		this.descrizione = descrizione;
		this.stato = stato;
		this.codiceTipoMagazzino = codiceTipoMagazzino;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato codiceStato) {
		this.stato = codiceStato;
	}

	public String getCodiceTipoMagazzino() {
		return codiceTipoMagazzino;
	}

	public void setCodiceTipoMagazzino(String codiceTipoMagazzino) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
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
