package by.itAcademy.oop.bankomat;

public interface Bank {
    String getName();
    Card issueCard(Currency curr,String name);
    BanknoteBox packMoneyBox(Currency curr,long nominal);
    boolean checkCard(Card c);
    boolean withdrawMoney(Currency c, long amount,Card card);
    boolean topUpAccount(long amount,Card card);

}
