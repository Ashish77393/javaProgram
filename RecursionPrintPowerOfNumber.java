import java.util.*;

public class RecursionPrintPowerOfNumber {
    public static int Power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        // System.out.println(Math.pow(n, p));
        return n * Power(n, p - 1);
    }

    public static void main(String[] args) {
        System.out.println(Power(2, 10));
    }
}
