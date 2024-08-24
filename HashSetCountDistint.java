import java.util.*;

public class HashSetCountDistint {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 2, 5, 7, 3, 8, 6 };
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            h.add(num[i]);
        }
        System.out.println(h.size());
    }

}
