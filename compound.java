import java.util.*;

public class compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int p = sc.nextInt();
        System.out.println("Enter rate of loan");
        int r = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        int pow = (1 + (r / 100));
        double CI = p + Math.pow(pow, t);
        System.out.println("Compound Interest = " + CI);

    }
}
