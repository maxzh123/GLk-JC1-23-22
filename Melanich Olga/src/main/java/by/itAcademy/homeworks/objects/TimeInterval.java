package by.itAcademy.homeworks.objects;

/**
 * Задание 24
 * Создать класс, описывающий промежуток времени. Промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд и получающий часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных.
 */

public class TimeInterval implements Comparable<TimeInterval> {
    private final int seconds;
    private final int minutes;
    private final int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int totalNumberOfSeconds) {
        this.seconds = totalNumberOfSeconds % 60;
        this.minutes = (totalNumberOfSeconds % 3600) / 60;
        this.hours = totalNumberOfSeconds / 3600;
    }

    public int getTotalNumberOfSeconds() {
        return this.seconds + (this.minutes * 60) + (this.hours * 3600);
    }

    @Override
    public int compareTo(TimeInterval o) {
        int first = getTotalNumberOfSeconds();
        int second = o.getTotalNumberOfSeconds();
        if (first < second) {
            return -1;
        }
        if (first > second) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
