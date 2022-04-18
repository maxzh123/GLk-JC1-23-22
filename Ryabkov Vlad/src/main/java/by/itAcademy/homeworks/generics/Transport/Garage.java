package by.itAcademy.homeworks.generics.Transport;

public class Garage<T extends  Vehicle> {
    private T vehicle;

    @Override
    public String toString() {
        return  vehicle.getName() + " " + vehicle.description();
    }

    public void addVehicle(T vehicle) {
        this.vehicle = vehicle;


    }
}
