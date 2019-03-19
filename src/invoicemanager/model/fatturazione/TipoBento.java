package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class TipoBento{
	private String codiceTipoBento; //(2) NOT NULL
	private String descrizione; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public TipoBento(String codiceTipoBento){
		this.codiceTipoBento = codiceTipoBento;
	}

	public TipoBento(String codiceTipoBento, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
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
