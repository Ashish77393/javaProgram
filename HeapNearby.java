import java.util.*;

public class HeapNearby {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int idx;

        public Point(int x, int y, int distsq, int idx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 2, 3 }, { 3, -3 }, { 3, 1 } };
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distsq, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }

    }
}
