package by.itAcademy.homeworks.objects;

class Time implements Comparable<Time> {
    private int seconds;
    private int minutes;
    private int hours;

    Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    private int getSeconds() {
        return seconds + (minutes * 60) + (hours * 3600);
    }

    public Time(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = seconds % 3600 / 60;
        this.hours = seconds / 3600;
    }

    @Override
    public int compareTo(Time o) {
        int firstValue = getSeconds();
        int secondValue = o.seconds;
        {
            if (firstValue < secondValue) {
                return -1;
            }
            if (firstValue > secondValue) {
                return 1;
            } else return 0;

        }

    }
}
