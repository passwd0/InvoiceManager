package fatturazione.model;

import java.time.LocalDateTime;


public class Clienti{
	private String CodiceCliente; //(30) NOT
	private String Descrizione; //(100)
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimoAggiornamento;
	private String CodiceTipoCliente; //(4)
	private String CodiceUfficioCommerciale; //(20)
	private String CodiceResaMerce; //(4)
	private String CodiceImballo; //(4)
	private String CodiceRaggruppamento; //(4)
	private float Fatturato;
	private float Fido;
	private String PartitaIVA; //(15)
	private String CodiceFiscale; //(16)
	private String CodicePagamento; //(4)
	private String Sinonimo; //(50)
	private String CodiceBanca; //(4)
	private short NumeroFattureEmesse;
	private String CodiceEsenzioneIVA; //(4)
	private float ImponibileNonEsente;
	private float ImponibileEsente;
	private float ImportoIVA;
	private String CodiceClassificazione; //(10)
	private float CostoVenduto;
	private String CodiceAgente; //(10)
	private float PercentualeProvvigioneAgente;
	private float ScontoLegatoProvvigioniAgente;
	private short NumeroCopieFattura;
	private boolean IndicatoreAddebitoSpeseIncasso;
	private boolean IndicatoreAddebitoSpeseBolli;
	private int CodiceListino;
	private String CodiceVettore; //(3)
	private String CodiceAffidabilita; //(4)
	private String CodiceISO; //(4)
	private String PartitaIVAEstero; //(12)
	private String CodiceDivisa; //(4)
	private int DataScadenzaSpostataAgosto;
	private int DataScadenzaSpostataDicembre;
	private String CodiceRetrocessione; //(5)
	private String CodiceCommissione; //(5)
	private String CodiceLingua; //(5)
	private String Note; //(6000)
	private String CodiceStato; //(2)
	private boolean IndicatoreInviataInformativaPrivacy;
	private boolean IndicatoreRicevutaInformativaPrivacy;
	private String CodiceClienteRiferimento; //(15)
	private LocalDateTime DataUltimaModifica;
	private boolean IndicatoreInibizione;
	private String LoginInserimento; //(30)
	private String LoginModifica; //(30)
	private boolean IndicatoreScorporoIVA;
	private boolean IndicatoreIVADifferita;
	private boolean IndicatoreEmail;
	private boolean InputInibito;
	private boolean IndicatoreEdi;
	private String PartitaIvaEdi; //(35)
	private String QualificatoreEdi; //(4)
	private String IdentificativoFornitoreEdi; //(17)
	private String TipoFornitoreEdi; //(3)
	private String IdentificativoIntestatarioFatturaEdi; //(17)
	private String TipoIntestatarioFatturaEdi; //(3)
	private String IdentificativoPuntoConsegnaEdi; //(17)
	private String TipoPuntoConsegnaEdi; //(3)
}
