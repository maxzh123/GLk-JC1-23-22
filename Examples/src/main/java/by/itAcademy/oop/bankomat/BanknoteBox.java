package by.itAcademy.oop.bankomat;

import java.util.List;

public interface BanknoteBox{
    long getNominal();
    Currency getCurrency();
    List<Banknote> getBanknotes(int cont) throws Exception;
    boolean isEmpty();
    int getCount();

}
