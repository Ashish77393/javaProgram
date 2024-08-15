import java.util.*;

public class listRemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(2);
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int data = list.get(i);
            if (!l1.contains(data)) { // If l1 does not contain the data, add it
                l1.add(data);

            }
        }
        System.out.println("remove duplicate data is " + l1);
    }
}
