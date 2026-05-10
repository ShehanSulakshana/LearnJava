package Polymorphism;

public class oopPolymorphism {

    public static void main(String[] args){

        engine carEngine = new engine("Renault",7500);

        car benz = new car("benz", 4, "black");

        System.out.println(benz.getDoor());
    }
}
