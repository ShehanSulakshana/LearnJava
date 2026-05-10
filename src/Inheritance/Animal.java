package Inheritance;

public class Animal {

    private String name;
    private int legs;
    private String foods;
    private String color;

    public Animal(String name, String color, String foods, int legs) {
        this.name = name;
        this.color = color;
        this.foods = foods;
        this.legs = legs;
    }

    public void activity(){
        System.out.println(this.name + " is doing some activity");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
