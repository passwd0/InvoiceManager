package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class ArticoloMagazzinoDescrizioneMultilingua {
	private String codiceArticolo; //(30) NOT NULL
	private String codiceLingua; //(4) NOT NULL
	private String descrizione; //(500) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public ArticoloMagazzinoDescrizioneMultilingua(String codiceArticolo, String codiceLingua){
		this.codiceArticolo = codiceArticolo;
		this.codiceLingua = codiceLingua;
	}

	public ArticoloMagazzinoDescrizioneMultilingua(String codiceArticolo, String codiceLingua, String descrizione,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, String loginInserimento) {
		this.codiceArticolo = codiceArticolo;
		this.codiceLingua = codiceLingua;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}
}
