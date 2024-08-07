

public class ArrayLinearSearch {
   public static void main(String[] args){
    int a[]={4,5,7,9,7,9,3,5,7,9,0,6,5,4,3,5,6};
    int key=5;
    for(int i=0;i<a.length;i++){
        if(a[i]==key){
            System.out.println("position of" +a[i]+" is in array are ="+i);
            
        }
    }
   } 
}
