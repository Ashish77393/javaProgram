import java.util.*;

public class StringPairidffer {
    static String pairdiffrev(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] ch = str.toCharArray();
        System.out.println(ch.length);
        for (int i = 0; i < ch.length - 1; i = i + 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;

        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String reverse = pairdiffrev(str);
        System.out.println(reverse);
    }
}
