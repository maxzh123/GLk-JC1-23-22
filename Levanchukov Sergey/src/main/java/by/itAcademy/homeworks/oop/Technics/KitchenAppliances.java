package by.itAcademy.homeworks.oop.Technics;

public class KitchenAppliances extends Appliances{

    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public KitchenAppliances(String name, int age, String manufacturer, int serialNumber) {
        super(name, age, manufacturer);
        this.serialNumber=serialNumber;
    }
}
