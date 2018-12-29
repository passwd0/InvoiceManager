package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class SottogruppoMerceologico{
	private String codiceSottogruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public SottogruppoMerceologico(String codiceSottogruppoMerceologico){
		this.codiceSottogruppoMerceologico = codiceSottogruppoMerceologico;
	}
}
