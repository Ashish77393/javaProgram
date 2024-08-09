import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class listCreation {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("arraylist is =" + arr.toString());
        List<Integer> arr1 = new LinkedList<Integer>() {
            {
                add(10);
                add(20);
                add(30);
            }
        };
        System.out.println(LocalDateTime.now());
        System.out.println("Linkedlist is =" + arr1.toString());
    }
}
