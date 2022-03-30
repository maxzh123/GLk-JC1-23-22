package by.itAcademy.oop.bankomat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BankomatMoneyBox implements  BanknoteBox{
    private final long nominal;
    private final Currency currency;
    private final List<Banknote> banknotes =new ArrayList<>();

    public BankomatMoneyBox(long nominal, Currency currency, Collection<Banknote> bb) {
        this.nominal = nominal;
        this.currency = currency;
        this.banknotes.addAll(bb);
    }

    @Override
    public long getNominal() {
        return nominal;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public List<Banknote> getBanknotes(int count) throws Exception {
        ArrayList<Banknote> result=new ArrayList<>();
        if (banknotes.size()>=count){
            for (int i=0;i<count && banknotes.size()>0;i++){ //BUGFIX выдавать пока не дадим нужное количество, либо пока не кончатся деньги.
                Banknote b=banknotes.get(0);
                banknotes.remove(0);// BUGFIX ящик выдавал деньги в пачку, но при этом оставлял у себя.
                if (b.getCurrency()!=currency){
                    throw new Exception("Ктото всунул не ту валюту!");
                }
                if (b.getNominal()!=nominal){
                    throw new Exception("Ктото всунул не ту купюру!");
                }
                result.add(b);
            }
        }else{
            throw new Exception("Денег нет, но вы держитесь!");
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return banknotes.isEmpty();
    }

    @Override
    public int getCount() {
        return banknotes.size();
    }
}
