package invoicemanager.model;
import java.time.LocalDateTime;

public class RaggruppamentoClienteFornitore{
	private String codiceRaggruppamento; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
	
	public RaggruppamentoClienteFornitore(String codiceRaggruppamento){
		this.codiceRaggruppamento = codiceRaggruppamento;
	}

	public RaggruppamentoClienteFornitore(String codiceRaggruppamento, String descrizione, Stato stato,
		LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
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
