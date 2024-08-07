import java.util.*;
public class StringSortestPath {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int x=0;
    int y=0;
    System.out.println("Enter a string direction");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        int dir=str.charAt(i);
        if(dir=='N'){
              y++;
        }else if(dir=='S'){
            y--;
        }else if(dir=='W'){
            x--;
        }else{
            x++;
        }
    }
    int x2=x*x;
    int y2=y*y;
    double displacement=(double)Math.sqrt(x2+y2);
    System.out.println("dispalcement of sortest path is "+displacement);
   } 
}
