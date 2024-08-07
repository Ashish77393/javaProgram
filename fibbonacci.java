import java.util.*;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= n - 2; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}
