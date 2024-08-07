import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="123454321";
        String name2=new String("sanjeev kumar singh");
        System.out.println("My name is "+name);
        System.out.println("My brother name is "+name2);
        System.out.println("Enter Your Father Name");
        String fname=sc.nextLine();
        System.out.println("my fathername is "+fname);
        System.out.println(fname.length());
        System.out.println(fname.concat(" "+name));
        System.out.println(name +" "+ name2);
        System.out.println(fname.charAt(4));
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
