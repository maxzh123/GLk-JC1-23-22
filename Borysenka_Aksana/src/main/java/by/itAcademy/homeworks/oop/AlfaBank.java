package by.itAcademy.homeworks.oop;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AlfaBank implements Bank{

    private static Map<Card, Long> account = new HashMap<>();
    private static long cardSn = 0;
    private long moneyInBank;


    @Override
    public String getNameBank() {
        return "ЗАО АЛЬФА-БАНК";
    }

    @Override
    public Card issueCard(String name) {
        Card c = new Visa (this, name, Long.toString(cardSn++));
        account.put(c, 0L);
        return c;
    }

    @Override
    public long addMoneyToBankomat(long moneyInBank) {
        this.moneyInBank = moneyInBank;
        return this.moneyInBank;
    }


    @Override
    public boolean addMoneyToCard(long money, Card card) {
        if (card!=null && account.containsKey(card)){
            account.put(card,account.get(card) + money);
            return  true;
        }
        return false;
    }

    @Override
    public boolean checkCard(Card x) {
        boolean result = x != null && x.getExpirationDate().compareTo(new Date()) == 1 && account.containsKey(x);
        return result;
    }

    @Override
    public long checkBalance(Card x) {
        return account.get(x);
    }

}
