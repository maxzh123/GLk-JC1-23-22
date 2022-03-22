package by.itAcademy.homeworks.objects;

/**
 * 1. Сделать метод для добавления денег
 * 2. Сделать метод для снятия денег (С клавиатуры вводим сумму. На экран выводим удалось или нет)
 */

class ATM {
    @Override
    public String toString() {
        return "ATM{" +
                "twenty=" + twenty +
                ", fifty=" + fifty +
                ", hundred=" + hundred +
                '}';
    }

    private int twenty;
    private int fifty;
    private int hundred;

    public int addTwenty() {
        return this.twenty += twenty;
    }

    public int addFifty() {
        return this.fifty += fifty;
    }

    public int addHundred() {
        return this.hundred += hundred;
    }

    public ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public boolean withDrawMoney(int money) {
        System.out.println("Всего снято : " + money);
        if ((money / 100) != 0) {
            System.out.println("Снято номиналом в 100 рублей : " + money / 100 );
            hundred -= money / 100;
            money %= 100;
        }
        if ((money / 50) != 0) {
            System.out.println("Снято номиналом в 50 рублей : " + money / 50);
            fifty -= money / 50;
            money %= 50;
            if (money / 20 != 0) {
                System.out.println("Снято номиналом в 20 рублей : " + money  / 20);
                twenty -= money / 20;
                money %= 20;
            }
        }
        return money==0;
    }
}
