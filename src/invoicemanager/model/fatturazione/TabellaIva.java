package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaIva{
		private String CodiceIva; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private int RigaIVAAcquisti; //  NULL
		private float AddizionaleIVA; //  NULL
		private float AliquotaIVA; //  NULL
		private float ImponibileAcquisti; //  NULL
		private float ImponibileAcquistiNonDetraibile; //  NULL
		private float ImpostaAcquisti; //  NULL
		private float ImponibileVendite; //  NULL
		private float ImponibileVenditeNonDetraibile; //  NULL
		private float ImpostaVendite; //  NULL
		private int RigaIVAVendite; //  NULL
		private float CoefficienteIVA; //  NULL
		private String PercentualeIndetraibilita; //(5) NULL
		private float ValoreArrotondamento; //  NULL
		private boolean IndicatoreTroncaAcquisti; // NULL
		private boolean IndicatoreSommaAcquisti; // NULL
		private boolean IndicatoreArrotondaAcquisti; // NULL
		private boolean IndicatoreSottraeAcquisti; // NULL
		private boolean IndicatoreTroncaVendite; // NULL
		private boolean IndicatoreSommaVendite; // NULL
		private boolean IndicatoreArrotondaVendite; // NULL
		private boolean IndicatoreSottraeVendite; // NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private boolean ElencoClientiFornitori; // NULL
		private String ColonnaClientiFornitori; //(50) NULL
		private String ColonnaNoteClientiFornitori; //(50) NULL
}

public TabellaIva(String CodiceIva){
	this.CodiceIva = CodiceIva;
}
