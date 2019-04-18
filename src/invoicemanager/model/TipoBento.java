package invoicemanager.model;
import java.sql.Timestamp;

public class TipoBento{
	private String codiceTipoBento; //(2) NOT NULL
	private String descrizione; //(50) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public TipoBento(String codiceTipoBento){
		this.codiceTipoBento = codiceTipoBento;
	}

	public TipoBento(String codiceTipoBento, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceTipoBento = codiceTipoBento;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceTipoBento() {
		return codiceTipoBento;
	}

	public void setCodiceTipoBento(String codiceTipoBento) {
		this.codiceTipoBento = codiceTipoBento;
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
}
