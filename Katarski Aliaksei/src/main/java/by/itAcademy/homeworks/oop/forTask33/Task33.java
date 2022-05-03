package by.itAcademy.homeworks.oop.forTask33;

/**
 * > Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */

public class Task33 {
    public static void main(String[] args) {
        PremiumCard a=new PremiumCard("Z","AW",1231,Currency.BYN,1231,12.55,3000);
        PremiumCard b=new PremiumCard("Z","AW",1231,Currency.USD,1231,12.55,3000);
        a.getCredit(Currency.USD,2900);

    }
}