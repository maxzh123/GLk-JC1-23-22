package by.itAcademy.homeworks.oop.ForTask32;

import java.util.Date;

public class Fridge extends KitchenAppliance {


    public Fridge(int price, String model, String producer, Date dateOfManufacture) {
        super(price, model, producer, dateOfManufacture);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", isPlugIn=" + isPlugIn +
                '}';
    }
}
