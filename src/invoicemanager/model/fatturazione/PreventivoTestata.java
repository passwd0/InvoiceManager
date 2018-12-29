package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class PreventivoTestata{
	private int numeroPreventivo; //  NOT NULL
	private LocalDateTime dataPreventivo; //  NOT NULL
	private boolean indicatoreStatoAvanzamento; // NULL
	private LocalDateTime dataConsegna; //  NULL
	private LocalDateTime dataValidita; //  NULL
	private String periodoValidita; //(100) NULL
	private boolean indicatoreUtilizzoDataValidita; // NULL
	private String codiceCliente; //(30) NULL
	private String attenzione; //(50) NULL
	private String oggetto; //(2000) NULL
	private String riferimentoInterno; //(50) NULL
	private String numeroInterno; //(50) NULL
	private String codiceIVA; //(4) NULL
	private String codiceAgente; //(10) NULL
	private String codiceResa; //(4) NULL
	private String codiceVettore; //(4) NULL
	private String codicePagamento; //(4) NULL
	private String codiceBanca; //(4) NULL
	private String codiceCausale; //(4) NULL
	private String codiceCausalePrelievo; //(4) NULL
	private boolean codiceListino; // NULL
	private String descrizioneOrdine; //(200) NULL
	private String codiceDivisa; //(4) NULL
	private float cambio; //  NULL
	private String numeroFax; //(30) NULL
	private String venditore; //(50) NULL
	private boolean indicatoreAddebitoBolli; // NULL
	private boolean indicatoreAddebitoSpeseIncasso; // NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String note; //(200) NULL
	private String codiceClienteSpedizione; //(30) NULL
	private String nomeSpedizione; //(50) NULL
	private String indirizzoSpedizione; //(100) NULL
	private String capSpedizione; //(20) NULL
	private String cittaSpedizione; //(50) NULL
	private String provinciaSpedizione; //(30) NULL
	private String codiceNazioneSpedizione; //(10) NULL
	private String loginInserimento; //(30) NULL

	public PreventivoTestata(int numeroPreventivo, LocalDateTime dataPreventivo){
		this.numeroPreventivo = numeroPreventivo;
		this.dataPreventivo = dataPreventivo;
	}
}
