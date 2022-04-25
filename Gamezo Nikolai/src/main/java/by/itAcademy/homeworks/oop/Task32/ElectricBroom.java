package by.itAcademy.homeworks.oop.Task32;

public class ElectricBroom<isOn> extends AbstarctAppliancesForCleaning {

    private int batteryСapacity;
    private boolean needСharging;
    private float tankCapacity;

    public ElectricBroom(boolean isOn, String brand, String model, int batteryСapacity, boolean needСharging, float tankCapacity) {
        super(isOn, brand, model);
        this.batteryСapacity = batteryСapacity;
        this.needСharging = needСharging;
        this.tankCapacity = tankCapacity;
    }
    public int getBatteryСapacity() {
        return batteryСapacity;
    }
    public void isNeedСharging() {
        if (needСharging = true) {
            System.out.println("Нужно зарядить электровеник :)");
        }
        else {
            System.out.println("Электровеник заряжен");
        }
    }
    public float getTankCapacity() {
        return tankCapacity;
    }
    public void turnOn() {
        if (this.isOn == true) {
            System.out.println("Электровеник включен, да он существует o_O");
            System.out.println("Брэнд: " + getBrand());
            System.out.println("Модель: " + getModel());
            System.out.println("Ёмкость батареи: " + getBatteryСapacity() + " mAh");
            isNeedСharging();
            System.out.println("Ёмкость бака: " + getTankCapacity() + " л.");
        }
        else {
            System.out.println("Электровеник выключен");
        }
    }
}
