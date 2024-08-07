class Encapsualtion{
     String  name;
   int age;
    void student(int age,String Name){
        age=age;
        name=Name;
      System.out.println("Student age :"+age);
      System.out.println("student name :"+name);

   }
}


public class OopsEncapsulation {
    public static void main(String[] args) {
       Encapsualtion E= new Encapsualtion();
    E.student(23, "ashsish kumar singh");
  
}
}