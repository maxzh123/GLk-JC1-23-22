package by.itAcademy.homeworks.objects;
/** Создать класс, описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
 * получающий общее количество секунд
 * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */
public class Task24 {
    public static void main(String[] args) {
        Time24task first = new Time24task(200);
        Time24task second = new Time24task(600, 21 ,3);
        System.out.println("Cекунд в объекте " + first.TimeGetSeconds());
        System.out.println("Cекунд в объекте " + second.TimeGetSeconds());
        System.out.println(first.compareTo(second));
    }
    }
