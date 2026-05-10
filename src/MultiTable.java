public class MultiTable {
    public static void main(String[] args) {
        int table = 2;
        int multiplier = 1;
        while (table < 15) {
            System.out.println("Table of " + table);
            while (multiplier <= 5) {
                int result = table * multiplier;
                System.out.println(table + " x " + multiplier + " = " + result);
                multiplier++;
            }
            multiplier = 1;
            table++;
        }
    }
}