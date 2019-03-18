package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.FatturaTestata;
import javafx.util.StringConverter;

public class FatturaTestataConverter extends StringConverter<FatturaTestata> {

	@Override
	public FatturaTestata fromString(String ft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(FatturaTestata ft) {
		return ft == null ? null : ft.getNomeSpedizione();
	}
	
}
