package by.itAcademy.homeworks.objects;

import org.jetbrains.annotations.NotNull;

import static java.lang.System.*;

/**
 * Создать класс,который будет описывать промежуток времени и иметь 3 свойства(секунды,минуты,часы).
 * Сделать метод для получения кол-ва секунд в обьекте.
 * метод для сравнения 2 обьектов(как compareTo в строках).
 * Сделать 2 конструктора:
 * получающий общее количество секунд
 * > - получающий часы, минуты и секунды по отдельности.
 * > Сделать метод для вывода данных.
 */

public class Time implements Comparable<Time>{
    private int hours;
    private int minutes;
    private int seconds;

    @Override
    public String toString() {
        return "Time{" +
                "hours= " + hours +
                ", minutes= " + minutes +
                ", seconds= " + seconds +
                '}';
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
    System.out.println(hours);
        return hours;
    }

    public int getMinutes(){
    System.out.println(minutes);
        return minutes;
    }

    public int getSecondFromObject(){
        out.println(this.seconds);
        return seconds;
    }
    public int totalSeconds(){
        System.out.println(hours*3600+minutes*60+seconds);
        return hours*3600+minutes*60+seconds;
    }
    @Override
    public int compareTo(@NotNull Time o) {
        int result=0;
        if(this.hours==o.hours){
            result=0;
        }if(this.hours>o.hours){
            result=1;
        }if(this.hours<o.hours){
            result=-1;
        }
        System.out.println(result);
        return result;
    }
}



