Create table public.FatturaTestata (
	"NumeroFatturazione" INTEGER NULL,
	"DataFattura" Date NULL,
	"CodiceStatoAvanzamento" varchar(25) NULL,
	"CodiceClienteFatturazione" varchar(25) NULL,
	"CodiceEsenzioneIva" varchar(25) NULL,
	"CodiceAgente" varchar(25) NULL,
	"CodiceCausale" varchar(25) NULL,
	"CodiceCausalePrelievi" varchar(25) NULL,
	"PercentualeSconto" Float NULL,
	"PercentualeScontoPagamento" Float NULL,
	"PercentualeProvvigione" Float NULL,
	"Descrizione" varchar(25) NULL,
	"IndicatoreAddebitoBolli" Boolean NULL,
	"IndicatoreAddebitoSpeseIncasso" Boolean NULL,
	"IndicatoreScaricoMagazzino" Boolean NULL,
	"CodiceListino" INTEGER NULL,
	"CodiceResa" varchar(25) NULL,
	"CodiceVettore" varchar(25) NULL,
	"IndicatoreFatturaAccompagnatoria" Boolean NULL,
	"CodicePagamento" varchar(25) NULL,
	"CodiceBanca" varchar(25) NULL,
	"CodiceImballo" varchar(25) NULL,
	"PesoColli" Float NULL,
	"NumeroColli" Float NULL,
	"Acconto" Float NULL,
	"CodiceDivisa" varchar(25) NULL,
	"Cambio" Float NULL,
	"CodiceClienteSpedizione" varchar(25) NULL,
	"NomeSpedizione" varchar(25) NULL,
	"IndirizzoSpedizione" varchar(25) NULL,
	"CapSpedizione" varchar(25) NULL,
	"CittaSpedizione" varchar(25) NULL,
	"ProvinciaSpedizione" varchar(25) NULL,
	"CodiceNazioneSpedizione" varchar(25) NULL,
	"Note" varchar(25) NULL,
	"IndicatoreFatturazioneDifferita" Boolean NULL,
	"IndicatoreEmail" Boolean NULL,
	"IndicatorePa" Boolean NULL,
	"SpeseTrasporto" Float NULL,
	"SpeseImballo" Float NULL,
	"SpeseIncasso" Float NULL,
	"SpeseBolli" Float NULL,
	"Omaggi" Float NULL,
	"TotalePagato" Float NULL,
	"DataScadenza" Date NULL,
	"ImportoScadenza" Float NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL,
);
