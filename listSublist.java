import java.util.*;

public class listSublist {
    public static void main(String[] args) throws Exception {
        try {
            List<String> s1 = new ArrayList<String>();
            s1.add("raj");
            s1.add("Ashish");
            s1.add("Rohan");
            s1.add("saif");
            System.out.println("ArrayList is " + s1);
            List<String> arr1 = s1.subList(1, 2);
            System.out.println(arr1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
