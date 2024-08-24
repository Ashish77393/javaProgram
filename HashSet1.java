import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);// add(key)
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.remove(2);// remove data
        System.out.println(set);
        if (set.contains(2)) { // contains(key)
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
