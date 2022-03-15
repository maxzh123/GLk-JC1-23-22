package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;
import by.itAcademy.homeworks.oop.AdditionalProblem.Enums.Fines;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.ITicket;

import java.math.BigDecimal;

public class Ticket implements ITicket {
    private BigDecimal Price;
    private Fines Reason;

    public Ticket(BigDecimal price, Fines reason) {
        Price = price;
        Reason = reason;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public String getReason() {
        return Reason.getReason();
    }
}
