import java.util.Scanner;
public class conditionalStatement12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter second  number");
        int  b=sc.nextInt();
         System.out.println("Enter third  number");
        int  c=sc.nextInt();

    //      System.out.println("Enter your operator");
    //    String operator=sc.next();
          
    //     switch(operator){
    //         case"+":System.out.println("Sum of " + a + " and " + b + " is="+(a+b));
    //                break;
    //         case "-":System.out.println("Sub of " + a + "and"+ b + " is="+(a-b));
    //                 break;
    //         case "*":System.out.println("multi of a and b is="+(a*b));
    //                 break; 
    //         case "/":System.out.println("divided of a and b is="+(a/b));
    //                 break;               
    //                 default:System.out.println("this is a number");

    //     }
    //    if(a>b &&a>c){
    //     System.out.println("greatest number is "+a);
    //     }
    //     else if(b>c&&b>a){
    //         System.out.println("is greater than"+b);
    //     }
    //     else{
    //         System.out.println("greatest number is"+c);
    //     }
    System.out.println(a>b?a:b);
       }
    }


