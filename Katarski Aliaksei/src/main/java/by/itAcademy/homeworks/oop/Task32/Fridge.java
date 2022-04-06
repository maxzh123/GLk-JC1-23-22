package by.itAcademy.homeworks.oop.Task32;

public class Fridge extends Appliances implements TurnOnOff,DoSomething{
    private int weight;

    public Fridge( String manufacturer, String color, long serialnumber, int weight) {
        super( manufacturer, color, serialnumber);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getToWork() {
        return "Храню продукты";
    }

    @Override
    public String isTurnedOn() {
        return "Включил";
    }

    @Override
    public String isTurnedOff() {
        return "Выключен";
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "weight=" + weight +
                '}';
    }
}
