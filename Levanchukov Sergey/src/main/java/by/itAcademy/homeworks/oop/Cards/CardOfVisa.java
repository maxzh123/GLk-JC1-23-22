package by.itAcademy.homeworks.oop.Cards;

public class CardOfVisa extends AlfaBankCard{

    private int cashbackPercentage;

    public int getCashbackPercentage() {
        return cashbackPercentage;
    }

    public CardOfVisa(String numberOfCard, String ownersName, String dateOfCreation, String color, int cashbackPercentage) {
        super(numberOfCard, ownersName, dateOfCreation, color);
        if (cashbackPercentage>20){
            this.cashbackPercentage=20;
        } else this.cashbackPercentage=cashbackPercentage;
    }
}
