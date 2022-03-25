package by.itAcademy.homeworks.objects;

public class ATM {
    int nominalValueTwenty;
    int nominalValueFifty;
    int nominalValueHundred;
    int moneyBalance = 0;
    boolean transactionOK = false;

    //конструктор
    public ATM(int nominalValueTwenty, int nominalValueFifty, int nominalValueHundred){
        this.nominalValueTwenty = nominalValueTwenty;
        this.nominalValueFifty = nominalValueFifty;
        this.nominalValueHundred = nominalValueHundred;
    }

    //добавление денег
    public String addMoney(int addMon){
        String msg = "";
        if (((((addMon % 100) % 50) % 20) == 0) && (addMon > 0)){
            nominalValueHundred = nominalValueHundred + addMon / 100;
            nominalValueFifty = nominalValueFifty + (addMon % 100) / 50;
            nominalValueTwenty = nominalValueTwenty + ((addMon % 100) % 50) / 20;
            msg = "Зачислено " +  addMon;
        } else {
            msg = "Деньги не зачислены! Принимаются только деньги номиналом 20, 50, 100!";
        }
        return msg;
    }

    //достаточно денег
    public boolean enoughMoney (int getMoney){
        if ((getMoney <= moneyBalance) && (getMoney != 0) && (getMoney > 0)){
            transactionOK = true;
        }
        return transactionOK;
    }

    //снятие денег
    public String withdrawalMoney(int getMoney){
        String msg = "";
        if (((getMoney % 100) % 50) % 20 == 0){
            int count100 = getMoney / 100;
            nominalValueHundred = nominalValueHundred - count100;
            int count50 = (getMoney % 100) / 50;
            nominalValueFifty = nominalValueFifty - count50;
            int count20 = ((getMoney % 100) % 50) / 20;
            nominalValueTwenty = nominalValueTwenty - count20;
            msg = "Выдано: " +  count100 + " * 100, " + count50 + " * 50, " + count20 + " * 20";
        } else {
            msg = "Увы! Нет необходимых купюр для выдачи денег";
        }
        return msg;
    }

    //сумма в ATM
    public int getMoneyBalance(){
        moneyBalance = nominalValueTwenty * 20 + nominalValueFifty * 50 + nominalValueHundred * 100;
        return moneyBalance;
    }
}
