package by.itAcademy.homeworks.objects;

import java.util.Arrays;

public class Task24 {

    /**Task24
     * Создать класс, описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
     * секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
     * (метод должен работать аналогично compareTo в строках). Создать два конструктора:
     *
     * получающий общее количество секунд
     * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
     */

    public static void main(String[] args) {

        TimeInterval isTimeInterval = new TimeInterval(20,20,20);
        System.out.println(isTimeInterval);

        TimeInterval isTimeInterval2 = new TimeInterval(10000);
        System.out.println(isTimeInterval2);

        int result = isTimeInterval.compareTo(isTimeInterval2);

        if (result == 0) {
            System.out.println("Первый объект равен второму");
        } else if (result == -1){
            System.out.println("Первый объект меньше второго");
        } else {
            System.out.println("Первый объект больше второго");
        }

    }
}
