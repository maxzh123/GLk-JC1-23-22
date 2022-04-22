package by.itAcademy.oop.bankomat;

public interface Banknote {
    Currency getCurrency();
    long getSerialNumber();
    long getNominal();
}
