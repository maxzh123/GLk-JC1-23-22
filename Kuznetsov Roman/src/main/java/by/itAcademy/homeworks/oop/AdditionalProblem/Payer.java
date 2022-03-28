package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayable;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayer;

import java.math.BigDecimal;

public class Payer implements IPayer {

    public boolean getPayment(BigDecimal payment, BigDecimal price) {
        return false;
    }

    public boolean getPayment(IPayable iPayable, BigDecimal price) {
        return false;
    }

}
