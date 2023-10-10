import java.util.Calendar;
import java.util.TimeZone;

public class tut45_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());    
        // System.out.println(c.getTimeZone());
        System.out.println(c.getWeekYear());
        // System.out.println(c);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        String [] zones = TimeZone.getAvailableIDs();
        System.out.println(zones.length);
        for (String ele: zones){
            System.out.println(ele);
        }
    }
}
