package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Stato{
		private String codiceStato; // NOT NULL
		private String descrizione; //(50) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public Stato(String codiceStato){
		this.codiceStato = codiceStato;
	}

	public String getCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(String codiceStato) {
		this.codiceStato = codiceStato;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceStato == null) ? 0 : codiceStato.hashCode());
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
		Stato other = (Stato) obj;
		if (codiceStato == null) {
			if (other.codiceStato != null)
				return false;
		} else if (!codiceStato.equals(other.codiceStato))
			return false;
		return true;
	}
	
	
}
