package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaControparti{
		private String codiceControparte; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String codiceContoCOGE; //(30) NULL
		private int progressivoRelazioniCOGECOA; //  NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public TabellaControparti(String codiceControparte){
		this.codiceControparte = codiceControparte;
	}
}
