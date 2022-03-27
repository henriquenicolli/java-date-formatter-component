import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateFormatter {

    private final static String DD_MM_YYYY = "dd/MM/yyyy";
    private final static String YYYY_MM_DD = "yyyy/MM/dd";

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current dateTime -> " + dateTimeToPatternString(currentDateTime, DD_MM_YYYY));
        System.out.println("Current dateTime -> " + dateTimeToPatternString(currentDateTime, YYYY_MM_DD));
    }

    public static String dateTimeToPatternString(LocalDateTime localDateTime, String pattern){
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.format(date);

        return dateFormat.format(date);
    }

}
