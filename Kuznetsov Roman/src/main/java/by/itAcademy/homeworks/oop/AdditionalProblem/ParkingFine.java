package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ParkingFine<T extends Vehicle, B extends IPayer> extends Parking<T> {
    Map<T, Ticket> tickets = new HashMap<T, Ticket>();
    B payer;

    public ParkingFine(int size, B payer) {
        super(size);
        this.payer = payer;
    }

    public boolean parkVehicle(T vehicle, Ticket ticket) {
        boolean result = false;
        if (super.parkVehicle(vehicle)) {
            tickets.put(vehicle, ticket);
            result = true;
        }
        return result;
    }

    public boolean takeVehicleBack(T vehicle, BigDecimal Payment) {
        boolean result = false;
        if (payer.getPayment(Payment, tickets.get(vehicle).getPrice())) {
            super.takeVehicleBack(vehicle);
            result = true;
        }
        return result;
    }

    public boolean takeVehicleBack(T vehicle, Card card) {
        boolean result = false;
        if (payer.getPayment(card, tickets.get(vehicle).getPrice())) {
            super.takeVehicleBack(vehicle);
            result = true;
        }
        return result;
    }
}
