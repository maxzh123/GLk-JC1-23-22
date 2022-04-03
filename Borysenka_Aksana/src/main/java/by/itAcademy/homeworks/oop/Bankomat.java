package by.itAcademy.homeworks.oop;

public interface Bankomat {
    boolean insertCard(Card x);
    boolean pin (Integer pin);
    long balance();
    long takeCash (Card c, long amount);
    Card finish();
}
