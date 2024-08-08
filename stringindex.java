import java.util.*;

public class stringindex {
    static void findindex(String str, int index) {
        if (index < str.length()) {
            System.out.println(str.charAt(index));
        } else {
            System.out.println("idex value is grater than string length");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("enter index");
        int index = sc.nextInt();
        findindex(str, index);
        for (int i = 0; i < 100; i++) {
            double randomdata = Math.floor(Math.random() * 100);
            System.out.print(randomdata + " ");
        }
    }
}
