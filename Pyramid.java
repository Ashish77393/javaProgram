import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + "");
            }
            System.out.println(" ");
        }
    }
}
