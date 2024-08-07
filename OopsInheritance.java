class bird {
    void eat() {
        System.out.println(" eat");
    }

    void spaek() {
        System.out.println(" speak");
    }
}
//single level inheritance 
class fish extends bird {
    // int fin=2;
    void breathe() {
        System.out.println("breath");
    }
}
//multi level inheritance 
// class animal extends fish {
//     void pet() {
//         System.out.println("dog is pet animal ");
//     }
// }
class man extends bird{
    void clever(){
        System.out.println("human is clever ");
    }
}

public class OopsInheritance {
    public static void main(String[] args) {
        // animal b = new animal();
        man b=new man();
        b.eat();
        b.spaek();
        b.clever();
        // b.breathe();
        // b.pet();
    }
}
