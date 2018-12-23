package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaAgenti{
		private String codiceAgente; //(10) NOT NULL
		private String nome; //(50) NULL
		private float percentualeProvvigione; //  NULL
		private boolean tipoProvvigione; // NULL
		private boolean tipoMandato; // NULL
		private String codiceContabile; //(30) NULL
		private TabellaControparti codiceControparte; // (10) COLLATE Latin1_General_CI_AS NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL

	public TabellaAgenti(String codiceAgente){
		this.codiceAgente = codiceAgente;
	}
}
