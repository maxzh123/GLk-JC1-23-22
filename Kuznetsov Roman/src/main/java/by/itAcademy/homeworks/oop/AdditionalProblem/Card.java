package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.oop.AdditionalProblem.Enums.PaymentSystems;
import by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces.IPayable;

import java.math.BigDecimal;

public class Card implements IPayable {
    private BigDecimal balance;
    private PaymentSystems paymentSystem;

    public Card(BigDecimal balance, PaymentSystems paymentSystem) {
        this.balance = balance;
        this.paymentSystem = paymentSystem;
    }

    @Override
    public boolean addMoney(BigDecimal money) {
        balance= balance.add(money);
        return true;
    }

    @Override
    public boolean withdrawMoney(BigDecimal money) {
        boolean result = false;
        if(balance.subtract(money).intValue()>0){
            balance = balance.subtract(money);
            result = true;
        }
        return result;
    }
}
