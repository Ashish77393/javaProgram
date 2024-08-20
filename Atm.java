import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int deposit, withdraw;
        while (true) {
            System.out.println("Select Any Option");
            System.out.println("1.WithDraw Balance");
            System.out.println("2.Deposit Balance");
            System.out.println("3.Cheak Balance");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter withdraw Balance");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        System.out.println("Balance Withdraw Successfully");
                        balance = balance - withdraw;
                    } else {
                        System.out.println("Insufficent Balance");

                    }
                    break;
                case 2:
                    System.out.println("Enter Balance that are deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    break;
                case 3:
                    System.out.println("your Balance is = " + balance);
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }
}
