package by.itAcademy.homeworks.oop;

public class householdAppliances extends included implements powerSocked {


    private String name;
    private String countryOforigin;


    public householdAppliances(String name, String countryOforigin) {
        this.name = name;
        this.countryOforigin = countryOforigin;
    }

    public String getName() {
        return name;
    }

    public String getCountryOforigin() {
        return countryOforigin;
    }

    @Override
    public String toString() {
        return "householdAppliances{" +
                "name='" + name + '\'' +
                ", countryOforigin='" + countryOforigin + '\'' +
                '}';
    }


    @Override
    public void turnOn() {
        if(getState()) {
            System.out.println("Is on power socket.");
        } else {
            System.out.println("Is off from power socket.");
        }
    }

}
