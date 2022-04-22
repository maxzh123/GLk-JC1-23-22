package by.itAcademy.homeworks.oop.Technics;

public class Appliances {
    private String name;
    private int age;
    private String manufacturer;
    private String power;

    public void setPower(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Appliances(String name, int age, String manufacturer) {
        this.name = name;
        this.age = age;
        this.manufacturer = manufacturer;
    }

}
