public class RecursionFactorial {
   
   public static  int fact(int n){
       if(n==0){
        return 1;
       }
       if(n<0){
        return 0;
       }

     int fact=n*fact(n-1);
     return fact;
    
   }
    public static void main(String[] args) {
     int fact= fact(5);  
     System.out.println(fact);
    }
}
