class shape{
    void  area(int l,int b){
        System.out.println("area of rectanglre is :"+l*b);
    }
    void area(int l,int b,int h){
        System.out.println("volume of rectangle is :"+l*b*h);

    }
    void area(double l,double b){
        System.out.println("area of rectangle is float :"+l*b);
    }
}
public class OopsPolymorphismMrthodOverriding {
    public static void main(String[] args) {
        shape s=new shape();
        s.area(2, 2);
        s.area(2.3,3.5);
        s.area(1,4,6);
        
    }
}
