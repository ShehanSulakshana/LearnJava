import java.util.Scanner;

public class SimpleBankApplication {
    static double balance = 7500;

    static void checkBalance(double balance){
        System.out.println("Your account balance is : Rs."+balance);
    }

    static double deposit(double balance , double depositAmount){
        if (depositAmount<=0){
            throw new RuntimeException("Deposit amount cannot be negative or 0 .");
        }
        System.out.println("Current Balance :"+balance);
        balance += depositAmount;
        return balance;
    }

    static double withdraw(double balance,double withdrwalAmount){
        if (withdrwalAmount<=0){
            throw new RuntimeException("Withdrawal amount cannot be negative or 0 .");
        }
        if ((balance-withdrwalAmount<=0)){
            throw new RuntimeException("Insufficient balance");
        }
        System.out.println("Current Balance :"+balance);
        balance -= withdrwalAmount;
        return balance;
    }

    public static void main(String[] args){
        int choice;
        double depositAmount ,withdrawalAmount;

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");

        System.out.print("Choice : ");
        choice = scannerObj.nextInt();

        switch (choice){
            case 1:
                checkBalance(balance);
                break;
            case 2:
                try {
                    System.out.print("Enter the Deposit Amount: ");
                    depositAmount = scannerObj.nextDouble();
                    System.out.println("Updated Balance :" + deposit(balance,depositAmount));
                } catch (Exception e) {
                    System.out.println("Error occured");
                }
                break;

            case 3:
                try {
                    System.out.print("Enter the Withdrawal Amount: ");
                    withdrawalAmount = scannerObj.nextDouble();
                    System.out.println("Updated Balance :" + withdraw(balance,withdrawalAmount));
                }catch (Exception e){
                    System.out.println("Error occured");
                }
                break;
            case 4:
                System.out.println("Thank You...!");
                System.exit(0);
            default:
                System.out.println("Wrong input");
        }
    }
}
