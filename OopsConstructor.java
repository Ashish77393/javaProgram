class Construt{
    int age;
    String name;
    String password;
    Construt(){
      
    }
    Construt(Construt s1){
        this.name=s1.name;
        this.age=s1.age;
        this.password=s1.password;
        System.out.println(name);
        System.out.println(age);
        System.out.println(password);
    }
}

public class OopsConstructor {
   public static void main(String[] args) {
    Construt s1=new Construt();
    s1.name="ashish kumar singh";
    s1.age=23;
    s1.password="abcd";
    Construt s2=new Construt(s1);
    s2.password="xyz";
   } 
}
