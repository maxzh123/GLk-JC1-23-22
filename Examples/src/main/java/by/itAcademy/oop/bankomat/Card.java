package by.itAcademy.oop.bankomat;

import java.util.Date;

public interface Card {
    Bank getIssuer();
    Currency getCurrency();
    String getName();
    String getNumber();
    Date getExpirationDate();
}
