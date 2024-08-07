import java.util.*;

public class arrayTracematrixNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trace = 0;
        double normal = 0;
        int[][] mat1 = new int[4][4];
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
        System.out.print("Trace = ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (i == j) {
                    trace = trace + mat1[i][j];
                }
            }
        }
        System.out.println(trace);
        System.out.print("Normal = ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                normal = normal + Math.pow(mat1[i][j], 2);
            }

        }
        System.out.println(Math.sqrt(normal));

    }
}
