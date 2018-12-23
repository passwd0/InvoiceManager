package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Ordine_Dettaglio{
		private int NumeroOrdine; //  NOT NULL
		private short NumeroRigaOrdine; //  NOT NULL
		private LocalDateTime DataOrdine; //  NOT NULL
		private String CodiceTipoRigaDocumento; //(4) NULL
		private String CodiceMagazzino; //(4) NULL
		private String CodiceArticolo; //(30) NULL
		private float QuantitaConsegnata; //  NULL
		private boolean IndicatoreEvasione; // NULL
		private String Descrizione; //(2000) NULL
		private LocalDateTime DataConsegna; //  NULL
		private float Quantita; //  NULL
		private String CodiceUnitaMisura; //(4) NULL
		private float Prezzo; // (19, 5) NULL
		private String CodiceIva; //(4) NULL
		private String CodiceContropartitaContabile; //(4) NULL
		private float PercentualeProvvigione; //  NULL
		private float PercentualeScontoCliente; //  NULL
		private float PercentualeScontoArticolo; //  NULL
		private float PercentualeScontoPagamento; //  NULL
		private String DescrizioneAggiuntiva; //(2000) NULL
		private boolean IndicatoreCoordinamento; // NULL
		private boolean IndicatoreOrdineDaFatturare; // NULL
		private float QuantitaVariata; //  NULL
		private int NumeroPreventivo; //  NULL
		private short NumeroRigaPreventivo; //  NULL
		private LocalDateTime DataPreventivo; //  NULL
		private float QuantitaEvasa; //  NULL
		private boolean IndicatoreEvasionePreventivi; // NULL
		private boolean IndicatoreEvasioneRigheNote; // NULL
		private boolean IndicatoreNoConferma; // NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private LocalDateTime DataConsegnaSchedulatore; //  NULL
		private LocalDateTime DataConsegnaProposta; //  NULL
		private boolean IndicatoreBloccato; // NULL
		private boolean IndicatoreOrdineTrading; // NULL
		private LocalDateTime DataInizioSchedulatore; //  NULL
		private String CodiceArticoloBis; //(30) NULL

	public Ordine_Dettaglio(int NumeroOrdine, short NumeroRigaOrdine, LocalDateTime DataOrdine){
		this.NumeroOrdine = NumeroOrdine;
		this.NumeroRigaOrdine = NumeroRigaOrdine;
		this.DataOrdine = DataOrdine;
	}

	public int getNumeroOrdine() {
		return NumeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		NumeroOrdine = numeroOrdine;
	}

	public short getNumeroRigaOrdine() {
		return NumeroRigaOrdine;
	}

	public void setNumeroRigaOrdine(short numeroRigaOrdine) {
		NumeroRigaOrdine = numeroRigaOrdine;
	}

	public LocalDateTime getDataOrdine() {
		return DataOrdine;
	}

	public void setDataOrdine(LocalDateTime dataOrdine) {
		DataOrdine = dataOrdine;
	}

	public String getCodiceTipoRigaDocumento() {
		return CodiceTipoRigaDocumento;
	}

	public void setCodiceTipoRigaDocumento(String codiceTipoRigaDocumento) {
		CodiceTipoRigaDocumento = codiceTipoRigaDocumento;
	}

	public String getCodiceMagazzino() {
		return CodiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		CodiceMagazzino = codiceMagazzino;
	}

	public String getCodiceArticolo() {
		return CodiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		CodiceArticolo = codiceArticolo;
	}

	public float getQuantitaConsegnata() {
		return QuantitaConsegnata;
	}

	public void setQuantitaConsegnata(float quantitaConsegnata) {
		QuantitaConsegnata = quantitaConsegnata;
	}

	public boolean isIndicatoreEvasione() {
		return IndicatoreEvasione;
	}

	public void setIndicatoreEvasione(boolean indicatoreEvasione) {
		IndicatoreEvasione = indicatoreEvasione;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public LocalDateTime getDataConsegna() {
		return DataConsegna;
	}

	public void setDataConsegna(LocalDateTime dataConsegna) {
		DataConsegna = dataConsegna;
	}

	public float getQuantita() {
		return Quantita;
	}

	public void setQuantita(float quantita) {
		Quantita = quantita;
	}

	public String getCodiceUnitaMisura() {
		return CodiceUnitaMisura;
	}

	public void setCodiceUnitaMisura(String codiceUnitaMisura) {
		CodiceUnitaMisura = codiceUnitaMisura;
	}

	public float getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}

	public String getCodiceIva() {
		return CodiceIva;
	}

	public void setCodiceIva(String codiceIva) {
		CodiceIva = codiceIva;
	}

	public String getCodiceContropartitaContabile() {
		return CodiceContropartitaContabile;
	}

	public void setCodiceContropartitaContabile(String codiceContropartitaContabile) {
		CodiceContropartitaContabile = codiceContropartitaContabile;
	}

	public float getPercentualeProvvigione() {
		return PercentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		PercentualeProvvigione = percentualeProvvigione;
	}

	public float getPercentualeScontoCliente() {
		return PercentualeScontoCliente;
	}

	public void setPercentualeScontoCliente(float percentualeScontoCliente) {
		PercentualeScontoCliente = percentualeScontoCliente;
	}

	public float getPercentualeScontoArticolo() {
		return PercentualeScontoArticolo;
	}

	public void setPercentualeScontoArticolo(float percentualeScontoArticolo) {
		PercentualeScontoArticolo = percentualeScontoArticolo;
	}

	public float getPercentualeScontoPagamento() {
		return PercentualeScontoPagamento;
	}

	public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
		PercentualeScontoPagamento = percentualeScontoPagamento;
	}

	public String getDescrizioneAggiuntiva() {
		return DescrizioneAggiuntiva;
	}

	public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
		DescrizioneAggiuntiva = descrizioneAggiuntiva;
	}

	public boolean isIndicatoreCoordinamento() {
		return IndicatoreCoordinamento;
	}

	public void setIndicatoreCoordinamento(boolean indicatoreCoordinamento) {
		IndicatoreCoordinamento = indicatoreCoordinamento;
	}

	public boolean isIndicatoreOrdineDaFatturare() {
		return IndicatoreOrdineDaFatturare;
	}

	public void setIndicatoreOrdineDaFatturare(boolean indicatoreOrdineDaFatturare) {
		IndicatoreOrdineDaFatturare = indicatoreOrdineDaFatturare;
	}

	public float getQuantitaVariata() {
		return QuantitaVariata;
	}

	public void setQuantitaVariata(float quantitaVariata) {
		QuantitaVariata = quantitaVariata;
	}

	public int getNumeroPreventivo() {
		return NumeroPreventivo;
	}

	public void setNumeroPreventivo(int numeroPreventivo) {
		NumeroPreventivo = numeroPreventivo;
	}

	public short getNumeroRigaPreventivo() {
		return NumeroRigaPreventivo;
	}

	public void setNumeroRigaPreventivo(short numeroRigaPreventivo) {
		NumeroRigaPreventivo = numeroRigaPreventivo;
	}

	public LocalDateTime getDataPreventivo() {
		return DataPreventivo;
	}

	public void setDataPreventivo(LocalDateTime dataPreventivo) {
		DataPreventivo = dataPreventivo;
	}

	public float getQuantitaEvasa() {
		return QuantitaEvasa;
	}

	public void setQuantitaEvasa(float quantitaEvasa) {
		QuantitaEvasa = quantitaEvasa;
	}

	public boolean isIndicatoreEvasionePreventivi() {
		return IndicatoreEvasionePreventivi;
	}

	public void setIndicatoreEvasionePreventivi(boolean indicatoreEvasionePreventivi) {
		IndicatoreEvasionePreventivi = indicatoreEvasionePreventivi;
	}

	public boolean isIndicatoreEvasioneRigheNote() {
		return IndicatoreEvasioneRigheNote;
	}

	public void setIndicatoreEvasioneRigheNote(boolean indicatoreEvasioneRigheNote) {
		IndicatoreEvasioneRigheNote = indicatoreEvasioneRigheNote;
	}

	public boolean isIndicatoreNoConferma() {
		return IndicatoreNoConferma;
	}

	public void setIndicatoreNoConferma(boolean indicatoreNoConferma) {
		IndicatoreNoConferma = indicatoreNoConferma;
	}

	public LocalDateTime getDataInserimento() {
		return DataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		DataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return DataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		DataUltimaModifica = dataUltimaModifica;
	}

	public String getLoginInserimento() {
		return LoginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		LoginInserimento = loginInserimento;
	}

	public String getLoginModifica() {
		return LoginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		LoginModifica = loginModifica;
	}

	public LocalDateTime getDataConsegnaSchedulatore() {
		return DataConsegnaSchedulatore;
	}

	public void setDataConsegnaSchedulatore(LocalDateTime dataConsegnaSchedulatore) {
		DataConsegnaSchedulatore = dataConsegnaSchedulatore;
	}

	public LocalDateTime getDataConsegnaProposta() {
		return DataConsegnaProposta;
	}

	public void setDataConsegnaProposta(LocalDateTime dataConsegnaProposta) {
		DataConsegnaProposta = dataConsegnaProposta;
	}

	public boolean isIndicatoreBloccato() {
		return IndicatoreBloccato;
	}

	public void setIndicatoreBloccato(boolean indicatoreBloccato) {
		IndicatoreBloccato = indicatoreBloccato;
	}

	public boolean isIndicatoreOrdineTrading() {
		return IndicatoreOrdineTrading;
	}

	public void setIndicatoreOrdineTrading(boolean indicatoreOrdineTrading) {
		IndicatoreOrdineTrading = indicatoreOrdineTrading;
	}

	public LocalDateTime getDataInizioSchedulatore() {
		return DataInizioSchedulatore;
	}

	public void setDataInizioSchedulatore(LocalDateTime dataInizioSchedulatore) {
		DataInizioSchedulatore = dataInizioSchedulatore;
	}

	public String getCodiceArticoloBis() {
		return CodiceArticoloBis;
	}

	public void setCodiceArticoloBis(String codiceArticoloBis) {
		CodiceArticoloBis = codiceArticoloBis;
	}
}
