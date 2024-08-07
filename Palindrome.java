import java. util.*;
public class Palindrome {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
   int temp=n;
   int rev=0;
   while(temp!=0){
    int rem=temp%10;
    rev=rev*10+rem;
    temp=temp/10;
   }
   if(n==rev){
    System.out.println("palindrome number");
   }else{
    System.out.println("not a palindrome number");
   }
}
}