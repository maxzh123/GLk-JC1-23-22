package by.itAcademy.homeworks.generics;

public class Vehicle {
    private String name;
    private int mileage;

    public Vehicle(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
