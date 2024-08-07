import java.util.*;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number");
        int n = sc.nextInt();
        int squre = (n * n);
        while (squre > 0) {
            int r = squre % 10;
            sum = sum + r;
            squre = squre / 10;
        }
        if (sum == n) {
            System.out.println("This number is Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }

    }
}
