package by.itAcademy.oop.bankomat;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class VisaElectron implements Card{
    private final Currency currency;
    private final String name;
    private final String number;
    private final Date expiration;
    private final Bank issuer;

    public VisaElectron(Bank issuer,Currency currency, String name, String number) {
        this.issuer=issuer;
        this.currency = currency;
        this.name = name;
        this.number = number;
        Calendar c= Calendar.getInstance();
        c.add(Calendar.YEAR,1);
        this.expiration = c.getTime();
    }

    @Override
    public Bank getIssuer() {
        return issuer;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public Date getExpirationDate() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisaElectron that = (VisaElectron) o;
        return number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }
}
