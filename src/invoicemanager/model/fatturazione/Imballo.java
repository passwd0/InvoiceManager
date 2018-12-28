package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Imballo{
	private String codiceImballo; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
		
	public Imballo(String codiceImballo, String descrizione, Stato codiceStato, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceImballo = codiceImballo;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
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
