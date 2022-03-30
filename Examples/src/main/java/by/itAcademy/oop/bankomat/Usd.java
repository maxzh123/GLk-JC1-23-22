package by.itAcademy.oop.bankomat;

public class Usd extends AbstractBanknote{
    protected Usd(long nominal, long number) {
        super(nominal, number);
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
