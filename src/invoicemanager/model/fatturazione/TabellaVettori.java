package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaVettori{
		private String codiceVettore; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String via; //(50) NULL
		private String citta; //(100) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private String partitaIva; //(11) NULL
		private String iscrizione; //(50) NULL
		private String telefono; //(50) NULL

	public TabellaVettori(String codiceVettore){
		this.codiceVettore = codiceVettore;
	}
}
