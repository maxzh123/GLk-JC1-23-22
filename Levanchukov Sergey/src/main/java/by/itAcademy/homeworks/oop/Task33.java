package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.Cards.CardOfMastercard;
import by.itAcademy.homeworks.oop.Cards.CardOfVisa;

/**
 * > Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > банковские карточки. Иерархия должна иметь хотя бы три уровня.
 **/
public class Task33 {
    public static void main(String[] args) {

        CardOfVisa card1= new CardOfVisa("1234 5678 9123 4544","Petrov Valentin", "14.03.22","Red",30);
        System.out.println("Number: "+ card1.getNumberOfCard()+ "\n" +"Owner: "+ card1.getOwnersName()+"."+"\n" + "Date of creation: "+ card1.getDateOfCreation()+
                "."+"\n"+"Color: "+ card1.getColor()+"."+"\n"+"Cashback: "+ card1.getCashbackPercentage()+"%");

        CardOfMastercard card2=new CardOfMastercard("5555 4444 3333 5555","Petrov Petr", "23.02.21",
                "Black",true);
        System.out.println("Number: "+ card2.getNumberOfCard()+ "\n" +"Owner: "+ card2.getOwnersName()+"."+"\n" + "Date of creation: "+ card2.getDateOfCreation()+
                "."+"\n"+"Color: "+ card2.getColor()+"."+"\n"+"Online banking: ");
        card2.workingOnlineBanking();

    }


}
