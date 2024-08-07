import java.util.*;

public class ArrayListMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(22);
        num.add(2);
        num.add(7);
        num.add(88);
        num.add(67);
        num.add(34);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > max) {
                max = num.get(i);
                // max = Math.max(max, num.get(i));
            }
        }

        System.out.println("Largest Number is in ArrayList is :" + max);

    }

}
