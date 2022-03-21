package by.itAcademy.homeworks.objects;

/** Создать класс, описывающий Банкомат.
 *  Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
 *  Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
 *  На экран – булевское значение (операция удалась или нет).
 *  При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 *  Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.*/

public class ATM {
    private int twenty = 0;
    private int fifty = 0;
    private int hundred = 0;

    public ATM(int hundred, int fifty, int twenty){
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }
    public void putMoney(int money){
        this.hundred += money/100;
        money%=100;
        this.fifty += money/50;
        money%=50;
        this.twenty += money/20;
    }

    public boolean withdrawMoney(int money){
        if (money <= this.hundred*100 + this.fifty*50 + this.twenty*20){
            int h = money/100;
            money%=100;
            int f = money/50;
            money%=50;
            int t = money/20;
            System.out.printf("Cнято: %d cто   %d пятьдесят   %d двадцать", h, f, t);
            this.hundred -= h;
            money%=100;
            this.fifty -= f;
            money%=50;
            this.twenty -= t;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "ATM{" +
                "fifty=" + this.fifty +
                ", twenty=" + this.twenty +
                ", hundred=" + this.hundred +
                '}';
    }
}
