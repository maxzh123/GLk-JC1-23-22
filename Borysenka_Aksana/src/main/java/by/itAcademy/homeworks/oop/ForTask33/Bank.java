package by.itAcademy.homeworks.oop.ForTask33;

public interface Bank {
    String getNameBank();
    Card issueCard(String name);
    long addMoneyToBankomat(long money);
    boolean addMoneyToCard(long money, Card card);
    boolean checkCard(Card x);
    long checkBalance(Card x);
}
