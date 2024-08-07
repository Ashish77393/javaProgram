
 class pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
        System.out.println(color);
    }
    void setTip(int newtip){
    tip=newtip;
    System.out.println(tip);
    }

}

class student{
    String name;
    int age;
    void setname(String Name){
        name=Name;
        System.out.println(name);
    }
    void setage(int Age){
        age=Age;
        System.out.println(age);
    }
}
  class BankAccount{
    public String username="";
    private String password="";
    public void setPassword(String pwd){
        password=pwd;
        System.out.println(password);
        
    }
  }
    public class OOPsFirstProgram {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("red");
        p1.setTip(4);
        student s1=new student();
       s1.setname("ashish kumar singh");
       s1.setage(33);
       BankAccount b1=new BankAccount();
       b1.username="ashish kumar singh";
       b1.setPassword("Ashish@1234");
    }
}

