package invoicemanager.model;
import java.sql.Timestamp;

public class TipoMagazzino{
	private boolean codiceTipoMagazzino; // COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL,
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL,

	public TipoMagazzino(boolean codiceTipoMagazzino){
		this.codiceTipoMagazzino = codiceTipoMagazzino;
	}

	public TipoMagazzino(boolean codiceTipoMagazzino, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public boolean isCodiceTipoMagazzino() {
		return codiceTipoMagazzino;
	}

	public void setCodiceTipoMagazzino(boolean codiceTipoMagazzino) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
