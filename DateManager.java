import java.util.Calendar;

public class DateManager {
    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }
}
