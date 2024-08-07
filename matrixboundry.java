import java.util.Scanner;

public class matrixboundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        System.out.println("enter number");
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
        System.out.println("bounded matrix is =");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (i == 0 || j == 0 || i == mat1.length - 1 || j == mat1.length - 1) {
                    System.out.print(mat1[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
