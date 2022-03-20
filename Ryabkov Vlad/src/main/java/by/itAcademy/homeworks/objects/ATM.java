package by.itAcademy.homeworks.objects;

/**
 * 1. Сделать метод для добавления денег
 * 2. Сделать метод для снятия денег (С клавиатуры вводим сумму. На экран выводим удалось или нет)
 */

class ATM {
    private int twenty;
    private int fifty;
    private int hundred;

    ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    // Создание метода для добавления денег
    public double addTwenty(int twenty) {
        return this.twenty += twenty;
    }

    public double addFifty(int fifty) {
        return this.fifty += fifty;
    }

    public double addHundred(int hundred) {
        return this.hundred += hundred;
    }

public double balance (){
        int balance = (this.twenty * 20) + (this.fifty * 50) + (this.hundred * 100);
        return balance;
}



    // Создание метода для снятия денег
    public double withDrawTwenty(int twenty) {
        return this.twenty -= twenty;
    }

    public double withDrawFifty(int fifty) {
        return this.fifty -= fifty;
    }

    public double withDrawHundred(int hundred) {
        return this.hundred -= hundred;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "fifty=" + fifty +
                ", twenty=" + twenty +
                ", hundred=" + hundred +
                '}';
    }
    public double balance(int twenty, int fifty, int hundred){return twenty + fifty + hundred;}


    public boolean withDrawMoney(int money) {
        if (money / 100 != 0) {
            System.out.println("Снято купюр номиналом в 100 рублей : " + money / 100);
            hundred -= money / 100;
            money = money % 100;
        }
        if ((money / 50 != 0)) {
            System.out.println("Снято купюр номиналом в 50 рублей : " + money / 50);
            fifty -= money / 50;
            money = money % 50;
        }
        if ((money / 20 != 0)) {
            System.out.println("Снято купюр номиналом в 20 рублей : " + money / 20);
            twenty -= money / 20;
            money = money % 50;

        }
        return money == 0;
    }



}
