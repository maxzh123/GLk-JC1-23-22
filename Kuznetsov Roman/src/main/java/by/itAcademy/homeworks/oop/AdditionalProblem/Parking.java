package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IParking;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс отвечающий за создание объекта парковки
 * @param <T>
 */
public class Parking<T extends Vehicle> implements IParking{
    private final List<ParkingLot> lots;

    public Parking(int size) {
        lots = new ArrayList<>(size);
    }

    /**
     * Метод отвечает за парковку транспорта на свободное парковочное место
     * @param vehicle
     * @return boolean
     */
    protected boolean parkVehicle(T vehicle) {
        boolean result = false;
        for (ParkingLot lot : lots) {
            if(!lot.isBusy()){
                lot.parkVehicle(vehicle);
                result = true;
            }
        }
        return result;
    }

    /**
     * Метод забирающий автомобиль с парковочного места.
     * @param vehicle
     * @return boolean
     */
    protected boolean takeVehicleBack(T vehicle) {
        boolean result = false;
        for (ParkingLot lot : lots) {
            if(vehicle == lot.getVehicle()){
                lot.takeVehicleBack(vehicle);
                result = true;
            }
        }
        return result;
    }
}
