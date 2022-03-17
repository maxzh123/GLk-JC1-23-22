package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayer;

import java.math.BigDecimal;

public class Payer implements IPayer {

    @Override
    public boolean getPayment(BigDecimal payment, BigDecimal price) {
        return false;
    }

    @Override
    public boolean getPayment(Card Card, BigDecimal price) {
        return false;
    }
}
