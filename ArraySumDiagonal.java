import java.util.*;
public class ArraySumDiagonal {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [][]a=new int[3][3];
   int sum=0;
   int sum2=0;
    System.out.println("Enter matrix elemnts:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println(a.length);
    System.out.println("array elemnts is");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }
    System.out.println("sum of diogonal elemnts is LTR");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i==j){
              
                sum=sum+a[i][j];
            }

        }
       
    }

      System.out.println(sum);
  System.out.println("sum of diogonal elemnts is RTL");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i+j==2){
            sum2=sum2+a[i][j];
           
              
            }

        }
       
    }


   
     System.out.println(sum2);
   } 
}
