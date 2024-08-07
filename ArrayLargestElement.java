

public class ArrayLargestElement {
    public static void main(String[] args) {
        int [] a={5,6,3,8,7,4,9};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
           
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println("smallest number is in array="+smallest);
    }
}
