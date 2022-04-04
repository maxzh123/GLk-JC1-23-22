package by.itAcademy.homeworks.oop.Task32;

public class Teapot extends Appliances implements TurnOnOff,DoSomething{
    private String volume;

    public Teapot( String manufacturer, String color, long serialnumber, String volume) {
        super(manufacturer, color, serialnumber);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String getToWork() {
        return "Кипячу воду";
    }

    @Override
    public String isTurnedOn() {
        return "Ты включил чайник,умница!";
    }

    @Override
    public String isTurnedOff() {
        return "Выключен";
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume='" + volume + '\'' +
                '}';
    }
}
