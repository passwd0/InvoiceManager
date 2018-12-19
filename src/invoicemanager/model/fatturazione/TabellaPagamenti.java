package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaPagamenti{
		private String CodicePagamento; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private List<TipoPagamento> CodiceTipoPagamento; // (10) COLLATE Latin1_General_CI_AS NULL
		private boolean IndicatoreScadenzaAVista; // NULL
		private String GiornoMese; //(10) NULL
		private int NumeroGiorni; //  NULL
		private short NumeroScadenze; //  NULL
		private float Sconto; //  NULL
		private boolean ScadenzaIVAPrimaRata; // NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
}

public TabellaPagamenti(String CodicePagamento){
	this.CodicePagamento = CodicePagamento;
}
