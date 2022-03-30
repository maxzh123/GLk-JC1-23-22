package by.itAcademy.oop.bankomat;

public class BankTransaction implements  Transaction{
    private final  Currency currency;
    private final long amount;
    private final long amountInAccountCurrency;

    public BankTransaction(Currency currency, long amount, long amountInAccountCurrency) {
        this.currency = currency;
        this.amount = amount;
        this.amountInAccountCurrency = amountInAccountCurrency;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public long getAmount() {
        return amount;
    }

    @Override
    public long getAmountInAccountCurrency() {
        return amountInAccountCurrency;
    }
}
