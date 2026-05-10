import java.util.Scanner;

public class BasicNotes {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 10.002;
        float num3 = 10.099f;
        char letter = 'A';
        boolean flag = true;
        String text = "Some string";
        byte byteValue = 123;
        short shortValue = 83;
        int hexValue = 0xABCDEF;
        int ten = 10;
        int nine = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        System.out.print("Hello " + name + "...");

        String first = "10";
        if (first == "10") {
            System.out.println(first + " is equal");
        } else {
            System.out.println(first + " is not equal");
        }

        int choice = 2;
        String choiceText = Integer.toString(choice);
        switch (choice) {
            case 1:
                System.out.println(choiceText + " is case 1");
                break;
            case 2:
                System.out.println(choiceText + " is case 2");
                break;
            default:
                break;
        }

        for (int i = 25; i < 30; i++) {
            System.out.println("Hello John Kener...");
        }
    }
}