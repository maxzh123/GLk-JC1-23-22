package by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Card;

import java.math.BigDecimal;

public interface IPaidParking<T extends Vehicle> {
    public boolean park(T Vehicle, Card card);
    public boolean park(T Vehicle, BigDecimal Payment);
    public boolean takeVehicleBack(T Vehicle);
}
