package by.itAcademy.homeworks.generics;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
