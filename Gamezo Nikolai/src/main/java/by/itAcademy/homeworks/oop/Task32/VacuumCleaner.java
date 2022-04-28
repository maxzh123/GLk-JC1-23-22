package by.itAcademy.homeworks.oop.Task32;

public class VacuumCleaner extends AbstarctAppliancesForCleaning {
    private float bagCapacity;
    private int power;
    public VacuumCleaner(boolean isOn, String brand, String model, float bagCapacity, int power) {
        super(isOn, brand, model);
        this.bagCapacity = bagCapacity;
        this.power = power;
    }
    public float getBagCapacity(){
        return bagCapacity;
    }
    public int getPower() {
        return power;
    }

    public void printInfo() {
        turnOn();
        System.out.println("Пылесос");
        System.out.println("Брэнд: " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Объём пылесборника: " + getBagCapacity() + " л.");
        System.out.println("Мощность: " + getPower() + " Вт" + "\n");
    }
}

