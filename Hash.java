import java.util.*;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // put method ime complexity is O(1)
        hm.put("India", 100);
        hm.put("Pakistan", 20);
        hm.put("China", 150);
        hm.put("SriLanka", 30);
        System.out.println(hm);
        // get method time complexity is O(1)
        System.out.println(hm.get("India"));
        // containsKey method time complexity is O(1)
        System.out.println(hm.containsKey("India"));
        // remove method time complexity is O(1)
        System.out.println(hm.remove("Pakistan"));
        System.out.println(hm);
        // hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        // iteration in hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Keys= " + k + " values = " + hm.get(k));

        }

    }
}
