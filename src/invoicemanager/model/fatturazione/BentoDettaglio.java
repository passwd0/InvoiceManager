package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class BentoDettaglio{
	private String codiceBento; //(50) NOT NULL
	private short numeroRigaBento; //  NOT NULL
	private String codiceTipoBento; //(2) NULL
	private String codiceRigaBento; //(2) NULL
	private String codiceArticolo; //(30) NULL
	private String descrizione; //(2000) NULL
	private float quantita; // (19, 4) NULL
	private String codiceUnitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private String codiceIVA; //(4) NULL
	private String codiceControparte; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceCausale; //(4) NULL
	private String descrizioneAggiuntiva; //(200) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public BentoDettaglio(String codiceBento, short numeroRigaBento){
		this.codiceBento = codiceBento;
		this.numeroRigaBento = numeroRigaBento;
	}
}
