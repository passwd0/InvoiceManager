package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class SottogruppiMerceologici{
	private String codiceSottogruppoMerceologico; //(4) COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(100) COLLATE Latin1_General_CI_AS NULL,
	private boolean codiceStato; // COLLATE Latin1_General_CI_AS NULL,
	private float sconto; //  NULL,
	private float percentualeProvvigione; //  NULL,
	private LocalDateTime dataInserimento; //  NULL,
	private LocalDateTime dataUltimaModifica; //  NULL,

	public SottogruppiMerceologici(String codiceSottogruppoMerceologico){
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}

	public SottogruppiMerceologici(String codiceSottogruppoMerceologico, String descrizione, boolean codiceStato,
			float sconto, float percentualeProvvigione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.sconto = sconto;
		this.percentualeProvvigione = percentualeProvvigione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceSottogruppoMerceologico() {
		return codiceSottogruppoMerceologico;
	}

	public void setCodiceSottogruppoMerceologico(String codiceSottogruppoMerceologico) {
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(boolean codiceStato) {
		this.codiceStato = codiceStato;
	}

	public float getSconto() {
		return sconto;
	}

	public void setSconto(float sconto) {
		this.sconto = sconto;
	}

	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
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
