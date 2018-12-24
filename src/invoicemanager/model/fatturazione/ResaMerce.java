package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class ResaMerce{
		private String codiceResa; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private float percentualeAddebito; //  NULL
		private float importoMinimo; // (19, 5) NULL
		private boolean indicatoreProvvigione; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public ResaMerce(String CodiceResa){
		this.codiceResa = CodiceResa;
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

	public Stato getCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(Stato codiceStato) {
		this.codiceStato = codiceStato;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
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
