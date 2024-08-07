import java.util.*;
public class binaryToDecimal {

    void decbin(int n){
        int pow=0;
        int dec=0;
        while(n>0){
        int lastdigit=n%10;
        dec=dec+(lastdigit*(int)Math.pow(2, pow));
                pow++;
         n=n/10;

    }
    System.out.println("after converted binary to decimal number is= "+dec);
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        binaryToDecimal B=new binaryToDecimal();
        B.decbin(n);
    }
}
