package invoicemanager.model.ddt;

import java.time.LocalDateTime;

public class Ddt {
	private int numeroDDT; //NOT NULL
	private LocalDateTime dataDDT; //NOT NULL
	private boolean indicatoreStatoAvanzamento; //] [varchar](1) ,
	private String codiceCausale; //] [varchar](4) ,
	private String codiceCausalePrelievi; //] [varchar](4) ,
	private String codiceClienteFatturazione; //] [varchar](30) ,
	private String codiceEsenzioneIva; //] [varchar](4) ,
	private String codiceAgente; //] [varchar](10) ,
	private float percentualeProvvigione; //NULL
	private float percentualeSconto; //NULL
	private short numeroCopieFattura; //NULL
	private boolean indicatoreAddebitoBolli; //] [varchar](1) ,
	private boolean indicatoreAddebitoSpeseIncasso; //] [varchar](1) ,
	private short codiceListino; //NULL
	private String codiceResa; //] [varchar](4) ,
	private String codiceVettore; //] [varchar](4) ,
	private String codiceImballo; //] [varchar](4) ,
	private String codicePagamento; //] [varchar](4) ,
	private String codiceBanca; //] [varchar](4) ,
	private int numeroFattura; //NULL
	private LocalDateTime dataFattura; //NULL
	private String codiceDivisa; // [varchar](4) ,
	private String causaleTrasporto; //] [varchar](50) ,
	private float pesoColli; //NULL
	private String descrizione; //] [varchar](200) ,
	private short numeroColli; //NULL
	private boolean indicatorePreventivoDaConferma; //] [varchar](1) ,
	private boolean indicatoreBollaVisione; //] [varchar](1) ,
	private String codiceClienteSpedizione; //] [varchar](30) ,
	private String nomeSpedizione; //] [varchar](100) ,
	private String indirizzoSpedizione; //] [varchar](100) ,
	private String capSpedizione; //] [varchar](20) ,
	private String cittaSpedizione; //] [varchar](50) ,
	private String provinciaSpedizione; //] [varchar](30) ,
	private String codiceNazioneSpedizione; //] [varchar](10) ,
	private LocalDateTime dataInserimento; //NULL
	private LocalDateTime dataUltimaModifica; //NULL
	private String note; //[Note] [varchar](500) ,
	private String loginInserimento; //] [varchar](30) ,
	private String oginModifica; //] [varchar](30) ,
	private String codiceLingua; //] [varchar](4) ,
	private int numeroDdtDeposito; //NULL
	private String codiceDeposito; //] [varchar](4) ,
	private String noteCaricamento; //] [varchar](2000) ,
	private String codiceFilialeEdi;//] [varchar](50) ,
	private LocalDateTime dataCaricamento; //NULL
	private String unitaMisuraPesoColli; //[UnitaMisuraPesoColli] [varchar](3) 

}
