package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;

/**
 * Класс реализующий муниципальную парковку
 *
 * @param <T>
 */
public class MunicipalParking<T extends Vehicle> extends Parking<T> {

    public MunicipalParking(int size) {
        super(size);
    }

    /**
     * Метод отвечающий за парковку транспорта.
     *
     * @param vehicle
     * @return boolean
     */
    public boolean parkVehicle(T vehicle) { //Да паблик, потому что могу.
        return super.parkVehicle(vehicle);
    }

    /**
     * Метод отвечающий за снятие трансопрта с парковки
     *
     * @param vehicle
     * @return boolean
     */
    public boolean takeVehicleBack(T vehicle) { //Да паблик, потому что могу X2.
        return super.takeVehicleBack(vehicle);
    }
}
