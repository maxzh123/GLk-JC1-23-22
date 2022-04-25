package by.itAcademy.homeworks.oop.Task32;

public abstract class AbstarctAppliancesForCleaning implements Appliances {
    public boolean isOn;
    private String brand;
    private String model;
    protected AbstarctAppliancesForCleaning(boolean isOn, String brand, String model) {
        this.isOn = isOn;
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public abstract void turnOn();
}
