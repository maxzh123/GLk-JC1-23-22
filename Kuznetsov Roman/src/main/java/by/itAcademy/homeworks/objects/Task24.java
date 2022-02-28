package by.itAcademy.homeworks.objects;

/**
 * > Создать класс, описывающий промежуток времени. Сам промежуток в классе
 * > должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
 * > методы для получения полного количества секунд в объекте, сравнения двух
 * > объектов (метод должен работать аналогично compareTo в строках). Создать два
 * > конструктора:
 * > - получающий общее количество секунд
 * > - получающий часы, минуты и секунды по отдельности.
 */
class Time implements Comparable<Time>{
    int seconds;
    int minutes;
    int hours;
    @Override
    public int compareTo(Time o) {
        int result = this.hours==o.hours? 1 : 0;
        if(result == 0)
            result = this.minutes==o.minutes? 1 : 0;
        if (result == 0)
            result = this.seconds==o.seconds? 1 : 0;
        return result;
    }
    int getSeconds(){
        return seconds+(minutes*60)+(hours*3600);
    }
    public Time(int seconds){
        this.seconds = seconds%60;
        this.minutes = seconds%3600/60;
        this.hours = seconds/3600;
    }
    public Time(){
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }
    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
}
public class Task24 {

    public static void main(String[] args) {
        Time time = new Time(3941);
        Time time2 = new Time(3941);
         System.out.println(time.getSeconds());
        System.out.println(time.compareTo(time2));
    }
}
