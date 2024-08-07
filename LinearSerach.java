public class LinearSerach {
    static int Search(int arr[], int arrlen, int value) {
        for (int i = 0; i < arrlen; i++) {
            if (arr[i] == value) {
                return i; // Return the index if the value is found
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 3, 9, 7, 4, 3 };
        int arrlen = arr.length;
        int value = 7;
        int index = Search(arr, arrlen, value);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
