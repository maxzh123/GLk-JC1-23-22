package by.itAcademy.homeworks.oop.Cards;

public class AlfaBankCard extends Card{

    private String color;

    public String getColor() {
        return color;
    }

    public AlfaBankCard(String numberOfCard, String ownersName, String dateOfCreation, String color) {
        super(numberOfCard, ownersName, dateOfCreation);
        this.color=color;
    }
}
