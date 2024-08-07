
public class SortBubbleSort {
  public static void BubbleSort(int [] a)  {
   int temp;
    for(int i=0;i<a.length-1;i++){
      
      int swap=0;
    for(int j=0;j<a.length-1-i;j++){
    if(a[j]>a[j+1]){
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        swap++;
    }
}

}

    }
    public static void printarray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
        System.out.println();
    }
        
    
    public static void main(String[] args){
   int [] a={1,2,3,4,5,6};
 
    BubbleSort(a);
    printarray(a);
  }
}
