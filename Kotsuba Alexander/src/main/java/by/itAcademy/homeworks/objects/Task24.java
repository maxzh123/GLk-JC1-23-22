/*Создать класс, описывающий промежуток времени.
 Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 Сделать методы для получения полного количества секунд в объекте,
 сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 Создать два конструктора:
 получающий общее количество секунд
 получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.*/

package by.itAcademy.homeworks.objects;

public class Task24 {
    public static void main(String[] args) {
        TimeInterval time = new TimeInterval(12,34,48);
        TimeInterval time_2 = new TimeInterval(1240);

        System.out.println(time.showTime());
        System.out.println(time_2.showTime());
        System.out.println(time_2.compareTo(time));
    }
}
