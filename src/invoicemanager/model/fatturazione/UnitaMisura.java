package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class UnitaMisura{
	private String codiceUnitaMisura; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public UnitaMisura(String codiceUnitaMisura){
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public UnitaMisura(String codiceUnitaMisura, String descrizione, boolean codiceStato, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceUnitaMisura() {
		return codiceUnitaMisura;
	}

	public void setCodiceUnitaMisura(String codiceUnitaMisura) {
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(boolean codiceStato) {
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
