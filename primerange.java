import java.util.*;

public class primerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println(n);
        } else {
            int number = 4;
            for (int i = 2; i < n; i++) {
                if (n % i != 0) {
                    number = i;
                }
                System.out.println(number);
            }
        }
    }
}
