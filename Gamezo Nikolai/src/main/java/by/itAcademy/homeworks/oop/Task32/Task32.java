package by.itAcademy.homeworks.oop.Task32;

/**
 * Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner("","", 1, 2);
        vacuumCleaner.turnOn();
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner("", "", 1, 2, 3, true);
        robotVacuumCleaner.turnOn();
        ElectricBroom  electricBroom = new  ElectricBroom("", "", 1, true, 2);
        electricBroom.turnOn();
    }
}
