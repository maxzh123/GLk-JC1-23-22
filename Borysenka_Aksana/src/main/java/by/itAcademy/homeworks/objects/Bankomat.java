package by.itAcademy.homeworks.objects;

public class Bankomat {
    private  int banknot_20;
    private  int banknot_50;
    private  int banknot_100;

    public int getBanknot_20() {
        return banknot_20;
    }

    public int getBanknot_50() {
        return banknot_50;
    }

    public int getBanknot_100() {
        return banknot_100;
    }

    public Bankomat(int banknot_20, int banknot_50, int banknot_100) {
        if (banknot_20 < 0 || banknot_50 < 0 || banknot_100 < 0){
            System.out.println("Error: enter correct number");
            return;
        }

        this.banknot_20 = banknot_20;
        this.banknot_50 = banknot_50;
        this.banknot_100 = banknot_100;
    }

    public int putCash (int banknot_20, int banknot_50, int banknot_100){

        this.banknot_20 += banknot_20;
        this.banknot_50 += banknot_50;
        this.banknot_100 += banknot_100;

        return this.banknot_20*20 + this.banknot_50*50 + this.banknot_100*100;
    };

    public void outCash (int sumOutCash){
        if (sumOutCash < 0 || sumOutCash >= (this.banknot_20*20 + this.banknot_50*50 + this.banknot_100*100)){
            System.out.println("Error: enter correct number");
            return;
        }


        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int sum20 = 0;
        int sum50 = 0;
        int sum100 = 0;

        if (sumOutCash / 100 > 0 && this.banknot_100 != 0){
            if (sumOutCash / 100 >= this.banknot_100) {
                sum100 = this.banknot_100 * 100;
                count100 = this.banknot_100;

            } else {
                count100 = sumOutCash / 100;
                sum100 = count100*100;
            }


        } if ((sumOutCash - sum100) != 0 && (sumOutCash - sum100) / 50 > 0 && this.banknot_50 != 0){
            if ((sumOutCash - sum100) / 50 >= this.banknot_50){
                sum50 = this.banknot_50*50;
                count50 = this.banknot_50;

            } else {
                count50 = (sumOutCash - sum100) / 50;
                sum50 = count50*50;
            }


        } if ((sumOutCash - sum100 - sum50) != 0 && (sumOutCash - sum100 - sum50) / 20 > 0 && this.banknot_20 != 0){
            if ((sumOutCash - sum100 - sum50) / 20 >= this.banknot_20){
                sum20 = this.banknot_20*20;
                count20 = this.banknot_20;

            } else {
                count20 = (sumOutCash - sum100 - sum50) / 20;
                sum20 = count20*20;
            }

            if ( (sumOutCash - sum100 - sum50 - sum20) == 0) {
                System.out.println("Выдано: " + sum100 + " купюрами номиналом 100, в количестве " + count100);
                System.out.println("Выдано: " + sum50 + " купюрами номиналом 50, в количестве " + count50);
                System.out.println("Выдано: " + sum20 + " купюрами номиналом 20, в количестве " + count20);
            } else {
                System.out.println("В банкомате не достаточно купюр требуемого номинала");
            }

        }

    }

}
