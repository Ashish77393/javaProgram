class Animal{
    void eat(){
        System.out.println("eating anythings");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass ");
    }
}

public class OopsmethodOveriding {
    public static void main(String[] args) {
        deer d=new deer();
        d.eat();
    }
}
