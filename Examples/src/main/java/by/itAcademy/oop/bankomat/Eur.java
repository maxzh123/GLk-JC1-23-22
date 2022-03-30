package by.itAcademy.oop.bankomat;

public class Eur extends AbstractBanknote{
    protected Eur(long nominal, long number) {
        super(nominal, number);
    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}
