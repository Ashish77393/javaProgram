

public class ArrayLargestElementFunction {
    void largest(int [] a){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
        }
        System.out.println("largest number in array  is="+largest);

    }
    public static void main(String[] args) {
        int [] a={11,2,3,5,77,3,7,4,9};
 ArrayLargestElementFunction A=new ArrayLargestElementFunction();
 A.largest(a);

    }
    
}
