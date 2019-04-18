package invoicemanager.model;
import java.sql.Timestamp;

public class ArticoloMagazzinoDescrizioneMultilingua {
	private String codiceArticolo; //(30) NOT NULL
	private String codiceLingua; //(4) NOT NULL
	private String descrizione; //(500) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public ArticoloMagazzinoDescrizioneMultilingua(String codiceArticolo, String codiceLingua){
		this.codiceArticolo = codiceArticolo;
		this.codiceLingua = codiceLingua;
	}

	public ArticoloMagazzinoDescrizioneMultilingua(String codiceArticolo, String codiceLingua, String descrizione,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceArticolo = codiceArticolo;
		this.codiceLingua = codiceLingua;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getCodiceLingua() {
		return codiceLingua;
	}

	public void setCodiceLingua(String codiceLingua) {
		this.codiceLingua = codiceLingua;
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
