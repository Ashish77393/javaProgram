
public class ArrayLinearSearchUsingFun2 {
    int LinearArrayfun2(int b[],int key){
        for(int i=0;i<b.length;i++){
            if(b[i]==key){
            return i;
            }
            
        }
      return -1;
    }
    public static void main(String[] args) {
        int b[]={1,2,3,5,33,5,6,4,6,4,6,4,3,3,3,3,3};
        int key=3;
         ArrayLinearSearchUsingFun2 f2 =new ArrayLinearSearchUsingFun2() ;
       int index= f2.LinearArrayfun2(b, key);
       if(index==-1){
        System.out.println("data is not found in array");
       }
       else{
        System.out.println("array elements of i array "+index);
       }
    }
}
