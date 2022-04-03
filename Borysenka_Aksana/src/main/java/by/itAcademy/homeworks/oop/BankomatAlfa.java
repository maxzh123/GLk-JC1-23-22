package by.itAcademy.homeworks.oop;

public class BankomatAlfa implements Bankomat{
    private Card card;


    @Override
    public boolean insertCard(Card x) {
        card = x;
        if(card == null){
            throw new RuntimeException("Карта не должна быть null");
        }
        return x.getIssuer().checkCard(card);
    }

    @Override
    public boolean pin(Integer pin) {
        return true;
    }

    @Override
    public long takeCash(Card card, long amount) {

        if(card == null || amount > card.getIssuer().checkBalance(card)){
            throw new RuntimeException("Недостаточно средств");
        }
        long amoutAfterTakeCash = card.getIssuer().checkBalance(card) - amount;
        System.out.println("Сумма на карте после снятия наличных: " + amoutAfterTakeCash);
        return amount;
    }

    @Override
    public long balance() {
        if (card == null){
            throw new RuntimeException("Карта не вставлена");
        }
        return card.getIssuer().checkBalance(card);
    }

    @Override
    public Card finish() {
        Card x = card;
        card = null;
        return x;
    }

}
