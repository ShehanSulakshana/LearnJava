class Mobile{
    String name;
    String brand;
    static int year;

    static {
        year = 2020;
    }

    public void show(){
        System.out.println(name + " : "+ brand + " : " + year );
    }
}


public class Main {
    public static void main(String[] args){

        Mobile obj1 = new Mobile();
        obj1.brand ="Samsung";
        obj1.name = "galaxy s23";


        Mobile obj2 = new Mobile();
        obj2.brand ="Apple";
        obj2.name = "Iphone 15";


        obj1.show();
        obj2.show();

    }

}