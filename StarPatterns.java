public class StarPatterns {
    public static void main(String[] args){

        System.out.println("\nPATTERN TYPE 1");
        for (int r=1; r<=5 ; r++){
            for (int c=1 ; c<=r ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 2");
        for (int r=1; r<=5; r++ ){
            for (int c=5; c>=r; c--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 3");
        for (int r=1; r<=5; r++ ){
            for (int s=0; s<r ; s++){
                System.out.print(" ");
            }
            for (int c=5; c>=r; c--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 4");
        for (int r=1; r<=5 ; r++){
            for (int s=5; r<s ; s--){
                System.out.print(" ");
            }
            for (int c=1 ; c<=r ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 5");
        int x = 5;
        for (int i = 0; i <= x ; i++) {
            for (int n = 0; n<i ; n++){
                System.out.print("  ");
            }
            for (int j = x; j>i ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("\nPATTERN TYPE 6");
        int y = 5;
        for (int i = 0; i < y; i++) {
            for (int n = y; n>i ; n--){
                System.out.print("  ");
            }
            for (int j = 0; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
