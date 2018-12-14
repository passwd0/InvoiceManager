package fatturazione.model;

import java.time.LocalDateTime;

public class Tabella_Iva{
	private String CodiceIva; //(4) NOT
	private String Descrizione; //(100)
	private boolean CodiceStato;
	private int RigaIVAAcquisti;
	private float AddizionaleIVA;
	private float AliquotaIVA;
	private float ImponibileAcquisti;
	private float ImponibileAcquistiNonDetraibile;
	private float ImpostaAcquisti;
	private float ImponibileVendite;
	private float ImponibileVenditeNonDetraibile;
	private float ImpostaVendite;
	private int RigaIVAVendite;
	private float CoefficienteIVA;
	private String PercentualeIndetraibilita; //(5)
	private float ValoreArrotondamento;
	private boolean IndicatoreTroncaAcquisti;
	private boolean IndicatoreSommaAcquisti;
	private boolean IndicatoreArrotondaAcquisti;
	private boolean IndicatoreSottraeAcquisti;
	private boolean IndicatoreTroncaVendite;
	private boolean IndicatoreSommaVendite;
	private boolean IndicatoreArrotondaVendite;
	private boolean IndicatoreSottraeVendite;
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimaModifica;
	private String LoginInserimento; //(30)
	private String LoginModifica; //(30)
	private boolean ElencoClientiFornitori;
	private String ColonnaClientiFornitori; //(50)
	private String ColonnaNoteClientiFornitori; //(50)
}
