package by.itAcademy.homeworks.objects;

public class Banknote {
    private  static int count;
    private final int serialNumber ;
    private final long nominal;
    private final String currency;

    public Banknote(long nominal, String currency) {
        this.nominal = nominal;
        this.currency = currency;
        serialNumber=count++;
    }

    public long getNominal() {
        return nominal;
    }

    public String getCurrency() {
        return currency;
    }


}
