import java.util.Scanner;

public class DecInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1 :: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter num2 :: ");
        double num2 = scanner.nextDouble();

        double DecTotal = num1 + num2;
        int InTotal = (int) DecTotal;
        System.out.println("#~ Integer Total :: " + InTotal);

    }
}
