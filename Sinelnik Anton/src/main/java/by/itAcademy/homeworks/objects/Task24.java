package by.itAcademy.homeworks.objects;

/**
 * Создать класс, описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
 * секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора:
 * получающий общее количество секунд
 * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Task24 {
    public static void main(String[] args) {
    Time time = new Time(365400);
    Time time1 = new Time(32,2,4);
        System.out.println(time.compareTo(time1));
    }


}
