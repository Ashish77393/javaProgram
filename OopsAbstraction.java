abstract class Animal{
     String color="red";
    Animal(){
      System.out.println(color);
    }
    void eat(){
        System.out.println("eating");
    }
    abstract void walk();
}
class Deer extends Animal{
    void walk(){
        System.out.println("walk with four leg");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walks with two legs");
    }
}
public class OopsAbstraction {
    public static void main(String[] args) {
        Deer a=new Deer() ;
        a.walk();
        a.eat();
      System.out.println(a.color);

            
        }
    }

