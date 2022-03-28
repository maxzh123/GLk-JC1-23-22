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
 **/

public class Task25 {
    public static void main(String[] args) {
        Banknote rub20=new Banknote(20,"rub");
        AmountOfMoney amount= new AmountOfMoney();
        amount.addAmountOfBanknote(rub20);
        System.out.println(amount.recalculation());

        Banknote eur50=new Banknote(50,"eur");
        amount.addAmountOfBanknote(eur50);
        System.out.println(amount.recalculation());

        Banknote rub50= new Banknote(50,"rub");
        amount.addAmountOfBanknote(rub50);
        System.out.println(amount.recalculation());

        amount.addAmountOfBanknote(rub50);
        System.out.println(amount.recalculation());

        amount.removeAmountOfBanknote(rub50);
        System.out.println(amount.recalculation());

    }
}
