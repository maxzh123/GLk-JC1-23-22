package by.itAcademy.homeworks.oop.Task33;

/**
 * Задание 33
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task33 {
    public static void main(String[] args) {
        SomeCard card = new SomeCard("Belarusbank", "Visa", 12345678912345l, "Vasya Vasechkin", 24, 4);
        System.out.println(card.toString());
        VirtualCard virtualCard = new VirtualCard("Belinvestbank", "Mastercard", 12345678912345l, "Vasya Vasechkin", 24, 4, true);
        System.out.println(virtualCard.toString());
        PremiumCard premiumCard = new PremiumCard("Alphabank", "Мир", 12345678912345l, "Vasya Vasechkin", 24, 4, true, true, 0);
        System.out.println(premiumCard.toString());
        premiumCard.getOverdraft();
    }
}
