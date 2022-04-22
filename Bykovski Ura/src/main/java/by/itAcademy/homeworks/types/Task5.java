package by.itAcademy.homeworks.types;
//Задать промежуток времени в секундах в виде переменной.
//Следует вывести его на экран в виде секунд, минут, часов, суток, недель.

public class Task5 {
    public static void main(String[] args ){
        int time=678888;
        int week=time/604800;
        time-=week*604800;
        int day=time/86400;
        time-=day*86400;
        int hour=time/3600;
        time-=hour*3600;
        int minute=time/60;
        time-=minute*60;
        int sec=time;
        System.out.println(week);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(sec);
    }
}
