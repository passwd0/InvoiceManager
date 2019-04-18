package invoicemanager.model;
import java.sql.Timestamp;

public class RaggruppamentoClienteFornitore{
	private String codiceRaggruppamento; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
	
	public RaggruppamentoClienteFornitore(String codiceRaggruppamento){
		this.codiceRaggruppamento = codiceRaggruppamento;
	}

	public RaggruppamentoClienteFornitore(String codiceRaggruppamento, String descrizione, Stato stato,
		Timestamp dataInserimento, Timestamp dataUltimaModifica) {
	this.codiceRaggruppamento = codiceRaggruppamento;
	this.descrizione = descrizione;
	this.stato = stato;
	this.dataInserimento = dataInserimento;
	this.dataUltimaModifica = dataUltimaModifica;
}

	public String getCodiceRaggruppamento() {
		return codiceRaggruppamento;
	}

	public void setCodiceRaggruppamento(String codiceRaggruppamento) {
		this.codiceRaggruppamento = codiceRaggruppamento;
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
}
