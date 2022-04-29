package by.itAcademy.homeworks.oop.forTask33;

import java.util.Date;

public class PremiumCard extends BankCard implements GetCredit {
    private double cashback;
    private long availableCreditLine;

    public PremiumCard(String issuer, String owner, long cardNumber, Date issueDate, Date expirationDate, Currency currency, long moneyAmount, double cashback, long availableCreditLine) {
        super(issuer, owner, cardNumber, issueDate, expirationDate, currency, moneyAmount);
        this.cashback = cashback;
        this.availableCreditLine = availableCreditLine;
    }

    public PremiumCard(String issuer, String owner, long cardNumber, Currency currency, long moneyAmount, double cashback, long availableCreditLine) {
        super(issuer, owner, cardNumber, currency, moneyAmount);
        this.cashback = cashback;
        this.availableCreditLine = availableCreditLine;
    }

    @Override
    public int getCredit(Currency currency, int moneyAmounts) {
        if (currency == Currency.BYN || currency == Currency.USD) {
            if (moneyAmounts <= availableCreditLine) {
                this.moneyAmount += moneyAmounts;
                System.out.println("+ credit " + moneyAmounts);
            } else System.out.println("not successfully");
            return moneyAmounts;
        }
        return moneyAmounts;
    }
}
