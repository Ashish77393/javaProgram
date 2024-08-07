
public class SortInsertionSort {
public static void insertionSort(int [] a){
    for(int i=0;i<a.length;i++){
       int curr=a[i];
       int prev=i-1;
       while(prev>=0 && a[prev]>curr){
        a[prev+1]=a[prev];
        prev--;
       }
     a[prev+1]=curr;
     }
    
}
public static void arr(int []a){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
}
   public static void main(String[] args) {
    int []a ={5,4,3,2,1};
    insertionSort(a);
    arr(a);
   } 
}

