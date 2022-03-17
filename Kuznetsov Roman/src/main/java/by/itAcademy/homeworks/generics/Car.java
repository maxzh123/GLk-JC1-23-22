package by.itAcademy.homeworks.generics;

public class Car extends Vehicle {
    public Car(String name, int tears, String producer) {
        super(name, tears, producer);
    }

    @Override
    public String toString() {
        return "Car: "+ super.getName();
    }
}
