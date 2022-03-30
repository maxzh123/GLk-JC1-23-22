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

    @Override
    public long balance() {
        if (currentCard==null){
            throw new RuntimeException("Карта не вставлена");
        }
        return currentCard.getIssuer().checkBalance(currentCard);
    }

    //TODO Реализовать корректный сбор пачки по номиналам.
    //TODO Реализовать откат транзакции
    @Override
    public ManeyStack takeCash(Currency curr, long amount) throws Exception {
        if (currentCard==null){
            throw new RuntimeException("Карта не вставлена");
        }
        //Сортируем ящики по убыванию номинала
        boxes.sort((i,j)->-Long.compare(i.getNominal(),j.getNominal()));
        ManeyStack result=null;
        Transaction transaction=currentCard.getIssuer().withdrawMoney(curr,amount,currentCard);
        if (transaction!=null){
            result=new MStack();
            long tempAmount=amount; //Сохраняем сумму к выдаче.
            for (BanknoteBox box:boxes) { //Коробки уже отсортированы от большей к меньшей.
                if (box.getCurrency()==transaction.getCurrency() && (tempAmount >= box.getNominal())){ //Если у коробки валюта операции и номинал < суммы к выдаче
                    List<Banknote> cash=box.getBanknotes((int)(tempAmount/box.getNominal()));//Достаем N купюр, где N максимально возможное количество чтобы сумма была меньше либо равна текущей сумме к выдаче.
                    if (cash!=null){
                        for(Banknote b:cash){ //укладываем банкноты в пачку и вычитаем их номинал из суммы к выдаче.
                            tempAmount-=b.getNominal();
                            result.addBanknote(b);
                        }
                    }
                }
            }
            if (amount>0 && (result.isEmpty()|| !result.calc().get(curr).equals(amount))){
                //Откатываем транзакцию. (Возвращаем деньги)
                currentCard.getIssuer().topUpAccount(transaction.getAmountInAccountCurrency(),currentCard);
                throw new Exception("Не удалось собрать пачку. транзакция отменена.");
            }
        }

        //Удаляем пустые ящики чтобы не путались под ногами
        boxes.removeIf(i->i.isEmpty());
        return result;
    }

    @Override
    public Card finish() {
        Card r=currentCard;
        currentCard=null;
        return r;
    }
}
