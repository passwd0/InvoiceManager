package invoicemanager.ui.converter;

import invoicemanager.model.UnitaMisura;
import javafx.util.StringConverter;

public class UnitaMisuraConverter extends StringConverter<UnitaMisura> {

	@Override
	public String toString(UnitaMisura object) {
		return object == null ? null : object.getCodiceUnitaMisura();
	}

	@Override
	public UnitaMisura fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
