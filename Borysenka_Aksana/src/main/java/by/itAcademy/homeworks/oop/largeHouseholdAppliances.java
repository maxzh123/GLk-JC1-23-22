package by.itAcademy.homeworks.oop;

public class largeHouseholdAppliances extends householdAppliances {

    private String type;
    private int weight;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "largeHouseholdAppliances{" +
                "type= " + type +
                ", weight=" + weight + " kilogram" +
                '}';
    }


    public largeHouseholdAppliances(String name, String countryOforigin, int serviceLife, String type, int weight) {
        super(name, countryOforigin, serviceLife);
        this.type = type;
        this.weight = weight;
    }

}
