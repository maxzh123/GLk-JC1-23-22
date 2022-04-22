package by.itAcademy.homeworks.objects;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать класс, описывающий Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
 * кол.купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги.
 * С клавиатуры передается сумма денег. На экран – булевское значение (операция удалась или нет).
 * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр.
 */
public class Task25 {
    public static void main(String[] args) {
        Money banknote20 = new Money(20);
        Money banknote50 = new Money(50);
        Money banknote100 = new Money(100);

        Storage storage = new Storage();
        storage.addMoney(banknote20, 10);
        storage.addMoney(banknote50, 10);
        storage.addMoney(banknote100, 10);

        ATM atm = new ATM(storage);

        System.out.println(storage.getSum());

        System.out.println(atm.getMoney(270));


    }
}
