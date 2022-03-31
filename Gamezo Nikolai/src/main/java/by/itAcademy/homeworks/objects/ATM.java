package by.itAcademy.homeworks.objects;

public class ATM {
    private  int numOfBanknot_20;
    private  int numOfBanknot_50;
    private  int numOfBanknot_100;
    // метод для добавления денег в банкомат
    public int addCash (int numOfBanknot_20, int numOfBanknot_50, int numOfBanknot_100){
        this.numOfBanknot_20 = this.numOfBanknot_20 + numOfBanknot_20;
        this.numOfBanknot_50 = this.numOfBanknot_50 + numOfBanknot_50;
        this.numOfBanknot_100 = this.numOfBanknot_100 + numOfBanknot_100;
        int cashInATM = this.numOfBanknot_20 * 20 + this.numOfBanknot_50 *50 + this.numOfBanknot_100;
        return cashInATM;
    }
    // метод, снимающий деньги
    public int withdrawMoney (int outSum){
        int out_20 = 0;
        int count_20 = 0;
        int out_50 = 0;
        int count_50 = 0;
        int out_100 = 0;
        int count_100 = 0;
        if (outSum / 100 >= numOfBanknot_100){

        }
        return ;
    }
}
