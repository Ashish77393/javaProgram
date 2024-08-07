
public class RecursionPrintNumber1to10 {

 public static void increase(int n){
    if(n==1){
        System.out.println(n);
        return ;
    }
    increase(n-1);

    System.out.println(n);
    
 }

    public static void main(String[] args) {
        increase(10);
    }
}
