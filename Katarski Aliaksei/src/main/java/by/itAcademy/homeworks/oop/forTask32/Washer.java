package by.itAcademy.homeworks.oop.forTask32;

public class Washer extends Appliances implements TurnOnOff,DoSomething{
    private int revolvingNumber;

    public Washer(String manufacturer, String color, long serialnumber, int revolvingNumber) {
        super(manufacturer, color, serialnumber);
        this.revolvingNumber = revolvingNumber;
    }

    public int getRevolvingNumber() {
        return revolvingNumber;
    }

    @Override
    public String getToWork() {
        return "Стираю";
    }

    @Override
    public String isTurnedOn() {
        return "Включен" ;
    }

    @Override
    public String isTurnedOff() {
        return "Выключен";
    }

    @Override
    public String toString() {
        return "Washer{" +
                "revolvingNumber=" + revolvingNumber +
                '}';
    }
}
