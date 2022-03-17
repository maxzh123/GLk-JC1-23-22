package by.itAcademy.homeworks.objects;
import org.jetbrains.annotations.NotNull;

public class TimeInterval implements Comparable<TimeInterval> {
    public int seconds, minutes, hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds + (minutes * 60) + (hours * 3600);
    }

    @Override
    public int compareTo(@NotNull TimeInterval o) {
        int result=0;
        if (this.getSeconds() > o.getSeconds()) {
            result=1;
        }
        if (this.getSeconds() < o.getSeconds()) {
            result=-1;
        }
        if (this.getSeconds() == o.getSeconds()) {
            result= 0;
        }
        return result;
    }
}