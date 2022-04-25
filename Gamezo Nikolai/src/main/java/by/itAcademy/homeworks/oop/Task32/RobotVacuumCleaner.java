package by.itAcademy.homeworks.oop.Task32;

public class RobotVacuumCleaner extends VacuumCleaner implements Appliances{
    private int batteryСapacity;
    private boolean needСharging;
    public RobotVacuumCleaner(boolean isOn, String brand, String model, float bagCapacity, int power, int batteryСapacity, boolean needСharging) {
        super(isOn, brand, model, bagCapacity, power);
        this.batteryСapacity = batteryСapacity;
        this.needСharging = needСharging;
    }
    public int getBatteryСapacity() {
        return batteryСapacity;
    }
    public void isNeedСharging() {
        if (needСharging = true) {
            System.out.println("Нужно зарядить робот-пылесос");
        }
        else {
            System.out.println("Робот-пылесос заряжен");
        }
    }
    public void turnOn() {
        if (this.isOn == true) {
            System.out.println("Робот-пылесос включен");
            System.out.println("Брэнд: " + getBrand());
            System.out.println("Модель: " + getModel());
            System.out.println("Объём пылесборника: " + getBagCapacity() + " л.");
            System.out.println("Мощность: " + getPower() + " Вт");
            System.out.println("Ёмкость аккумулятора: " + getBatteryСapacity() + " mAh");
            isNeedСharging();
            System.out.println("\n");
        } else {
            System.out.println("Робот-пылесос выключен");
        }
    }
}
