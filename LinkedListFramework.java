import java.util.LinkedList;

public class LinkedListFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.addLast(3);
        ll.addFirst(10);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
