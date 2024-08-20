import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        // Date date = new Date();
        // System.out.println("Current date is " + date);
        // SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        // String time = formatTime.format(
        // date);
        // System.out.println(time);

        // date
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld.getHour());

    }
}
