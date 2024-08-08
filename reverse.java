import java.util.*;

public class reverse {
    public static void main(String[] args) {
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String charater");
        String str = sc.nextLine();
        int i = str.length() - 1;
        while (i >= 0) {
            char data = str.charAt(i);
            rev = rev + data;
            i--;
        }
        System.out.println("Original String is " + str);
        System.out.println("Reverse string is " + rev);
    }
}
