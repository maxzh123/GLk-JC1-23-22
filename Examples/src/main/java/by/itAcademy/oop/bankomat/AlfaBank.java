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
            switch(curr){ //BUGFIX не было прерываний. клало банкноты в перемешку.
                case EUR:bb.add(new Eur(nominal,banknoteSn++));break;
                case RUB:bb.add(new Rub(nominal,banknoteSn++));break;
                case BYN:bb.add(new Byn(nominal,banknoteSn++));break;
                case USD:bb.add(new Usd(nominal,banknoteSn++));break;

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

    private long комиссия =5;
    private long прокатило =1;
    private long кРукамПрилипло =2;
    private long жадность =3;
    private long вредность =1;
    private long нуАЧо =2;

    private double getCourse(Currency original,Currency want){
        //По идее тут бы надо как-то вычислять курс. Либо брать из хранилища, но в текущей ситуации и для упрощения разумно предположить, что курс - случаен.
        return Math.random();
    }

    private long exchange(Currency original,Currency want,long wantAmount){
        long result=wantAmount;
        result=(long)(getCourse(original,want)*result);
        result+=комиссия;
        result+=прокатило;
        result+=кРукамПрилипло;
        result+=жадность;
        result+=вредность;
        result+=нуАЧо;
        return result;
    }

    @Override
    public Transaction withdrawMoney(Currency c, long amount, Card card) throws Exception {
        if (card==null  || !account.containsKey(card)) return null;
        long accountAmount=amount;
        if (c!=card.getCurrency()){
            accountAmount=exchange(card.getCurrency(),c,amount);
        }
        Transaction tr=new BankTransaction(c,amount,accountAmount);
        if (account.get(card).compareTo(accountAmount)>0){
            account.put(card,account.get(card)-tr.getAmountInAccountCurrency());
            return tr;
        }else{
            throw new Exception("Если у вас нету денег - они не смогут сгореть на банковском счете!");
        }
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

    @Override
    public long checkBalance(Card card) {
        return account.get(card);
    }
}
