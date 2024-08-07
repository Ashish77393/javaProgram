 import java.util.*;
public class array2DsortedelementSearch {
   public static void sortedelementSearch(int [][]ar,int key){
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        if(ar[i][j]==key){
        System.out.println("my element is (" +i+","+j+")" );
    }  
        }
    }
   } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [][]ar=new int[3][3];
    System.out.println("Enter array elemnts u want to  print ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        ar[i][j]=sc.nextInt();
        }
    }
    System.out.println("My array is:");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
      System.out.print(ar[i][j]+" ");
        }
        System.out.println(" ");
    }
 
    sortedelementSearch(ar,12);

   }
}


