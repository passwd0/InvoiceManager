package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class ResaMerce{
	private String codiceResa; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private float percentualeAddebito; //  NULL
	private float importoMinimo; // (19, 5) NULL
	private boolean indicatoreProvvigione; // NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public ResaMerce(String CodiceResa){
		this.codiceResa = CodiceResa;
	}

	public ResaMerce(String codiceResa, String descrizione, Stato stato, float percentualeAddebito,
		float importoMinimo, boolean indicatoreProvvigione, LocalDateTime dataInserimento,
		LocalDateTime dataUltimaModifica) {
	this.codiceResa = codiceResa;
	this.descrizione = descrizione;
	this.stato = stato;
	this.percentualeAddebito = percentualeAddebito;
	this.importoMinimo = importoMinimo;
	this.indicatoreProvvigione = indicatoreProvvigione;
	this.dataInserimento = dataInserimento;
	this.dataUltimaModifica = dataUltimaModifica;
}

	public String getCodiceResa() {
		return codiceResa;
	}

	public void setCodiceResa(String codiceResa) {
		this.codiceResa = codiceResa;
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

	public float getPercentualeAddebito() {
		return percentualeAddebito;
	}

	public void setPercentualeAddebito(float percentualeAddebito) {
		this.percentualeAddebito = percentualeAddebito;
	}

	public float getImportoMinimo() {
		return importoMinimo;
	}

	public void setImportoMinimo(float importoMinimo) {
		this.importoMinimo = importoMinimo;
	}

	public boolean isIndicatoreProvvigione() {
		return indicatoreProvvigione;
	}

	public void setIndicatoreProvvigione(boolean indicatoreProvvigione) {
		this.indicatoreProvvigione = indicatoreProvvigione;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceResa == null) ? 0 : codiceResa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResaMerce other = (ResaMerce) obj;
		if (codiceResa == null) {
			if (other.codiceResa != null)
				return false;
		} else if (!codiceResa.equals(other.codiceResa))
			return false;
		return true;
	}
}
