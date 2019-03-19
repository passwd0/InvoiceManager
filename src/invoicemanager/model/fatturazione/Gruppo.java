package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Gruppo{
	private String codiceGruppo; //(10) NOT NULL
	private String descrizione; //(100) NOT NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public Gruppo(String codiceGruppo, String descrizione){
		this.codiceGruppo = codiceGruppo;
		this.descrizione = descrizione;
	}

	public Gruppo(String codiceGruppo, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceGruppo = codiceGruppo;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceGruppo() {
		return codiceGruppo;
	}

	public void setCodiceGruppo(String codiceGruppo) {
		this.codiceGruppo = codiceGruppo;
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
