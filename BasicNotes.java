import java.util.Scanner;


public class BasicNotes {

    public static void main(String[] args) {
  
    /**********Variables**********/
  
    int a = 10;        // Integer
  
    double b = 10.002; // double 64
    float ff = 10.099f; //float 32
 
    char c = 'A';      // Characters
  
    boolean d = true;    // Boolean Values
  
    String e = "Some string"; // Strings

    /********** TYPE CASTING **********/

    // 1 widning casting
      //small to big


    // 2 Narrowing casting
      // big into small


    /********** LITERALS **********/

      //Interger literels
      int x = 123; // numerical
      int y = 0123; // octal  0-7
      int z = 0xABCDEF; //hexadecimal 0-9 A-F

      //Floating point literals
      //can use  e+ notation

      //character literels
      char newline = '\n';
      char tabspc = '\t';

    /********** COMMENTS **********/

      // single line

       /*  multi
            line */

      /**  special commnts for java doc */










/**********MATHEMATICAL OPERATERS **********/

      // Valiables Can be used
    /*
      add = 3+4;
      subtract = 10-7;
      multiplication = 6*7;
      division = 9/3 ;
      remainder = 11%4;
    */

    // Arithmetic compound assign operators
      // X = X+5  ===>>>  X +=5
      // X = X-5  ===>>>  X -=5
      // etc.


      // Mathematical Activities
    /*	int x = 20;
          x = x+5;
          System.out.println(x);
    */

      // Post Increment (1++)
    /*
      int j = 20;
      int k = j++;
      System.out.println(j);
      System.out.println(k);
    */

      // Pre Increment (++1)
    /*
       int j = 20;
       int k = ++j;
       System.out.println(j);
       System.out.println(k);
    */

      // Post decrement (1--)
    /*
      int j = 20;
      int k = j--;
      System.out.println(j);
      System.out.println(k);
    */

      // Pre Decrement (--1)
    /*
       int j = 20;
       int k = --j;
       System.out.println(j);
       System.out.println(k);
    */


      // BitWise Operators
      // AND &
      // OR |
      // XOR ^
      // NOT ~

      // BitWise Shift Operators
      //  >> Right shift (MSB FILLES WITH 1 FOR NEGATIVE , 0 FOR POSITIVE)
      //  >>> ZERO FILL Right shift
      // << Left shift  (Filled with zero)


      /********** USER INPUTS **********/

    // import java.util.Scanner

    // String Inputs
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Name :");
    String name = scan.nextLine();
    System.out.print("VALUE IS "+name);

    // Inputs in Other Data Types
    /*
          int name = x.nextInt();
          double x = y.nextDouble();
    */



    /**********IF,ELSE STATEMENT**********/
    /*
      ||   OR
      &&   AND
      ==   Equal
      !=   Not Equal
      <    Greater than
      >    Less than
      >=   Greater than or equal
      <=   Less than or equal

    */


    String xx = "10";
    if (xx == "10") {
      System.out.println("IF :: XX = "+xx);
    } else {
      System.out.println("ELSE :: XX = "+xx);
    }


    /**********SWITCH CASE **********/

    int C = 2;
    String count = Integer.toString(C);

    switch (C)
    {
      case 1 :
          System.out.println("Count = "+count );

      case 2 :
          System.out.println("Count = "+count);
    }


    /**********WHILE LOOPS**********/

    int k = 25;
    while(k<30)
    {
      System.out.println("Hello John Kener...");
      k += 1;
    }


    }
}
















