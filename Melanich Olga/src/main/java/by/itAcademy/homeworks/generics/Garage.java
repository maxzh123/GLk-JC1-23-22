package by.itAcademy.homeworks.generics;

public class Garage<T extends Vehicle> {

    private T vehicle;

    public Garage() {
    }

    public T getVehicle() {
        return vehicle;
    }

    public void putInto(T o) {
        vehicle = o;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
