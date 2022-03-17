package by.itAcademy.homeworks.generics;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, int wheels, String producer) {
        super(name, wheels, producer);
    }
    @Override
    public String toString() {
        return "Motorcycle: "+ super.getName();
    }
}
