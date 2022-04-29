package by.itAcademy.homeworks.oop.forTask33;

import java.time.format.DateTimeFormatter;

public class PremiumCard extends SomeCard implements Overdraft{
    public boolean haveDiscounts;
    public boolean haveCashBack;
    public double money;
    public PremiumCard(String bankName, String cardType, long cardNumber, String cardOwner, int month, int year, boolean haveDiscounts, boolean haveCashBack, double money) {
        super(bankName, cardType, cardNumber, cardOwner, month, year);
        this.haveDiscounts = haveDiscounts;
        this.haveCashBack = haveCashBack;
        this.money = money;
    }
    public String isHaveDiscounts() {
        if (haveDiscounts == true) {
            return "По карте есть скидки";
        }
        else {
            return "Скидок нет (";
        }
    }
    public String isHaveCashBack() {
        if (haveDiscounts == true) {
            return "По карте есть кэшбэк";
        }
        else {
            return "Кэшбэка нет (";
        }
    }
    public double getMoney() {
        return money;
    }
    public String toString() {
        return  "Банк: " + bankName + "\n" +
                "Платёжная система: " + cardType + "\n" +
                "Номер карты: " + cardNumber + "\n" +
                "Владелец карты: " + cardOwner + "\n" +
                "Окончание срока действия: " + expirationDate.format(DateTimeFormatter.ofPattern("MM/uu")) + "\n" +
                isHaveDiscounts() + "\n" +
                isHaveCashBack();
    }
    @Override
    public void getOverdraft() {
        if (money <= 0) {
            System.out.println("Можно взять овердрафт");
        }
    }
}
