package by.itAcademy.homeworks.oop.householdAppliances;

public class WashingMachine extends AbstractHouseholdAppliance {
    private double maxLoad;
    private boolean isWashingFinished;


    public WashingMachine(double maxLoad, String brand, String model) {
        super(brand, model);
        this.maxLoad = maxLoad;
    }

    public boolean isWashingFinished() {
        return isWashingFinished;
    }

    public void setWashingFinished(boolean washingFinished) {
        isWashingFinished = washingFinished;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    @Override
    public void turnOn() {
        System.out.println("Стиральная машина включена");
        super.setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Стиральная машина не включена");
        super.setOn(false);
    }

       public void washing() {
        System.out.println("Загрузите барабан. Максимальная загрузка не более " + maxLoad + "кг");
        if (super.isOn()) {
            System.out.println("Стирка запущена");
            isWashingFinished = true;
            System.out.println("Стирка завершена");
        } else {
            System.out.println("Стиральная машина не включена");
        }
    }
}










