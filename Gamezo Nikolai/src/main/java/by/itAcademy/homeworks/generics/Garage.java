package by.itAcademy.homeworks.generics;

public class Garage <Gen extends Vehicle>{
    private Gen vehicle;
    public Gen getVehicle() {
        return vehicle;
    }
    public void putInto(Gen o) {
        vehicle = o;
    }
}
