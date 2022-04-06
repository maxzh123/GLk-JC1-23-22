package by.itAcademy.homeworks.oop.ForTask33;


import java.util.Calendar;
import java.util.Date;

public class Visa implements Card {


    private final String name;
    private final String number;
    private final Date expiration;
    private final Bank issuer;


    public Visa(Bank issuer, String number,String name) {
        this.name = name;
        this.number = number;
        this.issuer = issuer;
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        this.expiration = c.getTime();
    }


    @Override
    public Bank getIssuer() {
        return issuer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumberCard() {
        return number;
    }

    @Override
    public Date getExpirationDate() {
        return expiration;
    }
}
