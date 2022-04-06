package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.ForTask32.fridge;

public class Task32 {

    /**Task32
     * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
     * Создать несколько объектов описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
     */

    public static void main(String[] args) {

        fridge object1 = new fridge("Atlant" , "Belarus",2);
        System.out.println(object1);
        object1.on();
        object1.turnOn();

        fridge object2 = new fridge("Samsung" , "Republic of Korea",4);
        System.out.println(object2);
        object1.off();
        object1.turnOn();
    }

}
