package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.Ordine;
import javafx.util.StringConverter;

public class OrdineConverter extends StringConverter<Ordine> {

	@Override
	public Ordine fromString(String ordine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(Ordine ordine) {
		return ordine == null ? null : String.valueOf(ordine.getNumeroOrdine());
	}

}
