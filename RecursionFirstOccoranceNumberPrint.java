public class RecursionFirstOccoranceNumberPrint {
    public static int firstOccor(int a[], int key, int i) {
        if (i == a.length) {
            return -1;
        }

        if (a[i] == key) {
            return i;
        }
        return firstOccor(a, key, i + 1);

    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 3, 3, 5, 1, 6, 6, 6 };
        System.out.println(firstOccor(a, 6, 0));
    }
}
