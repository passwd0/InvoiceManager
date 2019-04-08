package invoicemanager.utils;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import invoicemanager.model.fatturazione.IndirizzoGeografico;

public class Utils {
	public static DateTimeFormatter formatterOra = DateTimeFormatter.ofPattern("HH:mm");
	public static DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter formatterComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public static DateTimeFormatter formatterDataDB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static DateTimeFormatter formatterCompleteDB = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static List<String> listaLocalita = new ArrayList<>(Arrays.asList("citta_a", "citta_b", "citta_c"));
	public static List<String> listaNazioni = new ArrayList<>(Arrays.asList("nazione_a", "nazione_b", "nazione_c"));
	
	public Utils() {}
	
	public static Timestamp toTimestamp(LocalDateTime datetime) {
		if (datetime == null)
			return null;
		return Timestamp.valueOf(datetime);
	}
	
	public static Date convertToDatabaseColumn(LocalDate localDate) {
        return Optional.ofNullable(localDate)
          .map(Date::valueOf)
          .orElse(null);
    }
 
    public static LocalDate convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date)
          .map(Date::toLocalDate)
          .orElse(null);
    }
}