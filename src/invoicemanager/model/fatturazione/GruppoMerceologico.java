package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class GruppoMerceologico{
	private String codiceGruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private int numeroPezziConfezione; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public GruppoMerceologico(String codiceGruppoMerceologico){
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
	}

	public GruppoMerceologico(String codiceGruppoMerceologico, String descrizione, Stato stato, float sconto,
			float percentualeProvvigione, int numeroPezziConfezione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
		this.descrizione = descrizione;
		this.stato = stato;
		this.sconto = sconto;
		this.percentualeProvvigione = percentualeProvvigione;
		this.numeroPezziConfezione = numeroPezziConfezione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceGruppoMerceologico() {
		return codiceGruppoMerceologico;
	}

	public void setCodiceGruppoMerceologico(String codiceGruppoMerceologico) {
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getCodiceStato() {
		if (stato == null) return null;
		return stato.name();
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

	public int getNumeroPezziConfezione() {
		return numeroPezziConfezione;
	}

	public void setNumeroPezziConfezione(int numeroPezziConfezione) {
		this.numeroPezziConfezione = numeroPezziConfezione;
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
