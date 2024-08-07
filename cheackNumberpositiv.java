import java.util.*;

public class cheackNumberpositiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("number is negative");
        }
    }

}
