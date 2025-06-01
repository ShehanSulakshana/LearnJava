import java.util.Scanner;


public class CubeCalculator {
    public static void main(String[] args){

        double lenght;
        double SArea , volume;

        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter a double value as the lenght of the cube : ");
        lenght = scannerObject.nextDouble();

        if (lenght<=0){
            System.out.println("Error! dimensions should be positive and non-zero to represent a valid cube.");

        }else {
            volume = lenght*lenght*lenght;
            System.out.println("Volome of the cube : "+volume);

            SArea = 6*lenght*lenght;
            System.out.println("surface Area of the cube : "+ SArea);
        }

        scannerObject.close();

    }
}
