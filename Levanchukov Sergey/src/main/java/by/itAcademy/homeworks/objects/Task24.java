package by.itAcademy.homeworks.objects;
/**
 * > Создать класс, описывающий промежуток времени. Сам промежуток в классе
 * > должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
 * > методы для получения полного количества секунд в объекте, сравнения двух
 * > объектов (метод должен работать аналогично compareTo в строках). Создать два
 * > конструктора:
 * > - получающий общее количество секунд
 * > - получающий часы, минуты и секунды по отдельности.
 * > Сделать метод для вывода данных. Прочее на ваше усмотрение.
 **/

import by.itAcademy.homeworks.objects.TimeInterval;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int seconds, minutes,hours;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter seconds, minutes and hours for first object:");
        seconds=sc.nextInt();
        minutes=sc.nextInt();
        hours=sc.nextInt();
        TimeInterval time1=new TimeInterval(seconds,minutes,hours);
        System.out.println("Enter seconds, minutes and hours for second object:");
        seconds=sc.nextInt();
        minutes=sc.nextInt();
        hours=sc.nextInt();
        TimeInterval time2=new TimeInterval(seconds,minutes,hours);
        TimeInterval.printResult(time1,time2);
    }

}
