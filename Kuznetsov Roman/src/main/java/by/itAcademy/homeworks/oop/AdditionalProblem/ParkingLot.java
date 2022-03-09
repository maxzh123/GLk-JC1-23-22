package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;

public class ParkingLot<T extends Vehicle> {
    private boolean isBusy;
    private int number;
    private T vehicle;


    public ParkingLot(int number) {
        this.number = number;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public int getNumber() {
        return number;
    }

    //Парковка автомобиля на месте
    public boolean parkVehicle(T vehicle) {
        if (!this.isBusy()) {
            this.vehicle = vehicle;
            this.isBusy = true;
            return true;
        }
        return false;
    }

    //Заборка автомобиля с места
    public boolean takeVehicleBack() {
        if (vehicle != null) {
            vehicle = null;
            return true;
        }
        return false;
    }
}
