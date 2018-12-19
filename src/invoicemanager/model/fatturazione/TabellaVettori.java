package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaVettori{
		private String CodiceVettore; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String Via; //(50) NULL
		private String Citta; //(100) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private String PartitaIva; //(11) NULL
		private String Iscrizione; //(50) NULL
		private String Telefono; //(50) NULL
}
