package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Clienti{
		private String CodiceCliente; //(30) NOT NULL
		private String Descrizione; //(100) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimoAggiornamento; //  NULL
		private List<TipoCliente> CodiceTipoCliente; // (4) COLLATE Latin1_General_CI_AS NULL
		private String CodiceUfficioCommerciale; //(20) NULL
		private List<TabellaResaMerce> CodiceResaMerce; // (4) COLLATE Latin1_General_CI_AS NULL
		private List<TabellaImballi> CodiceImballo; // (4) COLLATE Latin1_General_CI_AS NULL
		private List<TabellaRaggruppamentiClientiFornitori> CodiceRaggruppamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private float Fatturato; //  NULL
		private float Fido; //  NULL
		private String PartitaIVA; //(15) NULL
		private String CodiceFiscale; //(16) NULL
		private List<TabellaPagamenti> CodicePagamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private String Sinonimo; //(50) NULL
		private List<TabellaBanche> CodiceBanca; // (4) COLLATE Latin1_General_CI_AS NULL
		private short NumeroFattureEmesse; //  NULL
		private List<TabellaIva> CodiceEsenzioneIVA; // (4) COLLATE Latin1_General_CI_AS NULL
		private float ImponibileNonEsente; //  NULL
		private float ImponibileEsente; //  NULL
		private float ImportoIVA; //  NULL
		private String CodiceClassificazione; //(10) NULL
		private float CostoVenduto; //  NULL
		private List<TabellaAgenti> CodiceAgente; // (10) COLLATE Latin1_General_CI_AS NULL
		private float PercentualeProvvigioneAgente; //  NULL
		private float ScontoLegatoProvvigioniAgente; //  NULL
		private short NumeroCopieFattura; //  NULL
		private boolean IndicatoreAddebitoSpeseIncasso; // NULL
		private boolean IndicatoreAddebitoSpeseBolli; // NULL
		private int CodiceListino; //  NULL
		private String CodiceVettore; //(3) NULL
		private String CodiceAffidabilita; //(4) NULL
		private List<TabellaIso> CodiceISO; // (4) COLLATE Latin1_General_CI_AS NULL
		private String PartitaIVAEstero; //(12) NULL
		private String CodiceDivisa; //(4) NULL
		private int DataScadenzaSpostataAgosto; //  NULL
		private int DataScadenzaSpostataDicembre; //  NULL
		private String CodiceRetrocessione; //(5) NULL
		private String CodiceCommissione; //(5) NULL
		private String CodiceLingua; //(5) NULL
		private String Note; //(6000) NULL
		private List<StatiTabelle> CodiceStato; // (2) COLLATE Latin1_General_CI_AS NULL
		private boolean IndicatoreInviataInformativaPrivacy; // NULL
		private boolean IndicatoreRicevutaInformativaPrivacy; // NULL
		private String CodiceClienteRiferimento; //(15) NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private boolean IndicatoreInibizione; // NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private boolean IndicatoreScorporoIVA; // NULL
		private boolean IndicatoreIVADifferita; // NULL
		private boolean IndicatoreEmail; // NULL
		private boolean InputInibito; // NULL
		private boolean IndicatoreEdi; // NULL
		private String PartitaIvaEdi; //(35) NULL
		private String QualificatoreEdi; //(4) NULL
		private String IdentificativoFornitoreEdi; //(17) NULL
		private String TipoFornitoreEdi; //(3) NULL
		private String IdentificativoIntestatarioFatturaEdi; //(17) NULL
		private String TipoIntestatarioFatturaEdi; //(3) NULL
		private String IdentificativoPuntoConsegnaEdi; //(17) NULL
		private String TipoPuntoConsegnaEdi; //(3) NULL
}
