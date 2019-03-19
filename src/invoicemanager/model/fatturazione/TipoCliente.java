package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class TipoCliente{
	private String codiceTipoCliente; //(4) NOT NULL
	private String descrizione; //(50) NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public TipoCliente(String codiceTipoCliente){
		this.codiceTipoCliente = codiceTipoCliente;
	}

	public TipoCliente(String codiceTipoCliente, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceTipoCliente = codiceTipoCliente;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceTipoCliente() {
		return codiceTipoCliente;
	}

	public void setCodiceTipoCliente(String codiceTipoCliente) {
		this.codiceTipoCliente = codiceTipoCliente;
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
		result = prime * result + ((codiceTipoCliente == null) ? 0 : codiceTipoCliente.hashCode());
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
		TipoCliente other = (TipoCliente) obj;
		if (codiceTipoCliente == null) {
			if (other.codiceTipoCliente != null)
				return false;
		} else if (!codiceTipoCliente.equals(other.codiceTipoCliente))
			return false;
		return true;
	}
	
	
}
