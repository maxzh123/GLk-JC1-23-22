package by.itAcademy.homeworks.oop.Task32;

/**
 * Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner(false,"Samsung", "VCC4520S36/XEV", 1.3F, 1600);
        vacuumCleaner.printInfo();
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(true, "Xiaomi", "Mi Robot Vacuum-Mop 2 Lite MJSTL", 0.45F, 35, 2600, true);
        robotVacuumCleaner.printInfo();
        ElectricBroom  electricBroom = new  ElectricBroom(true,"Karcher", "KB 5 Premium 1.258-021.0", 3000, true, 0.8F);
        electricBroom.printInfo();
    }
}
