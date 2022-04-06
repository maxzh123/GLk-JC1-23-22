package by.itAcademy.homeworks.oop;


public class RobotVacuumCleaner extends VacuumCleaner{
    private int batteryCapacity;
    private int batteryPower;
    private int chargingTime;
    private int workingTime;

    public RobotVacuumCleaner(double price, String manufacturer, String model, int expirationDate, int capacity, int noiseLevel, int bagVolume, int batteryCapacity, int batteryPower, int chargingTime, int workingTime) {
        super(price, manufacturer, model, expirationDate, capacity, noiseLevel, bagVolume);
        this.batteryCapacity = batteryCapacity;
        this.batteryPower = batteryPower;
        this.chargingTime = chargingTime;
        this.workingTime = workingTime;
    }

    public void charge(){
        batteryPower = batteryCapacity;
        System.out.println("Пылесос зарядился");
    }

    @Override
    public void clean(){
        if(isState() && batteryPower > 0) System.out.println("Пылесосим");
        else {
            if (!isState()) System.out.println("Включите в розетку");
            else System.out.println("Зарядите");
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    @Override
    public String toString() {
        return "RobotVacuumCleaner{" +
                "price=" + getPrice() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", expirationDate=" + df.format(getExpirationDate().getTime()) +
                ", state=" + isState() +
                ", capacity=" + getCapacity() +
                ", noiseLevel=" + getNoiseLevel() +
                ", bagVolume=" + getBagVolume() +
                ", batteryCapacity=" + batteryCapacity +
                ", batteryPower=" + batteryPower +
                ", chargingTime=" + chargingTime +
                ", workingTime=" + workingTime +
                '}';
    }
}
