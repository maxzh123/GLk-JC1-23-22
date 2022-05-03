package by.itAcademy.homeworks.oop.ForTask32;

import java.util.Date;

public class Notebook extends ComputerAppliance{

    private final int diagonal;

    public Notebook(int price, String model, String producer, Date dateOfManufacture, int diagonal) {
        super(price, model, producer, dateOfManufacture);
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", isPlugIn=" + isPlugIn +
                ", diagonal=" + diagonal +
                '}';
    }
}
