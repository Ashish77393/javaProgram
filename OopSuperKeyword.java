class Area{
    int l;
    int b;
     Area(int l,int b){
System.out.println("area of rec :"+l*b);
    }
}
class area2 extends Area{
    int l;int b;int h;
    area2(int l,int b,int h){
        super(l,b);
      System.out.println("volume of cube is :"+l*b*h);
    }
} 


public class OopSuperKeyword {
    public static void main(String[] args) {
   area2 a=new area2(2,4, 4);
        
    }
}
