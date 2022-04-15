package by.itAcademy.homeworks.generics;

public abstract class Vehicle {
    private final String name;
    public String brand;
    public String model;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String description(){
        return brand + " " + model;
    }
}
