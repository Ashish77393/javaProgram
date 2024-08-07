import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string ");
      String name=sc.nextLine();
      for(int i=name.length()-1;i>=0;i--){
        rev=rev+name.charAt(i);
      }
      if(name.equals(rev)){
        System.out.println(name + " is a palindrome number");
      }
      else{
        System.out.println(name + "not a palindrome number");
      }

    }
}
