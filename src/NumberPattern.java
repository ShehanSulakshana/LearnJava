public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;
        int counter = 1;

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}