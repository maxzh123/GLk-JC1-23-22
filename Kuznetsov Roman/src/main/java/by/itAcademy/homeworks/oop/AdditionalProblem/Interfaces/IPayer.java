package by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces;

import by.itAcademy.homeworks.oop.AdditionalProblem.Card;

import java.math.BigDecimal;

public interface IPayer {
    public boolean getPayment(BigDecimal payment, BigDecimal price);
    public boolean getPayment(Card Card, BigDecimal price);
}
