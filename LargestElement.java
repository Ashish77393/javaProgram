public class LargestElement {
    static void largestValue(int[] arr, int len) {
        int largest = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest elements an array is = " + largest);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 386, 6, 55, 66, 1133, 22, 333 };
        int len = arr.length;
        largestValue(arr, len);
    }
}
