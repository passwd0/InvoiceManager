package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class RaggruppamentoClienteFornitore{
	private String codiceRaggruppamento; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	
	public RaggruppamentoClienteFornitore(String codiceRaggruppamento){
		this.codiceRaggruppamento = codiceRaggruppamento;
	}

	public RaggruppamentoClienteFornitore(String codiceRaggruppamento, String descrizione, Stato codiceStato,
		LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
	this.codiceRaggruppamento = codiceRaggruppamento;
	this.descrizione = descrizione;
	this.codiceStato = codiceStato;
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
}
