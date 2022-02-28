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
class ATM{
    protected int fifty;
    protected int twenty;
    protected int hundred;
    public void addFifty(int fifty) {
        this.fifty += fifty;
    }
    public void addTwenty(int twenty) {
        this.twenty += twenty;
    }
    public void addHundred(int hundred) {
        this.hundred += hundred;
    }
    public ATM(int fifty, int twenty, int hundred) {
        this.fifty = fifty;
        this.twenty = twenty;
        this.hundred = hundred;
    }
    public ATM() {
        this.fifty = Integer.MAX_VALUE;
        this.twenty = Integer.MAX_VALUE;
        this.hundred = Integer.MAX_VALUE;
    }
    public boolean withdrawMoney(int money){
        if(money/100!=0){
            System.out.println("Со счета снято в 100 рублевых:"+money/100);
            hundred-=money/100;
            money=money%100;
        }
        if(money/50!=0){
            System.out.println("Со счета снято в 50 рублевых:"+money/50);
            fifty-=money/50;
            money=money%50;
        }
        if(money/20!=0){
            System.out.println("Со счета снято в 20 рублевых:"+money/20);
            fifty-=money/50;
            money=money%50;
        }
        return money == 0;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "fifty=" + fifty +
                ", twenty=" + twenty +
                ", hundred=" + hundred +
                '}';
    }
}

public class Task25 {
    public static void main(String[] args) {
        ATM temp = new ATM(10,10,10);
        System.out.println(temp.withdrawMoney(153));
        System.out.println(temp.toString());
    }
}
