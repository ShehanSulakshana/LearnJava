import java.util.Scanner;

public class ElectricityBillCalc {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Unit count :");
            int units = scanner.nextInt();

            int bill;
            if (units > 300) {
                bill = units * 10;
            } else if (units > 100) {
                bill = units * 8;
            } else {
                bill = units * 5;
            }

            int tax = (bill / 100) * 10;
            int total = bill + tax;

            System.out.println("Bill amount : " + bill);
            System.out.println("Tax amount : " + tax);
            System.out.println("Total amount : " + total);
        } catch (Exception e) {
            System.out.println(" ERR : Invalid input...!");
        }
    }
}