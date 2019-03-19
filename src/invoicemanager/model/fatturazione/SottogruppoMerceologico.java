package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class SottogruppoMerceologico{
	private String codiceSottogruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
	private String loginInserimento; //(30) NULL

	public SottogruppoMerceologico(String codiceSottogruppoMerceologico){
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}

	public SottogruppoMerceologico(String codiceSottogruppoMerceologico, String descrizione, boolean codiceStato,
			float sconto, float percentualeProvvigione, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica,
			String loginInserimento) {
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.sconto = sconto;
		this.percentualeProvvigione = percentualeProvvigione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}
}
