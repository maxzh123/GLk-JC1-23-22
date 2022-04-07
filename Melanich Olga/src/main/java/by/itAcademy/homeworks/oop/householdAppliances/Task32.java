package by.itAcademy.homeworks.oop.householdAppliances;

/**
 * Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить.
 */

public class Task32 {
    public static void main(String[] args) {
        ElectricKettle kettle = new ElectricKettle(1.7, 1800, "Brayer", "BR1021");
        kettle.turnOn();
        kettle.boil();
//        Appliances ketAppliances = new ElectricKettle(1.7, 1800, "Brayer", "BR1021");
//        ketAppliances.boil(); // если так создать объект, почему-то не получается чайнику закипеть.???

        WashingMachine washingMachine = new WashingMachine(5, "LG", "AQ850");
        washingMachine.turnOff();

        WashingMachine washingMachine1 = new WashingMachine(6, "LG", "A250");
        washingMachine.turnOn();
        washingMachine.washing();

        WasherDryers washerDryers = new WasherDryers(7, 4, " Bosch", " WDU28590OE");
        washerDryers.turnOn();
        washerDryers.washing();
    }
}
