
import java.util.Scanner;

public class Addtwonumbermethod {
    // int add(int a, int b) {
    // return a + b;
    // }
    public static void PrintHelloworld() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("hello world ");

        }
    }

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two number is =" + sum);

    }

    public static void main(String[] args) {

        Addtwonumbermethod A = new Addtwonumbermethod();
        PrintHelloworld();
        A.add(34, 55);

    }
}
