package by.itAcademy.homeworks.objects;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 24
 * Создать класс, описывающий промежуток времени. Промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд и получающий часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных.
 */

public class Task24 {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(1, 5, 0);
        TimeInterval timeInterval2 = new TimeInterval(300);
        Printer.print(timeInterval1);
        Printer.print(timeInterval2);

        int result = timeInterval1.compareTo(timeInterval2);
        if (result == 0) {
            Printer.print("Первый объект равен второму объекту");
        }
        if (result == 1) {
            Printer.print("Первый объект больше второго объекта");
        }
        if (result == -1) {
            Printer.print("Первый объект меньше второго объекта");
        }
    }
}
