import java.util.Scanner;

public class RecursionSumNnaturalNumber {
    public static int sumofN(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = sumofN(n - 1);
        sum = n + sum;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number u want to print sum");
        int n = sc.nextInt();
        int s = sumofN(n);
        System.out.println("Sum of n natural number is:" + s);
    }
}
