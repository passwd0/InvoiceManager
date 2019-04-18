package invoicemanager.model;
import java.sql.Timestamp;

public class Gruppo{
	private String codiceGruppo; //(10) NOT NULL
	private String descrizione; //(100) NOT NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public Gruppo(String codiceGruppo, String descrizione){
		this.codiceGruppo = codiceGruppo;
		this.descrizione = descrizione;
	}

	public Gruppo(String codiceGruppo, String descrizione, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
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
