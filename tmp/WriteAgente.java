Create table public.Agente (
	"CodiceAgente" varchar(25) NOT NULL,
	"Nome" varchar(25) NULL,
	"PercentualeProvvigione" Float NULL,
	"TipoProvvigione" Boolean NULL,
	"TipoMandato" Boolean NULL,
	"CodiceContabile" varchar(25) NULL,
	"CodiceControparte" varchar(25) NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL
);
