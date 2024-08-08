import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        String name = "Ashish kumar singh";
        char[] array = name.toCharArray();
        Arrays.sort(array);
        String sortarray = new String(array);
        System.out.println(sortarray);
    }
}
