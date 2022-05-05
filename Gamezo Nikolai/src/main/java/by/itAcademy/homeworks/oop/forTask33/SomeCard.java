package by.itAcademy.homeworks.oop.forTask33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SomeCard {

    public String bankName;
    public String cardType;
    public long cardNumber;
    public String cardOwner;
    public LocalDate expirationDate;
    public int month;
    public int year;
    public SomeCard (String bankName, String cardType, long cardNumber, String cardOwner, int month, int year){
        this.bankName = bankName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.expirationDate = LocalDate.of(month, year,1);
    }
    public String getBankName() {
        return null;
    }
    public String getCardType() {
        return null;
    }
    public long getCardNumber() {
        return 0;
    }
    public String getCardOwner() {
        return null;
    }
    public LocalDate getExpirationDate() {
        return null;
    }

    public String toString() {
        return  "Банк: " + bankName + "\n" +
                "Платёжная система: " + cardType + "\n" +
                "Номер карты: " + cardNumber + "\n" +
                "Владелец карты: " + cardOwner + "\n" +
                "Окончание срока действия: " + expirationDate.format(DateTimeFormatter.ofPattern("MM/uu"))  + "\n";
    }
}

