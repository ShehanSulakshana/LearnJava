import java.util.Scanner;

public class SimpleBankApplication {
    static double balance = 7500.0d;

    static void checkBalance(double currentBalance) {
        System.out.println("Balance : " + currentBalance);
    }

    static double deposit(double currentBalance, double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Deposit amount cannot be negative or 0 .");
        }
        System.out.println("Current balance : " + currentBalance);
        return currentBalance + amount;
    }

    static double withdraw(double currentBalance, double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Withdrawal amount cannot be negative or 0 .");
        }
        if (currentBalance - amount <= 0) {
            throw new RuntimeException("Insufficient balance");
        }
        System.out.println("Current balance : " + currentBalance);
        return currentBalance - amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.print("Choice :");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance(balance);
                break;
            case 2:
                try {
                    System.out.print("Enter the Deposit Amount:");
                    double depositAmount = scanner.nextDouble();
                    balance = deposit(balance, depositAmount);
                    System.out.println("Balance : " + balance);
                } catch (Exception e) {
                    System.out.println("Error occured");
                }
                break;
            case 3:
                try {
                    System.out.print("Enter the Withdrawal Amount:");
                    double withdrawalAmount = scanner.nextDouble();
                    balance = withdraw(balance, withdrawalAmount);
                    System.out.println("Balance : " + balance);
                } catch (Exception e) {
                    System.out.println("Error occured");
                }
                break;
            case 4:
                System.out.println("Thank You...!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}