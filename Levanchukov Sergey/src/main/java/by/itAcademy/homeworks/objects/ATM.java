package by.itAcademy.homeworks.objects;
/**
 * > 1) Создать класс, описывающий Банкомат. Набор купюр, находящихся в
 * > банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 * > 50, 100.
 * > 2) Сделать методы для добавления денег в банкомат.
 * > 3) Сделать метод, снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 * > значение (операция удалась или нет). При снятии денег метод должен выводить на
 * > экран каким количеством купюр и какого номинала выдается сумма.
 * > 4) Создать конструктор с тремя параметрами – количеством купюр.
 * > 5) Прочее – на ваше усмотрение.
 * */

public class ATM {
    protected int twenty;
    protected int fifty;
    protected int hundred;

    //конструктор для создания объекта
    public ATM(int twenty, int fifty, int hundred){
        this.twenty=twenty;
        this.fifty=fifty;
        this.hundred=hundred;
    }

    //методы добовляющие деньги
    public double addTwenty(int twenty){
       return this.twenty+=twenty;
    }
    public double addFifty(int fifty){
        return this.fifty+=fifty;
    }
    public double addHundred(int hundred){
        return this.hundred=hundred;
    }


    //метод возвращающий результат снятия...... В процессе
    public void withdrawalOfMoney (int money){
        if (twenty<=money){
            twenty-=money;
            System.out.println("Со счета снято 20 рублей в количестве: "+money+" "+true);
            System.out.println("Осталось 20 в количестве: "+twenty);
        } else System.out.println("Недостаточно средств");
        if (fifty<=money){
            fifty-=money;
            System.out.println("Со счета снято 50 рублей в количестве: "+money+" "+true);
            System.out.println("Осталось 50 в количестве: "+fifty);
        }else System.out.println("Недостаточно средств");;
        if (hundred<=money) {
            hundred -= money;
            System.out.println("Со счета снято 100 рублей в количестве: "+money+" "+true);
            System.out.println("Осталось 100 в количестве: "+hundred);
        }else System.out.println("Недостаточно средств");
    }


}

