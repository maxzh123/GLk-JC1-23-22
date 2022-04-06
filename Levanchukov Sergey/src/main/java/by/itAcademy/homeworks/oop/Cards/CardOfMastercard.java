package by.itAcademy.homeworks.oop.Cards;

public class CardOfMastercard extends AlfaBankCard{

    private boolean onlineBanking;

    public void workingOnlineBanking() {
        if (onlineBanking==true){
            System.out.println("Банкинг подключен.");
        } else System.out.println("Банкинг не активирован.");
    }

    public CardOfMastercard(String numberOfCard, String ownersName, String dateOfCreation, String color, boolean onlineBanking) {
        super(numberOfCard, ownersName, dateOfCreation, color);
        this.onlineBanking=onlineBanking;
    }
}
