package by.itAcademy.oop.bankomat;

public class BankomatRunner {
    public static void main(String[] args) throws Exception {
        Bank bank=new AlfaBank();
        Bankomat bankomat=new AlfaBankBankomat();
        Bankomat bankomat2=new AlfaBankBankomat();

        bankomat.loadBox(bank.packMoneyBox(Currency.EUR,20));

        bankomat2.loadBox(bank.packMoneyBox(Currency.USD,10));
        bankomat2.loadBox(bank.packMoneyBox(Currency.BYN,10));

        bankomat.loadBox(bank.packMoneyBox(Currency.BYN,20));
        Card c=bank.issueCard(Currency.BYN,"Я любимый");

        bank.topUpAccount(1000,c);
        if (bankomat2.insertCard(c)){
         if (bankomat2.pin("1234")){
             ManeyStack stack=bankomat2.takeCash(Currency.BYN,60);
             System.out.println(stack);
         }
        }

    }
}
