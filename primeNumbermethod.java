import java.util.Scanner;

public class primeNumbermethod {
    void prime(int n) {
        if (n == 2) {
            System.out.println("prime  number");
        }
        boolean number = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                number = false;
                break;
            }
        }
        if (number == true) {
            System.out.println("this is  prime number");
        } else {
            System.out.println("this is a not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nummber");
        int n = sc.nextInt();
        primeNumbermethod B = new primeNumbermethod();
        B.prime(n);
    }
}
