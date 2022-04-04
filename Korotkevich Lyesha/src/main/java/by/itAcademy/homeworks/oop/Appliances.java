package by.itAcademy.homeworks.oop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Appliances {
    private double price;
    private String manufacturer;
    private String model;
    private Calendar expirationDate = Calendar.getInstance();
    DateFormat df = new SimpleDateFormat("dd MMM yyyy ");
    private boolean state = false;

    public Appliances(double price, String manufacturer, String model, int expirationDate) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.expirationDate.add(Calendar.YEAR, expirationDate);
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public boolean isState() {
        return state;
    }

    public void turnOn() {
        state=true;
    }

    public void turnOff(){
        state = false;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", expirationDate=" + df.format(expirationDate.getTime()) +
                ", state=" + state +
                '}';
    }
}
