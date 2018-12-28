package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Controparte{
		private String codiceControparte; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String codiceContoCOGE; //(30) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public Controparte(String codiceControparte, String descrizione, Stato codiceStato, String codiceContoCOGE,
				LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
			this.codiceControparte = codiceControparte;
			this.descrizione = descrizione;
			this.codiceStato = codiceStato;
			this.codiceContoCOGE = codiceContoCOGE;
			this.dataInserimento = dataInserimento;
			this.dataUltimaModifica = dataUltimaModifica;
		}

	public Controparte(String codiceControparte){
		this.codiceControparte = codiceControparte;
	}

	public String getCodiceControparte() {
		return codiceControparte;
	}

	public void setCodiceControparte(String codiceControparte) {
		this.codiceControparte = codiceControparte;
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

	public String getCodiceContoCOGE() {
		return codiceContoCOGE;
	}

	public void setCodiceContoCOGE(String codiceContoCOGE) {
		this.codiceContoCOGE = codiceContoCOGE;
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
		result = prime * result + ((codiceControparte == null) ? 0 : codiceControparte.hashCode());
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
		Controparte other = (Controparte) obj;
		if (codiceControparte == null) {
			if (other.codiceControparte != null)
				return false;
		} else if (!codiceControparte.equals(other.codiceControparte))
			return false;
		return true;
	}
}