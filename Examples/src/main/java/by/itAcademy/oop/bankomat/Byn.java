package by.itAcademy.oop.bankomat;

public class Byn extends AbstractBanknote{
    protected Byn(long nominal, long number) {
        super(nominal, number);
    }

    @Override
    public Currency getCurrency() {
        return Currency.BYN;
    }
}
