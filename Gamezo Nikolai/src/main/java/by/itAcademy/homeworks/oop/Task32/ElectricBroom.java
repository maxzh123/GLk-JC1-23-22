package by.itAcademy.homeworks.oop.Task32;

public class ElectricBroom extends AbstarctAppliancesForCleaning {

    private int batteryСapacity;
    private boolean needСharging;
    private int tankCapacity;

    public ElectricBroom(String brand, String model, int batteryСapacity, boolean needСharging, int tankCapacity) {
        super(brand, model);
        this.batteryСapacity = batteryСapacity;
        this.needСharging = needСharging;
        this.tankCapacity = tankCapacity;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public boolean isNeedСharging() {
        return needСharging;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void turnOn() {
        super.setOn(true);
        System.out.println("Электровеник включен, да он существует o_O");
        System.out.println("Ёмкость батареи: " + getBatteryСapacity());
        System.out.println(isNeedСharging());
        System.out.println(getTankCapacity());
    }




}
