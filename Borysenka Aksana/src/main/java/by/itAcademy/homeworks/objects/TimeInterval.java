package by.itAcademy.homeworks.objects;

public class TimeInterval implements Comparable<TimeInterval>{

    private int seconds;
    private int minutes;
    private int hours;


    public TimeInterval(int seconds, int minutes, int hours) {
        if (seconds<0 || minutes < 0 || hours < 0) {
            System.out.println("Error: enter correct number");
            return;
        }
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int totalSecond){
        this.hours = totalSecond/3600;
        this.minutes = (totalSecond%3600)/60;
        this.seconds = (totalSecond%3600)%60;
    }

    public int getTotalSeconds(){
        return this.seconds + this.minutes*60 + this.hours*3600;
    }


    @Override
    public String toString() {
        return "TimeInterval{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }


    @Override
    public int compareTo(TimeInterval o) {
        int sec_Tot_left = getTotalSeconds();
        int sec_Tot_right = o.getTotalSeconds();
        if (sec_Tot_left < sec_Tot_right) {
            return -1;
        } else if (sec_Tot_left > sec_Tot_right) {
            return 1;
        } else {
            return 0;
        }
    }
}
