import java.util.*;

public class listDividedtwopart {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(1);
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.print(" first half ");
        for (int i = 0; i < list.size() / 2; i++) {
            // System.out.print(list.get(i) + " ");
            l1.add(list.get(i));
        }
        System.out.print(" second half ");
        for (int i = list.size() / 2; i < list.size(); i++) {
            // System.out.print(list.get(i) + " ");
            l2.add(list.get(i));
        }
        System.out.println("first half = " + l1);
        System.out.println("second half = " + l2);

    }
}
