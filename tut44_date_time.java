// import java.util.Date;
// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class tut44_date_time {
    public static void main(String[] args) {
        // System.out.println((System.currentTimeMillis()-1612443786836l)/(1000*3600*24d));
        // System.out.println("Miliseconds passed since 1st Jan, 1970:
        // "+System.currentTimeMillis());
        // Date d = new Date(); Old Library
        // System.out.println(d); Deprecrated

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(date);  // View docs for more info
        System.out.println(time);
        System.out.println(dt);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("EEEE, dd MMMM YYYY, h:m a");
        // small d gives day of the month
        // Capital "DD" gives day of the year
        // E means day of the week
        // here there are specific codes for formatting, refer docs

        
        System.out.println(dt.format(form));
    }
}
