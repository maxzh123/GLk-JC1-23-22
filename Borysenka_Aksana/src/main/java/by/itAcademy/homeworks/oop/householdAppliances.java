package by.itAcademy.homeworks.oop;

public class householdAppliances {

    private String name;
    private String countryOforigin;
    private int serviceLife;


    public String getName() {
        return name;
    }

    public String getCountryOforigin() {
        return countryOforigin;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    @Override
    public String toString() {
        return "householdAppliances{" +
                "name='" + name + '\'' +
                ", countryOforigin='" + countryOforigin + '\'' +
                ", serviceLife=" + serviceLife + " years" +
                '}';
    }


    public householdAppliances(String name, String countryOforigin, int serviceLife) {
        this.name = name;
        this.countryOforigin = countryOforigin;
        this.serviceLife = serviceLife;
    }

    public boolean turnOn(){
            return true;
    }
}
