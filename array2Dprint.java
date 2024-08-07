import java.util.*;

public class array2Dprint {
    public static void main(String[] args) {
        // int[][] mat1 = {
        // { 1, 2, 4 },
        // { 3, 2, 5 },
        // { 3, 8, 9 }
        // };
        Scanner sc = new Scanner(System.in);
        int[][] sum = new int[3][3];
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
        System.out.println("data length " + mat1.length);
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter number of rows");
        int row1 = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns1 = sc.nextInt();
        int[][] mat2 = new int[row1][columns1];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("data length " + mat2.length);
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}
