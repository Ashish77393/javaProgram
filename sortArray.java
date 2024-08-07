import java.util.*;

public class sortArray {
    static void Sort(int[] arr, int len) {
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 44, 22, 11 };
        int len = arr.length;
        Sort(arr, len);
    }
}
