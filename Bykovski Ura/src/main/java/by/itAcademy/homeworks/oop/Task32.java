package by.itAcademy.homeworks.oop;

// Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
// Иерархия должна иметь хотя бы три уровня.

import by.itAcademy.homeworks.oop.forTask32.WasherDryer;
import by.itAcademy.homeworks.oop.forTask32.WashingMachine;

public class Task32 {
    public static void main(String[] args) {
      WashingMachine m1=new WashingMachine(500,"LG","200",5,1300,40);
        m1.wash();
        m1.turnOn();
        m1.wash();

        WasherDryer m2=new WasherDryer(1400,"woic","5",7,1500,50,true,false);
        m2.turnOn();
        m2.washAndDry();
    }
}
