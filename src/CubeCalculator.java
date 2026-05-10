import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value as the lenght of the cube :");
        double length = scanner.nextDouble();

        if (length <= 0) {
            System.out.println("Error! dimensions should be positive and non-zero to represent a valid cube.");
        } else {
            double volume = length * length * length;
            double surfaceArea = 6.0d * length * length;
            System.out.println("Volume of the cube : " + volume);
            System.out.println("Surface area of the cube : " + surfaceArea);
        }

        scanner.close();
    }
}