
public class ArrSumSubArray {
    public static void main(String[] args) {
      int sum=0;
      int maxvalue=Integer.MIN_VALUE;
     int a[]={2,4,6,8,10};
     int i;
     
     for( i=0;i<a.length;i++){
        int start=i;
     for(int j=i;j<a.length;j++){
        int end=j;
        sum=0;
     for(int k=start ;k<=end;k++){
        sum=sum+a[k];
        }
        System.out.println(+sum);
       if(maxvalue<sum){
        maxvalue=sum;
       }
      
     }   
     
    }
   System.out.println("max sum ="+maxvalue); 
}
}

