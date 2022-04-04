package by.itAcademy.homeworks.oop.ForTask33;

import java.util.Date;

public interface Card {
    Bank getIssuer();
    String getName();
    String getNumberCard();
    Date getExpirationDate();
}
