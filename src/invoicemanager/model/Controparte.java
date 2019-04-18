package invoicemanager.model;
import java.sql.Timestamp;

public class Controparte{
	private String codiceControparte; //(4) NOT NULL									x
	private String descrizione; //(100) NULL											x
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL	x
	private String codiceContoCOGE; //(30) NULL											----
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public Controparte(String codiceControparte, String descrizione, Stato stato, String codiceContoCOGE,
				Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceControparte = codiceControparte;
		this.descrizione = descrizione;
		this.stato = stato;
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
	
	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public String getCodiceContoCOGE() {
		return codiceContoCOGE;
	}

	public void setCodiceContoCOGE(String codiceContoCOGE) {
		this.codiceContoCOGE = codiceContoCOGE;
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
