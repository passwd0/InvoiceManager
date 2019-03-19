package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class StatoFattura{
	private boolean indicatoreStatoAvanzamento; // COLLATE Latin1_General_CI_AS NOT NULL,
	private boolean tipoDocumento; // 
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public StatoFattura(boolean indicatoreStatoAvanzamento){
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public StatoFattura(boolean indicatoreStatoAvanzamento, boolean tipoDocumento, String descrizione,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
		this.tipoDocumento = tipoDocumento;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public boolean isIndicatoreStatoAvanzamento() {
		return indicatoreStatoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(boolean indicatoreStatoAvanzamento) {
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public boolean isTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(boolean tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
