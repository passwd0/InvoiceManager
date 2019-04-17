package invoicemanager.model;
import java.time.LocalDateTime;

public class CausaleMagazzino {
	private String codiceCausaleMagazzino; //(4) NOT NULL			x
	private String descrizione; //(100) NULL						x		
	private Stato stato = Stato.DISPONIBILE; // NULL				x
	private boolean segnoEsistenza; // NULL
	private boolean segnoImpegniCliente; // NULL
	private boolean segnoOrdiniFornitore; // NULL
	private boolean segnoFatturato; // NULL
	private boolean segnoCaricoAValore; // NULL
	private boolean segnoUnitaVendute; // NULL
	private boolean segnoCaricoAQuantita; // NULL
	private boolean indicatoreMovimentoAQuantita; // NULL
	private boolean indicatoreMovimentoAValore; // NULL
	private boolean indicatoreMovimentoContoLavorazione; // NULL
	private boolean indicatoreMovimentoCommessa; // NULL
	private boolean indicatoreAggiornamentoDataUltimoCarico; // NULL
	private boolean indicatoreAggiornamentoDataUltimoScarico; // NULL
	private boolean indicatoreAggiornamentoCostoUltimo; // NULL
	private String valoreDaProporre; //(10) NULL
	private String valorePerValorizzazioneMovimenti; //(10) NULL
	private boolean indicatoreConcatenamento; // NULL
	private String codiceCausaleMagazzinoConcatenata; //(4) NULL
	private String nomeFileMemo; //(50) NULL
	private boolean indicatoreModifica; // NULL
	private boolean indicatoreBollaEntrata; // NULL
	private boolean indicatoreDocumentoDiTrasporto; // NULL
	private boolean indicatoreFatturaAccompagnatoria; // NULL
	private boolean indicatoreOrdineCliente; // NULL
	private boolean indicatoreOrdineFornitore; // NULL
	private boolean indicatoreDistinta; // NULL
	private String note; //(300) NULL								x
	private boolean indicatoreLotti;
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public CausaleMagazzino(String codiceCausaleMagazzino, String descrizione){
		this.codiceCausaleMagazzino = codiceCausaleMagazzino;
		this.descrizione = descrizione;
	}

	public CausaleMagazzino(String codiceCausaleMagazzino, String descrizione, Stato stato, boolean segnoEsistenza,
			boolean segnoImpegniCliente, boolean segnoOrdiniFornitore, boolean segnoFatturato,
			boolean segnoCaricoAValore, boolean segnoUnitaVendute, boolean segnoCaricoAQuantita,
			boolean indicatoreMovimentoAQuantita, boolean indicatoreMovimentoAValore,
			boolean indicatoreMovimentoContoLavorazione, boolean indicatoreMovimentoCommessa,
			boolean indicatoreAggiornamentoDataUltimoCarico, boolean indicatoreAggiornamentoDataUltimoScarico,
			boolean indicatoreAggiornamentoCostoUltimo, String valoreDaProporre,
			String valorePerValorizzazioneMovimenti, boolean indicatoreConcatenamento, String codiceCausaleMagazzinoConcatenata,
			String nomeFileMemo, boolean indicatoreModifica, boolean indicatoreBollaEntrata,
			boolean indicatoreDocumentoDiTrasporto, boolean indicatoreFatturaAccompagnatoria,
			boolean indicatoreOrdineCliente, boolean indicatoreOrdineFornitore, boolean indicatoreDistinta, String note,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, boolean indicatoreLotti) {
		this.codiceCausaleMagazzino = codiceCausaleMagazzino;
		this.descrizione = descrizione;
		this.stato = stato;
		this.segnoEsistenza = segnoEsistenza;
		this.segnoImpegniCliente = segnoImpegniCliente;
		this.segnoOrdiniFornitore = segnoOrdiniFornitore;
		this.segnoFatturato = segnoFatturato;
		this.segnoCaricoAValore = segnoCaricoAValore;
		this.segnoUnitaVendute = segnoUnitaVendute;
		this.segnoCaricoAQuantita = segnoCaricoAQuantita;
		this.indicatoreMovimentoAQuantita = indicatoreMovimentoAQuantita;
		this.indicatoreMovimentoAValore = indicatoreMovimentoAValore;
		this.indicatoreMovimentoContoLavorazione = indicatoreMovimentoContoLavorazione;
		this.indicatoreMovimentoCommessa = indicatoreMovimentoCommessa;
		this.indicatoreAggiornamentoDataUltimoCarico = indicatoreAggiornamentoDataUltimoCarico;
		this.indicatoreAggiornamentoDataUltimoScarico = indicatoreAggiornamentoDataUltimoScarico;
		this.indicatoreAggiornamentoCostoUltimo = indicatoreAggiornamentoCostoUltimo;
		this.valoreDaProporre = valoreDaProporre;
		this.valorePerValorizzazioneMovimenti = valorePerValorizzazioneMovimenti;
		this.indicatoreConcatenamento = indicatoreConcatenamento;
		this.codiceCausaleMagazzinoConcatenata = codiceCausaleMagazzinoConcatenata;
		this.nomeFileMemo = nomeFileMemo;
		this.indicatoreModifica = indicatoreModifica;
		this.indicatoreBollaEntrata = indicatoreBollaEntrata;
		this.indicatoreDocumentoDiTrasporto = indicatoreDocumentoDiTrasporto;
		this.indicatoreFatturaAccompagnatoria = indicatoreFatturaAccompagnatoria;
		this.indicatoreOrdineCliente = indicatoreOrdineCliente;
		this.indicatoreOrdineFornitore = indicatoreOrdineFornitore;
		this.indicatoreDistinta = indicatoreDistinta;
		this.note = note;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.indicatoreLotti = indicatoreLotti;
	}

	public String getCodiceCausaleMagazzino() {
		return codiceCausaleMagazzino;
	}

	public void setCodiceCausaleMagazzino(String codiceCausaleMagazzino) {
		this.codiceCausaleMagazzino = codiceCausaleMagazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	public boolean isSegnoEsistenza() {
		return segnoEsistenza;
	}

	public void setSegnoEsistenza(boolean segnoEsistenza) {
		this.segnoEsistenza = segnoEsistenza;
	}

	public boolean isSegnoImpegniCliente() {
		return segnoImpegniCliente;
	}

	public void setSegnoImpegniCliente(boolean segnoImpegniCliente) {
		this.segnoImpegniCliente = segnoImpegniCliente;
	}

	public boolean isSegnoOrdiniFornitore() {
		return segnoOrdiniFornitore;
	}

	public void setSegnoOrdiniFornitore(boolean segnoOrdiniFornitore) {
		this.segnoOrdiniFornitore = segnoOrdiniFornitore;
	}

	public boolean isSegnoFatturato() {
		return segnoFatturato;
	}

	public void setSegnoFatturato(boolean segnoFatturato) {
		this.segnoFatturato = segnoFatturato;
	}

	public boolean isSegnoCaricoAValore() {
		return segnoCaricoAValore;
	}

	public void setSegnoCaricoAValore(boolean segnoCaricoAValore) {
		this.segnoCaricoAValore = segnoCaricoAValore;
	}

	public boolean isSegnoUnitaVendute() {
		return segnoUnitaVendute;
	}

	public void setSegnoUnitaVendute(boolean segnoUnitaVendute) {
		this.segnoUnitaVendute = segnoUnitaVendute;
	}

	public boolean isSegnoCaricoAQuantita() {
		return segnoCaricoAQuantita;
	}

	public void setSegnoCaricoAQuantita(boolean segnoCaricoAQuantita) {
		this.segnoCaricoAQuantita = segnoCaricoAQuantita;
	}

	public boolean isIndicatoreMovimentoAQuantita() {
		return indicatoreMovimentoAQuantita;
	}

	public void setIndicatoreMovimentoAQuantita(boolean indicatoreMovimentoAQuantita) {
		this.indicatoreMovimentoAQuantita = indicatoreMovimentoAQuantita;
	}

	public boolean isIndicatoreMovimentoAValore() {
		return indicatoreMovimentoAValore;
	}

	public void setIndicatoreMovimentoAValore(boolean indicatoreMovimentoAValore) {
		this.indicatoreMovimentoAValore = indicatoreMovimentoAValore;
	}

	public boolean isIndicatoreMovimentoContoLavorazione() {
		return indicatoreMovimentoContoLavorazione;
	}

	public void setIndicatoreMovimentoContoLavorazione(boolean indicatoreMovimentoContoLavorazione) {
		this.indicatoreMovimentoContoLavorazione = indicatoreMovimentoContoLavorazione;
	}

	public boolean isIndicatoreMovimentoCommessa() {
		return indicatoreMovimentoCommessa;
	}

	public void setIndicatoreMovimentoCommessa(boolean indicatoreMovimentoCommessa) {
		this.indicatoreMovimentoCommessa = indicatoreMovimentoCommessa;
	}

	public boolean isIndicatoreAggiornamentoDataUltimoCarico() {
		return indicatoreAggiornamentoDataUltimoCarico;
	}

	public void setIndicatoreAggiornamentoDataUltimoCarico(boolean indicatoreAggiornamentoDataUltimoCarico) {
		this.indicatoreAggiornamentoDataUltimoCarico = indicatoreAggiornamentoDataUltimoCarico;
	}

	public boolean isIndicatoreAggiornamentoDataUltimoScarico() {
		return indicatoreAggiornamentoDataUltimoScarico;
	}

	public void setIndicatoreAggiornamentoDataUltimoScarico(boolean indicatoreAggiornamentoDataUltimoScarico) {
		this.indicatoreAggiornamentoDataUltimoScarico = indicatoreAggiornamentoDataUltimoScarico;
	}

	public boolean isIndicatoreAggiornamentoCostoUltimo() {
		return indicatoreAggiornamentoCostoUltimo;
	}

	public void setIndicatoreAggiornamentoCostoUltimo(boolean indicatoreAggiornamentoCostoUltimo) {
		this.indicatoreAggiornamentoCostoUltimo = indicatoreAggiornamentoCostoUltimo;
	}

	public String getValoreDaProporre() {
		return valoreDaProporre;
	}

	public void setValoreDaProporre(String valoreDaProporre) {
		this.valoreDaProporre = valoreDaProporre;
	}

	public String getValorePerValorizzazioneMovimenti() {
		return valorePerValorizzazioneMovimenti;
	}

	public void setValorePerValorizzazioneMovimenti(String valorePerValorizzazioneMovimenti) {
		this.valorePerValorizzazioneMovimenti = valorePerValorizzazioneMovimenti;
	}

	public boolean isIndicatoreConcatenamento() {
		return indicatoreConcatenamento;
	}

	public void setIndicatoreConcatenamento(boolean indicatoreConcatenamento) {
		this.indicatoreConcatenamento = indicatoreConcatenamento;
	}

	public String getCodiceCausaleMagazzinoConcatenata() {
		return codiceCausaleMagazzinoConcatenata;
	}

	public void setCodiceCausaleMagazzinoConcatenata(String codiceCausaleMagazzinoConcatenata) {
		this.codiceCausaleMagazzinoConcatenata = codiceCausaleMagazzinoConcatenata;
	}

	public String getNomeFileMemo() {
		return nomeFileMemo;
	}

	public void setNomeFileMemo(String nomeFileMemo) {
		this.nomeFileMemo = nomeFileMemo;
	}

	public boolean isIndicatoreModifica() {
		return indicatoreModifica;
	}

	public void setIndicatoreModifica(boolean indicatoreModifica) {
		this.indicatoreModifica = indicatoreModifica;
	}

	public boolean isIndicatoreBollaEntrata() {
		return indicatoreBollaEntrata;
	}

	public void setIndicatoreBollaEntrata(boolean indicatoreBollaEntrata) {
		this.indicatoreBollaEntrata = indicatoreBollaEntrata;
	}

	public boolean isIndicatoreDocumentoDiTrasporto() {
		return indicatoreDocumentoDiTrasporto;
	}

	public void setIndicatoreDocumentoDiTrasporto(boolean indicatoreDocumentoDiTrasporto) {
		this.indicatoreDocumentoDiTrasporto = indicatoreDocumentoDiTrasporto;
	}

	public boolean isIndicatoreFatturaAccompagnatoria() {
		return indicatoreFatturaAccompagnatoria;
	}

	public void setIndicatoreFatturaAccompagnatoria(boolean indicatoreFatturaAccompagnatoria) {
		this.indicatoreFatturaAccompagnatoria = indicatoreFatturaAccompagnatoria;
	}

	public boolean isIndicatoreOrdineCliente() {
		return indicatoreOrdineCliente;
	}

	public void setIndicatoreOrdineCliente(boolean indicatoreOrdineCliente) {
		this.indicatoreOrdineCliente = indicatoreOrdineCliente;
	}

	public boolean isIndicatoreOrdineFornitore() {
		return indicatoreOrdineFornitore;
	}

	public void setIndicatoreOrdineFornitore(boolean indicatoreOrdineFornitore) {
		this.indicatoreOrdineFornitore = indicatoreOrdineFornitore;
	}

	public boolean isIndicatoreDistinta() {
		return indicatoreDistinta;
	}

	public void setIndicatoreDistinta(boolean indicatoreDistinta) {
		this.indicatoreDistinta = indicatoreDistinta;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public boolean isIndicatoreLotti() {
		return indicatoreLotti;
	}

	public void setIndicatoreLotti(boolean indicatoreLotti) {
		this.indicatoreLotti = indicatoreLotti;
	}
}
