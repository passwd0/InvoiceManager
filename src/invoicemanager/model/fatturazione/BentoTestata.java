package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class BentoTestata{
	private String codiceBento; //(50) NOT NULL
	private String descrizione; //(100) NULL
	private String codiceTipoBento; //(2) NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceClienteFornitore; //(30) NULL
	private String note; //(500) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public BentoTestata(String codiceBento){
		this.codiceBento = codiceBento;
	}
}
