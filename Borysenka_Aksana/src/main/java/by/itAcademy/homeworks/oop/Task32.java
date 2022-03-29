package by.itAcademy.homeworks.oop;

import java.util.ArrayList;
import java.util.List;

public class Task32 {

    /**Task32
     * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
     * Создать несколько объектов описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
     */

    public static void main(String[] args) {
//        householdAppliances object1 = new householdAppliances("Atlant" , "Belarus",10);
//        object1.turnOn();
//        largeHouseholdAppliances object2 = new largeHouseholdAppliances("Atlant" , "Belarus",10, "Refrigeration equipment", 57);
//        System.out.println(object1);
//        System.out.println(object2);
//

        fridge object3 = new fridge("Atlant" , "Belarus",10, "Refrigeration equipment", 57, "Protected food", 280);

        if(object3.turnOn()){
            System.out.println(object3 + "\n" + object3.work());
        } else {
            System.out.println(object3 + "\n" + "Don't work");
        }
    }

}
