public class searchArray {
    static boolean SearchArray(int[] arr, int value, int len) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 7, 6, 4, 8 };
        int len = arr.length;
        int key = 7;
        boolean index = SearchArray(arr, key, len);
        if (index == false) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }
}
