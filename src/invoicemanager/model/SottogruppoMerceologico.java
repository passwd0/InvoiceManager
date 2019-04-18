package invoicemanager.model;
import java.sql.Timestamp;

public class SottogruppoMerceologico{
	private String codiceSottogruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
	private String loginInserimento; //(30) NULL

	public SottogruppoMerceologico(String codiceSottogruppoMerceologico){
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}

	public SottogruppoMerceologico(String codiceSottogruppoMerceologico, String descrizione, Stato stato,
			float sconto, float percentualeProvvigione, Timestamp dataInserimento, Timestamp dataUltimaModifica,
			String loginInserimento) {
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
		this.descrizione = descrizione;
		this.stato = stato;
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

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}
}
