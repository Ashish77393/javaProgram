import java.util.Deque;
import java.util.LinkedList;

public class DequeQueue {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addFirst(data);
        }

        public int remove() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println("peek value is = " + s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());

    }
}
