package Inheritance;

public class Dog extends Animal{
    private String type;

    public Dog(String name, String color, String foods, int legs , String type) {
        super(name, color, foods, legs);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
