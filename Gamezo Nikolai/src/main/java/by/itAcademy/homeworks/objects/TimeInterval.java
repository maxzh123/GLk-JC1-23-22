package by.itAcademy.homeworks.objects;

public class TimeInterval implements Comparable<TimeInterval> {
    private int seconds;
    private int minutes;
    private int hours;
    //конструктор получающий секунды, минуты и часы по отдельности
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    //конструктор получающий общее количество секунд
    public TimeInterval(int seconds) {
        this.seconds = seconds;
        this.minutes = seconds / 60;
        this.hours = seconds / 3600;
    }
    //метод для получения полного количества секунд в объекте
    public int getSeconds(){
        return seconds;
    }
    //метод для сравнения двух объектов (TimeInterval и O) по количеству секунд
    public int compareTo(TimeInterval O) {
        int seconds = getSeconds();
        int secondsInO = O.getSeconds();
        if (seconds > secondsInO) {
            return 1;
        }
        else if (seconds < secondsInO) {
            return -1;
        }
        else {
            return 0;
        }
    }
    //метод для вывода данных
    public void printTime() {
        System.out.println("TimeInterval "+ seconds + " секунд " + minutes + " минут " + hours +" часов ");
    }
}
