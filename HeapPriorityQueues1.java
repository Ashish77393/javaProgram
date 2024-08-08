import java.util.*;

public class HeapPriorityQueues1 {
    static class student implements Comparable<student> {
        String name;
        int Rank;

        student(String name, int Rank) {
            this.name = name;
            this.Rank = Rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.Rank - s2.Rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("raj", 4));
        pq.add(new student("rohan", 2));
        pq.add(new student("sahil", 7));
        pq.add(new student("sonali", 6));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().Rank);
            pq.remove();

        }
    }

}
