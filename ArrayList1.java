import java.util.*;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // Add method in arrayList
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);

    // get method in ArrayList
    int ele = list.get(3);
    System.out.println(ele);

    // remove method in ArrayList
    list.remove(3);
    System.out.println(list);

    // set method in Arraylist
    list.set(3, 22);
    System.out.println(list);

    // contain method in Arraylist
    System.out.println(list.contains(22));
    System.out.println(list.contains(33));
    System.out.println(list.size());
  }
}
