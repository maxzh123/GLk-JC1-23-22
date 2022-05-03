package by.itAcademy.homeworks.oop.ForTask32;

import java.util.Date;

public abstract class HomeAppliance {

    protected final int price;
    protected final String model;
    protected final String producer;
    protected final Date dateOfManufacture;
    protected boolean isPlugIn = false;

    protected HomeAppliance(int price, String model, String producer, Date dateOfManufacture) {
        this.price = price;
        this.model = model;
        this.producer = producer;
        this.dateOfManufacture = dateOfManufacture;
    }

    public void plugIn() {

        isPlugIn = true;
        System.out.println(producer + " " + model + " Включен в розетку");
    }

    public void unplug() {

        isPlugIn = false;
        System.out.println(producer  + " " + model + " Выключен");
    }
}
