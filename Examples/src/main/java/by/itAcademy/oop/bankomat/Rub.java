package by.itAcademy.oop.bankomat;

public class Rub extends  AbstractBanknote{
    protected Rub(long nominal, long number) {
        super(nominal, number);
    }

    @Override
    public Currency getCurrency() {
        return Currency.RUB;
    }
}
