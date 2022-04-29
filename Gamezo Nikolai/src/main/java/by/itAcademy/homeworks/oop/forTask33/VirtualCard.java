package by.itAcademy.homeworks.oop.forTask33;

import java.time.format.DateTimeFormatter;

public class VirtualCard extends SomeCard {
    public boolean noPlasticCarrier;
    public VirtualCard(String bankName, String cardType, long cardNumber, String cardOwner, int month, int year, boolean noPlasticCarrier) {
        super(bankName, cardType, cardNumber, cardOwner, month, year);
        this.noPlasticCarrier = noPlasticCarrier;
    }
    public String isCarrierPresent() {
        if (noPlasticCarrier == true) {
            return "Виртуальная карта";
        }
        else {
            return "Это не виртуальная карта";
        }
    }
    public String toString() {
        return  "Банк: " + bankName + "\n" +
                "Платёжная система: " + cardType + "\n" +
                "Номер карты: " + cardNumber + "\n" +
                "Владелец карты: " + cardOwner + "\n" +
                "Окончание срока действия: " + expirationDate.format(DateTimeFormatter.ofPattern("MM/uu")) + "\n" +
                isCarrierPresent() + "\n";
    }
}
