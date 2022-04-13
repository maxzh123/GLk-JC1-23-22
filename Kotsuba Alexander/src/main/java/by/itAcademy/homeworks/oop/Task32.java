/*Создать цепочку наследования (минимум 3 звена) классов,
 описывающих бытовую технику.
 Создать несколько объектов описанных классов, часть из них включить в розетку.
 Иерархия должна иметь хотя бы три уровня.*/

package by.itAcademy.homeworks.oop;

public class Task32 {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("Samsung" , "ME88SUW",2022);
        Tv tv = new Tv("Sony","Bravia",2011);
        Computer computer = new Computer("MSI","GL72 6QF",2016);
        microwave.switchOn();
        microwave.printInfo();
        tv.switchOff();
        tv.printInfo();
        computer.switchOn();
        computer.printInfo();
    }


}
