package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaPagamenti{
		private String codicePagamento; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private List<TipoPagamento> codiceTipoPagamento; // (10) COLLATE Latin1_General_CI_AS NULL
		private boolean indicatoreScadenzaAVista; // NULL
		private String giornoMese; //(10) NULL
		private int numeroGiorni; //  NULL
		private short numeroScadenze; //  NULL
		private float sconto; //  NULL
		private boolean scadenzaIVAPrimaRata; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public TabellaPagamenti(String codicePagamento){
		this.codicePagamento = codicePagamento;
	}
}
