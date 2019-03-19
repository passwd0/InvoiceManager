package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class TipoIndirizzo{
	private String codiceTipoIndirizzo; //(2) NOT NULL
	private String descrizione; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public TipoIndirizzo(String codiceTipoIndirizzo){
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
	}

	public TipoIndirizzo(String codiceTipoIndirizzo, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
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