package by.itAcademy.oop.bankomat;

public interface Bankomat {
    boolean loadBox(BanknoteBox box);
    boolean insertCard(Card card);
    boolean pin(String pin);
    long balance();
    ManeyStack takeCash(Currency curr,long amount) throws Exception;
    Card finish();
}
