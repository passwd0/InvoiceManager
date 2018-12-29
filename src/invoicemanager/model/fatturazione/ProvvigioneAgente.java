package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class ProvvigioneAgente{
	private String codiceProvvigione; //(50) NULL
	private String codiceAgente; //(10) NULL
	private float scontoLegatoProvvigione; //  NULL
	private float provvigioneLegataSconto; //  NULL
	private int progressivo; //  NULL
	private String codiceGruppoMerceologico; //(4) NULL
	private LocalDateTime dataInserimento; //  NULL

	public ProvvigioneAgente(){
	}
}
