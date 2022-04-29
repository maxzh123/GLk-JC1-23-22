package by.itAcademy.homeworks.oop.forTask33;

import java.util.Date;

public class SalaryCard extends BankCard{
    private String companyName;

    public SalaryCard(String issuer, String owner, long cardNumber, Date issueDate, Date expirationDate, Currency currency, long moneyAmount) {
        super(issuer, owner, cardNumber, issueDate, expirationDate, currency, moneyAmount);
    }


    public String getCompanyName() {
        return companyName;
    }


}


