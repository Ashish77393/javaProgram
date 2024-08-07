import java.util.*;

public class BinaryTooctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        double decimeter = 0;
        int i = 0;
        while (n > 0) {
            decimeter = decimeter + Math.pow(2, i++) * (n % 10);
            n = n / 10;

        }
        System.out.print(decimeter);
    }
}
