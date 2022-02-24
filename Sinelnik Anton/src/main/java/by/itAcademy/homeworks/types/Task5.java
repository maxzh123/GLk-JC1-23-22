package by.itAcademy.homeworks.types;

//Задать промежуток времени в секундах в виде переменной.
// Следует вывести его на экран в виде часов минут и секунд, суток и недель.

public class Task5 {
    public static void main(String[] args) {
        int sec = 1553143543;
        int min = sec/60;
        int h = sec/3600;
        int d = sec/86400;
        int w = sec/604800;
        System.out.println("Значение "+sec+" секунд равняется:");
        System.out.println(min +" минут");
        System.out.println(h+" часов");
        System.out.println(d+" дней");
        System.out.println(w+" недель");
    }
}
