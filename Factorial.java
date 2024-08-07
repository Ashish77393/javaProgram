import java.util.Scanner;
public class Factorial {
void Factorial1(int n){
     int fact=1;
     for(int i=1;i<=n;i++){
          fact=fact*i;
    }
System.out.println(fact);
 }
void area(int l,int b){
    System.out.println("area of rectangle is="+(l*b));
}
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fact1;
    System.out.println("Enter a number");
    int n=sc.nextInt();
    Factorial f=new Factorial();
    f. Factorial1(n);
    f.area(3,5);
}
}
