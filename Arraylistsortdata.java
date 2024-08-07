import java.util.*;

public class Arraylistsortdata {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(23);
        data.add(4);
        data.add(12);
        data.add(25);
        data.add(21);

        // inbuilt method in Arraylist for sorting in Ascending order
        System.out.println(data);
        Collections.sort(data);
        System.out.println(data);

        // descending order in Arraylist using inbuild function Descending order
        Collections.sort(data, Collections.reverseOrder());
        System.out.println(data);

    }
}
