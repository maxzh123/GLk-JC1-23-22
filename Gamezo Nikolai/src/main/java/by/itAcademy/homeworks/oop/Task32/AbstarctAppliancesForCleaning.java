package by.itAcademy.homeworks.oop.Task32;

public abstract class AbstarctAppliancesForCleaning implements Appliances {
    private boolean isOn;
    private String brand;
    private String model;

    protected AbstarctAppliancesForCleaning(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public boolean getState() {
        return isOn;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {

    }
    public  void turnOff(){

    }
    public void setOn (boolean isOn){
        isOn = true;
    }
}
