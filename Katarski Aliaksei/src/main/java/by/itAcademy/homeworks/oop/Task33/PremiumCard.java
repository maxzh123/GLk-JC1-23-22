package by.itAcademy.homeworks.oop.Task33;

import java.util.Date;

public class PremiumCard extends BankCard implements GetCredit {
    private double cashback;
    private long availableCreditLine;

    public PremiumCard(String issuer, String owner, long cardNumber, Date issueDate, Date expirationDate, String currency, long moneyAmount, double cashback, long availableCreditLine) {
        super(issuer, owner, cardNumber, issueDate, expirationDate, currency, moneyAmount);
        this.cashback = cashback;
        this.availableCreditLine = availableCreditLine;
    }

    public PremiumCard(String issuer, String owner, long cardNumber, String currency, long moneyAmount, double cashback, long availableCreditLine) {
        super(issuer, owner, cardNumber, currency, moneyAmount);
        this.cashback = cashback;
        this.availableCreditLine = availableCreditLine;
    }

    @Override
    public int getCredit(Currency currency, int moneyAmount) {
        if(currency==Currency.BYN&&moneyAmount<=availableCreditLine){
            this.moneyAmount+=moneyAmount;
            System.out.println("+ credit " + moneyAmount);
        }else System.out.println("not successfully");
        return moneyAmount;
    }
}
