package by.itAcademy.oop.bankomat;

public abstract class AbstractBanknote implements  Banknote{
    private final long nominal;
    private final long number;

    protected AbstractBanknote(long nominal, long number) {
        this.nominal = nominal;
        this.number = number;
    }


    @Override
    public long getSerialNumber() {
        return number;
    }

    @Override
    public long getNominal() {
        return nominal;
    }
}
