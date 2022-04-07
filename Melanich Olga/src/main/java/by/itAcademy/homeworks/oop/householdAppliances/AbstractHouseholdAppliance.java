package by.itAcademy.homeworks.oop.householdAppliances;

public abstract class AbstractHouseholdAppliance implements Appliances {
    private boolean isOn;
    private String brand;
    private String model;

    protected AbstractHouseholdAppliance() {
    }

    protected AbstractHouseholdAppliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public abstract void turnOn();

    @Override
    public abstract void turnOff();

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }
}
