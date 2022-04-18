package by.itAcademy.homeworks.objects;
//Создать класс, описывающий промежуток времени.
// Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках).
// Создать два конструктора:
//получающий общее количество секунд
//получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
public class Task24 {
    public static void main(String[] args) {
        Interval interval = new Interval(2, 2, 2);
        Interval interval2 = new Interval(3, 3, 3);
        System.out.println(interval.only_seconds());
        interval.print();
        System.out.println(interval.compareTo(interval2));
    }
}
