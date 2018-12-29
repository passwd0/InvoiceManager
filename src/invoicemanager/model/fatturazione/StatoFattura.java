package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class StatoFattura{
	private boolean indicatoreStatoAvanzamento; // NOT NULL
	private String descrizione; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public StatoFattura(boolean indicatoreStatoAvanzamento){
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}
}
