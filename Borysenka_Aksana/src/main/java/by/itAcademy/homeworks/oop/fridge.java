package by.itAcademy.homeworks.oop;

public class fridge extends largeHouseholdAppliances{



    private String function;
    private int energyСonsumption;

    public String getFunction() {
        return function;
    }

    public int getenergyСonsumption() {
        return energyСonsumption;
    }

    @Override
    public String toString() {
        return "fridge{ " +
                "name = " + getName()  +
                ", countryOforigin = " + getCountryOforigin()  +
                ", serviceLife = " + getServiceLife() + " years, " +
                "type = " + getType() +
                ", weight = " + getWeight() + " kilogram, " +
                "function = " + function  +
                ", energyСonsumption = " + energyСonsumption + " кВт·ч" +
                '}';
    }

    public fridge(String name, String countryOforigin, int serviceLife, String type, int weight, String function, int energyСonsumption) {
        super(name, countryOforigin, serviceLife, type, weight);
        this.function = function;
        this.energyСonsumption = energyСonsumption;
    }

    public String work(){
        return "Freezes";
    }

}
