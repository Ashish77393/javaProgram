
import java.util.Scanner;

public class primeNumberOfGivenRange {
     void prime(int n){
        if(n==2){
          System.out.println("natural number");
        }
          boolean number=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                number=false;
                break;
            }
        }
        if(number==true){
            System.out.println("this is  prime number");  
        }
        else{
            System.out.println("this is a not a prime number");
        }
    }
 void range(int n){
         for(int i=2;i<=n;i++){
            //  if(prime(i)==true){
            //      System.out.println(i);

            // }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nummber");
        int n=sc.nextInt();
       primeNumberOfGivenRange  B=new  primeNumberOfGivenRange ();
       B.range(10); 
    }
}
