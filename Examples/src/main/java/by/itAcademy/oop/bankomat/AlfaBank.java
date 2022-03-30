package by.itAcademy.oop.bankomat;

import java.util.*;

public class AlfaBank implements Bank{
    private static Map<Card,Long> account=new HashMap<>();
    private static long banknoteSn=0;
    private static long cardSn=0;

    @Override
    public String getName() {
        return "ЗАО Альфа Банк";
    }

    @Override
    public Card issueCard(Currency curr,String name) {
        Card c=new VisaElectron(this,curr,name,Long.toString(cardSn++));
        account.put(c,0L);
        return c;
    }

    @Override
    public BanknoteBox packMoneyBox(Currency curr,long nominal) {
        List<Banknote> bb=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            switch(curr){
                case EUR:bb.add(new Eur(nominal,banknoteSn++));
                case RUB:bb.add(new Rub(nominal,banknoteSn++));
                case BYN:bb.add(new Byn(nominal,banknoteSn++));
                case USD:bb.add(new Usd(nominal,banknoteSn++));

            }
        }
        return new BankomatMoneyBox(nominal,curr,bb);
    }

    @Override
    public boolean checkCard(Card c) {
        boolean result=c!=null
                && c.getExpirationDate().compareTo(new Date())==1
                && account.containsKey(c)
                && c.getIssuer().getClass()==this.getClass();
        return result;
    }

    @Override
    public boolean withdrawMoney(Currency c, long amount, Card card) {
        if (card!=null
                && account.containsKey(card)
                && account.get(card)>amount
                && card.getCurrency()==c
        ){
            account.put(card,account.get(card)-amount);
            return  true;
        }
        return false;
    }

    @Override
    public boolean topUpAccount(long amount, Card card) {
        if (card!=null
                && account.containsKey(card)
        ){
            account.put(card,account.get(card)+amount);
            return  true;
        }
        return false;
    }
}
