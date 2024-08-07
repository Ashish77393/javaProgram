import java.util.Scanner;
public class loopApnaCollege {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=0;
       int  sum=0;
        //while loop
        // while(i<=n){
        //     System.out.println("hello worldd="+i);
        //     i++;
        // }

        //do while
    //    do{
    //         System.out.println("jai sree ram = "+i);
    //         i++;
    //     } 
    //     while(i<=n);

    // for loop in java
    // for(i=1;i<=n;i++){
    //     System.out.println("for looop use in java "+i);
    //     sum=sum+i;
       
    // }
    //  System.out.println("sum="+sum);
    for(i=n;i>=1;i--){
        System.out.println(i);

    }
    }
}
