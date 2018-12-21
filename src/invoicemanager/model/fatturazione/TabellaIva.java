package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaIva{
		private String codiceIva; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private int rigaIVAAcquisti; //  NULL
		private float addizionaleIVA; //  NULL
		private float aliquotaIVA; //  NULL
		private float imponibileAcquisti; //  NULL
		private float imponibileAcquistiNonDetraibile; //  NULL
		private float impostaAcquisti; //  NULL
		private float imponibileVendite; //  NULL
		private float imponibileVenditeNonDetraibile; //  NULL
		private float impostaVendite; //  NULL
		private int rigaIVAVendite; //  NULL
		private float coefficienteIVA; //  NULL
		private String percentualeIndetraibilita; //(5) NULL
		private float valoreArrotondamento; //  NULL
		private boolean indicatoreTroncaAcquisti; // NULL
		private boolean indicatoreSommaAcquisti; // NULL
		private boolean indicatoreArrotondaAcquisti; // NULL
		private boolean indicatoreSottraeAcquisti; // NULL
		private boolean indicatoreTroncaVendite; // NULL
		private boolean indicatoreSommaVendite; // NULL
		private boolean indicatoreArrotondaVendite; // NULL
		private boolean indicatoreSottraeVendite; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private boolean elencoClientiFornitori; // NULL
		private String colonnaClientiFornitori; //(50) NULL
		private String colonnaNoteClientiFornitori; //(50) NULL

	public TabellaIva(String codiceIva){
		this.codiceIva = codiceIva;
	}
}
