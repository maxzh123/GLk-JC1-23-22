package by.itAcademy.homeworks.oop;

public class Task33 {

    /**Task33
     * Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
     * Иерархия должна иметь хотя бы три уровня.
     */

    // породия на ваш банкомат... знаю что много чего не хватает... оооочень туго идет(

    public static void main(String[] args) {
        Bank bank = new AlfaBank();
        Bankomat bankomat = new BankomatAlfa();
        bank.addMoneyToBankomat(100_000);
        Card card = bank.issueCard("AAAA");
        bank.addMoneyToCard(50_000, card);
        System.out.println("Денег на карте:" + bank.checkBalance(card));
        if (bankomat.insertCard(card)) {
            if (bankomat.pin(0000)) {
                System.out.println("Денег на карте через банкомат: " + bankomat.balance());
                System.out.println("Сняли: " + bankomat.takeCash(card, 10_000));
            } else {
                System.out.println("Банкомат не принял пин");
            }
        } else {
            System.out.println("Банк не принял карту");
        }
    }
}
