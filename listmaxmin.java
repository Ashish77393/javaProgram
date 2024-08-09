import java.util.*;

public class listmaxmin {
    static int arrayMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        // List<Integer> sortedlist = new ArrayList<>(list);
        // Collections.sort(sortedlist);
        // return sortedlist.get(0);
        return Collections.min(list);
    }

    static int arrayMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        // List<Integer> sortedlist = new ArrayList<>(list);
        // Collections.sort(sortedlist);
        // return sortedlist.get(list.size() - 1);
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(99);
        list.add(9);
        list.add(8);
        list.add(-1);
        list.add(5);
        int min = arrayMin(list);
        int max = arrayMax(list);
        System.out.println(list.size());
        System.out.println("maximum value in arraylist = " + max);
        System.out.println("Minimum value in arraylist is = " + min);

    }
}
