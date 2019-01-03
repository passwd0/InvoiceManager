package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class BentoTestata{
	private String codiceBento; //(50) NOT NULL
	private String descrizione; //(100) NULL
	private String codiceTipoBento; //(2) NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceClienteFornitore; //(30) NULL
	private String note; //(500) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public BentoTestata(String codiceBento){
		this.codiceBento = codiceBento;
	}

	public BentoTestata(String codiceBento, String descrizione, String codiceTipoBento, String codiceMagazzino,
			String codiceClienteFornitore, String note, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
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
