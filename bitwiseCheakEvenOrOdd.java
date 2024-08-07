import java.util.Scanner;
public class bitwiseCheakEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int bitmask=1;
        if((n & bitmask)==0){
       System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}
