
public class ArrayReverseInFun {
    void reverse(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
   System.out.println(a[i]);
        
        }
       
    }
   public static void main(String[] args) {
    int a[]={1,2,3,6,7,9};
    ArrayReverseInFun A=new ArrayReverseInFun();
    A.reverse(a);
   } 
}
