import java.util.*;

public class copyArrayFromAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 3, 6, 2, 7, 9, 4 };
        int[] arr2 = new int[arr1.length];
        arr2 = arr1;
        // arr1[0]++;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
    }
}
