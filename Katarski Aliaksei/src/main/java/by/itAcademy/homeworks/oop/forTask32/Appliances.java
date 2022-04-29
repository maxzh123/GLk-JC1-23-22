package by.itAcademy.homeworks.oop.forTask32;

public class Appliances {
    private String manufacturer;
    private String color;
    private long serialnumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public long getSerialnumber() {
        return serialnumber;
    }

    public Appliances( String manufacturer, String color, long serialnumber) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.serialnumber = serialnumber;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", serialnumber=" + serialnumber +
                '}';
    }
}
