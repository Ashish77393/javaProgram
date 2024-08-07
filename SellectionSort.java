
public class SellectionSort {
    public static void SelcSort(int [] a){
        
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
               // if(a[min]<a[j]){//decreasing orderif(a[min]<a[j])
                if(a[min]>a[j]){
                    min=j;
                }
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
            
        }
        public static void printarray(int [] a){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println(" ");
        }
        
    
    public static void main(String[] args) {
        int [] a={3,5,2,7,2,1,8,9};
        SelcSort(a);
        printarray(a);
    }
}
