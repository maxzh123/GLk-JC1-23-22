package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IParkingLot;

public class ParkingLot<T extends Vehicle> implements IParkingLot<T> {
    private T vehicle = null;
    @Override
    public boolean parkVehicle(T vehicle) {
        boolean result = false;
        if(this.vehicle==null){
            this.vehicle=vehicle;
            result=true;
        }
        return result;
    }

    @Override
    public boolean takeVehicleBack(T vehicle) {
        boolean result = false;
        if(this.vehicle==vehicle){
            this.vehicle= null;
            result=true;
        }
        return result;
    }

    @Override
    public boolean isBusy() {
        return vehicle==null;
    }

    @Override
    public T getVehicle() {
        return vehicle;
    }
}
