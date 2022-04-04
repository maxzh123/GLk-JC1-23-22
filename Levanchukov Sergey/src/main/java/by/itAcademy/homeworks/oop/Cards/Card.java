package by.itAcademy.homeworks.oop.Cards;

public class Card {
    private String numberOfCard;
    private String ownersName;
    private String dateOfCreation;

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public Card(String numberOfCard, String ownersName, String dateOfCreation) {
        this.numberOfCard = numberOfCard;
        this.ownersName = ownersName;
        this.dateOfCreation = dateOfCreation;
    }
}
