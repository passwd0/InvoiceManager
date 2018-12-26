package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class OrdineTestata{
		private int numeroOrdine; //  NOT NULL
		private LocalDateTime dataOrdine; //  NOT NULL
		private boolean indicatoreStatoAvanzamento; // NULL
		private String codiceClienteFatturazione; //(30) NULL
		private String descrizione; //(200) NULL
		private String codiceEsenzioneIva; //(4) NULL
		private String codiceAgente; //(10) NULL
		private float percentualeProvvigione; //  NULL
		private float percentualeSconto; //  NULL
		private float percentualeScontoPagamento; //  NULL
		private int numeroCopieFattura; //  NULL
		private boolean indicatoreAddebitoBolli; // NULL
		private boolean indicatoreAddebitoSpeseIncasso; // NULL
		private int codiceListino; //  NULL
		private String codiceResa; //(4) NULL
		private String codiceVettore; //(4) NULL
		private String codiceCausale; //(4) NULL
		private String codicePagamento; //(4) NULL
		private String codiceBanca; //(4) NULL
		private LocalDateTime dataConsegna; //  NULL
		private String causaleTrasporto; //(50) NULL
		private String codiceDivisa; //(4) NULL
		private boolean indicatoreConsegnaParziale; // NULL
		private boolean indicatoreRaggruppamentoConsegne; // NULL
		private String codiceAgenteVecchio; //(10) NULL
		private String codiceClienteSpedizione; //(30) NULL
		private String nomeSpedizione; //(100) NULL
		private String indirizzoSpedizione; //(100) NULL
		private String capSpedizione; //(20) NULL
		private String cittaSpedizione; //(50) NULL
		private String provinciaSpedizione; //(30) NULL
		private String codiceNazioneSpedizione; //(10) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String note; //(500) NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private String codiceLingua; //(4) NULL
		private String revisione; //(10) NULL
		private String attenzione; //(50) NULL
		private boolean indicatoreOrdineTrading; // NULL
		private List<OrdineDettaglio> ordineDettagli;
		
		public OrdineTestata(int numeroOrdine, LocalDateTime dataOrdine) {
			this.numeroOrdine = numeroOrdine;
			this.dataOrdine = dataOrdine;
		}

		public List<OrdineDettaglio> getOrdineDettagli() {
			return ordineDettagli;
		}

		public void setOrdineDettagli(List<OrdineDettaglio> ordineDettagli) {
			this.ordineDettagli = ordineDettagli;
		}

		public int getNumeroOrdine() {
			return numeroOrdine;
		}

		public void setNumeroOrdine(int numeroOrdine) {
			this.numeroOrdine = numeroOrdine;
		}

		public LocalDateTime getDataOrdine() {
			return dataOrdine;
		}

		public void setDataOrdine(LocalDateTime dataOrdine) {
			this.dataOrdine = dataOrdine;
		}

		public boolean isIndicatoreStatoAvanzamento() {
			return indicatoreStatoAvanzamento;
		}

		public void setIndicatoreStatoAvanzamento(boolean indicatoreStatoAvanzamento) {
			this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
		}

		public String getCodiceClienteFatturazione() {
			return codiceClienteFatturazione;
		}

		public void setCodiceClienteFatturazione(String codiceClienteFatturazione) {
			this.codiceClienteFatturazione = codiceClienteFatturazione;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public String getCodiceEsenzioneIva() {
			return codiceEsenzioneIva;
		}

		public void setCodiceEsenzioneIva(String codiceEsenzioneIva) {
			this.codiceEsenzioneIva = codiceEsenzioneIva;
		}

		public String getCodiceAgente() {
			return codiceAgente;
		}

		public void setCodiceAgente(String codiceAgente) {
			this.codiceAgente = codiceAgente;
		}

		public float getPercentualeProvvigione() {
			return percentualeProvvigione;
		}

		public void setPercentualeProvvigione(float percentualeProvvigione) {
			this.percentualeProvvigione = percentualeProvvigione;
		}

		public float getPercentualeSconto() {
			return percentualeSconto;
		}

		public void setPercentualeSconto(float percentualeSconto) {
			this.percentualeSconto = percentualeSconto;
		}

		public float getPercentualeScontoPagamento() {
			return percentualeScontoPagamento;
		}

		public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
			this.percentualeScontoPagamento = percentualeScontoPagamento;
		}

		public int getNumeroCopieFattura() {
			return numeroCopieFattura;
		}

		public void setNumeroCopieFattura(int numeroCopieFattura) {
			this.numeroCopieFattura = numeroCopieFattura;
		}

		public boolean isIndicatoreAddebitoBolli() {
			return indicatoreAddebitoBolli;
		}

		public void setIndicatoreAddebitoBolli(boolean indicatoreAddebitoBolli) {
			this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
		}

		public boolean isIndicatoreAddebitoSpeseIncasso() {
			return indicatoreAddebitoSpeseIncasso;
		}

		public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
			this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		}

		public int getCodiceListino() {
			return codiceListino;
		}

		public void setCodiceListino(int codiceListino) {
			this.codiceListino = codiceListino;
		}

		public String getCodiceResa() {
			return codiceResa;
		}

		public void setCodiceResa(String codiceResa) {
			this.codiceResa = codiceResa;
		}

		public String getCodiceVettore() {
			return codiceVettore;
		}

		public void setCodiceVettore(String codiceVettore) {
			this.codiceVettore = codiceVettore;
		}

		public String getCodiceCausale() {
			return codiceCausale;
		}

		public void setCodiceCausale(String codiceCausale) {
			this.codiceCausale = codiceCausale;
		}

		public String getCodicePagamento() {
			return codicePagamento;
		}

		public void setCodicePagamento(String codicePagamento) {
			this.codicePagamento = codicePagamento;
		}

		public String getCodiceBanca() {
			return codiceBanca;
		}

		public void setCodiceBanca(String codiceBanca) {
			this.codiceBanca = codiceBanca;
		}

		public LocalDateTime getDataConsegna() {
			return dataConsegna;
		}

		public void setDataConsegna(LocalDateTime dataConsegna) {
			this.dataConsegna = dataConsegna;
		}

		public String getCausaleTrasporto() {
			return causaleTrasporto;
		}

		public void setCausaleTrasporto(String causaleTrasporto) {
			this.causaleTrasporto = causaleTrasporto;
		}

		public String getCodiceDivisa() {
			return codiceDivisa;
		}

		public void setCodiceDivisa(String codiceDivisa) {
			this.codiceDivisa = codiceDivisa;
		}

		public boolean isIndicatoreConsegnaParziale() {
			return indicatoreConsegnaParziale;
		}

		public void setIndicatoreConsegnaParziale(boolean indicatoreConsegnaParziale) {
			this.indicatoreConsegnaParziale = indicatoreConsegnaParziale;
		}

		public boolean isIndicatoreRaggruppamentoConsegne() {
			return indicatoreRaggruppamentoConsegne;
		}

		public void setIndicatoreRaggruppamentoConsegne(boolean indicatoreRaggruppamentoConsegne) {
			this.indicatoreRaggruppamentoConsegne = indicatoreRaggruppamentoConsegne;
		}

		public String getCodiceAgenteVecchio() {
			return codiceAgenteVecchio;
		}

		public void setCodiceAgenteVecchio(String codiceAgenteVecchio) {
			this.codiceAgenteVecchio = codiceAgenteVecchio;
		}

		public String getCodiceClienteSpedizione() {
			return codiceClienteSpedizione;
		}

		public void setCodiceClienteSpedizione(String codiceClienteSpedizione) {
			this.codiceClienteSpedizione = codiceClienteSpedizione;
		}

		public String getNomeSpedizione() {
			return nomeSpedizione;
		}

		public void setNomeSpedizione(String nomeSpedizione) {
			this.nomeSpedizione = nomeSpedizione;
		}

		public String getIndirizzoSpedizione() {
			return indirizzoSpedizione;
		}

		public void setIndirizzoSpedizione(String indirizzoSpedizione) {
			this.indirizzoSpedizione = indirizzoSpedizione;
		}

		public String getCapSpedizione() {
			return capSpedizione;
		}

		public void setCapSpedizione(String capSpedizione) {
			this.capSpedizione = capSpedizione;
		}

		public String getCittaSpedizione() {
			return cittaSpedizione;
		}

		public void setCittaSpedizione(String cittaSpedizione) {
			this.cittaSpedizione = cittaSpedizione;
		}

		public String getProvinciaSpedizione() {
			return provinciaSpedizione;
		}

		public void setProvinciaSpedizione(String provinciaSpedizione) {
			this.provinciaSpedizione = provinciaSpedizione;
		}

		public String getCodiceNazioneSpedizione() {
			return codiceNazioneSpedizione;
		}

		public void setCodiceNazioneSpedizione(String codiceNazioneSpedizione) {
			this.codiceNazioneSpedizione = codiceNazioneSpedizione;
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

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getLoginInserimento() {
			return loginInserimento;
		}

		public void setLoginInserimento(String loginInserimento) {
			this.loginInserimento = loginInserimento;
		}

		public String getLoginModifica() {
			return loginModifica;
		}

		public void setLoginModifica(String loginModifica) {
			this.loginModifica = loginModifica;
		}

		public String getCodiceLingua() {
			return codiceLingua;
		}

		public void setCodiceLingua(String codiceLingua) {
			this.codiceLingua = codiceLingua;
		}

		public String getRevisione() {
			return revisione;
		}

		public void setRevisione(String revisione) {
			this.revisione = revisione;
		}

		public String getAttenzione() {
			return attenzione;
		}

		public void setAttenzione(String attenzione) {
			this.attenzione = attenzione;
		}

		public boolean isIndicatoreOrdineTrading() {
			return indicatoreOrdineTrading;
		}

		public void setIndicatoreOrdineTrading(boolean indicatoreOrdineTrading) {
			this.indicatoreOrdineTrading = indicatoreOrdineTrading;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dataOrdine == null) ? 0 : dataOrdine.hashCode());
			result = prime * result + numeroOrdine;
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
			OrdineTestata other = (OrdineTestata) obj;
			if (dataOrdine == null) {
				if (other.dataOrdine != null)
					return false;
			} else {
			    int y1 = dataOrdine.getYear();
			    int y2 = other.dataOrdine.getYear();
				if (y1 != y2)
					return false;
			}
			if (numeroOrdine != other.numeroOrdine)
				return false;
			return true;
		}

	
	
	
}
