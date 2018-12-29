package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class GruppoMerceologico{
	private String codiceGruppoMerceologico; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato; // NULL
	private float sconto; //  NULL
	private float percentualeProvvigione; //  NULL
	private int numeroPezziConfezione; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public GruppoMerceologico(String codiceGruppoMerceologico){
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
	}
}
