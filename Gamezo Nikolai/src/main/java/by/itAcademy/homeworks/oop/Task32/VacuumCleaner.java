package by.itAcademy.homeworks.oop.Task32;

public class VacuumCleaner extends AbstarctAppliancesForCleaning {

    private int bagCapacity;
    private int power;

    public VacuumCleaner(String brand, String model, int bagCapacity, int power) {
        super(brand, model);
        this.bagCapacity = bagCapacity;
        this.power = power;
    }

    public int getBagCapacity(){
        return bagCapacity;
    }

    public int getPower() {
        return power;
    }

}
