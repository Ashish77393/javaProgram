import java.util.*;

public class Arraylistswapnumbergivenindex {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(4);
        data.add(5);
        data.add(7);
        data.add(8);
        data.add(12);
        System.out.println(data);
        int idx1 = data.get(1);
        int idx2 = data.get(3);
        int temp;
        temp = idx2;
        idx2 = idx1;
        idx1 = temp;
        data.set(1, idx1);
        data.set(3, idx2);
        System.out.println(data);
    }
}
