package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Iso{
		private String codiceISO; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		
	public Iso(String codiceISO, String descrizione, Stato codiceStato, LocalDateTime dataInserimento,
				LocalDateTime dataUltimaModifica, String loginInserimento) {
		this.codiceISO = codiceISO;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public Iso(String codiceISO){
		this.codiceISO = codiceISO;
	}

	public String getCodiceIso() {
		return codiceISO;
	}

	public void setCodiceIso(String codiceISO) {
		this.codiceISO = codiceISO;
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
		result = prime * result + ((codiceISO == null) ? 0 : codiceISO.hashCode());
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
		Iso other = (Iso) obj;
		if (codiceISO == null) {
			if (other.codiceISO != null)
				return false;
		} else if (!codiceISO.equals(other.codiceISO))
			return false;
		return true;
	}
	
	
}
