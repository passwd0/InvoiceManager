package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class CausaleMagazzino{
	private String codiceCausale; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
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
	private String codiceCausaleConcatenata; //(4) NULL
	private LocalDateTime dataUltimoAggiornamentoCausale; //  NULL
	private String nomeFileMemo; //(50) NULL
	private boolean indicatoreModifica; // NULL
	private boolean indicatoreBollaEntrata; // NULL
	private boolean indicatoreDocumentoDiTrasporto; // NULL
	private boolean indicatoreFatturaAccompagnatoria; // NULL
	private boolean indicatoreOrdineCliente; // NULL
	private boolean indicatoreOrdineFornitore; // NULL
	private boolean indicatoreDistinta; // NULL
	private String note; //(300) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL

	public CausaleMagazzino(String codiceCausale){
		this.codiceCausale = codiceCausale;
	}
}
