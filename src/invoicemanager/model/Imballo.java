package invoicemanager.model;
import java.sql.Timestamp;

public class Imballo{
	private String codiceImballo; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
		
	public Imballo(String codiceImballo, String descrizione, Stato stato, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceImballo = codiceImballo;
		this.descrizione = descrizione;
		this.stato = stato;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public Imballo(String codiceImballo){
		this.codiceImballo = codiceImballo;
	}

	public String getCodiceImballo() {
		return codiceImballo;
	}

	public void setCodiceImballo(String codiceImballo) {
		this.codiceImballo = codiceImballo;
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
		result = prime * result + ((codiceImballo == null) ? 0 : codiceImballo.hashCode());
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
		Imballo other = (Imballo) obj;
		if (codiceImballo == null) {
			if (other.codiceImballo != null)
				return false;
		} else if (!codiceImballo.equals(other.codiceImballo))
			return false;
		return true;
	}
}
