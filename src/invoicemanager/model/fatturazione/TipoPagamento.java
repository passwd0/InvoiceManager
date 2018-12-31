package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class TipoPagamento{
		private String codiceTipoPagamento; //(10) NOT NULL
		private String descrizione; //(100) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public TipoPagamento(String codiceTipoPagamento){
		this.codiceTipoPagamento = codiceTipoPagamento;
	}

	public String getCodiceTipoPagamento() {
		return codiceTipoPagamento;
	}

	public void setCodiceTipoPagamento(String codiceTipoPagamento) {
		this.codiceTipoPagamento = codiceTipoPagamento;
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
		result = prime * result + ((codiceTipoPagamento == null) ? 0 : codiceTipoPagamento.hashCode());
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
		TipoPagamento other = (TipoPagamento) obj;
		if (codiceTipoPagamento == null) {
			if (other.codiceTipoPagamento != null)
				return false;
		} else if (!codiceTipoPagamento.equals(other.codiceTipoPagamento))
			return false;
		return true;
	}
	
	
}
