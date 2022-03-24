package by.itAcademy.homeworks.objects;

import java.util.Collection;
import java.util.Scanner;

/**
 * > Создать класс, описывающий Банкомат. Набор купюр, находящихся в
 * > банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 * > 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
 * > снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 * > значение (операция удалась или нет). При снятии денег метод должен выводить на
 * > экран каким количеством купюр и какого номинала выдается сумма. Создать
 * > конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
 * > усмотрение.
 **/

public class Task25 {
    public static void main(String[] args) {
        Banknotes coin20=new Banknotes(1);
        Banknotes coin50=new Banknotes(1);
        Banknotes coin100=new Banknotes(1);
        Amount c20=new Amount();
        c20.setCollection((Collection) coin20);
        System.out.println(c20.toString());
    }
}
