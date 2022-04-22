package by.itAcademy.homeworks.objects;

public class ATM {

    private Storage storage;

    public ATM(Storage storage) {
        this.storage = storage;
    }

    //определяет достаточно ли денег в банкомате для снятия заданной суммы
    private boolean isEnoughMoney(Integer amount) {
        return storage.getSum() >= amount;
    }

    // выдает запрашиваемую сумму
    public String getMoney(Integer amount) {
        String str = " ";
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        if (!isEnoughMoney(amount)) {
            str = "Недостаточно средств в банкомате";
        } else {
            hundred = amount / 100;
            fifty = (amount % 100) / 50;
            twenty = ((amount % 100) % 50) / 20;
            str = "купюры 100 в количестве - " + hundred + "; " + "купюры 50 в количестве - " + fifty + "; " +
                    "купюры 20 в количестве - " + twenty;
        }
        if (amount - (hundred * 100 + fifty * 50 + twenty * 20) > 0) {
            str = "Недостаточно купюр требуемого номинала";
        }
        return str;
    }
}



