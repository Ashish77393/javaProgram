import java.util.*;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();// randomly print value
        s.add("Gopalganj");
        s.add("Siwan");
        s.add("Chapra");
        s.add("Aara");
        s.add("Buxar");
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String city : s) {// advanced loop method in java
            System.out.print(city + " ");
        }
        System.out.println("");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();// follow the ordered
        lhs.add("Siwan");
        lhs.add("Aara");
        lhs.add("Gopalganj");
        lhs.add("Chapra");
        System.out.print(lhs + " ");
        System.out.println(" ");
        TreeSet<String> ts = new TreeSet<>();// sorted in ascending order
        ts.add("Siwan");
        ts.add("Aara");
        ts.add("Gopalganj");
        ts.add("Chapra");
        System.out.print(ts + " ");
    }
}
