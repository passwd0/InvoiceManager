package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class PianoConto{
	private String codiceConto; //(30) NOT NULL
	private String descrizione; //(100) NULL
	private LocalDateTime dataUltimoAggiornamento; //  NULL
	private boolean tipo; // NULL
	private String codiceClassificazione; //(50) NULL
	private float darePeriodo; //  NULL
	private float averePeriodo; //  NULL
	private float dareProgressivo; //  NULL
	private float avereProgressivo; //  NULL
	private String codiceDivisa; //(4) NULL
	private String codiceBancaBonifico; //(4) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL

	public PianoConto(String codiceConto){
		this.codiceConto = codiceConto;
	}
}
