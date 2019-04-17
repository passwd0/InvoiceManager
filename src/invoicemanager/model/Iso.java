package invoicemanager.model;
import java.time.LocalDateTime;

public class Iso{
	private String codiceISO; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
		
	public Iso(String codiceISO, String descrizione, Stato stato, LocalDateTime dataInserimento,
				LocalDateTime dataUltimaModifica) {
		this.codiceISO = codiceISO;
		this.descrizione = descrizione;
		this.stato = stato;
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

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
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
