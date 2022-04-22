package by.itAcademy.oop.bankomat;

public interface Bank {
    String getName();
    Card issueCard(Currency curr,String name);
    BanknoteBox packMoneyBox(Currency curr,long nominal);
    boolean checkCard(Card c);
    Transaction withdrawMoney(Currency c, long amount,Card card) throws Exception;
    boolean topUpAccount(long amount,Card card);
//Добавил метод посмотреть баланс. Потому что теперь есть конверсия валют и это важно
    long checkBalance(Card currentCard);
}
