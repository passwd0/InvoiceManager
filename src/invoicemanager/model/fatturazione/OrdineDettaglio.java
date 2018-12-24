package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class OrdineDettaglio{
		private int numeroOrdine; //  NOT NULL
		private int numeroRigaOrdine; //  NOT NULL
		private LocalDateTime dataOrdine; //  NOT NULL
		private String codiceTipoRigaDocumento; //(4) NULL
		private String codiceMagazzino; //(4) NULL
		private String codiceArticolo; //(30) NULL
		private float quantitaConsegnata; //  NULL
		private boolean indicatoreEvasione; // NULL
		private String descrizione; //(2000) NULL
		private LocalDateTime dataConsegna; //  NULL
		private float quantita; //  NULL
		private String codiceUnitaMisura; //(4) NULL
		private float prezzo; // (19, 5) NULL
		private String codiceIva; //(4) NULL
		private String codiceContropartitaContabile; //(4) NULL
		private float percentualeProvvigione; //  NULL
		private float percentualeScontoCliente; //  NULL
		private float percentualeScontoArticolo; //  NULL
		private float percentualeScontoPagamento; //  NULL
		private String descrizioneAggiuntiva; //(2000) NULL
		private boolean indicatoreCoordinamento; // NULL
		private boolean indicatoreOrdineDaFatturare; // NULL
		private float quantitaVariata; //  NULL
		private int numeroPreventivo; //  NULL
		private int numeroRigaPreventivo; //  NULL
		private LocalDateTime dataPreventivo; //  NULL
		private float quantitaEvasa; //  NULL
		private boolean indicatoreEvasionePreventivi; // NULL
		private boolean indicatoreEvasioneRigheNote; // NULL
		private boolean indicatoreNoConferma; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private LocalDateTime dataConsegnaSchedulatore; //  NULL
		private LocalDateTime dataConsegnaProposta; //  NULL
		private boolean indicatoreBloccato; // NULL
		private boolean indicatoreOrdineTrading; // NULL
		private LocalDateTime dataInizioSchedulatore; //  NULL
		private String codiceArticoloBis; //(30) NULL
		
		public OrdineDettaglio(int numeroOrdine, int numeroRigaOrdine, LocalDateTime dataOrdine) {
			this.numeroOrdine = numeroOrdine;
			this.numeroRigaOrdine = numeroRigaOrdine;
			this.dataOrdine = dataOrdine;
		}

		public int getNumeroOrdine() {
			return numeroOrdine;
		}

		public void setNumeroOrdine(int numeroOrdine) {
			this.numeroOrdine = numeroOrdine;
		}

		public int getNumeroRigaOrdine() {
			return numeroRigaOrdine;
		}

		public void setNumeroRigaOrdine(int numeroRigaOrdine) {
			this.numeroRigaOrdine = numeroRigaOrdine;
		}

		public LocalDateTime getDataOrdine() {
			return dataOrdine;
		}

		public void setDataOrdine(LocalDateTime dataOrdine) {
			this.dataOrdine = dataOrdine;
		}

		public String getCodiceTipoRigaDocumento() {
			return codiceTipoRigaDocumento;
		}

		public void setCodiceTipoRigaDocumento(String codiceTipoRigaDocumento) {
			this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		}

		public String getCodiceMagazzino() {
			return codiceMagazzino;
		}

		public void setCodiceMagazzino(String codiceMagazzino) {
			this.codiceMagazzino = codiceMagazzino;
		}

		public String getCodiceArticolo() {
			return codiceArticolo;
		}

		public void setCodiceArticolo(String codiceArticolo) {
			this.codiceArticolo = codiceArticolo;
		}

		public float getQuantitaConsegnata() {
			return quantitaConsegnata;
		}

		public void setQuantitaConsegnata(float quantitaConsegnata) {
			this.quantitaConsegnata = quantitaConsegnata;
		}

		public boolean isIndicatoreEvasione() {
			return indicatoreEvasione;
		}

		public void setIndicatoreEvasione(boolean indicatoreEvasione) {
			this.indicatoreEvasione = indicatoreEvasione;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public LocalDateTime getDataConsegna() {
			return dataConsegna;
		}

		public void setDataConsegna(LocalDateTime dataConsegna) {
			this.dataConsegna = dataConsegna;
		}

		public float getQuantita() {
			return quantita;
		}

		public void setQuantita(float quantita) {
			this.quantita = quantita;
		}

		public String getCodiceUnitaMisura() {
			return codiceUnitaMisura;
		}

		public void setCodiceUnitaMisura(String codiceUnitaMisura) {
			this.codiceUnitaMisura = codiceUnitaMisura;
		}

		public float getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(float prezzo) {
			this.prezzo = prezzo;
		}

		public String getCodiceIva() {
			return codiceIva;
		}

		public void setCodiceIva(String codiceIva) {
			this.codiceIva = codiceIva;
		}

		public String getCodiceContropartitaContabile() {
			return codiceContropartitaContabile;
		}

		public void setCodiceContropartitaContabile(String codiceContropartitaContabile) {
			this.codiceContropartitaContabile = codiceContropartitaContabile;
		}

		public float getPercentualeProvvigione() {
			return percentualeProvvigione;
		}

		public void setPercentualeProvvigione(float percentualeProvvigione) {
			this.percentualeProvvigione = percentualeProvvigione;
		}

		public float getPercentualeScontoCliente() {
			return percentualeScontoCliente;
		}

		public void setPercentualeScontoCliente(float percentualeScontoCliente) {
			this.percentualeScontoCliente = percentualeScontoCliente;
		}

		public float getPercentualeScontoArticolo() {
			return percentualeScontoArticolo;
		}

		public void setPercentualeScontoArticolo(float percentualeScontoArticolo) {
			this.percentualeScontoArticolo = percentualeScontoArticolo;
		}

		public float getPercentualeScontoPagamento() {
			return percentualeScontoPagamento;
		}

		public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
			this.percentualeScontoPagamento = percentualeScontoPagamento;
		}

		public String getDescrizioneAggiuntiva() {
			return descrizioneAggiuntiva;
		}

		public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
			this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		}

		public boolean isIndicatoreCoordinamento() {
			return indicatoreCoordinamento;
		}

		public void setIndicatoreCoordinamento(boolean indicatoreCoordinamento) {
			this.indicatoreCoordinamento = indicatoreCoordinamento;
		}

		public boolean isIndicatoreOrdineDaFatturare() {
			return indicatoreOrdineDaFatturare;
		}

		public void setIndicatoreOrdineDaFatturare(boolean indicatoreOrdineDaFatturare) {
			this.indicatoreOrdineDaFatturare = indicatoreOrdineDaFatturare;
		}

		public float getQuantitaVariata() {
			return quantitaVariata;
		}

		public void setQuantitaVariata(float quantitaVariata) {
			this.quantitaVariata = quantitaVariata;
		}

		public int getNumeroPreventivo() {
			return numeroPreventivo;
		}

		public void setNumeroPreventivo(int numeroPreventivo) {
			this.numeroPreventivo = numeroPreventivo;
		}

		public int getNumeroRigaPreventivo() {
			return numeroRigaPreventivo;
		}

		public void setNumeroRigaPreventivo(int numeroRigaPreventivo) {
			this.numeroRigaPreventivo = numeroRigaPreventivo;
		}

		public LocalDateTime getDataPreventivo() {
			return dataPreventivo;
		}

		public void setDataPreventivo(LocalDateTime dataPreventivo) {
			this.dataPreventivo = dataPreventivo;
		}

		public float getQuantitaEvasa() {
			return quantitaEvasa;
		}

		public void setQuantitaEvasa(float quantitaEvasa) {
			this.quantitaEvasa = quantitaEvasa;
		}

		public boolean isIndicatoreEvasionePreventivi() {
			return indicatoreEvasionePreventivi;
		}

		public void setIndicatoreEvasionePreventivi(boolean indicatoreEvasionePreventivi) {
			this.indicatoreEvasionePreventivi = indicatoreEvasionePreventivi;
		}

		public boolean isIndicatoreEvasioneRigheNote() {
			return indicatoreEvasioneRigheNote;
		}

		public void setIndicatoreEvasioneRigheNote(boolean indicatoreEvasioneRigheNote) {
			this.indicatoreEvasioneRigheNote = indicatoreEvasioneRigheNote;
		}

		public boolean isIndicatoreNoConferma() {
			return indicatoreNoConferma;
		}

		public void setIndicatoreNoConferma(boolean indicatoreNoConferma) {
			this.indicatoreNoConferma = indicatoreNoConferma;
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

		public String getLoginModifica() {
			return loginModifica;
		}

		public void setLoginModifica(String loginModifica) {
			this.loginModifica = loginModifica;
		}

		public LocalDateTime getDataConsegnaSchedulatore() {
			return dataConsegnaSchedulatore;
		}

		public void setDataConsegnaSchedulatore(LocalDateTime dataConsegnaSchedulatore) {
			this.dataConsegnaSchedulatore = dataConsegnaSchedulatore;
		}

		public LocalDateTime getDataConsegnaProposta() {
			return dataConsegnaProposta;
		}

		public void setDataConsegnaProposta(LocalDateTime dataConsegnaProposta) {
			this.dataConsegnaProposta = dataConsegnaProposta;
		}

		public boolean isIndicatoreBloccato() {
			return indicatoreBloccato;
		}

		public void setIndicatoreBloccato(boolean indicatoreBloccato) {
			this.indicatoreBloccato = indicatoreBloccato;
		}

		public boolean isIndicatoreOrdineTrading() {
			return indicatoreOrdineTrading;
		}

		public void setIndicatoreOrdineTrading(boolean indicatoreOrdineTrading) {
			this.indicatoreOrdineTrading = indicatoreOrdineTrading;
		}

		public LocalDateTime getDataInizioSchedulatore() {
			return dataInizioSchedulatore;
		}

		public void setDataInizioSchedulatore(LocalDateTime dataInizioSchedulatore) {
			this.dataInizioSchedulatore = dataInizioSchedulatore;
		}

		public String getCodiceArticoloBis() {
			return codiceArticoloBis;
		}

		public void setCodiceArticoloBis(String codiceArticoloBis) {
			this.codiceArticoloBis = codiceArticoloBis;
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
			OrdineDettaglio other = (OrdineDettaglio) obj;
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
