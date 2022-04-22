package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IParkingLot;

public class ParkingLot<T extends Vehicle> implements IParkingLot<T> {
    private T vehicle = null;

    /**
     * Метод для парковки транспорта
     * @param vehicle
     * @return
     */
    @Override
    public boolean parkVehicle(T vehicle) {
        boolean result = false;
        if (this.vehicle == null) {
            this.vehicle = vehicle;
            result = true;
        }
        return result;
    }

    /**
     * Метод для изъятия транспорта с парковки
     * @param vehicle
     * @return
     */
    @Override
    public boolean takeVehicleBack(T vehicle) {
        boolean result = false;
        if (this.vehicle == vehicle) {
            this.vehicle = null;
            result = true;
        }
        return result;
    }

    /**
     * Метод для проверки занятости места
     * @return
     */
    @Override
    public boolean isBusy() {
        return vehicle == null;
    }

    /**
     * Метод для получения хранимого на парковочном месте ТС
     * @return
     */
    @Override
    public T getVehicle() {
        return vehicle;
    }
}
