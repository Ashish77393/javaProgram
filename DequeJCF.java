import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        // addfirst in deque
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        // addlast in deque
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        // removeFirst in deque
        deque.removeFirst();
        // removeLast in deque
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first Element is deque = " + deque.getFirst());
        System.out.println("last  Element is deque = " + deque.getLast());
    }
}
