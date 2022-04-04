package by.itAcademy.homeworks.oop.ForTask32;

public class fridge extends householdAppliances{

    private int numberOfChambersInRefrigerator;


    public fridge(String name, String countryOforigin, int numberOfChambersInRefrigerator) {
        super(name, countryOforigin);
        this.numberOfChambersInRefrigerator = numberOfChambersInRefrigerator;
    }

    @Override
    public String toString() {
        return "fridge{" +
                "name = '" + getName() + '\'' +
                ", countryOforigin = " + getCountryOforigin()  +
                ", numberOfChambersInRefrigerator = " + numberOfChambersInRefrigerator +
                '}';
    }

}
