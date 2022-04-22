package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayer;

import java.math.BigDecimal;

/**
 * Класс реализующий платную парковку.
 *
 * @param <T>
 * @param <B>
 */
public class PaidParking<T extends Vehicle, B extends IPayer> extends Parking<T> {
    BigDecimal pricePerLot;
    B payer;

    public PaidParking(int size, BigDecimal pricePerLot, B payer) {
        super(size);
        this.payer = payer;
        this.pricePerLot = pricePerLot;
    }

    /**
     * Метод отвечающий за постановку машины на парковку с использование наличной оплаты
     *
     * @param Vehicle
     * @param Payment
     * @return
     */
    public boolean park(T Vehicle, BigDecimal Payment) {
        boolean result = false;
        if (payer.getPayment(Payment, pricePerLot)) {
            super.parkVehicle(Vehicle);
            result = true;
        }
        return result;
    }

    /**
     * Метод отвечающий за постановку машины на парковку с использование банковской карты
     *
     * @param Vehicle
     * @param card
     * @return
     */
    public boolean park(T Vehicle, Card card) {
        boolean result = false;
        if (payer.getPayment(card, pricePerLot)) {
            super.parkVehicle(Vehicle);
            result = true;
        }
        return result;
    }

    /**
     * Метод отвечающий за снятие машины с парковки.
     *
     * @param Vehicle
     * @return
     */
    public boolean takeVehicleBack(T Vehicle) {
        return super.takeVehicleBack(Vehicle);
    }
}
