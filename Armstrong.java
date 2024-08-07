import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int arm = 0;
        while (temp != 0) {
            int r = temp % 10;
            arm = arm + r * r * r;
            temp = temp / 10;
        }
        if (n == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not Armstrong number");
        }
    }
}
