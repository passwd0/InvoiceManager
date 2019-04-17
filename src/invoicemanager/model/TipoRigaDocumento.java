package invoicemanager.model;
import java.time.LocalDateTime;

public class TipoRigaDocumento{
	private String codiceTipoRigaDocumento; //(4) COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public TipoRigaDocumento(String codiceTipoRigaDocumento){
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
	}

	public TipoRigaDocumento(String codiceTipoRigaDocumento, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
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

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}
}
