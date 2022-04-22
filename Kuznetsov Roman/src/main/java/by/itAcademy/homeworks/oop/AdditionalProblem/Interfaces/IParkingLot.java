package by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces;

import by.itAcademy.homeworks.generics.Vehicle;

public interface IParkingLot<T extends Vehicle> {
    public boolean parkVehicle(T vehicle);
    public boolean takeVehicleBack(T vehicle);
    public boolean isBusy();
    public T getVehicle();
}
