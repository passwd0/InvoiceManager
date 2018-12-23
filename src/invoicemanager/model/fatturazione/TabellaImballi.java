package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaImballi{
		private String codiceImballo; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private StatiTabelle codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public TabellaImballi(String codiceImballo){
		this.codiceImballo = codiceImballo;
	}
}
