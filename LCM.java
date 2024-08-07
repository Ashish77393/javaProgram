import java.util.*;

public class LCM {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        // int lcm = (a > b) ? a : b;
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm = lcm + 1;
        }
        System.out.println("lcm of " + a + " " + b + " is = " + lcm);
    }

}
