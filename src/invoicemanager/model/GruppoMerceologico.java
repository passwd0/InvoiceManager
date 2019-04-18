package invoicemanager.model;
import java.sql.Timestamp;

public class GruppoMerceologico{
	private String codiceGruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private int numeroPezziConfezione; //  NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public GruppoMerceologico(String codiceGruppoMerceologico){
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
	}

	public GruppoMerceologico(String codiceGruppoMerceologico, String descrizione, Stato stato, float sconto,
			float percentualeProvvigione, int numeroPezziConfezione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
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
