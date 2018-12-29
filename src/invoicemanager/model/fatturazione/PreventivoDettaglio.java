package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class PreventivoDettaglio{
	private int numeroPreventivo; //  NOT NULL
	private short numeroRigaPreventivo; //  NOT NULL
	private LocalDateTime dataPreventivo; //  NOT NULL
	private String codiceTipoRigaDocumento; //(4) NULL
	private String codiceArticolo; //(30) NULL
	private float quantitaArticolo; //  NULL
	private float quantitaConsegnata; //  NULL
	private float quantitaDaConsegnare; //  NULL
	private String descrizione; //(200) NULL
	private String descrizioneAggiuntiva; //(8000) NULL
	private LocalDateTime dataConsegna; //  NULL
	private String codiceUnitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private String codiceIVA; //(4) NULL
	private String codiceControparte; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private String codiceMagazzino; //(4) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public PreventivoDettaglio(int numeroPreventivo, short numeroRigaPreventivo, LocalDateTime dataPreventivo){
		this.numeroPreventivo = numeroPreventivo;
		this.numeroRigaPreventivo = numeroRigaPreventivo;
		this.dataPreventivo = dataPreventivo;
	}
}
