package Polymorphism;

public class car {
    private String name;
    private int door;
    private String color;

    public car(String name, int door, String color) {
        this.name = name;
        this.door = door;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
