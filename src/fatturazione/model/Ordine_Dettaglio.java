package fatturazione.model;

import java.time.LocalDateTime;

public class Ordine_Dettaglio{
	private int NumeroOrdine; // NOT
	private short NumeroRigaOrdine; // NOT
	private LocalDateTime DataOrdine; // NOT
	private String CodiceTipoRigaDocumento; //(4)
	private String CodiceMagazzino; //(4)
	private String CodiceArticolo; //(30)
	private float QuantitaConsegnata;
	private boolean IndicatoreEvasione;
	private String Descrizione; //(2000)
	private LocalDateTime DataConsegna;
	private float Quantita;
	private String CodiceUnitaMisura; //(4)
	private String CodiceIva; //(4)
	private String CodiceContropartitaContabile; //(4)
	private float PercentualeProvvigione;
	private float PercentualeScontoCliente;
	private float PercentualeScontoArticolo;
	private float PercentualeScontoPagamento;
	private String DescrizioneAggiuntiva; //(2000)
	private boolean IndicatoreCoordinamento;
	private boolean IndicatoreOrdineDaFatturare;
	private float QuantitaVariata;
	private int NumeroPreventivo;
	private short NumeroRigaPreventivo;
	private LocalDateTime DataPreventivo;
	private float QuantitaEvasa;
	private boolean IndicatoreEvasionePreventivi;
	private boolean IndicatoreEvasioneRigheNote;
	private boolean IndicatoreNoConferma;
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimaModifica;
	private String LoginInserimento; //(30)
	private String LoginModifica; //(30)
	private LocalDateTime DataConsegnaSchedulatore;
	private LocalDateTime DataConsegnaProposta;
	private boolean IndicatoreBloccato;
	private boolean IndicatoreOrdineTrading;
	private LocalDateTime DataInizioSchedulatore;
	private String CodiceArticoloBis; //(30)
}
