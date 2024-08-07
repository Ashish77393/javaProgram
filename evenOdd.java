import java.util.*;

public class evenOdd {

    static void oddeven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even number ");
        } else {
            System.out.println(n + " odd number");
        }
    }

    public static void main(String[] args) {
        oddeven();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number");
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        // System.out.println(n + " is Even number ");
        // } else {
        // System.out.println(n + " odd number");
        // }

    }
}
