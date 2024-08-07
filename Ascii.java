import java.util.*;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char a = sc.next().charAt(0);
        int ascii = a;
        System.out.println("ascii value of char is = " + ascii);
    }
}
