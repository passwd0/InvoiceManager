package fatturazione.model;

import java.time.LocalDateTime;

public class Ordine_Testata{
	private int NumeroOrdine; // NOT
	private LocalDateTime DataOrdine; // NOT
	private boolean IndicatoreStatoAvanzamento;
	private String CodiceClienteFatturazione; //(30)
	private String Descrizione; //(200)
	private String CodiceEsenzioneIva; //(4)
	private String CodiceAgente; //(10)
	private float PercentualeProvvigione;
	private float PercentualeSconto;
	private float PercentualeScontoPagamento;
	private short NumeroCopieFattura;
	private boolean IndicatoreAddebitoBolli;
	private boolean IndicatoreAddebitoSpeseIncasso;
	private short CodiceListino;
	private String CodiceResa; //(4)
	private String CodiceVettore; //(4)
	private String CodiceCausale; //(4)
	private String CodicePagamento; //(4)
	private String CodiceBanca; //(4)
	private LocalDateTime DataConsegna;
	private String CausaleTrasporto; //(50)
	private String CodiceDivisa; //(4)
	private boolean IndicatoreConsegnaParziale;
	private boolean IndicatoreRaggruppamentoConsegne;
	private String CodiceAgenteVecchio; //(10)
	private String CodiceClienteSpedizione; //(30)
	private String NomeSpedizione; //(100)
	private String IndirizzoSpedizione; //(100)
	private String CapSpedizione; //(20)
	private String CittaSpedizione; //(50)
	private String ProvinciaSpedizione; //(30)
	private String CodiceNazioneSpedizione; //(10)
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimaModifica;
	private String Note; //(500)
	private String LoginInserimento; //(30)
	private String LoginModifica; //(30)
	private String CodiceLingua; //(4)
	private String Revisione; //(10)
	private String Attenzione; //(50)
	private boolean IndicatoreOrdineTrading;
}