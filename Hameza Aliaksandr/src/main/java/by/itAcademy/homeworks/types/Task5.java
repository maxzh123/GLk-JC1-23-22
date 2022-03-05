package by.itAcademy.homeworks.types;

/** Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут
 и секунд,суток и недель.
*/
public class Task5 {
    public static void main(String[] args) {
        int sec = 10000000;
        int min = sec/60;
        int hour =  sec/3600;
        int day = sec/86400;
        int week = sec/604800;
        System.out.println("Секунд = " + sec);
        System.out.println("Минут = " + min);
        System.out.println("Часов = " + hour);
        System.out.println("Дней = " + day);
        System.out.println("Недель = " + week);
    }
}
