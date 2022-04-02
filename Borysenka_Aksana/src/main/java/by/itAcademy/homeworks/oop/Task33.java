package by.itAcademy.homeworks.oop;

public class Task33 {
    /**
     * Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
     * Иерархия должна иметь хотя бы три уровня.
     */

    public static void main(String[] args) {
        Bank bank = new AlfaBank();
        Bankomat bankomat = new BankomatAlfa();
        Money money = new elMoney(Currency.BYN, 10000);
        bankomat.loadCash(money);
        Card c = bank.issueCard(Currency.BYN, "X");
        bank.topUpAccount(500, c);
        if (bankomat.insertCard(c)){
            if(bankomat.pin(1234)){
                System.out.println(bankomat.takeCash(Currency.BYN, 50));
            }
        }
    ;
    }
}
