package invoicemanager.model;
import java.sql.Timestamp;

public class TipoRigaDocumento{
	private String codiceTipoRigaDocumento; //(4) COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL,
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL,

	public TipoRigaDocumento(String codiceTipoRigaDocumento){
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
	}

	public TipoRigaDocumento(String codiceTipoRigaDocumento, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceTipoRigaDocumento() {
		return codiceTipoRigaDocumento;
	}

	public void setCodiceTipoRigaDocumento(String codiceTipoRigaDocumento) {
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
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
