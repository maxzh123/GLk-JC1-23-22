package by.itAcademy.homeworks.oop;

/**
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

import by.itAcademy.homeworks.oop.ForTask32.Fridge;
import by.itAcademy.homeworks.oop.ForTask32.Notebook;

import java.util.Date;

public class Task32 {

    public static void main(String[] args) {

        Fridge fridge = new Fridge(100, "1288", "Minsk", new Date() );
        Notebook notebook = new Notebook(5600, "600 PRO MAX", "Apple", new Date(), 60);

        fridge.plugIn();
        notebook.plugIn();
        notebook.unplug();

        System.out.println(fridge);
        System.out.println(notebook);
    }
}
