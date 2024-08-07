 
interface petAnimal{
    void type();
}
class  dog implements petAnimal{
   public void type(){
        System.out.println("they can eat non veg");
    }
}
class cow implements petAnimal{
    public void type(){
        System.out.println("they can eat grass");
    }
}

public class OopsInterface {
    public static void main(String[] args) {
        cow d=new cow();
        d.type();
    }
}
