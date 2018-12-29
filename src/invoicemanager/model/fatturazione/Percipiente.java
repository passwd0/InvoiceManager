package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Percipiente{
	private String codicePercipiente; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private float aliquotaRitenutaAcconto; //  NULL
	private float percentualeImponibileRitenutaAcconto; //  NULL
	private String codiceTributo; //(10) NULL
	private boolean assoggettamentoINPS; // NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public Percipiente(String codicePercipiente){
		this.codicePercipiente = codicePercipiente;
	}
}
