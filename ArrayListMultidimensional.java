import java.util.*;

public class ArrayListMultidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(12);
        list1.add(21);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(72);
        list2.add(21);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + "  ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
