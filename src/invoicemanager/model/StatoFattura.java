package invoicemanager.model;
import java.sql.Timestamp;

public class StatoFattura{
	private boolean indicatoreStatoAvanzamento; // COLLATE Latin1_General_CI_AS NOT NULL,
	private boolean tipoDocumento; // 
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL,
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL,

	public StatoFattura(boolean indicatoreStatoAvanzamento){
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public StatoFattura(boolean indicatoreStatoAvanzamento, boolean tipoDocumento, String descrizione,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
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
