package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class ArticoloMagazzino{
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
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL
	private boolean indicatoreScorporoIVA; // NULL
	private String codiceControparteContabileFornitore; //(4) NULL
	private String codiceIVAFornitore; //(4) NULL
	private String codiceStampo; //(10) NULL
	private String noteProduzione; //(1500) NULL

	public ArticoloMagazzino(String codiceArticolo){
		this.codiceArticolo = codiceArticolo;
	}

	
	
	
}
