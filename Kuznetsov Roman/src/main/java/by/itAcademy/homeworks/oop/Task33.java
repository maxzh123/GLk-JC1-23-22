package by.itAcademy.homeworks.oop;

import java.util.Date;

/**
 * Цепочка наследований из трех звений цепи. Тема: Банковские карты.
 * Самое главное в наследовании - расширение функционала родительского(супер) класса.
 */
class PlasticCard{
    String Bank;
    String Owner;
    String SerialNumber;
    public String getBank() {
        return Bank;
    }
    public String getOwner() {
        return Owner;
    }
    public String getSerialNumber() {
        return SerialNumber;
    }
    public PlasticCard(String bank, String owner, String serialNumber) {
        Bank = bank;
        Owner = owner;
        SerialNumber = serialNumber;
    }
}
class CreditCard extends PlasticCard{
    Double balance;
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String getSerialNumber() {
        return super.getSerialNumber()+"CREDIT"; //Имитирую полиморфизм.
    }
    public CreditCard(String bank, String owner, String serialNumber, Double balance) {
        super(bank, owner, serialNumber);
        this.balance = balance;
    }
}
class GoldenCard extends CreditCard{
    double cashback;

    public GoldenCard(String bank, String owner, String serialNumber, Double balance, Double cashback) {
        super(bank, owner, serialNumber, balance);
        this.cashback = cashback;
    }

    public double getCashback() {
        return cashback;
    }
    @Override
    public Double getBalance() {
        return super.getBalance()+cashback;
    }
    @Override
    public String getSerialNumber() {
        return super.getSerialNumber()+"GOLDEN"; //Все еще имитирую полиморфизм.
    }
}
public class Task33 {
    public static void main(String[] args) {
        PlasticCard a = new PlasticCard("Bebro","Ivanov A.V.","AE12DTG");
        CreditCard b = new CreditCard("Bebro","Ivanov A.V.","AE12DTG", 0.0);
        GoldenCard c = new GoldenCard("Bebro","Ivanov A.V.","AE12DTG", 0.0, 10.0);
        System.out.println(a.getSerialNumber());
        System.out.println(b.getSerialNumber());
        System.out.println(c.getSerialNumber());
    }
}
