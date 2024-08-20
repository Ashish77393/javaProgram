import java.util.*;

public class sunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        number = number + 1;
        double sqr = Math.sqrt(number);
        if (number % sqr == 0) {
            System.out.println("Sunny NUmber");
        } else {
            System.out.println("Not Sunny Number");
        }
    }
}
