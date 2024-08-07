import java.util.*;

public class primeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println("Prime number");

        } else {
            boolean number = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    number = false;
                    break;
                }
            }

            if (number == true) {
                System.out.println("prime number");
            } else {
                System.out.println("Not prime number");
            }
        }
    }
}