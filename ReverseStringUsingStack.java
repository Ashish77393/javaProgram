import java.util.*;

public class ReverseStringUsingStack {
    static String reverse(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) { // popping element until
                                   // stack become empty
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        return new String(reverseString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value");
        String str = sc.nextLine();
        System.out.println(str + "<-> " + reverse(str));

    }
}
