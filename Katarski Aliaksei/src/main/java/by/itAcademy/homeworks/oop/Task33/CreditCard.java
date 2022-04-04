package by.itAcademy.homeworks.oop.Task33;

import java.util.Date;

public class CreditCard extends BankCard {
    private double creditPercent;

    public CreditCard(String issuer, String owner, long cardNumber, Date issueDate, Date expirationDate, String currency, long moneyAmount, double creditPercent) {
        super(issuer, owner, cardNumber, issueDate, expirationDate, currency, moneyAmount);
        this.creditPercent = creditPercent;
    }



    public double getCreditPercent() {
        return creditPercent;
    }

}
