public class StarPatterns {
    public static void main(String[] args) {
        System.out.println("\nPATTERN TYPE 1");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 2");
        for (int row = 1; row <= 5; row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 3");
        for (int row = 1; row <= 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 5; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 4");
        for (int row = 1; row <= 5; row++) {
            for (int col = 5; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 5");
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 5; col > row; col--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 6");
        for (int row = 0; row < 5; row++) {
            for (int col = 5; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}