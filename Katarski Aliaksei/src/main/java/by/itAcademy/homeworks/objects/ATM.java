package by.itAcademy.homeworks.objects;
/**
 * > Создать класс, описывающий Банкомат. Набор купюр, находящихся в
 * > банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 * > 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
 * > снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 * > значение (операция удалась или нет). При снятии денег метод должен выводить на
 * > экран каким количеством купюр и какого номинала выдается сумма. Создать
 * > конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
 * > усмотрение.
 */

public class ATM {
    private int twentyDollars;
    private int fiftyDollars;
    private int oneHundredDollars;


    public ATM(int twentyDollars, int fiftyDollars, int oneHundredDollars) {
        this.twentyDollars = twentyDollars;
        this.fiftyDollars = fiftyDollars;
        this.oneHundredDollars = oneHundredDollars;

    }
    public int getTotalMoney(){
        int totalMoney=(this.twentyDollars*20)+(this.fiftyDollars*50)+(this.oneHundredDollars*100);
        return totalMoney;
    }
    public int add_20(int money_20) {
        return this.twentyDollars += money_20;
    }
    public int add_50(int money_50) {
        return this.fiftyDollars += money_50;
    }
    public int add_100(int money_100) {
        return this.oneHundredDollars+=money_100;
    }

    public boolean takeMoney(int money) {
        if (money <= getTotalMoney()) {
            if (money / 100 != 0) {
                System.out.println("100 dollar banknotes: " + money / 100);
                oneHundredDollars -= money / 100;
                money %= 100;
            }
            if (money / 50 != 0) {
                System.out.println("50 dollar banknotes: " + money / 50);
                fiftyDollars -= money / 50;
                money %= 50;
            }
            if (money / 20 != 0) {
                System.out.println("20 dollar banknotes: " + money / 20);
                twentyDollars -= money / 20;
                money%= 20;
            }
            return true;
        }else
            System.out.println("Недостаточно денег");
        return false;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "twentyDollars=" + twentyDollars +
                ", fiftyDollars=" + fiftyDollars +
                ", oneHundredDollars=" + oneHundredDollars +
                '}';
    }
}


