
public class ArraySubArray {
    public static void main(String[] args) {
      int sum=0;
     int a[]={2,4,6,8,10};
     int i;
     
     for( i=0;i<a.length;i++){
        int start=i;
     for(int j=i;j<a.length;j++){
        int end=j;
     for(int k=start ;k<=end;k++){
        System.out.print(a[k] +"");
        }
       
        System.out.print(+sum);
       
     }   
     
    }
}
}
