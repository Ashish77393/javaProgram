public class RecursionLastOccuarance {
    public static int lastOccor(int a[], int key, int i) {
        if (i == a.length) {
            return -1;
        }
        // from last index print number
        // int len = a.length - 1 - i;
        // if (a[len] == key) {
        // return i;
        // }
        // return lastOccor(a, key, i + 1);

        // fron starting index print
        int Found = lastOccor(a, key, i + 1);
        if (Found == -1 && a[i] == key) {
            return i;
        }
        return Found;

    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 3, 3, 5, 1, 6, 6, 6 };
        System.out.println(lastOccor(a, 6, 0));
    }
}
