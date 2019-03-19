package invoicemanager.model.fatturazione;

import java.time.LocalDateTime;

public class ArticoloMagazzino {
	private String codiceArticolo; //(30) NOT NULL
	private String descrizione; //(200) NULL
	private String codiceUnitaMisura; //(4) NULL
	private String codiceGruppoMerceologico; //(4) NULL
	private String codiceSottogruppoMerceologico; //(4) NULL
	private String codiceControparteContabile; //(4) NULL
	private String codiceIVA; //(4) NULL
	private boolean indicatoreGestionePezzi; // NULL
	private float sconto; //  NULL
	private String codiceTaglieColori; //(30) NULL
	private String codiceColore; //(10) NULL
	private String codiceTaglia; //(10) NULL
	private float percentualeProvvigione; //  NULL
	private boolean indicatoreSerialNumber; // NULL
	private float pesoNetto; //  NULL
	private String codiceConfezione; //(4) NULL
	private float numeroPezziConfezione; //  NULL
	private int numeroColli; //  NULL
	private float pesoLordo; //  NULL
	private float volumeConfezione; //  NULL
	private float altezza; //  NULL
	private float larghezza; //  NULL
	private float profondita; //  NULL
	private boolean indicatoreArticoloPadreFiglio; // NULL
	private String codiceArticoloAlternativo; //(30) NULL
	private String codicePercipiente; //(4) NULL
	private int numeroDecimali; //  NULL
	private String note; //(1500) NULL
	private boolean indicatorePubblicazioneWeb; // NULL
	private boolean indicatoreInibizione; // NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
	private boolean indicatoreScorporoIVA; // NULL
	private String codiceControparteContabileFornitore; //(4) NULL
	private String codiceIVAFornitore; //(4) NULL
	private String codiceStampo; //(10) NULL
	private String noteProduzione; //(1500) NULL

	public ArticoloMagazzino(String codiceArticolo, String descrizione){
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
	}

	public ArticoloMagazzino(String codiceArticolo, String descrizione, String codiceUnitaMisura,
			String codiceGruppoMerceologico, String codiceSottogruppoMerceologico, String codiceControparteContabile,
			String codiceIVA, boolean indicatoreGestionePezzi, float sconto, String codiceTaglieColori,
			String codiceColore, String codiceTaglia, float percentualeProvvigione, boolean indicatoreSerialNumber,
			float pesoNetto, String codiceConfezione, float numeroPezziConfezione, int numeroColli, float pesoLordo,
			float volumeConfezione, float altezza, float larghezza, float profondita,
			boolean indicatoreArticoloPadreFiglio, String codiceArticoloAlternativo, String codicePercipiente,
			int numeroDecimali, String note, boolean indicatorePubblicazioneWeb, boolean indicatoreInibizione,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, boolean indicatoreScorporoIVA,
			String codiceControparteContabileFornitore, String codiceIVAFornitore, String codiceStampo,
			String noteProduzione) {
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
		this.codiceControparteContabile = codiceControparteContabile;
		this.codiceIVA = codiceIVA;
		this.indicatoreGestionePezzi = indicatoreGestionePezzi;
		this.sconto = sconto;
		this.codiceTaglieColori = codiceTaglieColori;
		this.codiceColore = codiceColore;
		this.codiceTaglia = codiceTaglia;
		this.percentualeProvvigione = percentualeProvvigione;
		this.indicatoreSerialNumber = indicatoreSerialNumber;
		this.pesoNetto = pesoNetto;
		this.codiceConfezione = codiceConfezione;
		this.numeroPezziConfezione = numeroPezziConfezione;
		this.numeroColli = numeroColli;
		this.pesoLordo = pesoLordo;
		this.volumeConfezione = volumeConfezione;
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
		this.indicatoreArticoloPadreFiglio = indicatoreArticoloPadreFiglio;
		this.codiceArticoloAlternativo = codiceArticoloAlternativo;
		this.codicePercipiente = codicePercipiente;
		this.numeroDecimali = numeroDecimali;
		this.note = note;
		this.indicatorePubblicazioneWeb = indicatorePubblicazioneWeb;
		this.indicatoreInibizione = indicatoreInibizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
		this.codiceControparteContabileFornitore = codiceControparteContabileFornitore;
		this.codiceIVAFornitore = codiceIVAFornitore;
		this.codiceStampo = codiceStampo;
		this.noteProduzione = noteProduzione;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodiceUnitaMisura() {
		return codiceUnitaMisura;
	}

	public void setCodiceUnitaMisura(String codiceUnitaMisura) {
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public String getCodiceGruppoMerceologico() {
		return codiceGruppoMerceologico;
	}

	public void setCodiceGruppoMerceologico(String codiceGruppoMerceologico) {
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
	}

	public String getCodiceSottogruppoMerceologico() {
		return codiceSottogruppoMerceologico;
	}

	public void setCodiceSottogruppoMerceologico(String codiceSottogruppoMerceologico) {
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}

	public String getCodiceControparteContabile() {
		return codiceControparteContabile;
	}

	public void setCodiceControparteContabile(String codiceControparteContabile) {
		this.codiceControparteContabile = codiceControparteContabile;
	}

	public String getCodiceIVA() {
		return codiceIVA;
	}

	public void setCodiceIVA(String codiceIVA) {
		this.codiceIVA = codiceIVA;
	}

	public boolean isIndicatoreGestionePezzi() {
		return indicatoreGestionePezzi;
	}

	public void setIndicatoreGestionePezzi(boolean indicatoreGestionePezzi) {
		this.indicatoreGestionePezzi = indicatoreGestionePezzi;
	}

	public float getSconto() {
		return sconto;
	}

	public void setSconto(float sconto) {
		this.sconto = sconto;
	}

	public String getCodiceTaglieColori() {
		return codiceTaglieColori;
	}

	public void setCodiceTaglieColori(String codiceTaglieColori) {
		this.codiceTaglieColori = codiceTaglieColori;
	}

	public String getCodiceColore() {
		return codiceColore;
	}

	public void setCodiceColore(String codiceColore) {
		this.codiceColore = codiceColore;
	}

	public String getCodiceTaglia() {
		return codiceTaglia;
	}

	public void setCodiceTaglia(String codiceTaglia) {
		this.codiceTaglia = codiceTaglia;
	}

	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
	}

	public boolean isIndicatoreSerialNumber() {
		return indicatoreSerialNumber;
	}

	public void setIndicatoreSerialNumber(boolean indicatoreSerialNumber) {
		this.indicatoreSerialNumber = indicatoreSerialNumber;
	}

	public float getPesoNetto() {
		return pesoNetto;
	}

	public void setPesoNetto(float pesoNetto) {
		this.pesoNetto = pesoNetto;
	}

	public String getCodiceConfezione() {
		return codiceConfezione;
	}

	public void setCodiceConfezione(String codiceConfezione) {
		this.codiceConfezione = codiceConfezione;
	}

	public float getNumeroPezziConfezione() {
		return numeroPezziConfezione;
	}

	public void setNumeroPezziConfezione(float numeroPezziConfezione) {
		this.numeroPezziConfezione = numeroPezziConfezione;
	}

	public int getNumeroColli() {
		return numeroColli;
	}

	public void setNumeroColli(int numeroColli) {
		this.numeroColli = numeroColli;
	}

	public float getPesoLordo() {
		return pesoLordo;
	}

	public void setPesoLordo(float pesoLordo) {
		this.pesoLordo = pesoLordo;
	}

	public float getVolumeConfezione() {
		return volumeConfezione;
	}

	public void setVolumeConfezione(float volumeConfezione) {
		this.volumeConfezione = volumeConfezione;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}

	public float getProfondita() {
		return profondita;
	}

	public void setProfondita(float profondita) {
		this.profondita = profondita;
	}

	public boolean isIndicatoreArticoloPadreFiglio() {
		return indicatoreArticoloPadreFiglio;
	}

	public void setIndicatoreArticoloPadreFiglio(boolean indicatoreArticoloPadreFiglio) {
		this.indicatoreArticoloPadreFiglio = indicatoreArticoloPadreFiglio;
	}

	public String getCodiceArticoloAlternativo() {
		return codiceArticoloAlternativo;
	}

	public void setCodiceArticoloAlternativo(String codiceArticoloAlternativo) {
		this.codiceArticoloAlternativo = codiceArticoloAlternativo;
	}

	public String getCodicePercipiente() {
		return codicePercipiente;
	}

	public void setCodicePercipiente(String codicePercipiente) {
		this.codicePercipiente = codicePercipiente;
	}

	public int getNumeroDecimali() {
		return numeroDecimali;
	}

	public void setNumeroDecimali(int numeroDecimali) {
		this.numeroDecimali = numeroDecimali;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isIndicatorePubblicazioneWeb() {
		return indicatorePubblicazioneWeb;
	}

	public void setIndicatorePubblicazioneWeb(boolean indicatorePubblicazioneWeb) {
		this.indicatorePubblicazioneWeb = indicatorePubblicazioneWeb;
	}

	public boolean isIndicatoreInibizione() {
		return indicatoreInibizione;
	}

	public void setIndicatoreInibizione(boolean indicatoreInibizione) {
		this.indicatoreInibizione = indicatoreInibizione;
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

	public boolean isIndicatoreScorporoIVA() {
		return indicatoreScorporoIVA;
	}

	public void setIndicatoreScorporoIVA(boolean indicatoreScorporoIVA) {
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
	}

	public String getCodiceControparteContabileFornitore() {
		return codiceControparteContabileFornitore;
	}

	public void setCodiceControparteContabileFornitore(String codiceControparteContabileFornitore) {
		this.codiceControparteContabileFornitore = codiceControparteContabileFornitore;
	}

	public String getCodiceIVAFornitore() {
		return codiceIVAFornitore;
	}

	public void setCodiceIVAFornitore(String codiceIVAFornitore) {
		this.codiceIVAFornitore = codiceIVAFornitore;
	}

	public String getCodiceStampo() {
		return codiceStampo;
	}

	public void setCodiceStampo(String codiceStampo) {
		this.codiceStampo = codiceStampo;
	}

	public String getNoteProduzione() {
		return noteProduzione;
	}

	public void setNoteProduzione(String noteProduzione) {
		this.noteProduzione = noteProduzione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceArticolo == null) ? 0 : codiceArticolo.hashCode());
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
		ArticoloMagazzino other = (ArticoloMagazzino) obj;
		if (codiceArticolo == null) {
			if (other.codiceArticolo != null)
				return false;
		} else if (!codiceArticolo.equals(other.codiceArticolo))
			return false;
		return true;
	}
}
