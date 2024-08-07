import java.util.*;

public class ArrayRotate {
    static void rotate(int[] arr, int index, int len) {
        int[] temp = new int[len];
        int k = 0;
        for (int i = index; i < len; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < index; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }
    }

    static void printdata(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 5, 6, 7, 8 };
        int index = 5;
        int len = arr.length;
        rotate(arr, index, len);
        printdata(arr, len);
    }
}
