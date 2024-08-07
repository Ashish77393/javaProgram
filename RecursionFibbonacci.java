public class RecursionFibbonacci {
    public static int fib(int n){
        if(n==0 || n==1){
       return n;
        }
        int a=fib(n-1);
        int b=fib(n-2);
        int fiboo=a+b;
       return fiboo;
    }
    public static void main(String[] args) {
      System.out.println(fib(10));
    }
}
