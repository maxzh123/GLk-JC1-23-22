package by.itAcademy.oop.bankomat;

import java.util.ArrayList;
import java.util.List;

public class AlfaBankBankomat implements Bankomat{
    private Card currentCard;
    private List<BanknoteBox> boxes=new ArrayList<>();

    @Override
    public boolean loadBox(BanknoteBox box) {
        return boxes.add(box);
    }

    @Override
    public boolean insertCard(Card card) {
        currentCard=card;
        if (currentCard==null){
            throw new RuntimeException("Карта должны быть не null");
        }
        return card.getIssuer().checkCard(currentCard);
    }

    @Override
    public boolean pin(String pin) {
        //currentCard.getIssuer()
        return true;
    }

    //TODO Реализовать корректный сбор пачки по номиналам.
    //TODO Реализовать откат транзакции
    @Override
    public ManeyStack takeCash(Currency curr, long amount) throws Exception {
        if (currentCard==null){
            throw new RuntimeException("Карта не вставлена");
        }
        ManeyStack result=null;
        if (currentCard.getIssuer().withdrawMoney(curr,amount,currentCard)){
            result=new MStack();
            for (BanknoteBox box:boxes) {
                if (box.getCurrency()==curr && (amount % box.getNominal()==0)){
                    List<Banknote> cash=box.getBanknotes((int)(amount/box.getNominal()));
                    if (cash!=null){
                        for(Banknote b:cash){
                            result.addBanknote(b);
                        }
                    }

                }
            }
        }
        return result;
    }

    @Override
    public Card finish() {
        Card r=currentCard;
        currentCard=null;
        return r;
    }
}
