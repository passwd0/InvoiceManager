package invoicemanager.ui.converter;

import invoicemanager.model.OrdineTestata;
import javafx.util.StringConverter;

public class OrdineTestataConverter extends StringConverter<OrdineTestata> {

	@Override
	public OrdineTestata fromString(String ordineTestata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(OrdineTestata ordineTestata) {
		return ordineTestata == null ? null : String.valueOf(ordineTestata.getNumeroOrdine());
	}

}
