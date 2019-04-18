package invoicemanager.model;
import java.sql.Timestamp;

public class BentoTestata{
	private String codiceBento; //(50) NOT NULL									x
	private String descrizione; //(100) NULL									x
	private String codiceTipoBento; //(2) NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceClienteFornitore; //(30) NULL
	private String note; //(500) NULL											----
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public BentoTestata(String codiceBento){
		this.codiceBento = codiceBento;
	}

	public BentoTestata(String codiceBento, String descrizione, String codiceTipoBento, String codiceMagazzino,
			String codiceClienteFornitore, String note, Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceBento = codiceBento;
		this.descrizione = descrizione;
		this.codiceTipoBento = codiceTipoBento;
		this.codiceMagazzino = codiceMagazzino;
		this.codiceClienteFornitore = codiceClienteFornitore;
		this.note = note;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceBento() {
		return codiceBento;
	}

	public void setCodiceBento(String codiceBento) {
		this.codiceBento = codiceBento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodiceTipoBento() {
		return codiceTipoBento;
	}

	public void setCodiceTipoBento(String codiceTipoBento) {
		this.codiceTipoBento = codiceTipoBento;
	}

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
	}

	public String getCodiceClienteFornitore() {
		return codiceClienteFornitore;
	}

	public void setCodiceClienteFornitore(String codiceClienteFornitore) {
		this.codiceClienteFornitore = codiceClienteFornitore;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
