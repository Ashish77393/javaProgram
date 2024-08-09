import java.util.*;

public class stringLead {
    static String leadzero(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        StringBuffer s = new StringBuffer(str);
        s.replace(0, i, "");
        return s.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        String s = sc.nextLine();
        String lead = leadzero(s);
        System.out.println(lead);

    }
}
