package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.DdtTestata;
import javafx.util.StringConverter;

public class DdtTestataConverter extends StringConverter<DdtTestata> {

	@Override
	public DdtTestata fromString(String ddtTestata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(DdtTestata ddtTestata) {
		return ddtTestata == null ? null : String.valueOf(ddtTestata.getNumeroDDT());
	}

}
