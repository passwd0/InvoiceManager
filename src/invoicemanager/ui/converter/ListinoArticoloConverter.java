package invoicemanager.ui.converter;

import invoicemanager.model.ListinoArticolo;
import javafx.util.StringConverter;

public class ListinoArticoloConverter extends StringConverter<ListinoArticolo> {

	@Override
	public String toString(ListinoArticolo object) {
		return object == null ? null : String.valueOf(object.getPrezzo());
	}

	@Override
	public ListinoArticolo fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
