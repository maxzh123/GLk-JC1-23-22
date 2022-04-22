package by.itAcademy.oop.bankomat;

public class BankomatRunner {
    public static void main(String[] args) throws Exception {
        Bank bank=new AlfaBank();
        Bankomat bankomat=new AlfaBankBankomat();
        Bankomat bankomat2=new AlfaBankBankomat();

        bankomat.loadBox(bank.packMoneyBox(Currency.EUR,20));

        bankomat2.loadBox(bank.packMoneyBox(Currency.USD,100));
        bankomat2.loadBox(bank.packMoneyBox(Currency.USD,50));
        bankomat2.loadBox(bank.packMoneyBox(Currency.USD,20));
        bankomat2.loadBox(bank.packMoneyBox(Currency.USD,10));
        bankomat2.loadBox(bank.packMoneyBox(Currency.BYN,10));

        bankomat.loadBox(bank.packMoneyBox(Currency.BYN,20));
        Card c=bank.issueCard(Currency.BYN,"Я любимый");

        bank.topUpAccount(1000,c);
        System.out.println("денег на карте:"+bank.checkBalance(c));
        if (bankomat2.insertCard(c)){
         if (bankomat2.pin("1234")){
             System.out.println("денег на карте через банкомат:"+bankomat2.balance());
             ManeyStack stack=bankomat2.takeCash(Currency.USD,580);
             System.out.println("Сняли:");
             System.out.println(stack);
             System.out.println("опять проверяем баланс:"+bankomat2.balance());
         }else{
             System.out.println("Банкомат не принял пин");
         }
        }else{
            System.out.println("Банк не принял карту");
        }

    }
}
