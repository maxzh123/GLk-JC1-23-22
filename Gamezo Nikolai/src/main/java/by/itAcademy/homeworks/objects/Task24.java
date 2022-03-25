package by.itAcademy.homeworks.objects;

/**
 * Задание 24
 * Создать класс, описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора:
 * получающий общее количество секунд
 * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Task24 {
    public static void main(String[] args) {
        TimeInterval first = new TimeInterval(2000);
        TimeInterval second = new TimeInterval(200, 5 ,1);
        first.printTime();
        second.printTime();
        System.out.println(first.compareTo(second));
    }
}
