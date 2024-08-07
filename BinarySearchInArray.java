
public class BinarySearchInArray {
    void Binarray(int a[],int key){
        int start=0;
        int end=a.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
        System.out.println(mid);
            }
            if(a[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
         }
    }
  public static void main(String[] args) {
    int [] a={2,4,6,6,7,9,10,12,34};
    int key=6;
    BinarySearchInArray B=new BinarySearchInArray();
    B.Binarray(a, key);
   

    
  }  
}
