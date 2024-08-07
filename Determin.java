import java.util.*;

public class Determin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] mat1 = new int[row][columns];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("detreninate is");

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (i == j) {
                    a = a * mat1[i][j];
                }
                if (i != j) {
                    b = b * mat1[i][j];
                }
            }
        }
        System.out.println(a - b);
    }
}
