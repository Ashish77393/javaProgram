
public class ArrayLinearSearchUsingFun {
    void LinearArrayfun(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
               System.out.println("position of " +a[i]+" is in array ="+i);
            }
            
        }
      
    }
    public static void main(String[] args) {
        int a[]={1,2,3,5,33,5,6,4,6,4,6,4,3,3,3,3,3};
        int key=1;
        ArrayLinearSearchUsingFun A=new ArrayLinearSearchUsingFun();
        A.LinearArrayfun(a, key);
      
    }
    
}
