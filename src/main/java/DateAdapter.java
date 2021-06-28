import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class DateAdapter {

    private String MEXICO_ZONE = "America/Mexico_City";
    private String pattern = "MM/dd/yyyy";

    /**
     * Adapter from date to string.
     * @return date in format dd/MM/yyyy.
     */
    @ToJson
    String dateToString(Date date){
        return stringToDate(date);
    }


    /**
     * Adapter from string in format dd/MM/yyyy to date.
     * @return date.
     */
    @FromJson
    private Date stringToDate(String stringDate) throws ParseException {
        return stringToDate(stringDate, pattern);
    }

    /**
     * Transform string to date given pattern.
     * @param stringDate a date in string.
     * @param pattern a valid pattern.
     * @return a Date given params.
     */
    private Date stringToDate(String stringDate, String pattern) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of(MEXICO_ZONE)));

        return dateFormat.parse(stringDate);
    }

    /**
     * Transform date to string.
     * @param date to convert to string.
     * @return a string date.
     */
    private String stringToDate(Date date) {

        DateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of(MEXICO_ZONE)));

        return dateFormat.format(date);
    }
}
