package by.itAcademy.homeworks.oop;

/**
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */


class Card{
    private String firstName;
    private String lastName;
    private String numbOfCard;

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getNumbOfCard() {return numbOfCard;}


    @Override
    public String toString() {
        return "Card{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numbOfCard='" + numbOfCard + '\'' +
                '}';
    }

    public Card(String firstName, String lastName, String numbOfCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numbOfCard = numbOfCard;
    }
}

class BankingCard extends Card {

    private String nameOfBank;
    private String contractTerm;

    @Override
    public String toString() {
        return "BankingCard{" +
                "nameOfBank='" + nameOfBank + '\'' +
                ", contractTerm='" + contractTerm + '\'' +
                '}';
    }

    public BankingCard(String firstName, String lastName, String numbOfCard, String nameOfBank, String contractTerm) {
        super(firstName, lastName, numbOfCard);
        this.nameOfBank = nameOfBank;
        this.contractTerm = contractTerm;
    }

    public String getContractTerm() {return contractTerm;}
    public String getNameOfBank() {return nameOfBank;}


}

class VIPcard extends BankingCard {

    private String statusOfCard;
    private double percentOfCashback;
    private double discountPercentageOfPartners;



    public VIPcard(String firstName, String lastName, String numbOfCard, String nameOfBank,
                   String contractTerm, String statusOfCard, double percentOfCashback,
                   double discountPercentageOfPartners) {
        super(firstName, lastName, numbOfCard, nameOfBank, contractTerm);
        this.statusOfCard = statusOfCard;
        this.percentOfCashback = percentOfCashback;
        this.discountPercentageOfPartners = discountPercentageOfPartners;}



    public String getStatusOfCard() {return statusOfCard;}
    public double getPercentOfCashback() {return percentOfCashback;}
    public double getDiscountPercentageOfPartners() {return discountPercentageOfPartners;}

    @Override
    public String toString() {
        return "VIPcard{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", numbOfCard='" + getNumbOfCard() + '\'' +"\n"+
                "nameOfBank='" + getNameOfBank() + '\'' +
                ", contractTerm= '" + getContractTerm() + '\'' +
                " statusOfCard='" + statusOfCard + '\'' + "\n" +
                "percentOfCashback=" + percentOfCashback +
                ", discountPercentageOfPartners=" + discountPercentageOfPartners +
                '}';
    }
}

class CreditCard extends BankingCard {

    private boolean isCredit;
    private double sumOfCredit;


    public boolean isCredit() {return isCredit;}
    public double getSumOfCredit() {return sumOfCredit;}

    public CreditCard(String firstName, String lastName, String numbOfCard, String nameOfBank,
                      String contractTerm, boolean isCredit, double sumOfCredit) {
        super(firstName, lastName, numbOfCard, nameOfBank, contractTerm);
        this.isCredit = isCredit;
        this.sumOfCredit = sumOfCredit;}


    @Override
    public String toString() {
        return "CreditCard{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", numbOfCard='" + getNumbOfCard() + '\''+"\n" +
                "nameOfBank='" + getNameOfBank() + '\'' +
                ", contractTerm='" + getContractTerm() + '\'' +
                "isCredit=" + isCredit +"\n" +
                "sumOfCredit=" + sumOfCredit +
                '}';
    }
}

public class Task33 {
    public static void main(String[] args) {
        Card card = new Card("Vlad", "Ryabkov", "0000.1111.2222.3333");
        System.out.println(card);
        System.out.println();
        VIPcard vipCard = new VIPcard("Vlad", "Ryabkov","0000.1111.2222.33330",
                "Alfa Bank","5 years","Gold",
                12, 5.3 );
        System.out.println(vipCard);
        System.out.println();
        CreditCard creditCard = new CreditCard("Vlad", "Ryabkov", "0000.1111.2222.3333",
                "Alfa Bank","7 years", true, 7000);
        System.out.println(creditCard);
    }
}
