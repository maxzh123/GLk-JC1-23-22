package by.itAcademy.homeworks.objects;

public class Time24task implements Comparable<Time24task> {
    public int seconds;
    public int minutes;
    public int hours;

    public Time24task(int second, int minutes, int hours) {
        this.seconds = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int TimeGetSeconds() {
        int sec = seconds + (minutes * 60) + (hours * 3600);
        return sec;
    }

    public Time24task(int seconds) {
        this.seconds = seconds;
        this.minutes = seconds / 60;
        this.hours = seconds / 3600;
    }

    @Override
    public int compareTo(Time24task o) {
        int fistValue = TimeGetSeconds();
        int secondValue = o.seconds;
        {
            if (fistValue < secondValue) {
                return -1;
            }
            if (fistValue > secondValue) {
                return 1;
            } else {
                return 0;

            }
        }
    }
}
