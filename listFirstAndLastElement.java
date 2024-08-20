import java.util.*;

public class listFirstAndLastElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(2);
        System.out.println("Original list is " + list);
        if (list != null && !list.isEmpty()) {
            System.out.println("First value is = " + list.get(0));
            System.out.println("Last value is = " + list.get(list.size() - 1));
        }

    }

}
