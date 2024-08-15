import java.util.*;

public class listRemoveValueGivenPoint {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('S');
        list.add('H');
        list.add('I');
        list.add('S');
        list.add('H');
        list.add('S');
        list.add('I');
        list.add('N');
        list.add('G');
        list.add('H');
        int fromIndex = 2;
        int endIdx = 4;
        for (int i = 0; i < list.size(); i++) {
            if (i >= fromIndex && i < endIdx) {
                continue;
            } else {
                System.out.print(list.get(i) + " ");
            }
        }

    }
}
