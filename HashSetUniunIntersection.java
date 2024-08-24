import java.util.*;

public class HashSetUniunIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 7, 4, 3, 7, 5, 3, 6, 8 };
        HashSet<Integer> h = new HashSet<>();
        // union find o(n)
        for (int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            h.add(arr2[i]);
        }
        for (Integer key : h) {
            System.out.print(key + " ");
        }

        System.out.println("Uniun= " + h.size());
        h.clear();
        // intersection find o(n)
        for (int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (h.contains(arr2[i])) {
                count++;
                h.remove(arr2[i]);
            }
        }
        System.out.println("intersection = " + count);
    }
}
