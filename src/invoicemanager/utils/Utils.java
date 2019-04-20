package invoicemanager.utils;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Utils {
	public static DateTimeFormatter formatterOra = DateTimeFormatter.ofPattern("HH:mm");
	public static DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter formatterComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public static DateTimeFormatter formatterDataDB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static DateTimeFormatter formatterCompleteDB = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static List<String> listaLocalita = new ArrayList<>(Arrays.asList("localita_a", "localita_b", "localita_c"));
	public static List<String> listaNazioni = new ArrayList<>(Arrays.asList("nazione_a", "nazione_b", "nazione_c"));
	public static List<String> listaDivise = new ArrayList<>(Arrays.asList("EUR", "USD", "AAA", "BBB"));
	public static List<Integer> listaSezionali = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdfDB = new SimpleDateFormat("yyyy-MM-dd");
	private static Calendar calendar = new GregorianCalendar();
	
	public Utils() {}
	
	public static String toString(Timestamp timestamp) {
		return sdf.format(timestamp);
	}
	
	public static String toString(Date date) {
		return sdf.format(date);
	}
	
	public static Date fromString(String date) throws ParseException {
		java.util.Date d = sdf.parse(date);
		return new Date(d.getTime());		
	}
	
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
    
    public static String toStringDB(Date date) {
    	return sdfDB.format(date);
    }
    
    public static int getYear(Date date) {
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
    }
}