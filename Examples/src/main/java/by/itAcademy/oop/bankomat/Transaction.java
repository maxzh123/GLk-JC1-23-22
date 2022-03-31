package by.itAcademy.oop.bankomat;

public interface Transaction {
    Currency getCurrency();
    long getAmount();
    long getAmountInAccountCurrency();
}
