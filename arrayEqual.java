import java.util.*;

public class arrayEqual {

    public static void main(String[] args) {
        boolean compare = true;
        int[] arr1 = { 2, 3, 2, 1, 4, 4, 7 };
        int[] arr2 = { 2, 3, 2, 1, 4, 4, 7 };
        // boolean compare = Arrays.equals(arr1, arr2);
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    compare = false;
                }
            }
        } else {
            compare = false;
        }
        if (compare == true) {
            System.out.println("equals of both array");
        } else {
            System.out.println("not equals of both array");
        }
    }

}
