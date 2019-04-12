package invoicemanager.model.fatturazione;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente implements Comparable<Cliente>{
	private String codiceCliente; //(30) NOT NULL					x
	private String descrizione; //(100) 							x
	private TipoCliente tipoCliente; // (4)							x
	private ResaMerce resaMerce; // (4)								----
	private Imballo imballo; // (4)									----
	private RaggruppamentoClienteFornitore raggruppamento; // (4)	----
	private float fatturato; //										x
	private float fido;
	private String partitaIVA; //(15)								x			
	private String codiceFiscale; //(16)							x
	private Pagamento pagamento; // (4)								x
	private Banca banca; // (4)										x
	private int numeroFattureEmesse; //								x
	private Iva iva; // (4)											x
	private float imponibileNonEsente;	 //							----
	private float imponibileEsente;	//								----
	private float importoIVA; //									x (perche e' qui e non in Iva)
	private String codiceClassificazione; //(10)
	private Agente agente; // (10)									----
	private float percentualeProvvigioneAgente; //					----
	private float scontoLegatoProvvigioneAgente; //					----
	private int numeroCopieFattura; //								x
	private boolean indicatoreAddebitoSpeseIncasso;
	private boolean indicatoreAddebitoSpeseBolli;
	private int progressivo; //										x
	private Vettore vettore; //(3)									x
	private String codiceAffidabilita; //(4)
	private Iso iso; // (4)											----						
	private String partitaIVAEstero; //(12)							x
	private String codiceDivisa; //(4)								x
	private int dataScadenzaSpostataAgosto;
	private int dataScadenzaSpostataDicembre;
	private String codiceLingua; //(5)								x
	private String note; //(6000)									x
	private Stato stato = Stato.DISPONIBILE; // (2)					x
	private boolean indicatoreInviataInformativaPrivacy;
	private boolean indicatoreRicevutaInformativaPrivacy;
	private boolean indicatoreScorporoIVA;
	private boolean indicatoreIVADifferita;
	private boolean indicatoreEmail;
	private boolean inputInibito;
	private boolean indicatoreFatturePA; // NULL
	private LocalDate dataUltimaFattura; //  NULL
	private float importoUltimaFattura; //  NULL
	private float importoPlafond; //  NULL
	private String numeroUltimaFattura; //(50) NULL
	private LocalDate dataInizioPlafond; //  NULL
	private boolean indicatoreFattureXML; // NULL
	private boolean indicatoreDdtEmail; // NULL
	private boolean indicatorePlafond; // NULL
	private String codiceDestinatarioXml; //(7) COLLATE Latin1_General_CI_AS	x
	private String codiceEORI;	// (17)
	private StabileOrganizzazione stabileOrganizzazione; //						----
	private RappresentanteFiscale rappresentanteFiscale; //						----
	private TerzoIntermediario terzoIntermediario;
	private LocalDateTime dataInserimento = LocalDateTime.now();
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); // NULL
	
	public Cliente(String codiceCliente){
		this.codiceCliente = codiceCliente;
	}

	public Cliente(String codiceCliente, String descrizione, TipoCliente tipoCliente, ResaMerce resaMerce,
			Imballo imballo, RaggruppamentoClienteFornitore raggruppamento, float fatturato, float fido,
			String partitaIVA, String codiceFiscale, Pagamento pagamento, Banca banca, int numeroFattureEmesse, Iva iva,
			float imponibileNonEsente, float imponibileEsente, float importoIVA, String codiceClassificazione,
			Agente agente, float percentualeProvvigioneAgente, float scontoLegatoProvvigioniAgente,
			int numeroCopieFattura, boolean indicatoreAddebitoSpeseIncasso, boolean indicatoreAddebitoSpeseBolli, int progressivo,
			Vettore vettore, String codiceAffidabilita, Iso iso, String partitaIVAEstero,
			String codiceDivisa, int dataScadenzaSpostataAgosto, int dataScadenzaSpostataDicembre, String codiceLingua,
			String note, Stato stato, boolean indicatoreInviataInformativaPrivacy,
			boolean indicatoreRicevutaInformativaPrivacy, boolean indicatoreScorporoIVA, boolean indicatoreIVADifferita,
			boolean indicatoreEmail, boolean inputInibito, boolean indicatoreFatturePA, LocalDate dataUltimaFattura,
			float importoUltimaFattura, float importoPlafond, String numeroUltimaFattura,
			LocalDate dataInizioPlafond, boolean indicatoreFattureXML, boolean indicatoreDdtEmail,
			boolean indicatorePlafond, String codiceDestinatarioXml, String codiceEORI,
			StabileOrganizzazione stabileOrganizzazione, RappresentanteFiscale rappresentanteFiscale,
			TerzoIntermediario terzoIntermediario) {
		this.codiceCliente = codiceCliente;
		this.descrizione = descrizione;
		this.tipoCliente = tipoCliente;
		this.resaMerce = resaMerce;
		this.imballo = imballo;
		this.raggruppamento = raggruppamento;
		this.fatturato = fatturato;
		this.fido = fido;
		this.partitaIVA = partitaIVA;
		this.codiceFiscale = codiceFiscale;
		this.pagamento = pagamento;
		this.banca = banca;
		this.numeroFattureEmesse = numeroFattureEmesse;
		this.iva = iva;
		this.imponibileNonEsente = imponibileNonEsente;
		this.imponibileEsente = imponibileEsente;
		this.importoIVA = importoIVA;
		this.codiceClassificazione = codiceClassificazione;
		this.agente = agente;
		this.percentualeProvvigioneAgente = percentualeProvvigioneAgente;
		this.scontoLegatoProvvigioneAgente = scontoLegatoProvvigioniAgente;
		this.numeroCopieFattura = numeroCopieFattura;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.indicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
		this.progressivo = progressivo;
		this.vettore = vettore;
		this.codiceAffidabilita = codiceAffidabilita;
		this.iso = iso;
		this.partitaIVAEstero = partitaIVAEstero;
		this.codiceDivisa = codiceDivisa;
		this.dataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
		this.dataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
		this.codiceLingua = codiceLingua;
		this.note = note;
		this.stato = stato;
		this.indicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
		this.indicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
		this.indicatoreIVADifferita = indicatoreIVADifferita;
		this.indicatoreEmail = indicatoreEmail;
		this.inputInibito = inputInibito;
		this.indicatoreFatturePA = indicatoreFatturePA;
		this.dataUltimaFattura = dataUltimaFattura;
		this.importoUltimaFattura = importoUltimaFattura;
		this.importoPlafond = importoPlafond;
		this.numeroUltimaFattura = numeroUltimaFattura;
		this.dataInizioPlafond = dataInizioPlafond;
		this.indicatoreFattureXML = indicatoreFattureXML;
		this.indicatoreDdtEmail = indicatoreDdtEmail;
		this.indicatorePlafond = indicatorePlafond;
		this.codiceDestinatarioXml = codiceDestinatarioXml;
		this.codiceEORI = codiceEORI;
		this.stabileOrganizzazione = stabileOrganizzazione;
		this.rappresentanteFiscale = rappresentanteFiscale;
		this.terzoIntermediario = terzoIntermediario;
	}

	public int getCodiceRappresentanteFiscale() {
		if (rappresentanteFiscale == null) return -1;
		return rappresentanteFiscale.getCodice();
	}
	
	public RappresentanteFiscale getRappresentanteFiscale() {
		return rappresentanteFiscale;
	}

	public void setRappresentanteFiscale(RappresentanteFiscale rappresentanteFiscale) {
		this.rappresentanteFiscale = rappresentanteFiscale;
	}
	
	public int getCodiceTerzoIntermediario() {
		if (terzoIntermediario == null) return -1;
		return terzoIntermediario.getCodice();
	}

	public TerzoIntermediario getTerzoIntermediario() {
		return terzoIntermediario;
	}

	public void setTerzoIntermediario(TerzoIntermediario terzoIntermediario) {
		this.terzoIntermediario = terzoIntermediario;
	}

	public LocalDateTime getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceTipoCliente() {
		if (tipoCliente == null) return null;
		return tipoCliente.getCodiceTipoCliente();
	}
	
	public String getCodiceResaMerce() {
		if (resaMerce == null) return null;
		return resaMerce.getCodiceResa();
	}
	
	public String getCodiceImballo() {
		if (imballo == null) return null;
		return imballo.getCodiceImballo();
	}
	
	public String getCodiceRaggruppamento() {
		if (raggruppamento == null) return null;
		return raggruppamento.getCodiceRaggruppamento();
	}
	
	public String getCodiceAgente() {
		if (agente == null) return null;
		return agente.getCodiceAgente();
	}
	
	public String getCodiceIva() {
		if (iva == null) return null;
		return iva.getCodiceIva();
	}
	
	public String getCodiceIso() {
		if (iso == null) return null;
		return iso.getCodiceIso();
	}
	
	public String getCodiceBanca() {
		if (banca == null) return null;
		return banca.getCodiceBanca();
	}
	
	public String getCodicePagamento() {
		if (pagamento == null) return null;
		return pagamento.getCodicePagamento();
	}
	
	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public int getProgressivo() {
		return progressivo;
	}

	public void setProgressivo(int progressivo) {
		this.progressivo = progressivo;
	}

	public String getCodiceEORI() {
		return codiceEORI;
	}

	public void setCodiceEORI(String codiceEORI) {
		this.codiceEORI = codiceEORI;
	}
	
	public int getCodiceStabileOrganizzazione() {
		if (stabileOrganizzazione == null) return -1;
		return stabileOrganizzazione.getCodice();
	}

	public StabileOrganizzazione getStabileOrganizzazione() {
		return stabileOrganizzazione;
	}

	public void setStabileOrganizzazione(StabileOrganizzazione stabileOrganizzazione) {
		this.stabileOrganizzazione = stabileOrganizzazione;
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

	public String getCodiceDestinatarioXml() {
		return codiceDestinatarioXml;
	}

	public void setCodiceDestinatarioXml(String codiceDestinatarioXml) {
		this.codiceDestinatarioXml = codiceDestinatarioXml;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public ResaMerce getResaMerce() {
		return resaMerce;
	}

	public void setResaMerce(ResaMerce resaMerce) {
		this.resaMerce = resaMerce;
	}

	public Imballo getImballo() {
		return imballo;
	}

	public void setImballo(Imballo imballo) {
		this.imballo = imballo;
	}

	public RaggruppamentoClienteFornitore getRaggruppamento() {
		return raggruppamento;
	}

	public void setRaggruppamento(RaggruppamentoClienteFornitore raggruppamento) {
		this.raggruppamento = raggruppamento;
	}

	public float getFatturato() {
		return fatturato;
	}

	public void setFatturato(float fatturato) {
		this.fatturato = fatturato;
	}

	public float getFido() {
		return fido;
	}

	public void setFido(float fido) {
		this.fido = fido;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	public int getNumeroFattureEmesse() {
		return numeroFattureEmesse;
	}

	public void setNumeroFattureEmesse(int numeroFattureEmesse) {
		this.numeroFattureEmesse = numeroFattureEmesse;
	}

	public float getImponibileNonEsente() {
		return imponibileNonEsente;
	}

	public void setImponibileNonEsente(float imponibileNonEsente) {
		this.imponibileNonEsente = imponibileNonEsente;
	}

	public float getImponibileEsente() {
		return imponibileEsente;
	}

	public void setImponibileEsente(float imponibileEsente) {
		this.imponibileEsente = imponibileEsente;
	}

	public float getImportoIVA() {
		return importoIVA;
	}

	public void setImportoIVA(float importoIVA) {
		this.importoIVA = importoIVA;
	}

	public String getCodiceClassificazione() {
		return codiceClassificazione;
	}

	public void setCodiceClassificazione(String codiceClassificazione) {
		this.codiceClassificazione = codiceClassificazione;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public float getPercentualeProvvigioneAgente() {
		return percentualeProvvigioneAgente;
	}

	public void setPercentualeProvvigioneAgente(float percentualeProvvigioneAgente) {
		this.percentualeProvvigioneAgente = percentualeProvvigioneAgente;
	}

	public float getScontoLegatoProvvigioniAgente() {
		return scontoLegatoProvvigioneAgente;
	}

	public void setScontoLegatoProvvigioniAgente(float scontoLegatoProvvigioniAgente) {
		this.scontoLegatoProvvigioneAgente = scontoLegatoProvvigioniAgente;
	}

	public int getNumeroCopieFattura() {
		return numeroCopieFattura;
	}

	public void setNumeroCopieFattura(int numeroCopieFattura) {
		this.numeroCopieFattura = numeroCopieFattura;
	}

	public boolean isIndicatoreAddebitoSpeseIncasso() {
		return indicatoreAddebitoSpeseIncasso;
	}

	public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
	}

	public boolean isIndicatoreAddebitoSpeseBolli() {
		return indicatoreAddebitoSpeseBolli;
	}

	public void setIndicatoreAddebitoSpeseBolli(boolean indicatoreAddebitoSpeseBolli) {
		this.indicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
	}
	
	public String getCodiceVettore() {
		if (vettore == null) return null;
		return vettore.getCodiceVettore();
	}

	public Vettore getVettore() {
		return vettore;
	}

	public void setVettore(Vettore vettore) {
		this.vettore = vettore;
	}

	public String getCodiceAffidabilita() {
		return codiceAffidabilita;
	}

	public void setCodiceAffidabilita(String codiceAffidabilita) {
		this.codiceAffidabilita = codiceAffidabilita;
	}

	public Iso getIso() {
		return iso;
	}

	public void setCodiceIso(Iso codiceISO) {
		this.iso = codiceISO;
	}

	public String getPartitaIVAEstero() {
		return partitaIVAEstero;
	}

	public void setPartitaIVAEstero(String partitaIVAEstero) {
		this.partitaIVAEstero = partitaIVAEstero;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public int getDataScadenzaSpostataAgosto() {
		return dataScadenzaSpostataAgosto;
	}

	public void setDataScadenzaSpostataAgosto(int dataScadenzaSpostataAgosto) {
		this.dataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
	}

	public int getDataScadenzaSpostataDicembre() {
		return dataScadenzaSpostataDicembre;
	}

	public void setDataScadenzaSpostataDicembre(int dataScadenzaSpostataDicembre) {
		this.dataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
	}

	public String getCodiceLingua() {
		return codiceLingua;
	}

	public void setCodiceLingua(String codiceLingua) {
		this.codiceLingua = codiceLingua;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public boolean isIndicatoreInviataInformativaPrivacy() {
		return indicatoreInviataInformativaPrivacy;
	}

	public void setIndicatoreInviataInformativaPrivacy(boolean indicatoreInviataInformativaPrivacy) {
		this.indicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
	}

	public boolean isIndicatoreRicevutaInformativaPrivacy() {
		return indicatoreRicevutaInformativaPrivacy;
	}

	public void setIndicatoreRicevutaInformativaPrivacy(boolean indicatoreRicevutaInformativaPrivacy) {
		this.indicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
	}

	public boolean isIndicatoreScorporoIVA() {
		return indicatoreScorporoIVA;
	}

	public void setIndicatoreScorporoIVA(boolean indicatoreScorporoIVA) {
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
	}

	public boolean isIndicatoreIVADifferita() {
		return indicatoreIVADifferita;
	}

	public void setIndicatoreIVADifferita(boolean indicatoreIVADifferita) {
		this.indicatoreIVADifferita = indicatoreIVADifferita;
	}

	public boolean isIndicatoreEmail() {
		return indicatoreEmail;
	}

	public void setIndicatoreEmail(boolean indicatoreEmail) {
		this.indicatoreEmail = indicatoreEmail;
	}

	public boolean isInputInibito() {
		return inputInibito;
	}

	public void setInputInibito(boolean inputInibito) {
		this.inputInibito = inputInibito;
	}

	public Iva getIva() {
		return iva;
	}

	public void setIva(Iva iva) {
		this.iva = iva;
	}

	public boolean isIndicatoreFatturePA() {
		return indicatoreFatturePA;
	}

	public void setIndicatoreFatturePA(boolean indicatoreFatturePA) {
		this.indicatoreFatturePA = indicatoreFatturePA;
	}

	public LocalDate getDataUltimaFattura() {
		return dataUltimaFattura;
	}

	public void setDataUltimaFattura(LocalDate dataUltimaFattura) {
		this.dataUltimaFattura = dataUltimaFattura;
	}

	public float getImportoUltimaFattura() {
		return importoUltimaFattura;
	}

	public void setImportoUltimaFattura(float importoUltimaFattura) {
		this.importoUltimaFattura = importoUltimaFattura;
	}

	public float getImportoPlafond() {
		return importoPlafond;
	}

	public void setImportoPlafond(float importoPlafond) {
		this.importoPlafond = importoPlafond;
	}

	public String getNumeroUltimaFattura() {
		return numeroUltimaFattura;
	}

	public void setNumeroUltimaFattura(String numeroUltimaFattura) {
		this.numeroUltimaFattura = numeroUltimaFattura;
	}

	public LocalDate getDataInizioPlafond() {
		return dataInizioPlafond;
	}

	public void setDataInizioPlafond(LocalDate dataInizioPlafond) {
		this.dataInizioPlafond = dataInizioPlafond;
	}

	public boolean isIndicatoreFattureXML() {
		return indicatoreFattureXML;
	}

	public void setIndicatoreFattureXML(boolean indicatoreFattureXML) {
		this.indicatoreFattureXML = indicatoreFattureXML;
	}

	public boolean isIndicatoreDdtEmail() {
		return indicatoreDdtEmail;
	}

	public void setIndicatoreDdtEmail(boolean indicatoreDdtEmail) {
		this.indicatoreDdtEmail = indicatoreDdtEmail;
	}

	public boolean isIndicatorePlafond() {
		return indicatorePlafond;
	}

	public void setIndicatorePlafond(boolean indicatorePlafond) {
		this.indicatorePlafond = indicatorePlafond;
	}

	public void setIso(Iso iso) {
		this.iso = iso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceCliente == null) ? 0 : codiceCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codiceCliente == null) {
			if (other.codiceCliente != null)
				return false;
		} else if (!codiceCliente.equals(other.codiceCliente))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cliente cliente) {
		return this.codiceCliente.compareTo(cliente.codiceCliente);
	}
}
