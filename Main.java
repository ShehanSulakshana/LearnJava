import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        //Generate a multiplcation table with nested for loops for 2 ,3 ,4 ,5 values multiply each of them 1-10 ...
        //Make sure to use nested loops and necessary logics ,try understanding and code using any IDE ,and write on papers too.

        int multi = 0;
        for (int i = 2; i <=5 ; i++) {
            System.out.println("\n\n#~ MULTIPLICATION TABLE OF : " + i);
            for (int j = 1; j <=10 ; j++) {
                multi = i*j;
                System.out.println(i + " * " + j + " = " + multi);    // 2 * 5 = 10
            }
        }

    }
}