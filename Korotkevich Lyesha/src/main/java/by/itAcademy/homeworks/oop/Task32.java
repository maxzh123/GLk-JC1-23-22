package by.itAcademy.homeworks.oop;


/**Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.*/

public class Task32 {
    public static void main(String[] args) {
        VacuumCleaner pylesos1 = new VacuumCleaner(400, "LG", "2000", 1, 2000, 50, 4);
        System.out.println(pylesos1);
        pylesos1.clean();
        pylesos1.turnOn();
        pylesos1.clean();

        RobotVacuumCleaner pylesos2 = new RobotVacuumCleaner(700, "Xiaomi", "2", 2, 3000, 10, 2, 250, 200, 3, 1);
        System.out.println(pylesos2);
        pylesos2.clean();
        pylesos2.setBatteryPower(0);
        pylesos2.turnOn();
        pylesos2.clean();
        pylesos2.charge();
        pylesos2.clean();
    }
}
