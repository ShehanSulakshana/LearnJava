import java.util.Scanner;

public class DecInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 ::");
        double num1 = scanner.nextDouble();
        System.out.print("Enter num2 ::");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        int converted = (int) sum;
        System.out.println("Converted integer value : " + converted);
    }
}