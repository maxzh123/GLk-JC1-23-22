package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.task32.Fridge;
import by.itAcademy.homeworks.oop.task32.Oven;
import by.itAcademy.homeworks.oop.task32.Teapot;

/**
 * ## Задание 32
 * > Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > бытовую технику. Создать несколько объектов описанных классов, часть из них
 * > включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main(String[] args) {
        Teapot socket = new Teapot();
        Fridge fridge = new Fridge("Gefest","Белый",2,1200);
        Oven oven = new Oven("Вкусняшка","Синий",1,1000);
        System.out.println("Выберите что хотите подключить");
        socket.getOnOf();
        fridge.getOnOf();
        oven.getOnOf();
        System.out.println(socket);
        System.out.println(fridge);
        System.out.println(oven);
    }
}
