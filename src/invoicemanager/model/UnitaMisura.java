package invoicemanager.model;
import java.sql.Timestamp;

public class UnitaMisura{
	private String codiceUnitaMisura; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public UnitaMisura(String codiceUnitaMisura){
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public UnitaMisura(String codiceUnitaMisura, String descrizione, Stato stato, Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.descrizione = descrizione;
		this.stato = stato;
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
