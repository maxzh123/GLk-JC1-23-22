package by.itAcademy.homeworks.generics;

public class Motorcycle extends Vehicle {

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Motorcycle " + super.toString();
    }
}
