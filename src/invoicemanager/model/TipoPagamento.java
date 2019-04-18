package invoicemanager.model;
import java.sql.Timestamp;

public class TipoPagamento{
	private String codiceTipoPagamento; //(10) NOT NULL
	private String descrizione; //(100) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public TipoPagamento(String codiceTipoPagamento){
		this.codiceTipoPagamento = codiceTipoPagamento;
	}

	public TipoPagamento(String codiceTipoPagamento, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceTipoPagamento = codiceTipoPagamento;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
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
