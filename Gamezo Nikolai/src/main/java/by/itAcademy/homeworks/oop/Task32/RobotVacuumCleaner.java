package by.itAcademy.homeworks.oop.Task32;

public class RobotVacuumCleaner extends VacuumCleaner implements Appliances{

    private int batteryСapacity;
    private boolean needСharging;

    public RobotVacuumCleaner(String brand, String model, int bagCapacity, int power, int batteryСapacity, boolean needСharging) {
        super(brand, model, bagCapacity, power);
        this.batteryСapacity = batteryСapacity;
        this.needСharging = needСharging;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public boolean isNeedСharging() {
        return needСharging;
    }

}
