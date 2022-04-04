package by.itAcademy.homeworks.oop;

import java.util.Calendar;

public class VacuumCleaner extends Appliances{
    private int capacity;
    private int noiseLevel;
    private int bagVolume;
    public VacuumCleaner(double price, String manufacturer, String model, int expirationDate, int capacity, int noiseLevel, int bagVolume) {
        super(price, manufacturer, model, expirationDate);
        this.capacity = capacity;
        this.noiseLevel = noiseLevel;
        this.bagVolume = bagVolume;
    }

    public void clean(){
        if(isState()) System.out.println("Пылесосим");
        else System.out.println("Включите в розетку");
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public int getBagVolume() {
        return bagVolume;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + getPrice() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", expirationDate=" + df.format(getExpirationDate().getTime()) +
                ", state=" + isState() +
                ", capacity=" + capacity +
                ", noiseLevel=" + noiseLevel +
                ", bagVolume=" + bagVolume +
                '}';
    }
}
