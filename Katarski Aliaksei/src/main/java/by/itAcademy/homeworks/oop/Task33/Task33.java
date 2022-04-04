package by.itAcademy.homeworks.oop.Task33;

import java.util.Calendar;

/**
 * > Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */

public class Task33 {
    public static void main(String[] args) {
        PremiumCard a=new PremiumCard("Z","AW",1231,"BYN",1231,12.55,3000);
        a.getCredit(Currency.BYN,25000);
    }
}