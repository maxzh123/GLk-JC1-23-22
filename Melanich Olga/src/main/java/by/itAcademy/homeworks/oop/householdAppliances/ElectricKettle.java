package by.itAcademy.homeworks.oop.householdAppliances;

public class ElectricKettle extends AbstractHouseholdAppliance {
    private double kettleVolume;
    private int power;


    public ElectricKettle(double kettleVolume, int power, String brand, String model) {
        super(brand, model);
        this.kettleVolume = kettleVolume;
        this.power = power;
    }

    public double getKettleVolume() {
        return kettleVolume;
    }

    @Override
    public void turnOn() {
        System.out.println("Включить чайник");
        super.setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить чайник");
        super.setOn(false);
    }

    public void boil() {
        if (super.isOn()) {
            System.out.println("Чайник закипел. " + timeBoil());
            super.setOn(false);
        } else {
            System.out.println("Чайник не включен");
        }
    }

    //  ооочень топорно, знаю))) просто в учебных целях для понимания темы
    public String timeBoil() {
        String time = "";
        if (kettleVolume == 1.5 && power == 1500) {
            time = "Время закипания 7 минут";
        }
        if (kettleVolume == 1.7 && power == 1800) {
            time = "Время закипания 6 минут";
        }
        if (kettleVolume == 1.8 && power == 2000) {
            time = "Время закипания 5 минут";
        }
        if (kettleVolume == 2.0 && power == 2200) {
            time = "Время закипания 4 минуты";
        }
        return time;
    }
}

