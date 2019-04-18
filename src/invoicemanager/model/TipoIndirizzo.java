package invoicemanager.model;
import java.sql.Timestamp;

public class TipoIndirizzo{
	private String codiceTipoIndirizzo; //(2) NOT NULL
	private String descrizione; //(50) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public TipoIndirizzo(String codiceTipoIndirizzo){
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
	}

	public TipoIndirizzo(String codiceTipoIndirizzo, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceTipoIndirizzo() {
		return codiceTipoIndirizzo;
	}

	public void setCodiceTipoIndirizzo(String codiceTipoIndirizzo) {
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
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