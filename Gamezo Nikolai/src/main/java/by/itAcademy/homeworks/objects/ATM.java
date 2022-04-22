package by.itAcademy.homeworks.objects;

public class ATM {
    private  int numOfBanknot_20;
    private  int numOfBanknot_50;
    private  int numOfBanknot_100;
    // конструктор с тремя параметрами – количеством купюр
    public ATM (int numOfBanknot_20, int numOfBanknot_50, int numOfBanknot_100) {
        this.numOfBanknot_20 = numOfBanknot_20;
        this.numOfBanknot_50 = numOfBanknot_50;
        this.numOfBanknot_100 = numOfBanknot_100;
    }
    // метод для вывода количества купюр и суммы в банкомате
    public void getBanknot() {
        System.out.println("Денег в банкомате: " + "\n" + "Банкнот по 20: " + numOfBanknot_20 + "\n"
        + "Банкнот по 50: " + numOfBanknot_50 + "\n" + "Банкнот по 100: " + numOfBanknot_100 + "\n"
        + "Всего: " + (numOfBanknot_20 * 20 + numOfBanknot_50 * 50 + numOfBanknot_100 * 100));
    }
    // метод для добавления денег в банкомат
    public int addCash(int numOfBanknot_20, int numOfBanknot_50, int numOfBanknot_100) {
        this.numOfBanknot_20 = this.numOfBanknot_20 + numOfBanknot_20;
        this.numOfBanknot_50 = this.numOfBanknot_50 + numOfBanknot_50;
        this.numOfBanknot_100 = this.numOfBanknot_100 + numOfBanknot_100;
        int cashInATM = this.numOfBanknot_20 * 20 + this.numOfBanknot_50 * 50 + this.numOfBanknot_100 * 100;
        return cashInATM;
    }
    // метод, снимающий деньги
    public int withdrawMoney (int outSum) {
        int InitialOutSum = outSum;
        int count_20 = 0;
        int count_50 = 0;
        int count_100 = 0;
        int cashInATM = this.numOfBanknot_20 * 20 + this.numOfBanknot_50 * 50 + this.numOfBanknot_100 * 100;
        if (outSum <= cashInATM) {
            for (count_100 = 0; outSum - 100 >= 0 && this.numOfBanknot_100 > 0; count_100++) {
                this.numOfBanknot_100--;
                outSum = outSum - 100;
            }
            for (count_50 = 0; outSum - 50 >= 0 && this.numOfBanknot_50 > 0; count_50++) {
                this.numOfBanknot_50--;
                outSum = outSum - 50;
            }
            for (count_20 = 0; outSum - 20 >= 0 && this.numOfBanknot_20 > 0; count_20++) {
                this.numOfBanknot_20--;
                outSum = outSum - 20;
            }
            if (InitialOutSum >= 20) {
                System.out.println("Выдано " + (InitialOutSum - outSum) + " денег, следующими банкнотами:");
                System.out.println("банкнот по 20: " + count_20 + "\n" + "банкнот по 50: " + count_50 + "\n" + "банкнот по 100: " + count_100);
            }
            else {
                System.out.println("В банкомате нет необходимых банкнот или введено некорректное значение");
            }
        }
        else {
            System.out.println("Недостаточно денег в банкомате");
        }
        return outSum;
    }
}
